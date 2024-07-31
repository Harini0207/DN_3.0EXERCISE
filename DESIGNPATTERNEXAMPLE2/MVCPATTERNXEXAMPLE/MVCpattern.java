public class MVCpattern {
    public static void main(String[] args) {
        Student model = new Student("HARINI", "12345", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("HARESH");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}