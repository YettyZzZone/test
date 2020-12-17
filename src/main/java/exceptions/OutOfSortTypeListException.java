package exceptions;

import java.io.IOException;

public class OutOfSortTypeListException extends IOException {
    public OutOfSortTypeListException(String message){
        super(message);
    }
}
