package model.Class;

import model.entities.Proprietis;

public class Aprendiz {
	
	public String toString() {
		return "Aprendiz";
	}
	
	public void classAprendizUpProprietiz() {	
		Proprietis p = new Proprietis();
		p.setFort(p.getFort()+1);
		p.setReis(p.getDext()+1);
		p.setDext(p.getDext()+1);
		p.setIntel(p.getDext()+1);
	}
	
	
}
