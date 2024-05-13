public class Stack {
    public class stack {
        private int top;
        private int arr[];
        private int capacity;

        public stack(int size) {
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



        public int pop(){
            if(isempty()){
                System.out.println("you must be kidding");
            }
            System.out.println(arr[top]);
            return arr[top--];
        }

        public Boolean isempty(){
            return top==-1;
        }
        public int peek(){
            if(top>=0) {
                return arr[top];
            }
            return -1;
        }

        public void printstack(){
            for(int i=0;i<=top;i++){
                System.out.println(arr[i]);
            }
        }
    }





}
