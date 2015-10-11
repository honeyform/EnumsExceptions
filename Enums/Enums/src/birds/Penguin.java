package birds;

/**
 * Created by oleksii on 9/29/15.
 */
public class Penguin extends Birds {
	@Override
	public void fly() {
		throw new ThisBirdCantFlyException("Im a penguin, I cant fly!");
	}
}