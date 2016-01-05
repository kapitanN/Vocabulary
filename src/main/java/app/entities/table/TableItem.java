package app.entities.table;

import app.entities.beans.ForeignWord;
import app.entities.beans.Translation;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

/**
 * Vocabulary(v3)
 * Created by Родион on 23.11.2015.
 */
@Entity
@Table(name = "unit")
public class TableItem {
    @Id
    @Column(name = "unit_id")
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "foreign_id")
    private ForeignWord foreignWord;

    @ManyToOne
    @JoinColumn(name = "tr_id")
    private Translation translation;

    @Column(name = "last_modified")
    @Temporal(value = TemporalType.DATE)
    private Date lastModifiedDate;

    @Column(name = "date_of_creation")
    @Temporal(value = TemporalType.DATE)
    private Date dateOfCreation;

    @Column(name = "category")
    private String category;

    private TableItem() {
    }

    public long getId() {
        return id;
    }

    public ForeignWord getOriginalWord() {
        return foreignWord;
    }

    public Translation getTranslatedWord() {
        return translation;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public String getCategory() {
        return category;
    }

    public class Builder {
        private Builder() {
        }

        public Builder setId(long id) {
            TableItem.this.id = id;
            return this;
        }

        public Builder setOriginalWord(ForeignWord foreignWord) {
            TableItem.this.foreignWord = foreignWord;
            return this;
        }

        public Builder setTranslatedWord(Translation translation) {
            TableItem.this.translation = translation;
            return this;
        }

        public Builder setLastModifiedDate(Date lastModifiedDate) {
            TableItem.this.lastModifiedDate = lastModifiedDate;
            return this;
        }

        public Builder setDateOfCreation(Date dateOfCreation) {
            TableItem.this.dateOfCreation = dateOfCreation;
            return this;
        }

        public Builder setCategory(String category) {
            TableItem.this.category = category;
            return this;
        }

        public TableItem build() {
            return TableItem.this;
        }
    }
}
