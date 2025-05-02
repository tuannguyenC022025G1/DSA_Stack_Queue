public class MyStack {
    private int[] arr;
    private int size;
    private int index;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
        index = 0;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + element);
        } else {
            arr[index] = element;
            index++;
            System.out.println("Pushed: " + element);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1; // hoặc ném exception
        } else {
            index--;
            int popped = arr[index];
            System.out.println("Popped: " + popped);
            return popped;
        }
    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean isFull() {
        return index == size;
    }
}
