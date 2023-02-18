public class Student {
    //долго копался не знал что gson сопоставляет слова словам)
    //то есть в json фамилия в объекте family то будет null
    //но если фамилия в json и в объекте фамилия будет то что в файле
    private String фамилия;
    private int оценка;
    private String предмет;

    public Student(String family, int mark, String lesson) {
        this.фамилия = family;
        this.оценка = mark;
        this.предмет = lesson;
    }

    public String getФамилия() {
        return фамилия;
    }

    public void setФамилия(String фамилия) {
        this.фамилия = фамилия;
    }

    public int getОценка() {
        return оценка;
    }

    public void setОценка(int оценка) {
        this.оценка = оценка;
    }

    public String getПредмет() {
        return предмет;
    }

    public void setПредмет(String предмет) {
        this.предмет = предмет;
    }

    @Override
    public String toString() {
        return фамилия + " " + оценка + " " + предмет;
    }
}
