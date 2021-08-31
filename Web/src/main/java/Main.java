//import smartbi.sdk.ClientConnector;
//import smartbi.sdk.service.combinedquery.CombinedReport;
//import smartbi.sdk.service.insight.InsightReport;
//import smartbi.sdk.service.simplereport.Parameter;
//
//import java.util.List;
//
///**
// * @description:
// * @author: wxy
// * @create: 2021-08-24 14:57
// **/
//public class Main {
//
//    public static void main(String[] args) {
//
//        ClientConnector conn = new ClientConnector("https://qaapi.cloudpense.com/smartbi");
//        boolean loginOK = conn.open("admin", "eXZlq6uRz6Z1");
//        InsightReport ir = new InsightReport(conn);
//        ir.open("I2c7c81f901766a276a27776901766f9b9d7f0fef");
//        List<Parameter> paramList = ir.getParamList();
//        System.out.println("done");
//
//    }
//
//}