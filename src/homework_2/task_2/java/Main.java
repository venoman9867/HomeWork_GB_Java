import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("log");
        int[] array = new int[11];
        //рандомно заполняем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        bubbleSort(array);
    }

    //Сортировка пузырьком + запись в лог файл
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int memory = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = memory;
                }
            }
        }
    }
}
