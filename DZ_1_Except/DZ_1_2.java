// 2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.


public class DZ_1_2 {

    public static int[] substractionArr(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Length is not valid");
        }
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array2[i] - array1[i];
        }
        return result;
    }


    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] array1 = { 13, 25, 6, 11, 4, 0 };
        int[] array2 = { 5, 1, 10, 3, 57 };
        printArray(substractionArr(array1, array2));

    }

}