

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

        public static int getlargest(int num[]){
                int largest=Integer.MIN_VALUE;//-infinity
                int smallest=Integer.MAX_VALUE;//+infinity

                for(int i=0;i<num.length;i++){
                        if(largest<num[i]){
                                largest=num[i];

                        }
                        if(smallest>num[i]){
                                smallest=num[i];//update
                        }
                }
                System.out.println("smallest value is:"+smallest);
                return largest;

        }
  

        //binary search in sorting array
        public static int binarysearch(int numbersb[],int keyb){
                int start=0,end =numbersb.length-1;
                while(start<=end){
                        int mid=(start+end)/2;

                        //comparison
                        if(numbersb[mid]==keyb){
                                return mid;
                                
                        }
                        if(numbersb[mid]<keyb){//right side after mid
                                start=mid+1;
                        }
                        else{//left
                                end=mid-1;
                        }
                        

                }
                return -1;


        }
        public static void main(String[] args) {

                //liner search 
                System.out.println("linear search ");
                int numbers[]={2,4,6,8,10,112,14,16};
                
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
                int num[]={3,4,6,7,8,34,12,35,56};
                System.out.println("largest value is:"+getlargest(num));



                //binary serch in sorting array
                System.out.println("binary serach in sorting array");
                int numbersb[]={2,4,6,8,10,12,14};
                int keyb=10;

                System.out.println("index for keyb is: "+binarysearch(numbersb, keyb));
                
                
        }
}