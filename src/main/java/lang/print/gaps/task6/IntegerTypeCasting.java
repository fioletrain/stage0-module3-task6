package lang.print.gaps.task6;
// Create long variable with "first" name and "1000" value.
// Assign to the variable another var, int, with "second" name. Print both.
public class IntegerTypeCasting {
    public static void main(String[] args) {
        long first = 1000L;
        int second = (int)first;
        System.out.println(first);
        System.out.println(second);
    }
}
