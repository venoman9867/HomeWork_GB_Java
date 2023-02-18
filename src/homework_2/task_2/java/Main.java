import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = new int[11];
        //рандомно заполняем массив
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        bubbleSort(array);
    }

    //Сортировка пузырьком + запись в лог файл
    public static void bubbleSort(int[] array) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("src/homework_2/task_2/resources/log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat=new SimpleFormatter();
        fh.setFormatter(sFormat);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int memory = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = memory;
                }
            }
            logger.info(Arrays.toString(array));
        }
    }
}
