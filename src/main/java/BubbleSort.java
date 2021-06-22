import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:[");
        for (int i = 0; i < size; i++) {
            System.out.print (array[i] + " "); // Выводим на экран, полученный массив
        }
        System.out.println("]");

        boolean isSorted = false; // Флаг того, отсортирован ли уже массив или нет
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("Sorted array:" + Arrays.toString(array));
    }
}
