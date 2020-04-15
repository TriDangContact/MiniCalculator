public abstract class Calculator implements Multiplier, Divider {
    protected int total;

    public Calculator() {
        total = 1;
    }

    @Override
    public void multiply(int y) {
       total = total * y;
    }

    @Override
    public void divide(int y) {
        total = total/y;
    }

    public abstract int calculate();
}
