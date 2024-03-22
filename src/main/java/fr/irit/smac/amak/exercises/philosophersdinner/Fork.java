package fr.irit.smac.amak.exercises.philosophersdinner;

public class Fork {
	private PhilosopherAgent takenBy;

	public synchronized boolean tryTake(PhilosopherAgent asker) {
		if (takenBy != null)
			return false;
		takenBy = asker;
		return true;
	}

	public synchronized void release(PhilosopherAgent asker) {
		if (takenBy == asker) {
			takenBy = null;
		}
	}

	public synchronized boolean owned(PhilosopherAgent asker) {
		return takenBy == asker;
	}
}