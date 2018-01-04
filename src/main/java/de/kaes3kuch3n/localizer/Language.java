package de.kaes3kuch3n.localizer;

public enum Language {
    EN("en"), DE("de");

    Language(String language) {
        this.language = language;
    }

    private final String language;

    @Override
    public String toString() {
        return language;
    }
}