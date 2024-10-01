package com.omer.devs.business.abstracts;

import com.omer.devs.entities.concretes.Language;

import java.util.List;

public interface ILanguageService {
    void insert(Language language) throws Exception;

    void update(Language language);

    void delete(Language language);

    Language getById(int id);

    List<Language> getAll();
}
