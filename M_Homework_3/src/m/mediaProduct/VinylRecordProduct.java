package m.mediaProduct;

public class VinylRecordProduct extends MediaProduct {

    // Constructor that uses attributes inherited from MediaProduct
    public VinylRecordProduct(String title, double price, int year, Genre genre) {
        super(title, price, year, genre);
    }

    // Copy constructor to prevent information leaks
    public VinylRecordProduct(VinylRecordProduct other) {
        super(other); // Calls the copy constructor of the superclass (MediaProduct)
    }

    // Override the toString() method if necessary to include additional Vinyl-specific details
    @Override
    public String toString() {
        return "VinylRecordProduct{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", genre=" + genre +
                '}';
    }
}


