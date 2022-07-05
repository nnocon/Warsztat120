package collections.enums;

public class Shirt {

    private String size;

    public Shirt(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void getNumericSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                '}';
    }
}
