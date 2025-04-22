public class Temperatura extends Subject{
    private double temp;

    public Temperatura(){
        super();
        this.temp = 0.0;
    }

    public double getTemp(){
        return this.temp;
    }

    public void setTemp(double temp){
        this.temp = temp;
        this.notifyObserver();

    }


}
