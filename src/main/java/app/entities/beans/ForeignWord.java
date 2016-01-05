package app.entities.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Vocabulary(v3)
 * Created by Родион on 29.11.2015.
 */
@Entity
public class ForeignWord {

    @Id
    @GeneratedValue
    private long id;

    private String word;
    private String language;

    public ForeignWord() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
