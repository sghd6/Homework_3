package m.manager;

public class StockManagerSingleton {
    private static StockManagerSingleton instance;
    private String inventoryFilePath;

    private StockManagerSingleton(String filePath) {
        this.inventoryFilePath = filePath;
        // Initialization code here
    }

    public StockManagerSingleton()
    {
    	mediaProducts = new MediaProduct[0];
    }

////Initialize Stock Function
    public boolean initializeStock(String inventoryFilePath){
    	try{
    		ArrayList<MediaProduct> productList = new ArrayList<MediaProduct>();
			Scanner fileIn = new Scanner(new FileInputStream(inventoryFilePath));
				fileIn.useDelimiter(",");
				String lineOfText = fileIn.nextLine();
            
				while(fileIn.hasNext())
				{
					//Variable Declaration, including print statements for bug testing.
					 String type = fileIn.next();
					 	//System.out.println("Type" + type);
					 String title = fileIn.next();
					 	//System.out.println("Title" + title);
					 double price = fileIn.nextDouble();
					 	//System.out.println("Price" + price);
					 int year = Integer.parseInt(fileIn.next());
					 	//System.out.println("Year" + year);
					 
					 /////Had issues with an effective Split function on this genre part.
					 /////I assume it is an extremely simple oversight, but I could not grasp it.
					 String genre = fileIn.next();
					 
					 	//System.out.println("Genre" + genre);
					 ////Skips to the next line to prevent a crash from the genre issue
					 if(genre.contains(""))
							 {
						 		fileIn.nextLine();
							 }
					 
					 ///Temporary value until I can parse the enum
					 Genre test = Genre.POP;
					 
					
					 MediaProduct mediaProduct = new MediaProduct(title, price, year,test);
					 addItem(mediaProduct);
				}
				fileIn.close();
		}
	catch (FileNotFoundException e){
			e.printStackTrace();
			System.out.println("Error: Data not found");
			return false;
		}
    	return true;
    }
///////AddItem Function

    public boolean addItem(MediaProduct mediaProduct) {
    	try 
    	{
        MediaProduct[] newArray = new MediaProduct[mediaProducts.length + 1];
        System.arraycopy(mediaProducts, 0, newArray, 0, mediaProducts.length);
        newArray[mediaProducts.length] = mediaProduct;
        mediaProducts = newArray;
    	}
    	catch (Exception e) 
    	{
    		System.out.println("Item could not be added");
    		return false;
    	}
    	return true;
        
    }
    
//////Get Instance Function
    public static StockManagerSingleton getInstance(String filePath) {
        if (instance == null) {
            instance = new StockManagerSingleton(filePath);
        }
        return instance;
    }

    // Stock management methods here

}

