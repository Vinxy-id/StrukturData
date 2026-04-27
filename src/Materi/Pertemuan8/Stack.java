package Materi.Pertemuan8;

public class Stack {
    static int size = 4;
    static int[]stack = new int[size];
    static int top = -1;


    public static void main(String[] args) {
        push(4);
        push(3);
        push(5);
        push(6);
        push(7);
        pop();
        pop();
        push(108);
    }

    public static boolean isFull(){
        if(top == size-1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void push(int x){
        System.out.println("Push : " + x);
        if(isFull()){
            System.err.println("Maaf penuh");
        }
        else{
            top = top + 1;
            stack[top]=x;
            tampilIsi();
        }
    }
    
    public static void tampilIsi(){
        System.out.print("Isi STACK : ");
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+ " ");
        }
        System.out.println(" ");
    }

    public static boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void pop(){
        System.out.println("POP "+ stack[top]);
        if(isEmpty()){
            System.out.println("Zonk");
        }
        else{
            top = top - 1;
            tampilIsi();
        }
    }
}

