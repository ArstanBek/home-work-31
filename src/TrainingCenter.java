public class TrainingCenter {
    private AbstractCourse[] courses;

    public TrainingCenter() {}

    public TrainingCenter(AbstractCourse[] courses) {
        this.courses = courses;
    }

    public AbstractCourse[] getCourses() {
        return courses;
    }

    public void setCourses(AbstractCourse[] courses) {
        this.courses = courses;
    }

    public void start() {
        for (AbstractCourse course:this.courses) {
            course.startCourse();
            course.conductClass();
            if (course instanceof Onsite) {
                ((Onsite) course).arrangeClassroom();
            }
            if (course instanceof Online) {
                ((Online) course).provideOnlineAccess();
            }
        }
    }
}
