package service;

import java.util.Set;

import entities.Guest;

public interface IGuestService {
	public void addGuest(Guest g);
	
	public Guest findGuestById(int id);
	
	public Set<Guest> allGuestsInOrder(boolean order);

}
