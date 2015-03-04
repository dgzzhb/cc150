class Untitled {
    public static void main(String[] args) {
        Node newHead;
        Node current;
        newHead = null;
        current = head;
        
        while (head != null) {
            head = head.next;
            current.prev = head;
            current.next = newHead;
            newHead = current;
            current = head;
        }
        
        head = newHead;
    }
}