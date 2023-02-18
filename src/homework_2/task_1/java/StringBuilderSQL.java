public class StringBuilderSQL {
    //Программа должна составлять SQL запрос по JSON строке
    //{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
    public static void main(String[] args) {
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        System.out.println(makeString(json));
    }

    public static String makeString(String json) {
        StringBuilder stringBuilder = new StringBuilder("select * from students where ");
        stringBuilder.append(json);
        return stringBuilder.toString().replaceAll("[-,\s]?\s?\"[A-Za-z]+\":\"null\"[-,\s]?\s?" ,"");
    }
}
