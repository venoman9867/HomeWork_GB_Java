import org.json.JSONException;
import org.json.JSONObject;

public class StringBuilderSQL {
    public static void main(String[] args) throws JSONException {
        String json = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"null\", \"age\":\"24\"}";
        System.out.println(makeString(json));
    }

    public static String makeString(String json) throws JSONException {
        StringBuilder stringBuilder = new StringBuilder("select * from students where ");
        JSONObject jsonObject = new JSONObject(json);
        boolean flag = false;
        if (jsonObject.get("name").hashCode() != "null".hashCode()) {
            stringBuilder.append(jsonObject.get("name"));
            flag = true;
        }
        if (jsonObject.get("country").hashCode() != "null".hashCode()) {
            if (flag == true) {
                stringBuilder.append(" and ");
            }
            stringBuilder.append(jsonObject.get("country"));
        }

        if (jsonObject.get("city").hashCode() != "null".hashCode()) {
            if (flag == true) {
                stringBuilder.append(" and ");
            }
            stringBuilder.append(jsonObject.get("city"));
        }
        if (jsonObject.get("age").hashCode() != "null".hashCode()) {
            if (flag == true) {
                stringBuilder.append(" and ");
            }
            stringBuilder.append(jsonObject.get("age"));
        }
        return stringBuilder.toString();
    }
}