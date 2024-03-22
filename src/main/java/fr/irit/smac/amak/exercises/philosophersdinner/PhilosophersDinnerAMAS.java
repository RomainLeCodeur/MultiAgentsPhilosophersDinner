package fr.irit.smac.amak.exercises.philosophersdinner;

import fr.irit.smac.amak.Amas;

public class PhilosophersDinnerAMAS extends Amas<Table> {
	public PhilosophersDinnerAMAS(Table env) {
		super(env, 1, Amas.ExecutionPolicy.ONE_PHASE);
	}

	@Override
	protected void onInitialAgentsCreation() {
		PhilosopherAgent[] p = new PhilosopherAgent[getEnvironment().getForks().length];
		//Create one agent per fork
		for (int i = 0; i < getEnvironment().getForks().length - 1; i++) {
			p[i] = new PhilosopherAgent(i, this, getEnvironment().getForks()[i], getEnvironment().getForks()[i + 1]);
		}
		//Let the last philosopher takes the first fork (round table)
		p[getEnvironment().getForks().length - 1] = new PhilosopherAgent(getEnvironment().getForks().length - 1, this, getEnvironment().getForks()[getEnvironment().getForks().length - 1], getEnvironment().getForks()[0]);
		//Add neighborhood
		for (int i = 1; i < p.length; i++) {
			p[i].addNeighbor(p[i - 1]);
			p[i - 1].addNeighbor(p[i]);
		}
		p[0].addNeighbor(p[p.length - 1]);
		p[p.length - 1].addNeighbor(p[0]);
	}
}