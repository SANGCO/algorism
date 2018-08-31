public class a03_InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int i, j, temp;

        for (i = 0; i < (array.length - 1); i++) {
            j = i;
            while (j > 0 & array[j] > array[j + 1]) {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }

        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

//    각 숫자를 적절한 위치에 삽입하면 어떨까?
//    삽입 정렬의 시간 복잡도는 O(N^2)
//    데이터가 이미 거의 정렬된 상태에 한해서는 어떤 알고리즘보다도 빠르다고
}
