import java.util.Stack;

// Design a stack with O(1) pish pop min
    
class Node{
    int data;
    Node next;
    
    Node(int d) {
        data = d;
    }
}

class MinStack {
    Node top;
    Stack<Integer> minValue;
    
    MinStack() {
        minValue = new Stack<Integer>();
    }
    
    void push(int i) {
        Node temp = new Node(i);
        temp.next = top;
        top = temp;  
        if (i < min()) minValue.push(i);
    }  
    
    Node pop() {
        if (top.data == min()) {
            minValue.pop();
        }
        if (top != null) {
            Node temp = new Node(top.data);
            top = top.next;
            return temp;
        }
        return null;    
    }
    
    int min() {
        if (minValue.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return minValue.peek();
        }       
    }
}
