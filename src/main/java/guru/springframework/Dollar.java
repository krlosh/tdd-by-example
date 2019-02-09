package guru.springframework;

public class Dollar extends Money{

    public Dollar(int amount) {
        super(amount);
    }

    Dollar times(int multiplier){
        return new Dollar(this.amount * multiplier);
    }

}
