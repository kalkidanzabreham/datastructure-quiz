public class circular_queue_array {
    private final int maxSize;
    private int front;
    private int rear;
    private final int[] queueArray;

    public circular_queue_array(int size) {
        maxSize = size + 1; // One extra space to differentiate between full and empty states
        front = 0;
        rear = 0;
        queueArray = new int[maxSize];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Unable to enqueue " + item);
            return;
        }

        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        System.out.println(item + " enqueued to the queue.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Unable to dequeue.");
            return -1;
        }

        front = (front + 1) % maxSize;
        int dequeuedItem = queueArray[front];
        queueArray[front] = 0; // Optional: Reset the dequeued element to default value

        return dequeuedItem;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int frontIndex = (front + 1) % maxSize;
        return queueArray[frontIndex];
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        return queueArray[rear];
    }

    public static void main(String[] args) {
        circular_queue_array queue = new circular_queue_array(5);

        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);

        System.out.println("Front element: " + queue.front());
        System.out.println("Rear element: " + queue.rear());

        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());

        System.out.println("Front element: " + queue.front());
        System.out.println("Rear element: " + queue.rear());
    }
}

