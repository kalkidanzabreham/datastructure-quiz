public class queueimplementation {
    private int capacity;
    private int item[];
    private int front,rear;

    public queueimplementation(int size){
        capacity=size;
        front=-1;
        rear=-1;
        item=new int[size];

    }
    public void enqeue(int x){
        if (isfull()){
            System.out.println("already full");
        }
        front=0;
        rear++;
        item[rear]=x;


    }
    public Boolean isfull() {
        return (front == 0 && (rear == (capacity - 1)));
    }
    public void dequeue(){
        if (isempty()){
            System.out.println("queue is already empty");
        }
        ++front;
    }
    public Boolean isempty(){
        return front ==-1 && rear ==-1;
    }
    public void display (){
        for(int i =front;i<=rear;i++){
            System.out.println(item[i]);}
    }
}


