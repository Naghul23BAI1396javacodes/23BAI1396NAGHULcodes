public class DowhileLoop {
    public static void main(String[] args) {
        int number=7;
        int i=1;
        int fact=1;
        do{
            fact=fact*i;
            i++;
        }
        while(i<=number);
        System.out.println(number+" factorial is:"+fact);
    }
}
