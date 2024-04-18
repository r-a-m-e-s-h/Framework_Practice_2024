package Interview_Questions;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class iretry_Analyzer_tc implements IRetryAnalyzer{

	
	
	int failedCount=0;
	int limit=3;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(failedCount<limit)
		{
			failedCount++;
			return true;
		}
		
		return false;
	}
	
	
	

}
