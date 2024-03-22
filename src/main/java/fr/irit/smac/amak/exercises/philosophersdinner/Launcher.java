package fr.irit.smac.amak.exercises.philosophersdinner;

import fr.irit.smac.amak.scheduling.Scheduler;

public class Launcher {
	public static void main(String[] args) {
		var environment = new Table();
		var amas = new PhilosophersDinnerAMAS(environment);
		var scheduler = new Scheduler(amas, environment);
		scheduler.start();
	}
}
