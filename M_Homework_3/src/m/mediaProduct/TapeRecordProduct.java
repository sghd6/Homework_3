package m.mediaProduct;

public class TapeRecordProduct extends MediaProduct {

    // Constructor that uses the 'super' keyword to initialize attributes inherited from MediaProduct
    public TapeRecordProduct(String title, double price, int year, Genre genre) {
        super(title, price, year, genre);
    }

    // Copy constructor to prevent information leaks
    public TapeRecordProduct(TapeRecordProduct other) {
        super(other); // Calls the copy constructor of the superclass (MediaProduct)
    }

    // Override the toString() method if necessary to include additional Tape-specific details
    @Override
    public String toString() {
        return "TapeRecordProduct{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", genre=" + genre +
                '}';
    }
}


