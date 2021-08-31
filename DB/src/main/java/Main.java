import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: wxy
 * @create: 2021-08-26 14:24
 **/

public class Main {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[+-]?[0-9]+(\\.[0-9]{1,4})?");
        Matcher matcher = pattern.matcher("234.234");
        System.out.println(matcher.matches());
    }
}
