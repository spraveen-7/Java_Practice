public class Prac {
    public static void main(String[] args) {
        int num=7890;
        while (num>0) {
            int lastdigit=num%10;
            System.out.print(lastdigit);
            num=num/10;
        }
    }
}
