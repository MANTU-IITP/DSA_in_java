//pairs in array
public class subArray {
    public static void printpairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];// 2,4,6,8,10
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;

            }
            System.out.println();
        }
        System.out.println("total pairs:" + tp);
    }

    // print subarray
    public static void printsubarray(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total no of subarray:" + ts);
    }


    
//maxm subarray
    public static void maxsubarray(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    currSum = currSum + numbers[k];

                }
                
                if (maxSum < currSum) {
                    maxSum = currSum;

                }

            }

        }
        System.out.println("max sum:" + maxSum);
    }
 //prefix maxsubarray
    public static void maxsubarray_using_prifix(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prifix array
        for(int i=1;i<prefix.length;i++){
          prefix[i]=prefix[i-1]+numbers[i];
        }
          for(int i=0;i<numbers.length;i++){
                  int start=i;
                  for(int j=i;j<numbers.length;j++){
                          int end=j;
                          currSum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                          if(maxSum<currSum){
                                  maxSum=currSum;
                          }
                          
                  }
                  
          }
          System.out.println("max sum:"+maxSum);
  }


  // using kadanes
  public static void kadanes(int numbers[]){
    int ms=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                    cs=0;

            }
            ms=Math.max(cs,ms);


    }
    System.out.println("our max sum:"+ms);
    

}

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
     //pairs in array
        System.out.println("pairs in array");
        System.out.println();
        printpairs(numbers);


        //print subarray
        System.out.println();
        System.out.println("print subarray");
        printsubarray(numbers);


    // max subarray in a simple method

        System.out.println();
        System.out.println("max subarray");
        maxsubarray(numbers);

        //max subarray using prifix
        System.out.println();
        System.out.println("max subarray using prifix");
       maxsubarray_using_prifix( numbers);

       //maxsubarray using kadanes

        System.out.println(" print maxsubarray using kadanes");
        kadanes(numbers);
    }
}