package collection.collection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmploeeAlreadyAddedException extends RuntimeException{
    public EmploeeAlreadyAddedException() {
    }

    public EmploeeAlreadyAddedException(String message) {
        super(message);
    }

    public EmploeeAlreadyAddedException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmploeeAlreadyAddedException(Throwable cause) {
        super(cause);
    }

    public EmploeeAlreadyAddedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
