// reverses string 12345

import java.util.*;

public class lab0 {
    public static void main(String[] args) {
        String string_to_reverse = "12345";
        StringBuilder reversed = new StringBuilder(string_to_reverse).reverse();
        System.out.println(string_to_reverse+" reversed is "+reversed);
    }
}
