package patterns.creational.factorymethod;

public class CommercialPlan extends Plan{

    @Override
    public void getRate() {
        this.rate = 25.50;
    }
}
