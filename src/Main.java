public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculate = new CreditPaymentService();
        int time = 12;
        int sumCredit = 1000000;
        double rate = 9.99;
        double creditPayment = calculate.credit(time, sumCredit, rate);
        System.out.println(creditPayment);
    }
}
