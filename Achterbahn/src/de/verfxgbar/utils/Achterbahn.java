package de.verfxgbar.utils;

public class Achterbahn {

	private Queue<Fahrgaeste> warteschlange;

	private List<Waggon> zug;

	public Achterbahn() {
		warteschlange = new Queue<>();
		zug = new List<>();
	}

	public void fahre() {
		zug.toFirst();

		while (zug.hasAccess()) {
			if (zug.getContent().hatGaeste()) // Not neccessary
				zug.getContent().aussteigen();
			zug.next();
		}

	}

	public void gaesteEinsteigen() {
		zug.toFirst();

		while (zug.hasAccess()) {
			Fahrgaeste currentGast = warteschlange.front();
			zug.getContent().einsteigen((currentGast == null ? null : currentGast));
			zug.next();
		}
	}

	public void addWaggon() {
		zug.append(new Waggon(null));
	}

	public void removeWaggon() {
		zug.remove();
	}
}
