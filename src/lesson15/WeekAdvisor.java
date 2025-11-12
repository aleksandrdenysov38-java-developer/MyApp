package lesson15;

public class WeekAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY ->
                    System.out.println("Work successfully! Keep focus on main goals and always learn something new!");
            case FRIDAY ->
                    System.out.println("Happy Friday! Finish your work and don't forget about rest!");
            case SATURDAY, SUNDAY ->
                    System.out.println("It's your time! Get pleasure, watch movie and play in PC games!");
            default ->
                    System.out.println("Неверный день недели.");
        }
    }
}
