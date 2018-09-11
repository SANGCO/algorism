public class a01_SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int index = 0, min = 9999, temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) { // > min보다 작으면
                    min = array[j];
                    index = j;
                }
            }

            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    //   가장 작은 것을 선택해서 제일 앞으로 보내자.
    //   선택 정렬의 시간 복잡도 O(N^2)
}
