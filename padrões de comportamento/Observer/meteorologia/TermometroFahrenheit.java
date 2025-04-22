public class TermometroFahrenheit implements Observer {
    public void update(Subject sub){
        double temp = ((Temperatura) sub).getTemp();
        temp = (temp*1.8)+32;
        System.out.println("A temperatura em graus Farenheint é de: "+ temp);
    }
}
