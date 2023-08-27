package HomeWork_Modul9_1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyArrayList> myArrayLists = new ArrayList<MyArrayList>();
        MyArrayList colorBlack = new MyArrayList("Black");
        MyArrayList colorWhite = new MyArrayList("White");
        MyArrayList colorGreen = new MyArrayList("Green");
        myArrayLists.add(colorBlack);
        myArrayLists.add(colorWhite);
        myArrayLists.add(colorGreen);

        System.out.println(myArrayLists.size());

        MyArrayList secondColor = myArrayLists.get(1);
        System.out.println(secondColor);

        myArrayLists.remove(0);
        System.out.println(myArrayLists.contains(colorBlack));

        myArrayLists.clear();
        System.out.println(myArrayLists.toString());
    }

}
