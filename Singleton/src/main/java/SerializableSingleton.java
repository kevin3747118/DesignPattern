import java.io.Serializable;

/**
 * Let's say your singleton has implemented serialization. Now what will happen if you serialize
 * object and deserialize? During deserialization, it will create a new object every time if we go
 * in a traditional way. To resolve it add readResolve method which will ensure that during
 * deserialize we return same instance. Check Main class for violation example
 */

public class SerializableSingleton implements Serializable {

  private static SerializableSingleton instance = null;

  private SerializableSingleton() {

  }

  public static SerializableSingleton getInstance() {
    if (null == instance) {
      instance = new SerializableSingleton();
    }

    return instance;
  }


  /**
   * This is the key method which is responsible during deserialization process This method gets
   * invoked, and we are simply returning an already created object
   *
   * @return
   */
  protected Object readResolve() {
    return instance;
  }
}
