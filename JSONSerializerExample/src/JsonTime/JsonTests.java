package JsonTime;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTests {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();
		
		try
		{
			// this line is creating a jsonparser
			JSONParser jsonparser  = new JSONParser();
			// here we create a file reader to read the json file
			FileReader reader = new FileReader("JsonFiles/TestJson.json");
			// we unite the 2 classes created in previous lines/ we use the json parser to parse the file from the reader and create an object
			Object obj=jsonparser.parse(reader);
			// we typecast the object from the previous line into a JSONArray. Jsons can be arrays or objects.
			JSONArray kings =(JSONArray) obj;
			// here we create a new list to put our king objects into
			List<King> kingList = new ArrayList<King>();
			for(int i = 0; i<kings.size(); i++)
			{
				JSONObject curKing = (JSONObject) kings.get(i);
				King king = new King((String) curKing.get("Name"), (String) curKing.get("Country"),(String) curKing.get("House"), (String)curKing.get("Reign"));
				kingList.add(king);
			}
			for(int i = 0; i<kingList.size(); i++)
			{
				System.out.println(kingList.get(i).toString());
			}
			
		}
		catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
		catch(ParseException e) {e.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
		

	}

}
