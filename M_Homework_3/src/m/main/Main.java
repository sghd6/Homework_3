package m.main;

public class Main {
		
		public static void main(String[] args) {
			
			// Main function goes here
		StockManagerSingleton stockManagerSingleton = new StockManagerSingleton();
		
		boolean fileReadStatus = stockManagerSingleton.initializeStock("Files/inventory.csv");
		
			
		}
}
