package Materi.Pertemuan5;
// data = 9, 8, 7, 5, 4
public class BubbleSort {
    public static void main(String[] args) {
        int[] x = {9, 8, 7, 5, 4};
        
        for(int a=0;a<x.length-1;a++){
            System.out.println("ITERASI" + a );
            for(int b=0;b<x.length-1-a;b++){
                if(x[b]>x[b+1]){
                    int temp=x[b];
                    x[b]=x[b+1];
                    x[b+1]=temp;
                }
                for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] +"|");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}