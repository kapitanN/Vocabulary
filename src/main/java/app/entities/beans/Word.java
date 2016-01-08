package app.entities.beans;

/**
 * Vocabulary(v3)
 * Created by Родион on 08.01.2016.
 */
public class Word {
    private String foreign;
    private String translation;

    public Word() {

    }

    public String getForeign() {
        return foreign;
    }

    public void setForeign(String foreign) {
        this.foreign = foreign;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Word{" +
                "foreign='" + foreign + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }
}
