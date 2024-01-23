package Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerException extends RuntimeException {
    public CustomerException() {

    }

    public CustomerException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Покупателя не существует";
    }
}
