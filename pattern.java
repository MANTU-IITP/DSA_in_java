


public class pattern{

        public static void hollow_rectangel(int totRows,int totCols){
                //outer loop
                for(int i=1; i<=totRows;i++){
                        //inner loop
                        for(int j=1;j<=totCols;j++){
                                //cell-(i,j)
                                if(i==1||i==totRows||j==1||j==totCols){
                                        //boundray cells
                                        System.out.print("*");
                                }
                                else{
                                        System.out.print(" ");
                                }
                                
                        }
                        System.out.println();
                }
        }


        public static void inverted_rotated_pyramid(int n){
               //outer
                for(int i=1;i<=n;i++){
                        //spaces
                        for(int j=1;j<=n-i;j++){
                                System.out.print(" ");
                        }
                        //stars
                        for(int j=1;j<=i;j++){
                                System.out.print("*");
                        }
                        System.out.println();

                }
        }

        public static void inverted_half_pyramid_withnumbers(int n){
                for(int i=1;i<=n;i++){
                        for(int j=1;j<=n-i+1;j++){
                                System.out.print(j);
                        }
                        System.out.println();
                }
        }

        public static void floyds_triangle(int n){
                int counter=1;
                for(int i=1;i<=n;i++){
                        //inner-how many times will counter be rinted
                        for(int j=1;j<=i;j++){
                                System.out.print(counter+ " ");
                                counter++;
                        }
                        System.out.println();
                }
        }

        public static void zero_one_triangle(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                        if((i+j)%2==0){
                           System.err.print("1");     
                        }
                        else{
                                System.out.print("0");
                        }
                }
                System.out.println();
            }    
        }
        public static void buterfly(int n){
                //1st half
                for(int i=1;i<=n;i++){
                        //stars -i
                        for(int j=1;j<=i;j++){
                                System.out.print("*");
                        }

                        //spaces-2*(n-i)

                        for(int j=1;j<=2*(n-i);j++){
                                System.out.print(" ");
                        }

                        //stars-i
                        for(int j=1;j<=i;j++){
                                System.out.print("*");
                        }
                        System.out.println();
                }
                //2nd half
                for(int i=n;i>=1;i--){
                        //stars -i
                        for(int j=1;j<=i;j++){
                                System.out.print("*");
                        }

                        //spaces-2*(n-i)

                        for(int j=1;j<=2*(n-i);j++){
                                System.out.print(" ");
                        }

                        //stars-i
                        for(int j=1;j<=i;j++){
                                System.out.print("*");
                        }
                        System.out.println();

                }

        }
        public static void silod_rhombus(int n){
                for(int i=1 ;i<=n;i++){
                        //spaces
                        for(int j=1;j<=n-i;j++){
                                System.out.print(" ");
                        }
                        //stars
                        for(int j=1;j<=n;j++){
                                System.out.print("*");
                        }
                        System.out.println();
                }

        }
        public static void hollow_rhombus(int n){
                for(int i=1;i<=n;i++){
                        //spaces
                        for(int j=1;j<=n-i;j++){
                                System.out.print(" ");
                        }
                        //hollow ractangel
                        for(int j=1;j<=n;j++){
                                if(i==1 || i==n || j==1|| j==n){
                                        System.out.print("*");
                                }
                                else{
                                        System.out.print(" ");
                                }
                        }
                        System.out.println();
                        
                }
        }
        public static void diamond_pateern(int n){
                for(int i=1 ;i<=n;i++){
                        //spaces
                        for(int j=1;j<=n-i;j++){
                                System.out.print(" ");
                        }
                        for(int j=1;j<=2*i-1;j++){
                                System.out.print("*");
                        }
                        System.out.println();
                }
                for(int i=n;i>=1;i--){
                        //spaces
                        for(int j=1;j<=n-i;j++){
                                System.out.print(" ");
                        }
                        for(int j=1;j<=2*i-1;j++){
                                System.out.print("*");
                        }
                        System.out.println();

                }

        }
        public static void main(String[] args) {
                hollow_rectangel(4, 5);
                inverted_rotated_pyramid(4);
                inverted_half_pyramid_withnumbers(5);
                floyds_triangle(5);
                zero_one_triangle(5);
                buterfly(4);
                silod_rhombus(5);
                hollow_rhombus(5);
                diamond_pateern(4);
                
        }
}