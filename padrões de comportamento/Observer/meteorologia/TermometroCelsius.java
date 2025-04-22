public class TermometroCelsius implements Observer {

    @Override
    public void update(Subject sub) {
        double temp = ((Temperatura) sub).getTemp();
        System.out.println("A temperatura em graus Celsius é de: " + temp);
    }
}
