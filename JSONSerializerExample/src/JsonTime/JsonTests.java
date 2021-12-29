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
		try 
		{
			JSONParser jparse = new JSONParser();
			FileReader read = new FileReader("JsonFiles/SpellList.json");
			Object o = jparse.parse(read);
			JSONObject spells = (JSONObject) o;
			List<Spell> spellList = new ArrayList<Spell>();
			JSONArray spellListJSONArray = (JSONArray) spells.get("spells");
			for(int i = 0; i<spellListJSONArray.size(); i++)
			{
				String name;
				long level;
				String range;
				String duration;
				boolean isCleric;
				String general;
				List<Effect> effects = new ArrayList<Effect>();
				List<String> manifestation = new ArrayList<String>();
				List<String> corruption = new ArrayList<String>();
				List<String> misfire = new ArrayList<String>();
				
				JSONObject curSpell = (JSONObject) spellListJSONArray.get(i);

				if(curSpell.get("Name")!=null)
					name = (String) curSpell.get("Name");
				if(curSpell.get("Level")!=null)
					level =  (long) curSpell.get("Level");
				if(curSpell.get("Range")!=null)
					range = (String) curSpell.get("Range");
				if(curSpell.get("Duration")!=null)
					duration = (String) curSpell.get("Duration");
				if(curSpell.get("IsCleric")!=null)
					isCleric = (boolean) curSpell.get("IsCleric");
				if(curSpell.get("General")!=null)
					general = (String) curSpell.get("General");
				if(curSpell.get("Manifestation")!=null)
					manifestation = readList((JSONArray)curSpell.get("Manifestation"));
				if(curSpell.get("Corruption")!=null)
					corruption = readList((JSONArray)curSpell.get("Corruption"));
			}
		}
		catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
		catch(ParseException e) {e.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
		
		
	}
	public static List<String> readList(JSONArray array)
	{
		List <String> outputList = new ArrayList<String>();
		array.forEach((String)-> outputList.add((java.lang.String) String));
		return outputList;
		
	}
}
