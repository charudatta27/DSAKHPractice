





public class insertionarr {
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 7, 8, 9};

        int indexpos = 3;
        int element = 6;

        int[] newArry = new int[arr.length + 1];

        // Step 1: Copy before index
        for (int i = 0; i < indexpos; i++) {
            newArry[i] = arr[i];
        }

        // Step 2: Insert element
        newArry[indexpos] = element;

        // Step 3: Copy remaining elements
        for (int i = indexpos; i < arr.length; i++) {
            newArry[i + 1] = arr[i];
        }

        // Step 4: Print new array
        for (int no : newArry) {
            System.out.print(no + " ");
        }
    }
}