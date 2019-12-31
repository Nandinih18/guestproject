package dao;

import java.util.*;

import entities.*;
import exceptions.*;
import util.*;

public class GuestDaoImpl implements IGuestDao{
	private Map<Integer,Guest> store=new HashMap<>();
	
	@Override
	public void addGuest(Guest g) {
		store.put(g.getId(),g);
	}
	
	@Override
	public Guest findGuestById(int id) {
		Guest g=store.get(id);
		if(g==null) {
			throw new GuestNotFoundException("Guest not found for id:"+id);
		}
		return g;
	}
	
	@Override
	public Set<Guest> allGuests(){
		Collection<Guest> guests=store.values();
		Set<Guest> guestlist= new HashSet<>(guests);
		return guestlist;
	}
	
	@Override
	public Set<Guest> allGuestsInOrder(boolean order){
		Collection<Guest> guests=store.values();
		if(order==true) {
			Set<Guest> guestSet= new TreeSet<>(new GuestComparator());
			guestSet.addAll(guests);
			return guestSet;
		}
		
			return allGuests();
		
		
	}

}
