public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthPayment12 = service.calculate(1000000,9.99,12);
        System.out.println(monthPayment12);
        double monthPayment24 = service.calculate(1000000,9.99,24);
        System.out.println(monthPayment24);
        double monthPayment36 = service.calculate(1000000,9.99,36);
        System.out.println(monthPayment36);

    }
}
