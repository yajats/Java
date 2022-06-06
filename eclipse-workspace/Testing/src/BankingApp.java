import  java.io.*;
import  java.util.*;
 

//  -----------------------------------------------------------------------------------------------------------------

public class BankingApp {
        public static void main ( String [] args ) {
                   BankAccount bankAccount = new BankAccount ("Jane", 12345, 100.00);

                   bankAccount.processTranferTransaction ( );
        }
}
//  -----------------------------------------------------------------------------------------------------------------

class BankAccount  {
   // static fields (should be made private static or public static final) and are initialized at declaration.
    public static final int BANK_ROUTING_NUMBER = 220873691;
    public static final String DEFAULT_CUSTOMER_NAME = "Jane Doe";
    public static final int DEFAULT_ACCOUNT_NUMBER = 0;
    public static final double DEFAULT_BALANCE = 0.0;         
  
    // instance fields (should be made private) - do not initialize here or initialization blocks, do it in constructors.
     private String customerName;
     private int accountNumber;
     private double balance;

     // constructors  -- it's desirable to provide both default constructor and non-default constructor. They should be made public.
     public BankAccount ( ) {  
          customerName = BankAccount.DEFAULT_CUSTOMER_NAME;
          accountNumber = BankAccount.DEFAULT_ACCOUNT_NUMBER;  
          balance = BankAccount.DEFAULT_BALANCE;
     }

     public BankAccount ( String startCustomerName, int startAccountNumber, double startBalance ) {  
           customerName = startCustomerName;
           accountNumber = startAccountNumber;
           balance = startBalance;
     }       
               
     // accessor and/or mutator methods (should be public). I will only show balance accessor/mutator here as illustrations.
      public double getBalance ( )  { return balance; }
      public void setBalance ( double startBalance)   { balance = startBalance; }
                   
     // Behavior instance methods (mostly public - some might be declared as private for internal usage.
      public void deposit  ( double amount )  {  
             if ( amount > 0 ) {
                  balance += amount; 
             }
       }       
       
       public void processTranferTransaction {  }  // just for illustrations - more logic to be added
               
     // Overriding super class methods (methods defined in the Object class in particular: toString ( ) and equals ( ).

      public String toString ( ) {
            return  new String ( customerName + ":" + accountNumber + ":" + balance);
      } 

    public boolean equals ( Object other )  {  // to properly compare objects in Java
             // if the object compare with itself like account.equals (anotherAccount) where both account and anotherAccount points to the same BankAccount object.
             if ( other == this ) {
                   return true;
             }
              if ( other == null ) {
                  return false;
              }
              // if other is not an instance of BankAccount then they're not equals.
              if  ( ! ( other instanceof BankAccount) ) {
                    return false;
              }
              // typecast then compare
             BankAccount comparedAccount = (BankAccount) other;
                
              return  accountNumber == comparedAccount.accountNumber &&
                          customerName  == comparedAccount.customerName &&
                          balance == comparedAccount.balance;  
      }   
}