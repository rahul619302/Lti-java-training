package com.lti.reflection.practice;

import java.lang.reflect.*;

public class ReflectionMain {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        ReflectionTest reflectionTest=new ReflectionTest();
        Class classMetaData=reflectionTest.getInfoOfClass("com.lti.reflection.practice.Person");
        Person person= (Person) reflectionTest.getRequiredObject(classMetaData);

        System.out.println("*************Person Object************** : ");
        System.out.println(person);
        System.out.println("*************Class Name************** : ");
        System.out.println(reflectionTest.getNameOfClass(classMetaData));
        System.out.println("*************Super Class Name************** : ");
        System.out.println(reflectionTest.getNameOfClass(reflectionTest.getSuperclass(classMetaData)));
        System.out.println("*************Interface Name************** : ");
        for(Class aClass:reflectionTest.getAllImplemantation(classMetaData))
            System.out.println(reflectionTest.getNameOfClass(aClass));

        System.out.println("*************Public Field Names************** : ");
        for(Field field:reflectionTest.getAllPublicFields(classMetaData)) {
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getName());
        }

        System.out.println("*************All Field Names************** : ");
        for(Field field:reflectionTest.getAllFields(classMetaData)) {
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println(field.getName());
        }
        System.out.println("*************Public Methods Names************** : ");
        for(Method method:reflectionTest.getAllPublicMethods(classMetaData)) {
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getName());
        }
        System.out.println("*************All Methods Names************** : ");
        for(Method method:reflectionTest.getAllMethods(classMetaData)) {
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getName());
        }
        System.out.println("*************Public Constructor Names************** : ");
        for(Constructor constructor:reflectionTest.getAllPublicConstructor(classMetaData))
            System.out.println(Modifier.toString(constructor.getModifiers()));

        System.out.println("*************All Constructor Names************** : ");
        for(Constructor constructor:reflectionTest.getAllConstructor(classMetaData))
            System.out.println(Modifier.toString(constructor.getModifiers()));

        System.out.println("*************No. Of Modifiers************** : ");
        System.out.println(reflectionTest.getNoOfModifersOfClass(classMetaData));
        System.out.println("*************Name Of Modifiers************** : ");
        System.out.println(reflectionTest.displayAllModifierOfClass(classMetaData));

        System.out.println("*************Accessing private Method************** : ");
        Method method=classMetaData.getDeclaredMethod("getId");
        method.setAccessible(true);
        method.invoke(person);

        System.out.println("*************Accessing Public Method************** : ");
        Method method1=classMetaData.getDeclaredMethod("setName", String.class);
        method1.setAccessible(true);
        method1.invoke(person, "Rahul Singh");

        System.out.println("*************Accessing public Method************** : ");
        Method method2=classMetaData.getDeclaredMethod("getFatherName");
        method2.setAccessible(true);
        method2.invoke(person);

        Thread.currentThread().getThreadGroup().getParent().getName();
    }
}
