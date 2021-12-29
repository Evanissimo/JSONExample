package JsonTime;

public class Effect {
	private int min;
	private int max;
	private String effectDescription;
	private boolean lost;
	private boolean worse;
	private int roll;
	public Effect(int min, int max, String effectDescription, boolean lost, boolean worse, int roll)
	{
		 this.min = min;
		 this.max = max;
		 this.effectDescription = effectDescription;
		 this.lost = lost;
		 this.worse = worse;
		 this.roll = roll;
	}

}
