package lang.print.gaps.task6;
    //You will be given a float number, and your task will be to find
    // a correct way to round this variable to integer variable,
    // corresponding to Math rules (requires googling). Print that variable to console.
public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int result = Math.round(numberToBeRounded);
        System.out.println(result);
    }
}
