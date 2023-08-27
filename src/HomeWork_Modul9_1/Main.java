package HomeWork_Modul9_1;
public class Main {
    public static void main(String[] args) {
        MyArrayList myArray = new MyArrayList();
        String colorBlack = "Black";
        String colorWhite = "White";
        String colorGreen = "Green";
        myArray.add(colorBlack);
        myArray.add(colorWhite);
        myArray.add(colorGreen);

        System.out.println(myArray.size());

        Object secondColor = myArray.get(1);
        System.out.println(secondColor);

        myArray.remove(0);

        myArray.clear();
        System.out.println(myArray.toString());
    }

}
