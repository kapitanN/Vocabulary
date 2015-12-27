package app.entities.table;

import java.util.Date;

/**
 * Vocabulary(v3)
 * Created by Родион on 23.11.2015.
 */
public class TableItem {
    private long id;
    private String originalWord;
    private String translatedWord;
    private Date lastModifiedDate;
    private Date dateOfCreation;
    private String category;

    private TableItem(){}

    public long getId() {
        return id;
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public String getTranslatedWord() {
        return translatedWord;
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
        private Builder(){}

        public Builder setId(long id) {
            TableItem.this.id = id;
            return this;
        }

        public Builder setOriginalWord(String originalWord) {
            TableItem.this.originalWord = originalWord;
            return this;
        }

        public Builder setTranslatedWord(String translatedWord) {
            TableItem.this.translatedWord = translatedWord;
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
