package fr.irit.smac.amak.exercises.philosophersdinner;

import fr.irit.smac.amak.Environment;

public class Table extends Environment {
	private final Fork[] forks;

	public Table() {
		forks = new Fork[10];
		for (int i = 0; i < forks.length; i++)
			forks[i] = new Fork();
	}

	public Fork[] getForks() {
		return forks;
	}
}