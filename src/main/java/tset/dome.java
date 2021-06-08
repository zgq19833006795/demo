package tset;

public class dome {
    public static void main(String[] args) {
       /* int rabbitNum=0;
        for (int chookNum =0; chookNum <=35;chookNum++){
            rabbitNum = 35-chookNum;
            if (2*chookNum + 4*rabbitNum == 94){
                System.out.println("鸡是 = " + chookNum + "兔子是 = " + rabbitNum);
                break;*/
        /*int rows = 5;
        for (int i =1;i<=rows; i++){
            for (int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println("\n");
        }*/


        int way = 1;
        int k = 0;
        for (int i=1;i<=20;i++){
            for (int j = 1; j <=33; j++){
                k = 100-i-j;
                if (k%3 == 0 && (5*i+3*j+k/3 == 100)){
                    System.out.print("[买法"+way++ +"]");
                    System.out.println("公鸡 = " + i+"母鸡 = " + j+"雏鸡 = " + k);
                }
            }
        }
    }
}
