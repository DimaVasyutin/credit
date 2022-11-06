public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculate = new CreditPaymentService();
        int timeCredit = 36;
        int sumCredit = 1000000;
        double rateCredit = 9.99;
        double creditPayment = calculate.credit(timeCredit, sumCredit, rateCredit);
        System.out.println(creditPayment);
    }
}
