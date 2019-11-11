package com.atmecs.ToolsninjaAutomation.dataProvider;

import org.testng.annotations.DataProvider;

import com.atmecs.ToolsninjaAutomation.constants.FilePath;
import com.atmecs.ToolsninjaAutomation.utils.ProvideExcelData;

/**
 * In this class, data is given from the dataprovider
 */
public class TestDataProvider {

	/**
	 * In this method, getting the data of the headers into object array and
	 * returning to the calling method
	 */

	Object[][] sheetData;

	@DataProvider(name = "products")
	public Object[][] getProducts() {
		ProvideExcelData provideData = new ProvideExcelData(FilePath.TESTDATA_FILE, 0);
		sheetData = provideData.provideExcelData();
		return sheetData;
	}

	/**
	 * In this method, getting the data inside the header(SERVICES) into object
	 * array and returning to the calling method
	 */
	@DataProvider(name = "wrongProducts")
	public Object[][] getWrongProducts() {
		ProvideExcelData provideData = new ProvideExcelData(FilePath.TESTDATA_FILE, 1);
		sheetData = provideData.provideExcelData();
		return sheetData;
	}

	@DataProvider(name = "headers")
	public Object[][] getheatClinicHeader() {
		ProvideExcelData provideData = new ProvideExcelData(FilePath.TESTDATA_FILE, 2);
		sheetData = provideData.provideExcelData();
		return sheetData;
	}

	@DataProvider(name = "cartDetails")
	public Object[][] getheatClinicCartDetails() {
		ProvideExcelData provideData = new ProvideExcelData(FilePath.TESTDATA_FILE, 3);
		sheetData = provideData.provideExcelData();
		return sheetData;
	}
}