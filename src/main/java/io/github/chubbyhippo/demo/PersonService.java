package io.github.chubbyhippo.demo;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class PersonService {

    private final Faker faker = new Faker();

    public List<Person> getPeople(int page, int size) {
        return IntStream.range(0, size)
                .mapToObj(index -> new Person(
                        faker.name().fullName(),
                        faker.internet().emailAddress(),
                        faker.job().title(),
                        faker.address().city()
                ))
                .toList();
    }
}
