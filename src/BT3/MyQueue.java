package BT3;

public class MyQueue {
    private  Node front,rear;
    public MyQueue(){
        this.front= null;
        this.rear = null;
    }
    public void enqueue(int data){
        //tạo node mới và thêm giá tr vào node
        Node newNode = new Node(data);
        // nếu hàng đợi là null
        if(this.rear==null){
            this.front = newNode;
            this.rear = newNode;
            return;
        }

        this.rear.link = newNode;
        this.rear=newNode;
    }

    public int dequeue(){
        if (this.front == null){
            throw new IllegalStateException("Hàng đợi null");
        }
        int data = this.front.getData();
        if(this.front==null){
            this.rear= null;
        }
        this.front = this.front.link;
        return data;
    }
    public void displayData(){

    }

}
