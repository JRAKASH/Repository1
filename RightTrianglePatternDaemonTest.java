public class RightTrianglePatternDaemonTest {
4
5
    public static void main(String args[]) {
7
        Runnable daemonRunner = new Runnable() {
8
            public void run() {
9

10
                while (true) {
11
                    System.out.println("I'm a Daemon.");
12
                    // Sleep for half a second
13
                    try {
14
                        Thread.sleep(1000);
15
16
                    } catch (InterruptedException ignored) {
17
18
                    }
19
                }
20
            }
23
        Thread daemonThread = new Thread(daemonRunner);
24
        daemonThread.setDaemon(true);
25
        daemonThread.start();
26
        // Sleep for five seconds
27
        try {
28
            Thread.sleep(5000);
29
30
        } catch (InterruptedException ignored) {
31
        }
32
        System.out.println("Done.");
33
    }
34
}
