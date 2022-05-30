package com.cremptin.GenericLib;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomerReport {

	public static void main(String[] args) {
		
		ExtentSparkReporter spark=new ExtentSparkReporter(".customerReports");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Cremptin Reports");
		spark.config().setReportName("Extent Reports 5");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(spark);
		ExtentTest test=extent.createTest("Verify Customer");
//		test.info(markuphe)
	
	
	}
}
