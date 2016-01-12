package app.controllers.word.table;

//import app.entities.table.TableItem;

import app.db.util.TableUtil;
import app.entities.beans.ForeignWord;
import app.entities.beans.Translation;
import app.entities.beans.Word;
import app.entities.table.TableItem;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collection;
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

    private static final String GET_ALL_WORDS = "FROM TableItem";

    private static final String GET_FOREIGN_WORD_ID = "FROM foreignwords WHERE foreign_word = :foreign_word";

    private static final String REMOVE_WORD_WHERE = "DELETE FROM TableItem WHERE foreign_id = :foreign_id_word";

    @RequestMapping(method = RequestMethod.POST)
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
        session.close();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteWord(@PathVariable String language, @RequestBody Word word) {
        Session session = TableUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery(GET_FOREIGN_WORD_ID);
        query.setParameter("foreign_word", word.getForeign());
        ForeignWord item = (ForeignWord) query.list().get(0);
        System.out.println(item.toString());

    }

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Word> getItem() {
        List<TableItem> items;
        List<Word> words = new ArrayList<Word>();

        Session session = TableUtil.getSessionFactory().openSession();
        session.beginTransaction();

        items = session.createQuery(GET_ALL_WORDS).list();
        session.getTransaction().commit();
        for (TableItem item : items) {
            Word temp = new Word();
            temp.setForeign(item.getOriginalWord().getWord());
            temp.setTranslation(item.getTranslatedWord().getWord());
            words.add(temp);
        }

        return words;
    }

    public List<TableItem> getItems() {
        throw new NotImplementedException();
    }
}
