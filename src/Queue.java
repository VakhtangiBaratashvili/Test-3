public class Queue {
    private int[] elements;
    private int size;
    private int capacity;

    public Queue() {
        capacity = 8;
        elements = new int[capacity];
        size = 0;
    }

    public void enqueue(int v) {
        if (size >= capacity) {
            int[] newElements = new int[capacity * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
            capacity *= 2;
        }
        elements[size] = v;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        int removedElement = elements[0];

        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;

        return removedElement;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    /*
        Queue queue = new Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Queue size: " + queue.getSize());
        System.out.println("Is the queue empty? " + queue.empty());
     */
}
