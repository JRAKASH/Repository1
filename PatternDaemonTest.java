public class PatternDaemonTest {
    public static void main(String args[]) {

        Runnable daemonRunner = new Runnable() {

            public void run() {
                   for (int n=0;n<=99;n++) {
                    System.out.println("I'm a Daemon Thread");
                    System.out.println(" Welcome To 2 0 2 3 Years .....Welcome .... ");
                    System.out.println("2 0 2 3 ...2 0 2 3...2 0 2 3...");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ignored) {
                    }
                }
            }
        Thread daemonThread = new Thread(daemonRunner);
        daemonThread.setDaemon(true);
        daemonThread.start();
        try {

            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Done.");
    }

}
