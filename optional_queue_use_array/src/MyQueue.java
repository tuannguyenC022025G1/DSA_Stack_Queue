public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head;
    private int tail;
    private int currentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
        head = 0;
        tail = -1;
        currentSize = 0;
    }

    public boolean isQueueFull() {
        return currentSize == capacity;
    }

    public boolean isQueueEmpty() {
        return currentSize == 0;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Queue is full! Cannot add " + item);
        } else {
            tail = (tail + 1) % capacity;
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Added to queue: " + item);
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
        } else {
            int removedItem = queueArr[head];
            head = (head + 1) % capacity;
            currentSize--;
            System.out.println("Removed from queue: " + removedItem);
        }
    }
}
