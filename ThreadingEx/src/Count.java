public class Count extends Thread {

	String string = "";
	
	public Count(String str) {
		//super("my extending thread");
		string = str;
		System.out.println("my thread created" + this);
		start();
	}

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(this.string+"Printing the count " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("my thread interrupted");
		}
		System.out.println("My thread run is over");
	}
}
