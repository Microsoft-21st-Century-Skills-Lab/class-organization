import java.util.ArrayList;

public class ArrayListProj {
    public static void main(String [] args){
        //Array
        String [] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        System.out.println(fruits[2]);


        //ArrayList
        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");
        fruitList.remove("Strawberry");

        System.out.println(fruitList);

    }

}
