package entities;

import java.util.*;

public class Guest {
	private int id;
	private String name;

	public Guest() {
	}

	public Guest(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null || !(obj instanceof Guest)) {
			return false;
		}

		Guest g = (Guest) obj;
		return g.id == this.id;
	}

	@Override
	public int hashCode() {
		return id;
	}
}
