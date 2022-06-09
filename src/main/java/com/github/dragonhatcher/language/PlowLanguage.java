package com.github.dragonhatcher.language;

import com.intellij.lang.Language;

public class PlowLanguage extends Language {

    public static final PlowLanguage INSTANCE = new PlowLanguage();

    private PlowLanguage() {
        super("Plow");
    }

}
