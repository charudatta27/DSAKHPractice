public class binary {
    public static void main(String[] args) {
        
       int[] arr =  {2,4,6,7,8,9};
       int srch = 8;
       int li = 0;
       int hi = arr.length - 1;
       int mi = (li+hi)/2;

   while(li <= hi) {

       if(arr[mi] == srch)
        {

         System.out.println("element is at " + mi + " index position");
            break;

       }

       else if(arr[mi] < srch)
       {

        li = mi + 1;

       }
       else
      {

        hi = mi - 1;

          
      }
      mi = (li+hi)/2;

    }

    if (li > hi){
        System.out.println("element not found");
    }
 }
}