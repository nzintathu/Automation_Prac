package automationpractical.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TestdataManager {

    public static JsonObject readTestDataFile(String fileName) throws FileNotFoundException{
        FileReader fileReader = new FileReader(getTestDataPath(fileName));
        Object object = JsonParser.parseReader(fileReader);
        JsonObject jsonObject = (JsonObject)object;

        return jsonObject;
    } 

    private static String getTestDataPath(String fileName){
        String path = new File("src/main/java/automationpractical/Testdata/" + fileName + ".json").getAbsolutePath();
        
        return path;
    }

}
