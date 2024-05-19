public class Day {
    // Final keyword so attributes can't be changed randomly
    private final int dayNumber;
    private final String eventDescription;
    private final String verse;

    // Private constructor so that it can't be used outside the class
    // Creation days are fixed along with the things that occurred, so it wouldn't really make sense to
    // create new Day objects in the main class
    private Day(int dayNumber, String eventDescription, String verse) {
        this.dayNumber = dayNumber;
        this.eventDescription = eventDescription;
        this.verse = verse;
    }

    // Method to get details of the day
    public String getDetails() {
        return "Day " + dayNumber + ": " + eventDescription;
    }

    // Method to get details of verse (depending on whether the user wants to see it)
    public String getVerse(){
        return "This is recorded in " + verse ;
    }

    // Method to get day number
    public int getDayNumber() {
        return dayNumber;
    }

    // Class to manage Day objects
    public static class CreationWeek {
        //Made this final so that it won't be changed randomly
        private static final Day[] creationDays = {
                new Day(1, "Light was commanded", "Genesis 1:3-5"),
                new Day(2, "Separation of waters", "Genesis 1:6-8"),
                new Day(3, "Dry land (which God called Earth) and vegetation", "Genesis 1:9-13"),
                new Day(4, "Lights in the sky (Sun, Moon, Stars)", "Genesis 1:14-19"),
                new Day(5, "Sea creatures and birds", "Genesis 1:20-23"),
                new Day(6, "Land animals and man (humans)", "Genesis 1:24-31"),
                new Day(7, "Rest", "Genesis 2:1-3")
        };

        // Method to get a Day object by day number
        public static Day getDay(int dayNumber) {
            if (dayNumber >= 1 && dayNumber <= 7) {
                return creationDays[dayNumber - 1];
            } else {
                return null;
            }
        }
    }
}
