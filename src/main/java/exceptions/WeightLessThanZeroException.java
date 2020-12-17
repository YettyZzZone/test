package exceptions;

public class WeightLessThanZeroException extends RuntimeException {
    public WeightLessThanZeroException(String message) {
        super(message);
    }
}
