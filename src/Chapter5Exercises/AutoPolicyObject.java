package Chapter5Exercises;

import java.io.Console;
import java.security.Policy;

public class AutoPolicyObject {
    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(11111111, "Acura ZDX", "CT");
        AutoPolicy policy2 = new AutoPolicy(2222222, "Lexus", "MA");
        AutoPolicy policy3 = new AutoPolicy(3333333, "ferrari", "ME");
        AutoPolicy policy4 = new AutoPolicy(4444444, "Royce Rolls", "NH");
        AutoPolicy policy5 = new AutoPolicy(5555555, "BMW", "NJ");
        AutoPolicy policy6 = new AutoPolicy(6666666, "Porche", "NY");
        AutoPolicy policy7 = new AutoPolicy(7777777, "Bently", "PA");
        AutoPolicy policy8 = new AutoPolicy(8888888, "Lamboghini", "VT");

        PolicyInNoFaultState(policy1);
        PolicyInNoFaultState(policy2);
        PolicyInNoFaultState(policy3);
        PolicyInNoFaultState(policy4);
        PolicyInNoFaultState(policy5);
        PolicyInNoFaultState(policy6);
        PolicyInNoFaultState(policy7);
        PolicyInNoFaultState(policy8);
    }

    public static void PolicyInNoFaultState(AutoPolicy policy) {
        System.out.println("The Auto Policy:");
        System.out.printf("Account#:%d; Car: %s%n State %s %s%n A No Fault State %n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not"));

    }

}

