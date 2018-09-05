package com.javatutorial.generics.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;

/**
 * @author jawad
 * @since 9/5/18 11:12 AM
 */
public class VehicleService {

    public static <E> void showConfiguration(List<? extends E> objects) throws InvocationTargetException, IllegalAccessException {
        for(E t : objects) {
            printConfigInfo(t.getClass(), t);
            System.out.println();
        }
    }

    private static void printConfigInfo(Class cls, Object in) throws InvocationTargetException, IllegalAccessException {
        if (cls != Object.class) {
            printConfigInfo(cls.getSuperclass(), in);

            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().startsWith("get")) {
                    Object out = method.invoke(in);
                    System.out.println(method.getName().split("get")[1] + ": " + (Objects.nonNull(out) ? out : "N/A"));
                }
            }
        }
    }

}
