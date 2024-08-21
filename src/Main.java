//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TrainingCenter trainingCenter = new TrainingCenter(
                new AbstractCourse[]{
                        new ProgrammingCourse("Java", 100, "Alex"),
                        new DesignCourse("Web-Design", 100, "Sergey"),
                        new LanguageCourse("English", 100, "Jack"),
                        new MathCourse("Math", 100, "Albert")
                }
        );

        trainingCenter.start();
    }
}