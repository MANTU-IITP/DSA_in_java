

import java.util.*;

public class Array{

        //linear search
        public static int linearsearch(int numbers[],int key){
                for(int i=0;i<numbers.length;i++){
                        if(numbers[i]==key){
                                return i;
                        }
                }
                return -1;
        }

        //get largest and smallest in array

        public static int getlargest(int numbers[]){
                int largest=Integer.MIN_VALUE;//-infinity
                int smallest=Integer.MAX_VALUE;//+infinity

                for(int i=0;i<numbers.length;i++){
                        if(largest<numbers[i]){
                                largest=numbers[i];

                        }
                        if(smallest>numbers[i]){
                                smallest=numbers[i];//update
                        }
                }
                System.out.println("smallest value is:"+smallest);
                return largest;

        }
  

        //binary search in sorting array
        public static int binarysearch(int numbers[],int keyb){
                int start=0,end =numbers.length-1;
                while(start<=end){
                        int mid=(start+end)/2;

                        //comparison
                        if(numbers[mid]==keyb){
                                return mid;
                                
                        }
                        if(numbers[mid]<keyb){//right side after mid
                                start=mid+1;
                        }
                        else{//left
                                end=mid-1;
                        }
                        

                }
                return -1;


        }
       //reverse array 
        public static void reversearray(int numbers[]){
                int first=0,last=numbers.length-1;

                while(first<last){
                        //swap
                        int temp=numbers[last];
                        numbers[last]=numbers[first];
                        numbers[first]=temp;


                        first++;
                        last--;
                        
                }

        }


        //pairs in array
        public static void printpairs(int numbers[] ){
                                int tp=0;
                                for(int i=0;i<numbers.length;i++){
                                        int curr=numbers[i];//2,4,6,8,10
                                        for(int j=i+1;j<numbers.length;j++){
                                                System.out.print( "(" +curr +"," +numbers[j]+ ")");
                                                tp++;
                
                                        }
                                        System.out.println();
                                }
                                System.out.println("total pairs:"+tp);
                        }
        public static void main(String[] args) {

                //liner search 
                System.out.println("linear search ");
                int numbers[]={2,4,6,8,10,12,14,16};
                
                int key=10;
                int index=linearsearch(numbers, key);
                if(index==-1){
                        System.out.println("not found");
                }
                else{
                        System.out.println("key is at index:"+index);
                }



                  //get largest and smallest in array
                  System.out.println("largest and smallest in array");
                
                System.out.println("largest value is:"+getlargest(numbers));



                //binary serch in sorting array
                System.out.println("binary serach in sorting array");
               
                int keyb=10;

                System.out.println("index for keyb is: "+binarysearch(numbers, keyb));

                //reverse array 
                System.out.println("reverse array");
                reversearray(numbers);

                for(int i=0;i<numbers.length;i++){
                        System.out.print(numbers[i]+" ");
                }
                System.out.println();

                //pairs in array 
                System.out.println("pairs in array");
                printpairs(numbers);




                
                
        }
}