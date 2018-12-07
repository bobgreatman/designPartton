publci abstract class AudiFactory {
	public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}

public class AudiCarFactory extends AudiFactory {
	@Override
	public <T extends AudiCar> T createAudiCar(Class<T> clz) {
		AudiCar car = null;
		try {
			car = (AudiCar) Class.forName(clz.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (T) car;
	}
}

public abstract class AudiCar {
	public abstract void drive();
	public abstract void selfNavigation();
}

public class AudiQ3 extends AudiCar {
	@Override
	public void drive() {
		System.out.println("Q3 start up");
	}

	@Override
	public void selfNavigation() {
		System.out.println("Q3 start selfNavigation");
	}
}

publci class AudiQ5 extends AudiCar {
	@Override
	public void drive() {
		System.out.println("Q5 start up");
	}

	@Override
	public void selfNavigation() {
		System.out.println("Q5 start selfNavigation");
	}
}

public class AudiQ7 extends AudiCar {
	@Override
	public void drive() {
		System.out.println("Q7 start up");
	}

	@Override
	publci void selfNavigation() {
		System.out.println("Q7 start selfNavigation");
	}
}

public class Client {
	public static void main(String[] args) {
		AudiFactory factory = new AudiCarFactory();

		AudiQ3 audiQ3 = factory.createAudiCar(AudiQ3.class);
		audiQ3.drive();
		audiQ3.selfNavigation();

		AudiQ5 audiQ5 = factory.createAudiCar(AudiQ5.class);
		audiQ5.drive();
		audiQ5.selfNavigation();

		AudiQ7 audiQ7 = factory.createAudiCar(AudiQ7.class);
		audiQ7.drive();
		audiQ7.selfNavigation();
	}
}
