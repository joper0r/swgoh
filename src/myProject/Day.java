package myProject;

public enum Day {

	MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;

	static Day[] values = Day.values();

	public static Day getDay(int i) {
		return values[i-1];
	}

}
