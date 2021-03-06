package ru.bozaro;

import ru.bozaro.annotation.FortyTwoAnnotation;
import ru.bozaro.annotation.HelloAnnotation;

import java.io.IOException;

/**
 * Пример использования аннотаций.
 *
 * @author Artem V. Navrotskiy (bozaro at buzzsoft.ru)
 */
public class HelloFortyTwo {
    @FortyTwoAnnotation
    private final static int number = 0;

    @HelloAnnotation
    public static void main(String[] args) throws IOException {
        System.out.println(number);
    }
}
