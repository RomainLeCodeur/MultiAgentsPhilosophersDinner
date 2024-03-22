package fr.irit.smac.amak.exercises.philosophersdinner;

import fr.irit.smac.amak.Agent;
import fr.irit.smac.lxplot.LxPlot;
import fr.irit.smac.lxplot.commons.ChartType;

public class PhilosopherAgent extends Agent<PhilosophersDinnerAMAS, Table> {
	private final Fork leftFork;
	private final Fork rightFork;
	private double eatenPastas;
	private final int id;

	public enum State {
		THINK, HUNGRY, EATING
	}

	private State state = State.THINK;

	public PhilosopherAgent(int id, PhilosophersDinnerAMAS amas, Fork leftFork, Fork rightFork) {
		super(amas);
		this.id = id;
		this.leftFork = leftFork;
		this.rightFork = rightFork;
	}

	@Override
	protected void onPerceive() {
		// TODO Complete this method
	}

	@Override
	protected void onDecideAndAct() {
		if (leftFork.owned(this) && rightFork.owned(this)){
			if (state==State.HUNGRY){
				this.eatPastas();
				state=State.EATING;
			} else {
				leftFork.release(this);
			}
		}
		else if (leftFork.owned(this)){
			if (state==State.HUNGRY){
				rightFork.tryTake(this);
			} else {
				leftFork.release(this);
				state=State.THINK;
			}
		}
		else if (rightFork.owned(this)){
			if (state==State.HUNGRY){
				leftFork.tryTake(this);
			} else {
				rightFork.release(this);
				state=State.THINK;
			}
		}
		else if (getMostCriticalNeighbor(true)==this) {
			state=State.HUNGRY;
			leftFork.tryTake(this);
		}
	}

	private void eatPastas() {
		if (leftFork.owned(this) && rightFork.owned(this)) {
			eatenPastas++;
		}
	}

	@Override
	protected void onAgentCycleEnd() {
		LxPlot.getChart("Eaten Pastas", ChartType.BAR).add(id, eatenPastas);
		LxPlot.getChart("Held Forks", ChartType.BAR).add("Left", id, leftFork.owned(this)?1:0);
		LxPlot.getChart("Held Forks", ChartType.BAR).add("Right", id, rightFork.owned(this)?1:0);
	}

	/**
	 * Compute the criticality of the agent
	 * The most critical agent among the neighbors can be retrieved with getMostCriticalNeighbor(true)
	 *
	 * @return a double representing the criticality of the agent
	 */
	@Override
	protected double computeCriticality() {
		if (state==State.THINK) {return 1.;}
		else if (state==State.HUNGRY) {return 2.;}
		else {return 0.;}
	}
}