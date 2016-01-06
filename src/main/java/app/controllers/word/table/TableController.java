package app.controllers.word.table;

//import app.entities.table.TableItem;
import app.entities.table.TableItem;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * Vocabulary(v3)
 * Created by Родион on 23.11.2015.
 */
@RestController
@RequestMapping("{language}/vocabulary")
public class TableController {
    private static final Logger LOG = Logger.getLogger(TableController.class);

    public boolean addWord() {
        throw new NotImplementedException();
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
