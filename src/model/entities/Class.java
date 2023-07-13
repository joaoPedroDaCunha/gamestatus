package model.entities;

public class Class extends Proprietis{

	private String clas ;
	
	public Class(String name) {
		super(name);
		this.clas ="Aprendiz";
	}
	
	public void classAprendizUpProprietiz() {
		Proprietis p = new Proprietis(getName());
		p.setFort(getFort()+1);
		p.setReis(getReis()+1);
		p.setDext(getDext()+1);
		p.setIntel(getIntel()+1);
				
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}
	
	
	
	
}
