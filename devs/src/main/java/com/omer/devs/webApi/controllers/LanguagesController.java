package com.omer.devs.webApi.controllers;

import com.omer.devs.business.abstracts.ILanguageService;
import com.omer.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private ILanguageService iLanguageService;

    @Autowired
    public LanguagesController(ILanguageService iLanguageService) {
        this.iLanguageService = iLanguageService;
    }

    @GetMapping("/insert")
    public void insert(Language language) throws Exception {
        iLanguageService.insert(language);
    }

    @GetMapping("/update")
    public void update(Language language) {
        iLanguageService.update(language);
    }

    @GetMapping("/delete")
    public void delete(Language language) {
        iLanguageService.delete(language);
    }

    @GetMapping("/getById")
    public Language getById(int id) {
        return iLanguageService.getById(id);
    }

    @GetMapping("/getAll")
    public List<Language> getAll() {
        return iLanguageService.getAll();
    }
}
