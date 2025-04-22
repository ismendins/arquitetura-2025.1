public class Main {
    public static void main(String[] args) {
        Temperatura temp = new Temperatura();
        TermometroCelsius cel = new TermometroCelsius();
        TermometroFahrenheit far = new TermometroFahrenheit();
        TermometroKelvin kel = new TermometroKelvin();
        temp.addObserver(cel);
        temp.addObserver(far);
        temp.addObserver(kel);
        
        temp.setTemp(10.0);
        temp.setTemp(0.0);
        temp.setTemp(100.0);


    }
}
