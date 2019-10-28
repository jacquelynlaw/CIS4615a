/**
 * ERR00-J. Do not suppress or ignore checked exceptions
 * Exception is not propagated forward:
 *  Arises when we ignore exceptions in trivial try catch
 * Prevention:
 *  Allow exception to propagate outwards
 */
public class R07_ERR00_J {
    public static void main(String args[]) {
        Foo fooSample = new Foo();
        fooSample.run();
    }
}

class Foo implements Runnable {
    public void run() {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.err.println(e);
        Thread.currentThread().interrupt(); // Reset interrupted status
      }
    }
  }