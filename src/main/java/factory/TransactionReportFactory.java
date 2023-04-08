package factory;

import domain.TransactionReport;
import util.Helper;
import java.util.Date;

public class TransactionReportFactory {
    public static TransactionReport createTransactionReport(int transactionReport_ID, String transactionReport_Type, String date_Of_Transaction, double amount, String currency, String status){
       if (Helper.isNullorEmpty(transactionReport_Type) || Helper.isNullorEmpty(status))
           return null;
       ;
       String transactionReport_Num = Helper.generateId();
        TransactionReport transactionReport = new TransactionReport.Builder().setTransactionReport(transactionReport_ID)
                .setTransactionReport_Type(transactionReport_Type)
                .setDate_Of_Transaction(date_Of_Transaction)
                .setAmount(amount)
                .setCurrency(currency)
                .setStatus(status)
                .build();
        return transactionReport;

    }
}
