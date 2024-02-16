package m.mediaProduct;

public class CDRecordProduct extends MediaProduct {

    // Constructor that uses attributes inherited from MediaProduct
    public CDRecordProduct(String title, double price, int year, Genre genre) {
        super(title, price, year, genre);
    }

    // Copy constructor to prevent information leaks
    public CDRecordProduct(CDRecordProduct other) {
        super(other); // Calls the copy constructor of the superclass (MediaProduct)
    }

    // Override the toString() method if necessary to include additional CD-specific details
    @Override
    public String toString() {
        return "CDRecordProduct{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", genre=" + genre +
                '}';
    }
}
