public class DaemonThreadPrintPattern {
 
   
    public static void main(String[] args) {
 
        // Create a new daemon thread and start it
        Thread daemonThread = new Thread();
        daemonThread.setDaemon(true);
        daemonThread.start();
 
        // Create a new user thread and start it
        Thread userThread = new Thread(new UserThread());
        userThread.start();
   }
}
    class UserThread implements Runnable {
 
    public void run() {
 
        try {
            
            System.out.println("User thread is running");
            System.out.println("Welcome to 2 0 2  3 Year ...");
            int n=5;
            int i, j;  
        for(i=0; i<n; i++) 
            
            {           
                System.out.print("* \n");
            } 
            for( j=0; j<=2; j++) 
            {       
                System.out.print("Welcome to 2 0 2  3 Year ..."+"+ "); 
            }           
            System.out.println();
                Thread.sleep(2500);
                System.out.println(); 
             while(true)
               System.out.println("Welcome to 2 0 2  3 Year ...");   
        } catch (InterruptedException ie) {
            ie.printStackTrace();
 
        } finally {
            System.out.println("Finnally  block User Thread exiting");
        }
    }
 
    }
