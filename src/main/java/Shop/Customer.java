package Shop;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String surnameFirstNamePatronymic;
    private int age;
    private String phone;
}
