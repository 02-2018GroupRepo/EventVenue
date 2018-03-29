package bootcamp.model;

public class Event {
	
	private String name;
	private String description;
	private String location;
	private int maxGuests;
	
	
	public Event() {
		name = "name test text";
		description = "this is an event description";
		location = "a place on earth";
		maxGuests = 25;
	}
	
	public Event(String name, String description, String location) {
	
		this.name= name;
		this.description=description;
		this.location=location;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setMaxGuests(int capacity) {
		this.maxGuests = capacity;
	}
}
