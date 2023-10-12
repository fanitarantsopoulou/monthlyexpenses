package monthlyexpenses;
public class MaxLimitExceededException extends Exception{
    public MaxLimitExceededException(String message) {
        super(message);
    }
}
