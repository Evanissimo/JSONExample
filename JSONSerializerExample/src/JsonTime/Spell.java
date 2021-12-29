package JsonTime;

import java.util.List;

public class Spell {
	private String name;
	private int level;
	private String range;
	private String duration;
	private String castingTime;
	private String save;
	private boolean isCleric;
	private String general;
	private List<String> manifestation;
	private List<String> corruption;
	private List<String> misfire;
	private List<Effect> effects;
	public Spell (String name,int level,String range,String duration,String castingTime,String save,boolean isCleric,String general, List<String> corruption,List<String> misfire,List<String> manifestation,List<Effect> effects)
	{
		this.name = name;
		this.range = range;
		this.duration = duration;
		this.castingTime = castingTime;
		this.save = save;
		this.isCleric = isCleric;
		this.general = general;
		this.manifestation = manifestation;
		this.corruption = corruption;
		this.misfire = misfire;
		this.effects = effects;
	}

	
}
