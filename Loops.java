public class Loops {
    public static void main(String[] args) {
        int i=0;
        for (i=0; i < 10; i++) {
            System.out.print("Git  ");
            if (i!=5 && i<8 && i>0 && i==4) {
                break;
            }
        }
        while (i>0) {
            System.out.println("While");
            i--;
        }
        System.out.println(i);
        do {
            if (i>5) {
                i++;
                continue;
            }
            System.out.println("dowhile");
            i++;
        } while (i!=10);
    }
}
