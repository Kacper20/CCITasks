struct MyQueue<Element> {

    var leftStack: [Element] = []
    var rightStack: [Element] = []



    mutating func enqueue(element: Element) {
        rightStack.append(element)
    }
    mutating func dequeue() -> Element? {
        guard !(leftStack.isEmpty && rightStack.isEmpty) else { return nil }

        if leftStack.isEmpty {
            leftStack = rightStack.reverse()
            rightStack.removeAll(keepCapacity: true)
        }

        return leftStack.removeLast()
    }
    func isEmpty() -> Bool {
        return leftStack.isEmpty && rightStack.isEmpty
    }
}
