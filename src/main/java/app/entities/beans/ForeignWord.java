package app.entities.beans;

import javax.persistence.*;

/**
 * Vocabulary(v3)
 * Created by Родион on 29.11.2015.
 */
@Entity
@Table(name = "foreignwords")
public class ForeignWord {

    @Id
    @Column(name = "foreign_id")
    @GeneratedValue
    private Long id;

    @Column(name = "foreign_word")
    private String word;

    @Column(name = "foreign_language")
    private String language;

    public ForeignWord() {
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
