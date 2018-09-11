public class a04_QuickSort {

    public static int partition(int arr[], int left, int right) {

        int pivot = arr[(left + right) / 2];

        while (left < right) {
            while ((arr[left] < pivot) && (left < right)) left++;
            // 끝나고 나면 left 앞쪽은 pivot 보다 작은 것만
            while ((arr[right] > pivot) && (left < right)) right--;
            // 끝나고 나면 right 뒤쪽은 pivot 보다 큰 것만
            // arr[right] < pivot < arr[left]


            if (left < right) {         // right의 배열의 순서가 left 보다 높다면 값을 바꿔주자.
                int temp = arr[left];   // 그러면 left 앞으로는, right 뒤로는 각각 pivot 보다 크거나 작거나
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        return left;
    }

    public static void quickSort(int arr[], int left, int right) {

        if (left < right) {
            int pivotNewIndex = partition(arr, left, right);

            quickSort(arr, left, pivotNewIndex - 1);
            quickSort(arr, pivotNewIndex + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arrs = {69, 10, 30, 2, 16, 8, 31, 22};
        quickSort(arrs, 0, arrs.length - 1);
        System.out.println("결과");

        for (int i : arrs) {
            System.out.print(i + " ");
        }
    }

}

//    특정한 값을 기준으로 큰 숫자와 작은 숫자를 나누면 어떨까?
//    퀵 정렬에서 기준 값을 피벗(Pivot)이라고 한다고
//    퀵 정렬의 평균 시간 복잡도는 O(N * logN)입니다.
//    퀵 정렬의 최악 시간 복잡도는 O(N^2)입니다.
