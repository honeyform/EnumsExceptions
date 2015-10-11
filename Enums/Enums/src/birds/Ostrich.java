package birds;

/**
 * Created by oleksii on 9/29/15.
 */
public class Ostrich extends Birds {
	@Override
	public void fly() {
		throw new ThisBirdCantFlyException("Im a ostrich, I cant fly!");
	}
}
