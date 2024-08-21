public class ProgrammingCourse extends AbstractCourse implements Online {
    public ProgrammingCourse() {
    }

    public ProgrammingCourse(String title, int duration, String instructor) {
        super(title, duration, instructor);
    }

    public void conductClass() {
        System.out.println("Проведение урока программирования");
    }

    public void provideOnlineAccess() {
        System.out.println("Предоставление онлайн-доступа к курсу программирования");
    }
}
