package ex02.construct;

public class Hotel {
	
	//멤버변수
		private Chef chef;
		
		public Hotel(Chef chef) {
			this.chef = chef;
		}
		
		public Chef getChef() {
			return chef;
		}
}
