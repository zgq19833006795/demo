package tset;

public class Mkeso {
    public static void main(String[] args) {
        int men = 0; //男人
        int women = 0; //女人
        int kids = 0; //小孩
        for (int n = 0;n<=30;n++){
            int nan = n*3;
            for (int nr=0;nr<=(30-n);nr++){
                int nv = n*2;
                int xh=30-(n+nr);
                if (nan+nv+xh==50){
                    System.out.println("男 = " + nan);
                    System.out.println("女 = " + nv);
                    System.out.println("小孩 = " + xh);
                }
            }
        }
    }
}
