public class CreditPaymentService {

    public int calculate (int s, int n) {
       int result = (int) ( s * (0.008325 + (0.008325/(Math.pow(1.008325,n) - 1))));
       return result;
    }
}
