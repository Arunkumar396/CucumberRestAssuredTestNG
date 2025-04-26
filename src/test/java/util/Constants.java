package util;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Used for constants declaration
 */
public class Constants {

    public static final String COPYRIGHT_TEXT = "Copyright © ITE - Robert Bosch Automotive Steering - 2024  v2.18";

    public static Map<String, Object> map = null;
    // Input map
    public static LinkedHashMap<String, Map<String, Object>> masterMap = new LinkedHashMap<>();
    // Output map
    public static LinkedHashMap<String, Map<String, Object>> masterOPMap = new LinkedHashMap<>();
    public static LinkedHashMap<String, LinkedHashMap<String, String>> masterWriteOPMap = new LinkedHashMap<>();
    public static LinkedHashMap<String, Boolean> masterDependenceTestMa = new LinkedHashMap<>();
    public static Map<String, Object> inputMap = new LinkedHashMap<>();
    public static Map<String, Object> outputMap = new LinkedHashMap<>();
    public static LinkedHashMap<String, String> writeOPMap = new LinkedHashMap<>();

    
    public static final String OBJECTREPOSITORY_FILE_LOCATION = System.getProperty("user.dir") + File.separator + "ObjectRepository.json";
    public static final String INPUT_DATA_FILE_LOCATION = System.getProperty("user.dir") + File.separator + "testData.xlsx";
    public static final String TEST_INPUT_FILE_LOCATION = System.getProperty("user.dir") + File.separator + "test-input" + File.separator + "testData.xlsx";
    public static final String PROPERTIES_FILE_LOCATION = System.getProperty("user.dir") + File.separator + "config.properties";
    public static final String OUTPUT_DATA_FILE_LOCATION = System.getProperty("user.dir") + File.separator + "testOutput.xlsx";
    public static final String Dependence_DATA_FILE_LOCATION = System.getProperty("user.dir") + File.separator + "testDependence.xlsx";
    public static final String INPUJSON_FILE_LOCATION = System.getProperty("user.dir") + File.separator + "test-inputJsonFiles" + File.separator;
}
