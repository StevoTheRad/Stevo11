public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1000_000;// Сумма кредита
        int loanTerm = 3;// Срок займа в годах
        int payment = service.calculate(creditSum, 12 * loanTerm); // Ежемесячный платеж
        System.out.println("Ежемесячный платеж составляет - " + payment + " руб.");
    }
}