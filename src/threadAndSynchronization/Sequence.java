package threadAndSynchronization;

public class Sequence {

	private int value = 0;

	public int getNext() {

		synchronized (this) {
			value = value + 1;
			;
			return value;
		}

	}

//	ili mozemo cijelu metodu staviti kao sinkroniziranu, tj. da se brojevi ne ponavljaju (ali nuzno ne idu po redu) ako se dohvaca metoda getNext() sa vise Threadova, 
//  tj. ako vise Threadova dijeli istu metodu
	
//		public synchronized int getNext() {
//		value = value + 1;
//		return value;
//	}

}
