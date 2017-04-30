package org.tom.wypozyczalnia;

public enum Stan {

	
	
		WYPOZYCZONA(false), DOSTEPNA(true); 
	
		private Stan(boolean value) {
			this.value = value;
		}

		public boolean value;
}
