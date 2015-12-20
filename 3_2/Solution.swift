//: Playground - noun: a place where people can play

import Foundation


//3.2
//How would you design a stack which in addition to push and pop operations also has a function min, which returns the minimum element? Sooo let's try it!
struct Stack<T: Comparable> {

    //In each time we're holding array of elements along with current minimums.
    private var stackElements: [(T, T)] = []
    var minElement: T? {
        guard !isEmpty() else { return nil }

        let (_, min) = stackElements.last!
        return min
    }
    mutating func push(element: T) {
        if isEmpty() {
            stackElements.append((element, element))
        }
        else {
            let newMin = { _ -> T in
               let (_, lastMin) = stackElements.last!
                return lastMin < element ? lastMin : element
            }()
            stackElements.append(element, newMin)
        }
    }

    mutating func pop() -> T {
        guard !stackElements.isEmpty else { fatalError("Stack is empty") }
        let(elem, _) =  stackElements.removeLast()
        return elem
    }
    func isEmpty() -> Bool {
        return stackElements.isEmpty
    }
}

//V 2 :  stack with minimums in other structure

struct Stack2<T: Comparable> {

    //In each time we're holding array of elements along with current minimums.
    private var minStack: [T] = []
    private var stackElements: [T] = []

    var minElement: T? {
        guard !isEmpty() else { return nil }

        return minStack.last!
    }
    mutating func push(element: T) {
        if isEmpty() {
            stackElements.append(element)
            minStack.append(element)
        }
        else {
            let lastMin = minStack.last!
            if element <= lastMin {
                minStack.append(element)
            }
            stackElements.append(element)
        }
    }

    mutating func pop() -> T {
        guard !stackElements.isEmpty else { fatalError("Stack is empty") }
        let elem =  stackElements.removeLast()
        if elem == minStack.last! {
            minStack.removeLast()
        }
        return elem
    }
    func isEmpty() -> Bool {
        return stackElements.isEmpty
    }
}
