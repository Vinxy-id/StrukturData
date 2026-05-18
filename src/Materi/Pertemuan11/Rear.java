package Coding.src.Materi.Pertemuan11;
public class Rear {
    static int size = 4;
    static int[]que = new int [size];
    static int rear = -1;

    public static void main(String[] args) {
        // que[1]=5;
        peek();
        enqueue(4);
        enqueue(5);
        enqueue(6);
        enqueue(7);
        enqueue(8);
        Dequeue();
        Dequeue();
        Dequeue();
        Dequeue();
        Dequeue();
        Dequeue();
    }

    public static void peek(){
        if (isEmpty())
            System.out.println("Antrian Kosong");
        else
        System.out.println("Antrian paling depan adalah " + que[0]);
    }

    public static boolean isFull(){
        if(rear == size-1){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isEmpty(){
            if(rear == -1)
                return true;
            else
                return false;
        }

    public static void enqueue(int x){
        // System.out.println("Enqueue : " + x);
        if (isFull()) {
            System.out.println("Maaf Antrian Penuh");
        }
        else{
            System.out.println(x + " Masuk dalam antrian");
            rear = rear + 1;
            que[rear]= x;
        }
        ViewQue();
    }

    public static void Dequeue(){
        if(isEmpty())
            System.out.println("Antrian Kosong");
        else{
            System.out.println(que[0] + " Keluar dari antrian");
            for(int i=0; i < rear; i++){
                que[i]=que[i+1];
            }
            rear=rear-1;
        }
        ViewQue();
    }

    public static void ViewQue(){
        System.out.println("Antrian Saat Ini : ");
        for(int i=0; i <= rear; i++){
            System.out.print(que[i]+ " ");
        }
        System.out.println(" ");
    }
}