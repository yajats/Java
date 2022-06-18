import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoothillMarket {
	public static void main(String[] args) {
		OnlineSuperMarket market = null;
		market = new OnlineSuperMarket();
		
		market.init();
		market.showFruits();
		market.sort();
		market.showFruits();
		market.run();
	}
}

class Fruit{
	private String fruitName;
	private double weight;
	private double pricePerLb;
	
	public static final String DEFAULT_FRUIT = "?";
	public static final double DEFAULT_WEIGHT = 0.0;
	public static final double DEFAULT_PRICEPERLB = 0.0;
	
	public Fruit(){
		fruitName = Fruit.DEFAULT_FRUIT;
		weight = Fruit.DEFAULT_WEIGHT;
		pricePerLb = Fruit.DEFAULT_PRICEPERLB;
	}

	public Fruit(String fruitName, double weight, double pricePerLb) {
		this.fruitName = fruitName;
		this.weight = weight;
		this.pricePerLb = pricePerLb;
	}
	
	public String getName(){return fruitName;}
	public Fruit setName(String newName) {
		fruitName = newName;
		return this;
	}
	
	public double getWeight() {return weight;}
	public Fruit setWeight(double newWeight) {
		weight = newWeight;
		return this;
	}
	
	public double getPrice() {return pricePerLb;}
	public Fruit setPrice(double newPrice) {
		pricePerLb = newPrice;
		return this;
	}
	
	public double order(double orderedWeight) {
		if (orderedWeight > weight) {
			return -1;
		}
		else {
			weight -= orderedWeight;
			return orderedWeight * pricePerLb;
		}
	}
	
	public boolean equals(Object other) {
		if (this == other) {
            return true;
		}
        if (other == null) {
        	return false;
        }
        if (! ( other instanceof Fruit)) {   
             return false;
        }
        
        Fruit comparedPoint  = (Fruit) other;  
        return ( fruitName == comparedPoint.fruitName && weight == comparedPoint.weight && pricePerLb == comparedPoint.pricePerLb);
        
	}
	
	public String toString() {
		String formatString = String.format("%25s %5.2f %5.2f", fruitName, weight, pricePerLb);
		return formatString;
	}
	
}

class OnlineSuperMarket{
	private static BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
	
	private Fruit [] fruits;
	private String superMarketName;
	private String webAddress;
	
	public static final double TAX_RATE = 0.095;
	public static final int FRUITS_SIZE = 10;
	public static final String STORE_NAME = "TBD";
	public static final String WEB_ADDRESS = "www.unknown.com";
	boolean inMenu = true;
	
	public OnlineSuperMarket() {
		superMarketName = OnlineSuperMarket.STORE_NAME;
		webAddress = OnlineSuperMarket.WEB_ADDRESS;
		fruits = new Fruit [OnlineSuperMarket.FRUITS_SIZE];
		
		for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new Fruit(); 
       }
	}
	
	public OnlineSuperMarket(String superMarketName, String webAddress) {
		this.superMarketName = superMarketName;
		this.webAddress = webAddress;
		fruits = new Fruit [OnlineSuperMarket.FRUITS_SIZE];
		
		for (int i = 0; i < fruits.length; i++) {
            fruits[i] = new Fruit(); 
            
		}
	}
	
	public String getName() {return superMarketName;}
	public void setName(String newName) {superMarketName = newName;}
	public String getAddress() {return webAddress;}
	public void setAddress(String newAddress) {webAddress = newAddress;}
	
	public void init() {
		String [] fruitNames = {"Apple", "Banana", "Orange", "Strawberry", "Pear", "Grape", "Mango", "Rambutan", "Watermelon", "Apricot"};
		double [] totalWeight = {1, 2, 3, 4, 5, 6, 7, 8.5, 9, 10};
		double [] priceArr = {0.5, 1.35, 4.3, 2.5, 3.4, 8.2, 3.4, 2.2, 1.8, 5.4};
		
		for (int i = 0; i < fruitNames.length; i++) {
			if (i % 2 == 0) {
				fruits[i] = new Fruit(fruitNames[i], totalWeight[i], priceArr[i]);
			}
			else {
				fruits[i].setName(fruitNames[i]).setWeight(totalWeight[i]).setPrice(priceArr[i]);
			}
		}
	}
	
	public void sort() {
		boolean swapped = true;
		int j = 0;
		Fruit tempFruit = null;
		while (swapped) {
			swapped = false;
		    j++;
		    for (int i = 0; i < fruits.length - j; i++ ) {
		    	if (fruits[i].getName().compareTo(fruits[i + 1].getName()) > 0) {
		    		tempFruit = fruits[i];
		            fruits[i] = fruits[i + 1];
		            fruits[i + 1] = tempFruit;
		            swapped = true;
		        }
		    }
		}
	}
	
	public void run() {
		 
		
		System.out.println(" 	--------------------------------------------");
		System.out.println("   Your most convenient and time saving way to order fruit from");
		System.out.println("");
		System.out.println("  	|              FOOTHILL CS SUPER MARKET         |");
		System.out.println("  	|         http://www.fh.cs.supermarket.com      |");
		System.out.println("");
		System.out.println("  	--------------------------------------------");
		System.out.println("");
		
		do {
			
			System.out.println("Enter a fruit name or Q (or q) to end: ");
			
			String choice = null;
			try {
				choice = OnlineSuperMarket.reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if (choice.equals("Q") || choice.equals("q")) {
				quit();
			}
			else {
				Fruit foundFruit = find(fruits, choice);
				if (foundFruit == null) {
					System.out.println("Sorry, the fruit is not in stock.");
				}
				else {
					System.out.println("Enter weight in lbs: ");
					
					double weightChoice = 0.0;
					try {
						weightChoice = Integer.parseInt(OnlineSuperMarket.reader.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
					
					double ordered = foundFruit.order(weightChoice);
					
					if (ordered == -1) {
						System.out.println("Sorry! We do not have that much of the fruit in stock. Please choose a lower amount.");
					}
					else{
						double plusTax = ordered + ordered * OnlineSuperMarket.TAX_RATE;
						System.out.println("You ordered: ");
						System.out.println("");
						System.out.println("Fruit: " + choice);
						System.out.println("");
						System.out.println("Weight: " + weightChoice);
						System.out.println("");
						System.out.println("Price: " + foundFruit.getPrice());
						System.out.println("");
						System.out.println("Total cost (plus tax): " + plusTax);
					}
				}
			}
			
			
		} while(inMenu);
	}
	
	public void showFruits() {
		for (Fruit fruit : fruits) {
			System.out.println(fruit);
		}
	}
	
	private void quit() {
		showFruits();
		System.out.println("Thanks for your visit. Please come again!");
		inMenu = false;
	}
	
	private Fruit find( Fruit [] list, String target) {
		 int firstIndex = 0;
	     int lastIndex = list.length - 1;
	     int middleIndex = 0;

	      while ( firstIndex <= lastIndex ) {
	             middleIndex = (firstIndex + lastIndex) / 2;
	             if (list[middleIndex].getName().equals(target)) {     // found a match - return target location immediately (different approach than the linear search algorithm)
	                  return list[middleIndex];
	             }
	             else if (list[middleIndex].getName().compareTo(target) > 0) {    // target should belong to the lower half
	                       lastIndex = middleIndex - 1;
	             }
	             else {    // target should belong to the upper half.
	                       firstIndex = middleIndex + 1;
	             }
	       }

	       return null;   // no match found
	}
}

