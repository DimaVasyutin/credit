
public class CreditPaymentService {
    public double credit(int a,  int b, double c){
        //double i = (Math.pow(1.00 + c/100D, 1/12D) - 1); - есть такой вариант расчета помесячного процента
        double i = (c/100)/12;
        double k = (i * Math.pow(i+1,a)) / (Math.pow(i+1,a)-1);



        int payment = (int)(b * k);
        return payment;

    }
}
