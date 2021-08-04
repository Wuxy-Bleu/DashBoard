import sun.misc.Launcher;
import sun.misc.URLClassPath;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @description:
 * @author: wxy
 * @create: 2021-08-03 09:24
 **/

public class Main {

    public static void main(String[] args) {
//        Class<?> aClass = Class.forName("Demo");
//        Method[] declaredMethods = aClass.getDeclaredMethods();
//        for (Method method :
//                declaredMethods) {
//            if (method.isAnnotationPresent(AutoWired.class)) {
//                method.setAccessible(true);
//                try {
//                    Object o = aClass.newInstance();
//                    method.invoke(o, "注入");
//                } catch (InstantiationException | InvocationTargetException | IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }

//        try {
//            Class<?> aClass = Class.forName("test");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

//        Launcher.getBootstrapClassPath();
//        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
//        for (URL url : urls) {
//            System.out.println(url.toExternalForm());
//        };

        URL[] urLs = ((URLClassLoader) (Thread.currentThread().getContextClassLoader())).getURLs();
        for (URL url : urLs) {
            System.out.println(url.toExternalForm());
        };

    }

}
