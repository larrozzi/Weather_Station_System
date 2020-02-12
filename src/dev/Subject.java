package dev;

public interface Subject {

	public void attachObserver(Observer o);
	public void detachObserver(Observer o);
	public void notifyObservers();
	
}
