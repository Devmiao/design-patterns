package patterns.creational.factorymethod;

public class PlanFactory {

    public Plan getPlan(String planTypeLiteral) {
        Plan planType;
        switch (planTypeLiteral) {
            case "DOMESTIC":
                planType = new DomesticPlan();
                break;
            case "COMMERCIAL":
                planType = new CommercialPlan();
                break;
            case "INSTITUTIONAL":
                planType = new InstitutionalPlan();
                break;
            default:
                planType = null;
        }
        return planType;
    }
}
