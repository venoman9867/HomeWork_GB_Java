import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 35, 47, 50, 102, 34, 1, 0, 23};
        array=mergeSort(array);
        Arrays.stream(array).forEach(x->System.out.print(x+" "));
    }

    public static int[] mergeSort(int[] array) {
        if (array == null) {//проверяем на null наш массив
            return null;
        }
        if (array.length < 2) {
            return array; // возврат из рекурсии если размер массива 0 или 1
        }
        int [] arrayLeft = new int[array.length / 2];//создаем подмассив для левой части массива из параметра метода
        System.arraycopy(array, 0, arrayLeft, 0, array.length / 2);//копируем левую часть в этот массив

        int [] arrayRight = new int[array.length - array.length / 2];//тоже самое для правой части
        System.arraycopy(array, array.length / 2, arrayRight, 0, array.length - array.length / 2);
        //Вызываем рекурсию
        arrayLeft = mergeSort(arrayLeft);
        arrayRight = mergeSort(arrayRight);
        //Когда массивы разобьются выполняем слияние
        return mergeArray(arrayLeft, arrayRight);
    }
    public static int[] mergeArray(int[] a1, int[] a2) {
        //вычисляем длину нового массива
        int[] res = new int[a1.length + a2.length];
        int n = a1.length;//длинна левого массива
        int m = a2.length;//длинна правого массива
        int i = 0, j = 0, k = 0;//начальные индексы всех трех массивов
        while (i < n && j < m) {//пока один из массивов не кончится заполняем результирующий массив
            if (a1[i] <= a2[j]) {// тут сравниваем элементы двух массивов
                res[k] = a1[i];//заполняем результирующий массив
                i++; }
            else {
                res[k] = a2[j];
                j++; }
            k++; }
        while (i < n) {//если правый кончился заполняем левым массивом результирующий
            res[k] = a1[i];
            i++;
            k++; }
        while (j < m) {//иначе правый
            res[k] = a2[j];
            j++;
            k++; }
        return res;
    }
//Алгоритм то хорош, вот только в отличии от QuickSort памяти дофига кушает)
    //кстати можно ли как то посмотреть сколько памяти данный алгоритм использовал в байтах?
}
