package patterns.creational.factorymethod;

public class DomesticPlan extends Plan{

    @Override
    public void getRate() {
        this.rate = 10.50;
    }
}
