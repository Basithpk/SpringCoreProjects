package spring;

import org.springframework.stereotype.Component;

@Component
public class SonnetPoem implements Poem {

	@Override
	public void recite() {
		System.out.println("In All Worlds and all the lands i have never seen someone like you");
	}

}
