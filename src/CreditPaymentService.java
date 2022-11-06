
public class CreditPaymentService {
    public double credit(int timeCredit, int sumCredit, double rateCredit) {
        //double i = (Math.pow(1.00 + c/100D, 1/12D) - 1); - есть такой вариант расчета помесячного процента
        double monthlyRate = (rateCredit / 100) / 12; // помесячный процент
        double annuityRatio = (monthlyRate * Math.pow(monthlyRate + 1, timeCredit)) / (Math.pow(monthlyRate + 1, timeCredit) - 1);

        int payment = (int) (sumCredit * annuityRatio);
        return payment;

    }
}
