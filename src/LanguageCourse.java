public class LanguageCourse extends AbstractCourse {
    public LanguageCourse() {
    }

    public LanguageCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }

    public void conductClass() {
        System.out.println("Проведение урока языка");
    }
}
