package com.lti.reflection.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {

    public Class getInfoOfClass(String className) throws ClassNotFoundException {
        return Class.forName(className);
    }

    public Object getRequiredObject(Class classMetaData) throws IllegalAccessException, InstantiationException {
        return classMetaData.newInstance();
    }

    public String getNameOfClass(Class classMetaData) {
        return classMetaData.getName();
    }

    public Class getSuperclass(Class classMetaData) {
        return classMetaData.getSuperclass();
    }

    public Class[] getAllImplemantation(Class classMetaData) {
        return classMetaData.getInterfaces();
    }

    public Field[] getAllPublicFields(Class classMetaData) {
        return classMetaData.getFields();
    }

    public Field[] getAllFields(Class classMetaData) {
        return classMetaData.getDeclaredFields();
    }

    public Method[] getAllPublicMethods(Class classMetaData) {
        return classMetaData.getMethods();
    }

    public Method[] getAllMethods(Class classMetaData) {
        return classMetaData.getDeclaredMethods();
    }

    public Constructor[] getAllPublicConstructor(Class classMetaData) {
        return classMetaData.getConstructors();
    }

    public Constructor[] getAllConstructor(Class classMetaData) {
        return classMetaData.getDeclaredConstructors();
    }

    public int getNoOfModifersOfClass(Class classMetaData) {
        return classMetaData.getModifiers();
    }

    public String displayAllModifierOfClass(Class classMetaData) {
        return Modifier.toString(classMetaData.getModifiers());
    }
}
