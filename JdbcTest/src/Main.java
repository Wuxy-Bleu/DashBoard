/**
 * @description:
 * @author: wxy
 * @create: 2021-08-13 11:07
 **/

public class Main {

    public static void main(String[] args) {
        int index = "/vision/openresource.jsp?resid=I2c7c81f90172c61ac61a64f1017347818a311800".indexOf("=");
        String resId = "/vision/openresource.jsp?resid=I2c7c81f90172c61ac61a64f1017347818a311800".substring(index + 1);
        System.out.println("teste");
    }
}
