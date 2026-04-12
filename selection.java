import java.util.Arrays;

public class selection{
    public static void selectionSort(int[] arr){

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i +1; j < arr.length; j++){

                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,5,2,8,9};
        System.out.println("Selection Sort");
        System.out.println("Before : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After : " + Arrays.toString(arr));

    }
}
