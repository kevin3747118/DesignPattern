import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

  public static void main(String[] args) throws Exception {
//    exampleSerialization();
    exampleReflection();
  }

  private static void exampleSerialization() throws IOException, ClassNotFoundException {
//    LazySingleton lazySingleton = LazySingleton.getInstance();
//    ObjectOutputStream objectOutputStream = new ObjectOutputStream(
//        new FileOutputStream("object.obj"));
//    objectOutputStream.writeObject(lazySingleton);
//    objectOutputStream.close();
//    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object
//    .obj"));
//    LazySingleton deserializedLazy = (LazySingleton) objectInputStream.readObject();
//    objectInputStream.close();
//    System.out.println("Object 1 :" + lazySingleton.hashCode());
//    System.out.println("Object 2 :" + deserializedLazy.hashCode());

    SerializableSingleton serializableSingleton = SerializableSingleton.getInstance();
    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(
        new FileOutputStream("object1.obj"));
    objectOutputStream2.writeObject(serializableSingleton);
    objectOutputStream2.close();
    ObjectInputStream objectInputStream2 = new ObjectInputStream(
        new FileInputStream("object1.obj"));
    SerializableSingleton deserializedInstance =
        (SerializableSingleton) objectInputStream2.readObject();
    objectInputStream2.close();
    System.out.println("SerializableSingleton Object 1 :" + serializableSingleton.hashCode());
    System.out.println(" SerializableSingleton Object 2 :" + deserializedInstance.hashCode());

  }

  private static void exampleReflection()
      throws InvocationTargetException, InstantiationException, IllegalAccessException {
    Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
    //Knowing only one constructor taking it using index
    Constructor constructor = constructors[0];
    constructor.setAccessible(true);
    LazySingleton lazySingleton = (LazySingleton) constructor.newInstance();
    LazySingleton instance = LazySingleton.getInstance();
    System.out.println("Reflected hashcode singleton :" + lazySingleton.hashCode());
    System.out.println("Singleton instance : " + instance.hashCode());

    //The Solution to this is go by enum
    EnumSingleton.INSTANCE.doSomething();
  }
}
