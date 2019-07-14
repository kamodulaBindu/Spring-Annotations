package com.stackroute.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;


public class Main {
    public static void main(String[] args) throws Exception {

        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movie = context.getBean(Movie.class);
        movie.actorInformation();

        BeanLifeCycleDemoBean beanLifeCycleDemoBean = context.getBean(BeanLifeCycleDemoBean.class);
        BeanPostProcessorDemoBean beanPostProcessorDemoBean = context.getBean(BeanPostProcessorDemoBean.class);
        context.close();
    }
}
