package multithreading;

public class SingletonDoubleLocking {

  private volatile static SingletonDoubleLocking uniqueInstance;

  private SingletonDoubleLocking() {
  }

  public static SingletonDoubleLocking getInstance() {
    if (uniqueInstance == null) {
      synchronized (SingletonDoubleLocking.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new SingletonDoubleLocking();
        }
      }
    }
    return uniqueInstance;
  }
}
