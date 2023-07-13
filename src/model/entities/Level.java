package model.entities;

public class Level extends PlayerPerfil{
	
	private int level;
	private int experienci;
	private int metaExperienci;
	
	public Level(String name) {
		super(name);
		this.level = 1;
		this.experienci = 0;
		this.metaExperienci = 100;
	}

	public int getLevel() {
		return level;
	}

	public int getExperienci() {
		return experienci;
	}

	public int getMetaExperienci() {
		return metaExperienci;
	}
	
	public void upLEvel() {
		if(experienci == metaExperienci){
			level += 1;
			experienci =0;
			
			if(level %10 != 0) {
				metaExperienci *= 2 ;
			}else {
				metaExperienci *= 5 ;
			}
		}	
	}

}
