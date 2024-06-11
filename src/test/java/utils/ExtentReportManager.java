package utils;


//	
//	// File: ExtentReportManager.java
//	
//
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//
//	public class ExtentReportManager {
//	    private static ExtentReports extent;
//    
//	    public static synchronized ExtentReports getInstance() {
//	        if (extent == null) {
//            extent = createInstance();
//        }
//	        return extent;
//    }
//
//    private static ExtentReports createInstance() {
//	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtendsReport/ExtentReport.html");
//	        extent = new ExtentReports();
//	        extent.attachReporter(htmlReporter);
//	        return extent;
//	    }
//
//	    public static synchronized ExtentTest createTest(String Abhi) {
//	        return getInstance().createTest(Abhi);
//	    }
//	}
//
//


 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.util.Date;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentHtmlReporter htmlReporter;

    public static synchronized ExtentReports getInstance() {
        if (extent == null) {
            extent = createInstance();
        }
        return extent;
    }

    private static ExtentReports createInstance() {
        String fileName = getReportFilePath();
        htmlReporter = new ExtentHtmlReporter(fileName);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        return extent;
    }

    public static synchronized ExtentTest createTest(String testName) {
        return getInstance().createTest(testName);
    }

    private static String getReportFilePath() {
        Date date = new Date();
        String filePath = "test-output/ExtentReport_" + date.getTime() + ".html";
        return filePath;
    }
}



//package utils;
/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.util.Date;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentHtmlReporter htmlReporter;

    // Get the singleton instance of ExtentReports
    public static synchronized ExtentReports getInstance() {
        if (extent == null) {
            extent = createInstance();
        }
        return extent;
    }

    // Create a new instance of ExtentReports
    private static ExtentReports createInstance() {
        String fileName = getReportFilePath();
        htmlReporter = new ExtentHtmlReporter(fileName);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        return extent;
    }

    // Create a new test in the report
    public static synchronized ExtentTest createTest(String testName) {
        return getInstance().createTest(testName);
    }

    // Generate a file path for the report with a timestamp
    private static String getReportFilePath() {
        Date date = new Date();
        String filePath = "test-output/ExtentReport_" + date.getTime() + ".html";
        return filePath;
    }
}
*/


