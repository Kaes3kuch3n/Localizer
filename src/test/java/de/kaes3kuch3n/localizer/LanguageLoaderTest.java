package de.kaes3kuch3n.localizer;

import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class LanguageLoaderTest {

    private LanguageLoader languageLoader;

    @Before
    public void setUp() {
        languageLoader = new LanguageLoader("src/test/resources/languages/");
    }

    @Test
    public void getLocalizedString() {
        assertEquals("Play", languageLoader.getLocalizedString("menu.play"));
        assertEquals("Options", languageLoader.getLocalizedString("menu.options"));
        assertEquals("Quit", languageLoader.getLocalizedString("menu.quit"));

        assertEquals("Graphics", languageLoader.getLocalizedString("options.graphics"));
        assertEquals("Sound", languageLoader.getLocalizedString("options.sound"));
        assertEquals("Other", languageLoader.getLocalizedString("options.other"));

        assertEquals("Path not found" , languageLoader.getLocalizedString("test.fail"));
    }

    @Test
    public void language() {
        Language language = Language.DE;
        languageLoader.setLanguage(language);
        assertEquals(language, languageLoader.getLanguage());
    }

    @Test
    public void langFilePath() {
        String langFilePath = "TestPath";
        languageLoader.setLangFilePath(langFilePath);
        assertEquals(new File("").getAbsolutePath() + File.separator + langFilePath, languageLoader.getLangFilePath());
    }
}