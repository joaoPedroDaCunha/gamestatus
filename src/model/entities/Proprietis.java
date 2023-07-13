package model.entities;

public class Proprietis extends PlayerPerfil{
	
	private int hp;
	private int mana;
	private int fort;
	private int reis;
	private int dext;
	private int intel;
	
	public Proprietis(String name) {
		super(name);
		this.hp = hpIstaceof();
		this.mana = manaIstaceof();
		this.fort = 0;
		this.reis = 0;
		this.dext = 0;
		this.intel = 0;
	}
	
	

	public Proprietis() {
	}



	public int getHp() {
		return hp;
	}

	public int getMana() {
		return mana;
	}
	
	public int getFort() {
		return fort;
	}
	public void setFort(int fort) {
		this.fort = fort;
	}
	public int getReis() {
		return reis;
	}
	public void setReis(int reis) {
		this.reis = reis;
	}
	public int getDext() {
		return dext;
	}
	public void setDext(int dext) {
		this.dext = dext;
	}
	public int getIntel() {
		return intel;
	}
	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int hpIstaceof() {
		hp = 5;
		if(reis != 0){
			 hp =(int) (hp * (double)(reis/2)); 
		}
		return hp;
	}
	
	public int manaIstaceof() {
		mana = 10;
			if(intel !=0) {
				mana=(int) (mana *(double)(intel/2));
			}
	       return mana;
	}
	
	public void manaEHpEquilibre() {
		if(mana*3 > hp) {
			
		}
	}
	
}
