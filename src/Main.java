public class Main {
    public static void main(String[] args) {
        int cost = 7499;
        int readout = 20;
        int mile;
        if (cost < readout) {
            mile = 0;
        } else {
            mile = cost / readout;
        }
        System.out.println("Начислится бесплатных миль: " + mile);
    }
}
