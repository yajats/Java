class HardwareStore {
    // static fields
    public static final int DEFAULT_PRODUCT_COUNT = 100;
    private static String headQuarterAddress = "123 First street, Santa Clara, CA 94024";
    // static methods
     public static String getHeadQuarterAddress ( )  { return headQuarterAddress; }
   // instance fields
   int productCount;
   // constructors
   public HardwareStore ( ) {  productCount = DEFAULT_PRODUCT_COUNT; }  
   // accessor and mutator methods
   int getProductCount ( ) { return productCount; }
   void setProductCount ( int startProductCount ) { productCount = startProductCount; }
   // behavior methods
    public void sellProduct ( ) { }
    
    
    public String toString ( ) {
        String info = "";
        info += "HQ Address: " +  HardwareStore.getHeadQuarterAddress ( ) + "\n";
        info += "Product Count: " + productCount;
        return info;
   }
}
 



public class testingAssignment5 {
	public static void main(String[] args){
		HardwareStore hardwareStore = null;
		hardwareStore = new HardwareStore ( );
		
		System.out.println ( hardwareStore );   
		
	   }
}
	
