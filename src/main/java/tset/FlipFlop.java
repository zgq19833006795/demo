package tset;

public class FlipFlop {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i%3==0){
                if (i%5==0){
                    System.out.println("FlipFlop");
                }else {
                    System.out.println("Flip");
                }
            }else if (i%5==0){
                System.out.println("Flop");
            }else {
                System.out.println("i = " + i);
            }
        }
    }
}
