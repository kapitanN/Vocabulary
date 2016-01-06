//package app.db.util;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
////import org.hibernate.service.ServiceRegistryBuilder;
//
///**
// * Vocabulary(v3)
// * Created by Родион on 05.01.2016.
// */
//public class TableUtil {
//    private static final SessionFactory sessionFactory = buildSessionFactory();
//    private static ServiceRegistry serviceRegistry;
//
//    private static SessionFactory buildSessionFactory() {
//        try {
//            // Создает сессию с hibernate.cfg.xml
//            Configuration configuration = new Configuration();
//            configuration.configure();
//            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
//
//            return configuration.buildSessionFactory(serviceRegistry);
//        }
//        catch (Throwable ex) {
//            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
//    }
//
//    public static SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//
//    public static void shutdown() {
//        // Чистит кеш и закрывает соединение с БД
//        getSessionFactory().close();
//    }
//
//}
