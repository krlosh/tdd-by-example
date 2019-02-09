package guru.springframework;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        return this.amount == ((Dollar) obj).amount;
    }
}
