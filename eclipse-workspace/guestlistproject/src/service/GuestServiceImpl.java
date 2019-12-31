package service;

import java.util.Set;

import dao.*;
import entities.Guest;
import exceptions.*;

public class GuestServiceImpl implements IGuestService{
	private IGuestDao dao;
	
	public GuestServiceImpl(IGuestDao dao) {
		this.dao=dao;
	}
	
	@Override
	public void addGuest(Guest g) {
		dao.addGuest(g);
	}
	
	@Override
	public Guest findGuestById(int id) {
		if(id<0) {
			throw new IncorrectIdException("id is incorrect");
		}
		
		Guest g=dao.findGuestById(id);
		return g;
	}
	
	public Set<Guest> allGuestsInOrder(boolean order){
		Set<Guest> guests=dao.allGuestsInOrder(order);
		return guests;
	}

}
