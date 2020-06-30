package ex06.autorwired;

import org.springframework.beans.factory.annotation.Autowired;

//여기서부터 중요
public class Printer {
	
	private Document doc1;
	
	//생성자
	@Autowired
	public Printer(Document doc1) {
		this.doc1 = doc1;
	}
	//게터,세터
	public Document getDoc1() {
		return doc1;
	}

	public void setDoc1(Document doc1) {
		this.doc1 = doc1;
	}
	
}
