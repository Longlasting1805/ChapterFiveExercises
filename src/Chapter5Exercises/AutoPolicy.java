package Chapter5Exercises;

public class AutoPolicy {
    public static void main(String[] args) {

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if ((state.equals("CT") ||state.equals("MA") ||state.equals("ME")  ||state.equals("NH")  ||state.equals("NJ")  ||state.equals("NY")  ||state.equals("PA")  ||state.equals("VT") )){
            state = state;
        }else{
            System.out.println("the state code is wrong");
        }
    }

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }
    public boolean isNoFaultState(){

            boolean noFaultState = switch (state) {
                case "CT", "MA", "ME", "NH", "NJ", "NY", "PA", "VT" -> true;
                default -> false;
            };
        return noFaultState;

    }

}
