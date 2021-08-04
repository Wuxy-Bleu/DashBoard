/**
 * @description: demo
 * @author: wxy
 * @create: 2021-08-03 09:22
 **/

public class Demo {

    private String str;

//    public Demo(String str) {
//        this.str = str;
//    }


    public String getStr() {
        return str;
    }

    @AutoWired
    public void setStr(String str) {
        this.str = str;
    }
}
