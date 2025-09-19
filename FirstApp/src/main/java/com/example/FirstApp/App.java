package com.example.FirstApp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        try {
            System.out.println("Hello World!");

            // Create Configuration
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml"); // make sure hibernate.cfg.xml is in resources

            // Build SessionFactory
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            System.out.println("SessionFactory created: " + sessionFactory);

            // Close SessionFactory
            sessionFactory.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
