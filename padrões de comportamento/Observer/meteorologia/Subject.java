import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Subject {
    private List<Observer> observers;

    public Subject (){
        this.observers = new ArrayList<Observer>();
    
    }
    public void addObserver(Observer obs){
        this.observers.add(obs);
    }

    public void removeObserver(Observer obs){
        this.observers.remove(obs);
    }

    public void notifyObserver(){
        Iterator<Observer> it = this.observers.iterator();
        while(it.hasNext()){
            Observer obs = it.next();
            obs.update(this);
        }
    }
}
