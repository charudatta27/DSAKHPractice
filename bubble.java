public class bubble
{
    public static void main(String[] args)
    {
        int[] arr = {55, 32, 44, 25, 16};

        int leng = arr.length;
        
        // Bubble Sort Algorithm
        for (int i = 1; i < leng; i++)
        {
            boolean swapped = false;

            for (int j = 0; j < leng - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if(swapped == false)
            {
                break;
            }
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}