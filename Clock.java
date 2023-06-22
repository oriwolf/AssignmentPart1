package ponterapart1;

public class Clock {
	private State state;
	private final Button buttonA;
	private final Button buttonB;
	private final Button buttonC;
	private final Button buttonD;

	/**
	 * Representing the states using an enum.
	 */
	enum State {
		ALARM,
		TIMER,
		STOPPER
	}


	public Clock() {
		this.state = State.ALARM;
		this.buttonA = new ButtonA();
		this.buttonB = new ButtonB();
		this.buttonC = new ButtonC();
		this.buttonD = new ButtonD();
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}

	public void doA() {
		buttonA.buttonPressed(this);
	}

	public void doB() {
		buttonB.buttonPressed(this);
	}

	public void doC() {
		buttonC.buttonPressed(this);
	}

	public void doD() {
		buttonD.buttonPressed(this);
	}

}
