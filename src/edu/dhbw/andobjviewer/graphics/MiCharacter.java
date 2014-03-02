package edu.dhbw.andobjviewer.graphics;

import javax.microedition.khronos.opengles.GL10;

import edu.dhbw.andobjviewer.models.Model;

public class MiCharacter extends Model3D{
	public Model3D selected;
	public MiCharacter(Model model, String pattern_file, Model3D selected) {
		super(model, pattern_file);
		this.selected=selected;
	}
	
	@Override
	public void draw(GL10 gl) {
		super.draw(gl);
		selected.model.setYrot(10.0f);
	}

}
