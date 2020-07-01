package quiz07.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	
	@Autowired
//	@Qualifier("mouse")
	private Mouse mouse;
	
	@Autowired
//	@Qualifier("key")
	private Keyboard kb;
	
	@Autowired
//	@Qualifier("monitor")
	private Monitor monitor;

	
	
	public void computerInfo() {
		System.out.println("***컴퓨터 정보***");
		mouse.info();
		kb.info();
		monitor.info();
	}



	public Mouse getMouse() {
		return mouse;
	}



	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}



	public Keyboard getKb() {
		return kb;
	}



	public void setKb(Keyboard kb) {
		this.kb = kb;
	}



	public Monitor getMonitor() {
		return monitor;
	}



	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	
	
	
	
	
	
	
	
	
}
