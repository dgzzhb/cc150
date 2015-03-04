// This is in place, or you can push it into a stack then pop

class Untitled {
    public static void main(String[] args) {
        Node temp1;
        Node temp2;
        newHead = null;
        current = head;
        
        while (head != null) {
            head = head.next;
            current.next = newHead;
            newHead = current;
            current = head;
        }
        
        head = newHead;
    }
}