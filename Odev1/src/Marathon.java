import java.util.ArrayList;

public class Marathon {
    private String[][] students;

    public Marathon(String[][] students) {
        this.students = students;
    }

    public int minimumTime() {
        int minTimeIndex = 0;
        int minTime = Integer.parseInt(students[0][1]);

        for (int i = 1; i < students.length; i++) {
            int minute = Integer.parseInt(students[i][1]);
            if (minute < minTime) {
                minTime = minute;
                minTimeIndex = i;
            }
        }
        return  minTimeIndex;
    }

    public int secondRunner() {
        int minTimeIndex = minimumTime();
        int secondIndex;
        if (minTimeIndex == 0) secondIndex = 1;
        else secondIndex = 0;

        for (int i = 0; i < students.length; i++) {
            if (i != minTimeIndex) {
                int minute = Integer.parseInt(students[i][1]);
                if (minute < Integer.parseInt(students[secondIndex][1]))
                    secondIndex = i;
            }
        }
        return secondIndex;
    }

    public int thirdRunner() {
        int minTimeIndex = minimumTime();
        int secondIndex = secondRunner();
        int thirdIndex = 0;
        int minTime = Integer.parseInt(students[minTimeIndex][1]);
        int secondMinute = Integer.parseInt(students[secondIndex][1]);

        for (int i = 0; i < students.length; i++) {
            int minute = Integer.parseInt(students[i][1]);
            if  (i != minTimeIndex && i != secondIndex && minute < Integer.parseInt(students[thirdIndex][1]))
                thirdIndex = i;
        }
        return thirdIndex;
    }

    public void marathonRanking() {
        int minIndex = minimumTime();
        int secondIndex = secondRunner();
        int thirdIndex = thirdRunner();
        System.out.println("Birinci: " + students[minIndex][0] + " " + students[minIndex][1] + "'");
        System.out.println("İkinci: " + students[secondIndex][0] + " " + students[secondIndex][1] + "'");
        System.out.println("Üçüncü: " + students[thirdIndex][0] + " " + students[thirdIndex][1] + "'");
    }

    public void classification() {
        ArrayList<Integer> times = new ArrayList<>();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < students.length; i++) 
            times.add(Integer.parseInt(students[i][1]));
        for (int i = 0; i < times.size(); i++) {
            if (times.get(i) >= 200 && times.get(i) <= 299) a++;
            else if (times.get(i) >= 300 && times.get(i) <= 399) b++;
            else if (times.get(i) >= 400) c++;
            }
        System.out.println("A -> " + a);
        System.out.println("B -> " + b);
        System.out.println("C -> " + c);
    }
}









