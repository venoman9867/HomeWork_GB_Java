public class StringBuilderSQL {
    public static void main(String[] args) {
        String name="Ivan";
        String country="Russia";
        String city="Moscow";
        String age="null";
        System.out.println(makeString(name,country,city,age));
    }
    public static String makeString(String name, String country, String city, String age){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(name).append(" ").append(country).append(" ").append(city).append(" ").append(age);
        return stringBuilder.toString().replaceAll("null","");
    }
}
