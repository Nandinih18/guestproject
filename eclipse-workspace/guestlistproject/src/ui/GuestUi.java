package ui;

import java.util.Set;

import dao.*;
import service.*;
import entities.*;

public class GuestUi {
	private IGuestService service=new GuestServiceImpl(new GuestDaoImpl());
	
	public static void main(String[]args) {
		GuestUi ui=new GuestUi();
		ui.runUi();
	}
	
	public void runUi() {
		try {
			Guest g1=new Guest(2,"Nandini");
			Guest g2=new Guest(1,"Nida");
			Guest g3=new Guest(4,"Harika");
			Guest g4=new Guest(3,"Rachana");
			service.addGuest(g1);
			service.addGuest(g2);
			service.addGuest(g3);
			service.addGuest(g4);
			Guest fetched1= service.findGuestById(4);
			Guest fetched2=service.findGuestById(2);
			System.out.println(fetched1.getName());
			System.out.println(fetched2.getName());
			System.out.println("Guests in order");
			print(service.allGuestsInOrder(true));
		}catch (Throwable e){
            e.printStackTrace();
            System.out.println("something went wrong");
	}
	}
	private void print(Set<Guest> allGuests) {
		for(Guest g:allGuests) {
			System.out.println("Id:"+g.getId()+"Name:"+g.getName());
		}
	}

}
