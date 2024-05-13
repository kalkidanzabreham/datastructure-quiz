public class Stack2 {

    private int bottom;       // equivalent with front in queue
    private int arr[];
    private int capacity;

    public Stack2(int size) {
        capacity = size;
        bottom = 0;
        arr = new int[size];
    }

    public int pop() {
        if (isempty()) {
            System.out.println("empty");
        }
        return ++bottom;
    }

    public Boolean isempty() {
        return bottom == -1;
    }

    public int peek() {
        if (bottom >= 0) {
            return arr[bottom];
        }
        return -1;
    }
}

   public static void main(String[] args) {
    for (int i = bottom; )

}


















}
