

public class methodtest1 { 
    public static void main ( String [] args ) { 
         
    	exam();

    }
 
    public static void exam ( ) {
        boolean notDone = true;

        while ( notDone ) {
              System.out.println("Working");
              notDone = false;
        }

        System.out.println ( "Finish exam" );
        System.out.println ( "Time to relax" );
  }
    
}