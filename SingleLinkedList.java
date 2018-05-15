public class SingleLinkedList {
    private Node first, prev, curr;

    public void addFirst(int data) {
        if (isEmpty()) {
            first = new Node(data);
        } else {
            Node temp = first;
            first = new Node(data);
            first.setNext(temp);
        }
    }

    public Node removeByIndex(int index) {
        Node temp;
        if (index == 1 || index == 0){
            temp = first;
            first = first.getNext();
        }
        else{
            // find the previous and current node
            setCurrent(index);
            temp = curr;
            prev.setNext(curr.getNext());
        }
        return temp;
    }

    private void setCurrent(int index){
        curr= first;
        prev = null;
        for (int i = 1; i < index && curr.getNext() != null; i++, curr = curr.getNext()) {
            prev = curr;
        }

    }

    public boolean isEmpty() {
        return first == null;
    }

    public void printList() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String str = "";
        Node temp = first;
        while (temp != null) {
            str+=temp.getData() + " ";
            temp=temp.getNext();
        }
        return str;
    }
}
