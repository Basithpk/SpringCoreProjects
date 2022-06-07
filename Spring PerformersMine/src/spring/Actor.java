package spring;

import org.springframework.stereotype.Component;

@Component
class Actor implements Performer {

	@Override
	public void perform() {
	System.out.println("Hi i am an actor and i am performing with something interesting");
			
	}
	
	public Actor(){
  
		System.out.println("Actor created Dude ss");
    
	}	


}
