package util;

import java.util.*;

import entities.Guest;

public class GuestComparator implements Comparator<Guest>{

	@Override
	public int compare(Guest o1, Guest o2) {
		if(o1.getId()>o2.getId()) {
			return 1;
		}
		if(o1.getId()<o2.getId()) {
			return -1;
		}
		return 0;
	}
	

}
