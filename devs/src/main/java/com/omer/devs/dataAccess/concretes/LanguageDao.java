package com.omer.devs.dataAccess.concretes;

import com.omer.devs.dataAccess.abstracts.ILanguageDao;
import com.omer.devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LanguageDao implements ILanguageDao {
    List<Language> languages;

    public LanguageDao() {
        languages = new ArrayList<>();
        languages.add(new Language(1, "Java"));
        languages.add(new Language(2, "C#"));
        languages.add(new Language(3, "Python"));
    }

    @Override
    public void insert(Language language) {
        languages.add(language);
        System.out.println("Eklendi!");

    }

    @Override
    public void update(Language language) {

        for (Language language1 : languages
        ) {
            if (language1.getId() == language.getId()) {
                language1.setName(language.getName());

                System.out.println("Update edildi!");
            }
        }


    }

    @Override
    public void delete(Language language) {

        for (Language language1 : languages
        ) {
            if (language1.getId() == language.getId()) {
                languages.remove(language.getId());

                System.out.println("Kayıt silindi!");
            }
        }

    }

    @Override
    public Language getById(int id) {
        for (Language language1 : languages
        ) {
            if (language1.getId() == id) {
                System.out.println("Kayıt bulundu!");
                return language1;
            }
        }
        return null;
    }

    @Override
    public List<Language> getAll() {
        System.out.println(languages.size() + " adet kayıt bulundu!");
        return languages;
    }
}
