package TUGAS1;

public class Student {
    String nim;

    public Student(String nim) {
        this.nim = nim;
    }

    public boolean checkNim(String nim) {
        return this.nim.equals(nim);
    }
}

