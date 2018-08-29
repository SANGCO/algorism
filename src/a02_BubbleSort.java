public class a02_BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int index = 0, min = 9999, temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1) - i; j++) { // array 인덱스는 0부터 시작하니 (array.length - 1)
                if (array[j] > array[j + 1]) { // array[j]가 크면
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    //   옆에 있는 값과 비교해서 더 작은 값을 앞으로 보내자.
    //   각 싸이클마다 가장 큰 값이 맨 뒤로 보내지게 된다.
    //   버블 정렬의 시간 복잡도는 O(N^2)
}
