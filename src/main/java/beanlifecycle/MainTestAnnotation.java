package beanlifecycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotationbasedconfiguration/beans.xml");
        applicationContext.close();
    }
    }

