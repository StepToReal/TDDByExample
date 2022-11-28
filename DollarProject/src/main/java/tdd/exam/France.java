package tdd.exam;

public class France extends Money{

    public France(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new France(amount * multiplier);
    }

}
