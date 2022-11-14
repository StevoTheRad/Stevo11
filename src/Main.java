public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1000_000;// Сумма кредита
        int loanTerm = 2;// Срок займа в годах
        int payment = (int) service.calculate(creditSum, loanTerm * 12); // Ежемесячный платеж
        System.out.println("Ежемесячный платеж составляет - " + payment + " руб.");
    }
}