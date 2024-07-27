public class WhileLoop {
    public static void main(String[] args) {
        int number=6;
        int fact=1;
        int i=1;
        while (i<=number) {
            fact=fact*i;
            i++;
        }
        System.out.println(number+" factorial is "+fact);
    }
}
