package garrage;

public class Receipt {
    private String repairType;
    private double totalPrice;
    private int count;
    private double price;

    public Receipt(String repairType, double price, int count) {
        this.repairType = repairType;
        totalPrice = price * count;
        this.count = count;
        this.price = price;
    }


    public void printReceipt(){
        System.out.printf("Typ naprawy %s , ilosc %d , cena %.2f zl,laczna cena %.2f zl\n",
                repairType, count,price, totalPrice);
    }
}
