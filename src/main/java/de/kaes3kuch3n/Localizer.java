package de.kaes3kuch3n;

import de.kaes3kuch3n.localizer.Language;
import de.kaes3kuch3n.localizer.LanguageLoader;

public class Localizer {

    public static void main(String[] args) {

        LanguageLoader languageLoader = new LanguageLoader("src/main/resources/languages/");
        languageLoader.setLangFilePath("src/main/resources/languages/");
        languageLoader.setLanguage(Language.DE);

        System.out.println("LanguageLoader\n" +
                           "====================\n" +
                           "Language: " + languageLoader.getLanguage().toString() + "\n" +
                           "LangFilePath: " + languageLoader.getLangFilePath());

        System.out.println(languageLoader.getLocalizedString("menu.play"));
        System.out.println(languageLoader.getLocalizedString("menu.options"));
    }

}
