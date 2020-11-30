package classNasting;

public class State {
	private final String name;
	private int population;
	private int area;
	public State(String name, int population, int area) {
		super();
		this.name = name;
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public int getPopulation() {
		return population;
	}
	@Override
	public String toString() {
		return "State [name=" + name + ", population=" + population + ", area=" + area + "]";
	}

	// inner class - non static nested class- each instance belongs to instance of enclosing type
	public class Citizen{
		
		private final int id;
		private String name;
		
		{// Initializer - runs before ctor on each object creation
			State.this.population++; // state.this is a reference to the state to this citizen.
			this.id= State.this.population;
		}
		
		

		public Citizen(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Citizen [id=" + id + ", name=" + name + "state: "+ State.this.name +"]";
		}
		
		public State getState() {
			return State.this;
		}
		
		}
	
	// static nested class - is independent of the enclosing type
	// the only difference here is that it is not a separate file.
	public static class car{
		
	}
	
	}
	


