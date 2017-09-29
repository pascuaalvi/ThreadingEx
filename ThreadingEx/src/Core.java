
public class Core {

	public static void main(String args[]) {
		
		Count cnt1 = new Count("Main");
		Count cnt2 = new Count("Sub");
		/*try {
			while (cnt1.isAlive()) {
				System.out.println("Main thread will be alive till the child thread is live");
				Thread.sleep(1500);
			}
			while (cnt2.isAlive()) {
				System.out.println("Sub thread will be alive till the child thread is live");
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}*/
		System.out.println("Main thread's run is over");
	}
}
