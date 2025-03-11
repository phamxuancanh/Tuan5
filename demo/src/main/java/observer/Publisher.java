package observer;

public interface Publisher {
    void attach (Observer observer);
    void detach (Observer observer);
    void notifyObserver();
}
