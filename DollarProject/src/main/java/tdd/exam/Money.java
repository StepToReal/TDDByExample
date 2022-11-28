package tdd.exam;

public abstract class Money {
    protected int amount;

    static Money dollar(int amount) {
        return new Dollar(amount);
    }

    static France france(int amount) {
        return new France(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount &&
                getClass().equals(money.getClass());
    }
}
