package com.omer.devs.business.concretes;

import com.omer.devs.business.abstracts.ILanguageService;
import com.omer.devs.dataAccess.abstracts.ILanguageDao;
import com.omer.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService implements ILanguageService {
    private ILanguageDao iLanguageDao;

    @Autowired
    public LanguageService(ILanguageDao iLanguageDao) {
        this.iLanguageDao = iLanguageDao;
    }

    @Override
    public void insert(Language language) throws Exception {
        iLanguageDao.insert(language);
    }

    @Override
    public void update(Language language) {
        iLanguageDao.update(language);
    }

    @Override
    public void delete(Language language) {
        iLanguageDao.delete(language);
    }

    @Override
    public Language getById(int id) {
        return iLanguageDao.getById(id);
    }

    @Override
    public List<Language> getAll() {
        return iLanguageDao.getAll();
    }
}
