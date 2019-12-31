package dao;

import java.util.*;

import entities.Guest;

public interface IGuestDao {
	void addGuest(Guest g);
	
	Guest findGuestById(int id);
	
	public Set<Guest> allGuests();
	
	Set<Guest> allGuestsInOrder(boolean order);

}
