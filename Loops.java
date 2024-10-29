public class Loops {
    public static void main(String[] args) {
        int i=0;
        for (i=0; i < 10; i++) {
            System.out.print("Git  ");
        }
        while (i>0) {
            System.out.println("While");
            i--;
        }
        System.out.println(i);
        do {
            System.out.println("dowhile");
            i++;
        } while (i!=10);
    }
}
