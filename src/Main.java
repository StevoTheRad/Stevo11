public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int a = 1000_000;// Сумма кредитп
        int b = 3;// Срок займа в годах
        int myResult = service.calculate(a,12*b);
        System.out.println(myResult);
    }
}