import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Map;

/**
 * @description:
 * @author: wxy
 * @create: 2021-08-13 11:07
 **/

public class Main {


//    public static void main(String[] args) {
////        int index = "/vision/openresource.jsp?resid=I2c7c81f90172c61ac61a64f1017347818a311800".indexOf("=");
////        String resId = "/vision/openresource.jsp?resid=I2c7c81f90172c61ac61a64f1017347818a311800".substring(index + 1);
////        System.out.println("teste");
//
//        Map properties = System.getProperties();
//    }


    public static void main(String[] args) {

        String verifyValue = "\n<?xml version=\"1.0\" encoding=\"GBK\"?>\n     " +
                "    <BOSEBankData>\n" +
                "                <opReq>\n" +
                "                    <serialNo>20210903140405965</serialNo>\n" +
                "                    <reqTime>20210903</reqTime>\n" +
                "                    <ReqParam>\n" +
                "                        <ACNO>31600700009000356</ACNO>\n" +
                "                        <VIRACNO></VIRACNO>\n" +
                "                        <OPAC>620522005029845818</OPAC>\n" +
                "                        <NAME>丁亚琳</NAME>\n" +
                "                        <PBNO>325290000012</PBNO>\n" +
                "                        <TRAM>11</TRAM>\n" +
                "                        <USAG></USAG>\n" +
                "                        <REMK></REMK>\n" +
                "                        <PATH></PATH>\n" +
                "                        <PREDATE></PREDATE>\n" +
                "                    </ReqParam>\n" +
                "                </opReq>\n" +
                "            </BOSEBankData>";

        InetAddress addr = null;
        Socket socket = null;
        String verifyheader = null;
        try {
            verifyheader = "<?xml version=\"1.0\" encoding=\"gbk\"?>\n"
                    + "<msg>\n"
                    + "<msg_head>\n"
                    + "<msg_type>0</msg_type>\n"
                    + "<msg_id>1005</msg_id>\n"
                    + "<msg_sn>0</msg_sn>\n"
                    + "<version>1</version>\n"
                    + "</msg_head>\n"
                    + "<msg_body>\n"
                    + "<origin_data_len>" + verifyValue.replaceAll("\\s*", "").getBytes("GBK").length + "</origin_data_len>\n"
                    + "<origin_data>" + verifyValue.replaceAll("\\s*", "") + "</origin_data>\n"
                    + "</msg_body>\n"
                    + "</msg>";
        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {

            String verifyIp = "signshbank.microport.com.cn";
            int verifyPort = 80;
            //verifyValue=getSendStr(verifyValue);
            System.out.println("发送的原文包："+verifyValue);
            addr = InetAddress.getByName(verifyIp);
            socket = new Socket(addr, verifyPort);
            BufferedWriter wr =
                    new BufferedWriter(
                            new OutputStreamWriter(socket.getOutputStream(), "GBK"));
            wr.write(verifyheader);
            wr.flush();
            //接收
            BufferedReader rd =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), "GBK"));
            String line = null;
            StringBuffer sb = new StringBuffer();
            while ((line = rd.readLine()) != null) {
                // System.out.println(line);
                sb.append(line);
            }
            //处理返回
            String returnStr = sb.toString();
            System.out.println("返回的密文："+returnStr);


            wr.close();
            rd.close();
            socket.close();
            System.out.println(returnStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
