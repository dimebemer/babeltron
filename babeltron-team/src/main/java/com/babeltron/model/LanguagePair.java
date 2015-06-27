package com.babeltron.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * @author  Rafael Bemerguy
 * @since   27/06/2015
 */
public class LanguagePair {
    private int id;
    private Language original;
    private Language translated;

    public LanguagePair() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Language getOriginal() {
        return original;
    }

    public void setOriginal(Language original) {
        this.original = original;
    }

    public Language getTranslated() {
        return translated;
    }

    public void setTranslated(Language translated) {
        this.translated = translated;
    }

    @Override
    public String toString() {
        return original.getLangCode().toUpperCase() +
                "-" +
                translated.getLangCode().toUpperCase();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        LanguagePair rhs = (LanguagePair) obj;
        return new EqualsBuilder()
                .append(this.id, rhs.id)
                .append(this.original, rhs.original)
                .append(this.translated, rhs.translated)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(id)
                .append(original)
                .append(translated)
                .toHashCode();
    }
}
