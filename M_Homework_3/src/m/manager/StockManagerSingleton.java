package m.manager;

public class StockManagerSingleton {
    private static StockManagerSingleton instance;
    private String inventoryFilePath;

    private StockManagerSingleton(String filePath) {
        this.inventoryFilePath = filePath;
        // Initialization code here
    }

    public static StockManagerSingleton getInstance(String filePath) {
        if (instance == null) {
            instance = new StockManagerSingleton(filePath);
        }
        return instance;
    }

    // Stock management methods here

}

