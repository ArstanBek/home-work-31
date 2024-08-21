public class DesignCourse extends AbstractCourse {
    public DesignCourse() {
    }

    public DesignCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }

    public void conductClass() {
        System.out.println("Проведение урока дизайна");
    }
}
