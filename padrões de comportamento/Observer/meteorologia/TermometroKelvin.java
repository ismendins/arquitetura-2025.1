public class TermometroKelvin implements Observer{

    @Override
    public void update(Subject sub) {
        
        double temp = ((Temperatura) sub).getTemp();
        temp = (temp+273);
        System.out.println("A temperatura em graus Kelvin é de: " + temp);
    }
    
    
}
