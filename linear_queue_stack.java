public class linear_queue_stack {
    private final int maxSize;
    private int top;
    private final int[] stackArray;

    public linear_queue_stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Unable to push " + item);
            return;
        }
        stackArray[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Unable to pop.");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}

     class LinearQueue {
        private final linear_queue_stack stack1;
        private final linear_queue_stack stack2;

        public LinearQueue() {
            stack1 = new linear_queue_stack(100);
            stack2 = new linear_queue_stack(100);
        }

        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }

        public void enqueue(int item) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            stack1.push(item);

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }

            System.out.println(item + " enqueued to the queue.");
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Unable to dequeue.");
                return -1;
            }

            return stack1.pop();
        }

        public int front() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return stack1.peek();
        }

        public int rear() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            int rearItem = stack2.peek();

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }

            return rearItem;
        }

        public static void main(String[] args) {
            LinearQueue queue = new LinearQueue();

            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
            queue.enqueue(4);
            queue.enqueue(5);

            System.out.println("Front element: " + queue.front());
            System.out.println("Rear element: " + queue.rear());

            System.out.println("Dequeued item: " + queue.dequeue());
            System.out.println("Dequeued item: " + queue.dequeue());

            System.out.println("Front element: " + queue.front());
            System.out.println("Rear element: " + queue.rear());
        }
    }

