/**
 * Lazy initialization mean application will create instance when it is requested.
 * However, this can be used when you have non-thread-safe application. If used in multi threading it might break,
 * Why? because your getinstance method if invoked by two threads at same time, then!!!!
 *
 * When to use? Non-thread safe and creating common resources like db connection.
 *
 */

public class LazySingleton {

  private static LazySingleton instance = null;

  private LazySingleton() {
  }

  public static LazySingleton getInstance() {
    if (null == instance) {
      instance = new LazySingleton();
    }
    return instance;
  }

}
