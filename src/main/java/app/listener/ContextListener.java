package app.listener;

import app.db.util.TableUtil;
import org.hibernate.Session;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Vocabulary(v3)
 * Created by Родион on 11.01.2016.
 */
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Session session = TableUtil.getSessionFactory().openSession();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
