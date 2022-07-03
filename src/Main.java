public class Main {
    public static void main(String[] args) {
        int cost = 7499;
        int x = 20;
        int mile;
        if (cost < x) {
            mile = 0;
        } else {
            mile = cost / x;
        }
        System.out.println("Начислится бесплатных миль: " + mile);
    }
}
