package myProject;

public class Ticketbot {

	public static void raidCalc(int rancorTickets, int haatTickets) {

		final int dailyTickets = 30000;
		final int rancorPrice = 60000;
		final int haatPrice = 90000;
		final int maxCapacity = 120000;

		// hier auf 0 <5 umstellen für sonntag
		for (int i = 1; i < 6; i++) {

			if (rancorTickets >= maxCapacity) {
				System.out.println(rancorTickets + "Öffne Rancor vor Payout am " + Day.getDay(i));
				rancorTickets = rancorTickets - rancorPrice;
			} else if (rancorTickets >= rancorPrice) {
				System.out.println(rancorTickets + " Öffne Rancor nach Payout am " + Day.getDay(i));
				rancorTickets = rancorTickets - rancorPrice;
			}
			if (haatTickets >= maxCapacity) {
				System.out.println(haatTickets + "Öffne HAAT vor Payout am " + Day.getDay(i));
				haatTickets = haatTickets - haatPrice;
			}
			if (haatTickets >= haatPrice) {
				System.out.println(haatTickets + "Öffne HAAT nach Payout am " + Day.getDay(i));
				haatTickets = haatTickets - haatPrice;
			}

			rancorTickets += dailyTickets;
			haatTickets += dailyTickets;

		}
		if (haatTickets >= maxCapacity){
			System.out.println("HAAT am Wochenende :( ");
			haatTickets -= haatPrice;
		}

		if (haatTickets >= haatPrice) {
			System.out.println("haat am Sonntag vor Payout eröffnen");
		}
		if (rancorTickets >= rancorPrice) {
			System.out.println("rancor am Sonntag vor Payout eröffnen");
		}
		
		System.out.println("RancorTickets am Freitag Abend nach Payout = " + rancorTickets + "\n"
				+ "haatTickets am Freitag Abend nach Payout = " + haatTickets);
		rancorTickets += dailyTickets*2;
		haatTickets += dailyTickets*2;
		System.out.println("RancorTickets am Sonntag Abend nach Payout = " + rancorTickets + "\n"
				+ "haatTickets am Sonntag Abend nach Payout = " + haatTickets);
		
		
	}

	public static void main(String[] args) {
		Ticketbot.raidCalc(84000, 124000);
	}

}
