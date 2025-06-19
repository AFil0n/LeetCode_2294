import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3,6,1,2,5};
        System.out.println(partitionArray(array, 2));
    }

    public static int partitionArray(int[] nums, int k) {
        if(nums.length == 0) { // Выходим если нечего перебирать и возвращаем 0
            return 0;
        }

        Arrays.sort(nums); // Сортируем

        int minValue = nums[0]; // Задаем минимальный возможный элемент
        int numOfArrays = 1; // Задаем количество возможных массивов, 1 так как есть минимум 1
        for (int i = 1; i < nums.length; i++){
            if(nums[i] - minValue <= k){ // Если елемент входит в диапозон, то идем дальше
                continue;
            }

            minValue = nums[i]; // Проставляем новое минимальное значение
            numOfArrays++; // Стартуем новый массив
        }

        return numOfArrays; // Возвращаем количество новых массивов
    }
}