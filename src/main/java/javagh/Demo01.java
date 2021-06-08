package javagh;

public class Demo01 {
    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x==y);
        Integer z = Integer.valueOf(123);
        Integer b = Integer.valueOf(123);
        System.out.println(z==b);
    }
}
