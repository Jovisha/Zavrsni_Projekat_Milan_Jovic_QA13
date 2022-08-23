package dataCreation;

import com.github.javafaker.Faker;

public class DataCreation {

    public static String[] personalData(){
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String postalCode = faker.number().digits(5);

        return new String[]{firstName,lastName,postalCode};
    }
}
