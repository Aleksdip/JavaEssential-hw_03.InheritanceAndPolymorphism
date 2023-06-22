package task_01.class_room;

public class Main {
    public static void main(String[] args) {
        //create students
        Pupil pupil1 = new Pupil("Aleks", 1);
        Pupil pupil2 = new Pupil("Oleg",3);
        Pupil pupil3 = new Pupil("Volodimir", 5);
        Pupil pupil4 = new Pupil();
        //add students to the array and assign them to roles
        Pupil [] students = {pupil1, pupil2, pupil3, pupil4};
        for (int i = 0; i < students.length; i++) {
            if (students[i].score < 1)
                students[i] = new Pupil();
           else if (students[i].score < 3)
                students[i] = new BadPupil(students[i].name);
            else if (students[i].score >= 3 && students[i].score < 5)
                students[i] = new GoodPupil(students[i].name);
            else students[i] = new ExcellentPupil(students[i].name);

        }
        //create new classroom with students
        ClassRoom classRoom = new ClassRoom(students);
        classRoom.watch();



    }

}
