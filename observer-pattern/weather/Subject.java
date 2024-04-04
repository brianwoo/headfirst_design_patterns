package weather;

interface Subject {

  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObservers();

}