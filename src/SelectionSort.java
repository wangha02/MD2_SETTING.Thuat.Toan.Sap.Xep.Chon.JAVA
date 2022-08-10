public class SelectionSort {
    static double[] list = {1,9,4,2,5,-6,4.5};
    public static void selectionSort( double[] list){
        for (int i = 0; i < list.length; i++) {
            double min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min < list[j]){
                    min = list[j];
                    minIndex = j;
                }

            }
            if (minIndex != i){
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");

        }
    }
}