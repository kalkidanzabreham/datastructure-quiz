public class linear_queue_array {

    private int front;
    private int rear;
    private final int capacity;
    private final int[] queue;

        public linear_queue_array(int size) {
            capacity = size;
            front = -1;
            rear = -1;
            queue = new int[capacity];
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public boolean isFull() {
            return rear == capacity - 1;
        }

        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full. Unable to enqueue " + item);
                return;
            }

            if (isEmpty()) {
                front = 0;
            }

            queue[++rear] = item;
            System.out.println(item + " enqueued to the queue.");
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Unable to dequeue.");
                return -1;
            }

            int item = queue[front++];
            if (front > rear) {
                front = -1;
                rear = -1;
            }
            return item;
        }

        public int front() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return queue[front];
        }

        public int rear() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return queue[rear];
        }

        public static void main(String[] args) {
            linear_queue_array queue = new linear_queue_array(5);

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);

            System.out.println("Front element: " + queue.front());
            System.out.println("Rear element: " + queue.rear());

            System.out.println("Dequeued item: " + queue.dequeue());
            System.out.println("Dequeued item: " + queue.dequeue());

            System.out.println("Front element: " + queue.front());
            System.out.println("Rear element: " + queue.rear());
        }
    }

