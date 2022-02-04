package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("poeticJuggler")
public class PoeticJuggler extends Juggler {

	@Autowired
	private Poem poem;

	@Autowired
	public PoeticJuggler(@Value("4")Integer n,Poem poem) { //Integer best practice , also dont use autowire on primitives
		super();
		this.numOfRings =n;
		this.poem = poem;
		System.out.println("in PoeticJugglers param constr "+poem+" Rings");
	}
	
	public void setPoem(Poem poem) {
		this.poem = poem;
		this.numOfRings=10;
	}

	public Poem getPoem() {
		return poem;
	}
	
	@Override
	public void perform() {
		super.perform();
		System.out.println("While Reciting");
		poem.recite();
	}
}
