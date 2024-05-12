package multithreading;

public class SingletonEagerly {

  private static SingletonEagerly uniqueInstance = new SingletonEagerly();

  private SingletonEagerly() {
  }

  public static SingletonEagerly getInstance() {
    return uniqueInstance;
  }
}
