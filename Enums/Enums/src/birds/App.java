package birds;

/**
 * Created by oleksii on 9/29/15.
 */
public class App {
	public static void main(String[] args) {
		Birds eagle = new Eagle();
		eagle.fly();

		Birds ostrich = new Ostrich();

		try {
			ostrich.fly();
		} catch (ThisBirdCantFlyException e){
			System.out.println(e.getMessage());
		}

		Birds swallow = new Swallow();
		swallow.fly();

	}
}
