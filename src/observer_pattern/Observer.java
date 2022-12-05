package observer_pattern;

public abstract class Observer {
    public abstract void notify(Subject subject, Object arg);
    protected Subject subject;
}
