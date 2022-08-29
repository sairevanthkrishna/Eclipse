package Task;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Test{
    public String convert(Object object) throws IllegalAccessException {
        Class<?> clapp = object.getClass();
        HashMap<String, String> variables = new HashMap<>();
        for(Field field: clapp.getDeclaredFields()){
        	field.setAccessible(true);
            if(field.isAnnotationPresent(ChangeValue.class)){
                variables.put(getValue(field), field.get(object).toString());
            }else{
                variables.put(field.getName(), field.get(object).toString());
            }
        }

        return variables.entrySet().stream().map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"").collect(Collectors.joining(","));

    }

    private String getValue(Field field){
        String value = field.getAnnotation(ChangeValue.class).value();
        return value;
    }
}

 