# Localizer
This project provides a LanguageLoader class which is able to load .json files and provide localized Strings from it.

## Usage
This project contains two important files (the file Localizer.java is not needed):

### Language.java
The Language.java file contains the enum Language which defines the languages available and their language file names. To add a new language, add a new enum value and the language file name as a String.

__Example:__
* English: `EN("en")` (Already included)
* German: `DE("de")`  (Already included)
* French: `FR("fr")`
* Spanish: `ES("es")`

All languages listed in Language.java will be loaded from the language file path.

### LanguageLoader.java
The LanguageLoader.java file contains the loader functions of the Localizer. It provides a constructor and five methods:

#### LanguageLoader(String path)
The constructor of the class loads all language files specified as enums in Language.java from the provided path.

#### getLocalizedString(String path)
This method returns a String in the language currently set. The path describes the structure of the language.json file (Example: menu.play refers to the String play in the object menu).

#### getLanguage
This method returns the language currently set.

#### setLanguage(Language language)
This method sets the current language to the language `language`.

#### getLangFilePath
This method returns the absolute path of the current language file directory.

#### setLangFilePath
This method sets the path to the language file directory.

## Example usage
For an example on how to use this project take a look at Localizer.java and the provided language files.
