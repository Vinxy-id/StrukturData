public class SelectionSort1{
    public static void main(String[] args) {
        int[]x={20,15,90,13,26};
        int a = 0;
        a = x[0]; 
        x[0]=x[4];
        x[4]=a;
        for(int i=0;i>x.length;i++){
            System.out.println(x[i]);
        }
    }
}
