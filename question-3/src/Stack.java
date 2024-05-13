public class Stack {

        public int top;
        private int arr[];
        private int capacity;

        public Stack(int size) {
            capacity = size;
            top = -1;
            arr = new int[size];
        }

        public void push(int y) {
            if (isfull()) {
                System.out.println("no more");
            }

            arr[++top] = y;
        }

        public Boolean isfull(){
            return top ==capacity-1;
        }






        public int peek(){
            if(top>=0) {
                return arr[top];
            }
            return -1;
        }

        }








