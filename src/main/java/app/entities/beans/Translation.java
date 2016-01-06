package app.entities.beans;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;

/**
 * Vocabulary(v3)
 * Created by Родион on 29.11.2015.
 */
@Entity
@Table(name = "translations")
public class Translation implements Serializable {

    @Id
    @Column(name = "tr_id")
    @GeneratedValue
    private Long id;

    @Column(name = "tr_word")
    private String word;

    @Column(name = "tr_language")
    private String language;

    public Translation() {
    }

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
