package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Juggler implements Performer{

	int numOfRings = 3;
	
	@Override
	public void perform() {
		System.out.println("i am juggler and i am juggling "+numOfRings+" Rings");	
	}

	
}
