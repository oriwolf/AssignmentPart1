package ponterapart1;

public class ButtonA extends Button {
	/**
	 * each time this (A) button pressed it changes the clock's state.
	 * TIMER -> ALARM -> STOPPER (in a circular way)
	 * @param clock - a Clock instance
	 */
	@Override
	public void buttonPressed(Clock clock) {
		Clock.State state = clock.getState();
		switch (state) {
		case ALARM -> clock.setState(Clock.State.TIMER);
		case TIMER -> clock.setState(Clock.State.STOPPER);
		case STOPPER -> clock.setState(Clock.State.ALARM);
		}
	}
}
