package Coding.src.Materi.Pertemuan12;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>(); //deklarasi
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(7);
        list.add(1, 4);
        list.remove(3);
        System.out.println(list);
    }
}
