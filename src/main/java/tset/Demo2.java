package tset;

public class Demo2 {
    public static void main(String[] args) {
       /* int sum = 0;
        for (int i=2;i<=100;i=i+2){
            sum = sum+i;
        }
        System.out.println("sum = " + sum);*/


        for (int m=1;m<=9;m++){
            for (int n=1;n<=9;n++){
                System.out.print(m+" "+"X"+" "+n+" "+"="+" "+m*n+" "  );
            }
            System.out.print("\n");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        for (int i = 1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+""+"x"+""+j+""+"="+" "+i*j+"  ");
            }
            System.out.print("\n");
        }



    }
}
