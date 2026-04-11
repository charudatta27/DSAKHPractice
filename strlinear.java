public class strlinear {
      public static void main(String[] args) {
        
          String[] arr = {"charu", "sanjay" ,"om", "jay", "ayush"};

          String item = "om";
          int temp = 0;

          for(int i = 0; i < arr.length; i++){

            if(arr[i].equals(item)){
                       System.out.println("element found in list " + i + "index position");
                       temp = temp + 1;
            }
          }

          if(temp == 0){
            System.out.println("element not found in list");
          }

      }
}