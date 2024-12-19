package ivt5.omgtu.misc;

import ivt5.omgtu.v1.Rectangle;

import java.awt.*;

public class Main {
    public static void main(String[] args){
        int[] example = {1,2,3,4,5,6};
        int[] example1 = {6,5,4,3,2,1};

        ListObject arr = new ListObject(example);
        ListObject arr1 = new ListObject(example1);

        System.out.printf("Элемент [%s]: %s",2, arr.getItem(2)); //вывод
        System.out.println();

        ListObject arr2 = new ListObject(6); //создаем массив
        arr1.printArray();
        System.out.println();


        arr.add(arr1); //Сложение
        System.out.println();
        arr.printArray();

        arr.subtract(arr1); //Вычитание
        System.out.println();
        arr.printArray();
        System.out.println();

        arr.Multiplication(2);//умножение
        arr.printArray();
        System.out.println();

        arr.Division(2);//деление
        arr.printArray();
        System.out.println();

        arr.printItem(3);//вывод по индексу
        System.out.println();
        arr.printItem(8); //проверка
    }
}
