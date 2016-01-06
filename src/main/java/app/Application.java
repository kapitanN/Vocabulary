package app;

import app.db.util.TableUtil;
import app.entities.beans.ForeignWord;
import app.entities.beans.Translation;
import app.entities.table.TableItem;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * Vocabulary(v3)
 * Created by Родион on 23.11.2015.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
    public static void main(String[] args) {
        Session session = TableUtil.getSessionFactory().openSession();
        session.beginTransaction();

        // Add new Employee object
        ForeignWord foreign = new ForeignWord();
        foreign.setWord("school");
        foreign.setLanguage("English");

        Translation translation = new Translation();
        translation.setWord("школа");
        translation.setLanguage("Russian");

        TableItem item = new TableItem();
        item.setForeignWord(foreign);
        item.setTranslation(translation);
        item.setCategory("School");
        item.setDateOfCreation(new Date());
        item.setLastModifiedDate(new Date());

        session.save(item);

        session.getTransaction().commit();
        TableUtil.shutdown();

        SpringApplication.run(Application.class, args);
    }
}
