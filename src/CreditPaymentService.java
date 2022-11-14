public class CreditPaymentService {

    public double calculate(int sum, int monthAmount) {
        double percent = 9.99 / (100 * 12);// 1/100 доля процентной ставки в месяц согласно формуле (не зависит от срока займа)
        return (sum * (percent + (percent / (Math.pow(1 + percent, monthAmount) - 1))));
    }
}
