public class MathCourse extends AbstractCourse implements Onsite {
    public MathCourse() {
    }

    public MathCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }

    public void conductClass() {
        System.out.println("Проведение урока математики");
    }

    public void arrangeClassroom() {
        System.out.println("Организация класса для урока математики");
    }
}
