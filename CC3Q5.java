import java.util.Stack;

// Implement myqueue using two stacks

class MyQueue<T> {
    Stack<T> oldStack, newStack;
    
    MyQueue() {
        oldStack = new Stack();
        newStack = new Stack();
    }
    
    int size() {
        return oldStack.size() + newStack.size();
    }
    
    void add(T value) {
        oldStack.push(value);
    }
    
    void move() {
        if (newStack.isEmpty()) {
            while (!oldStack.isEmpty()) {
                newStack.push(oldStack.pop());
            }
        }
    }
    
    T remove() {
        move();
        return newStack.pop();
    }
    
    T see() {
        move();
        return newStack.peek();
    }
}