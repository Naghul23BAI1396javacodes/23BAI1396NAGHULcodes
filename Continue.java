public class Continue {
    public static void main(String[] args) {
        int number=6;
        for(int i=1;i<=number;i++){
            if (i==4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
