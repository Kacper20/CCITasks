
//3.6
/*
Write a program to sort a stack in ascending order(biggest items on top)
You may use at most one additional stack to hold items but you may not copy the elements into any other data structure.
*/

struct Stack<Element> {

    private var elements : [Element] = []

    mutating func push(element: Element) {
        elements.append(element)
    }
    mutating func pop() -> Element {
        guard elements.count > 0 else { fatalError("pop on empty stack") }

        return elements.removeLast()
    }
    func isEmpty() -> Bool {
        return elements.isEmpty
    }
    func peek() -> Element? {
        return elements.last
    }
}

func sortedStack1<Element : Comparable>(var stackToSort: Stack<Element>) -> Stack<Element> {

    var newStack = Stack<Element>()


    //Do until we have something on left on left stack
    while !stackToSort.isEmpty() {
        //take an element,
        let elementFromLeftStack = stackToSort.pop()
        while let elem = newStack.peek() where elem > elementFromLeftStack {
            stackToSort.push(newStack.pop())

        }
        newStack.push(elementFromLeftStack)
    }
    return newStack
}
var stack: Stack<Int> = Stack()

stack.push(0)
stack.push(3)
stack.push(2)
stack.push(1)

var x = sortedStack1(stack)
x.peek()
