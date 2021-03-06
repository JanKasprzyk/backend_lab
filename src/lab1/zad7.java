package lab1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class zad7 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        TestObject userObject = new TestObject ("Test", 21);
        String testObjectAsJson = null;
        try {
            testObjectAsJson = objectMapper.writeValueAsString(userObject);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(testObjectAsJson);
    }
    static class TestObject {
        String name;
        int value;

        public TestObject(){}

        public TestObject(String name, int value) {
            this.name = name;
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
