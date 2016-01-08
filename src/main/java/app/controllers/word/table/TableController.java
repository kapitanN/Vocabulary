package app.controllers.word.table;

//import app.entities.table.TableItem;

import app.db.util.TableUtil;
import app.entities.beans.ForeignWord;
import app.entities.beans.Translation;
import app.entities.beans.Word;
import app.entities.table.TableItem;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;
import java.util.List;

/**
 * Vocabulary(v3)
 * Created by Родион on 23.11.2015.
 */
@RestController
@RequestMapping("{language}/vocabulary")
public class TableController {
    private static final Logger LOG = Logger.getLogger(TableController.class);

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addWord(@PathVariable String language, @RequestBody Word word) {

        Session session = TableUtil.getSessionFactory().openSession();
        session.beginTransaction();

        ForeignWord foreignWord = new ForeignWord();
        foreignWord.setWord(word.getForeign());
        foreignWord.setLanguage(language);

        Translation translationWord = new Translation();
        translationWord.setWord(word.getTranslation());
        translationWord.setLanguage("Russian");

        TableItem item = new TableItem();
        item.setForeignWord(foreignWord);
        item.setTranslation(translationWord);
        item.setCategory("Default");
        item.setDateOfCreation(new Date());
        item.setLastModifiedDate(new Date());

        session.save(item);

        session.getTransaction().commit();
        TableUtil.shutdown();
    }

    public boolean deleteWord() {
        throw new NotImplementedException();
    }

    public TableItem getItem() {
        throw new NotImplementedException();
    }

    public List<TableItem> getItems() {
        throw new NotImplementedException();
    }
}
