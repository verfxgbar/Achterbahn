package de.verfxgbar.utils;

public class Waggon {
	private Fahrgaeste gaeste;

	public Waggon(Fahrgaeste gaeste) {
		this.gaeste = gaeste;
	}

	public void aussteigen() {
		gaeste = null;
	}

	public void einsteigen(Fahrgaeste gaeste) {
		this.gaeste = gaeste;
	}

	public boolean hatGaeste() {
		return (gaeste == null); // Not neccessary
	}
}
