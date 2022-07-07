public class Main {
    public static void main(String[] args) {
        int cost = 7499;
        int mile;
        if (cost < 20) {
            mile = 0;
        } else {
            mile = cost / 20;
        }
        System.out.println("Начислится бесплатных миль: " + mile);
    }
}
