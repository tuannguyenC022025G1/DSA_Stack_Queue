class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);

        if (front == null) {
            // If queue is empty, set both front and rear to the new node
            front = rear = newNode;
            rear.link = front; // Circular link
        } else {
            // Add new node at rear and update links
            rear.link = newNode;
            rear = newNode;
            rear.link = front; // Maintain circular link
        }
    }

    public void deQueue() {
        if (front == null) {
            // Queue is empty
            System.out.println("Queue is empty!");
            return;
        }

        if (front == rear) {
            // Only one node in the queue
            front = rear = null;
        } else {
            // Move front to the next node and update rear's link
            front = front.link;
            rear.link = front; // Maintain circular link
        }
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        Node current = front;
        System.out.print("Queue: ");
        do {
            System.out.print(current.data + " ");
            current = current.link;
        } while (current != front);
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        // Following the diagram's sequence
        q.enQueue(14);
        q.displayQueue(); // 14
        q.enQueue(22);
        q.displayQueue(); // 14 22
        q.enQueue(-6);
        q.displayQueue(); // 14 22 -6
        q.deQueue();
        q.displayQueue(); // 22 -6
        q.deQueue();
        q.displayQueue(); // -6
        q.enQueue(9);
        q.displayQueue(); // -6 9
        q.enQueue(20);
        q.displayQueue(); // -6 9 20
    }
}