public class CreditPaymentService {
    public double calculate (long amount, double interestRate, long Month) {
        return amount * ((interestRate/100/12) + ((interestRate/100/12)/((Math.pow(1+(interestRate/100/12),Month)) -1)));
    }
    }

