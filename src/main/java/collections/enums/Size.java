package collections.enums;

public enum Size {
    XXL(46),
    XL(44),
    L(42),
    M(38),
    S(36),
    XS(34),
    XXS(32);

    private int numericSize;

    Size(int numericSize) {
        this.numericSize = numericSize;
    }

    public int getNumericSize() {
        return numericSize;

    }

    @Override
    public String toString() {
        return "Size{" +
                "numericSize=" + numericSize +
                '}';
    }
}
