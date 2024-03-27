package se.lexicon.model;

public enum Currency {
        ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100), TWO_HUNDRED(200), FIVE_HUNDRED(500), THOUSAND(1000);

        private final double amount;

        Currency(double amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }


