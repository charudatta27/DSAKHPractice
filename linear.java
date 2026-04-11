public class linear {
     public static void main(String[] args) {
            int[] arr = {2,4,5,7,8,9};

               int item = 2;
               int temp = 0;

               for(int i = 0; i < arr.length; i++){

                if(arr[i] == item){
                         System.out.println("element present in list " + i + " index position" );
      
                           temp = temp + 1;
                         }
               }
     if(temp==0){
        System.out.println("element not present in list ");
      }
    }
}