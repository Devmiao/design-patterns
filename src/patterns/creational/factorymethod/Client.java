package patterns.creational.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        PlanFactory planFactory = new PlanFactory();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine().toUpperCase();

        int units = Integer.parseInt(br.readLine());

        Plan planType = planFactory.getPlan(planName);

        planType.getRate();

        System.out.println("Bill Amount for " + planName + " plan for " + units + " units is: " + planType.calculateBill(units));
    }
}
