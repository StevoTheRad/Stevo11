public class CreditPaymentService {

    public int calculate(int sum, int monthAmount) {
        return (int) (sum * (0.008325 + (0.008325 / (Math.pow(1.008325, monthAmount) - 1))));
    }
}
