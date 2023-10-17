package com.bookyourshow.BookYourFavShow.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="language")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Language implements Serializable {
    private long languageId;
    private String languageName;

    public Language() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="language_id",unique = true,nullable = false)
    public long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(long languageId) {
        this.languageId = languageId;
    }

    @Column(name = "language_name",length = 100)
    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}
