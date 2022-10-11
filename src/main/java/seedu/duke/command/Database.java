package seedu.duke.command;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import seedu.duke.module.Module;
import seedu.duke.module.ModuleMapping;
import seedu.duke.university.University;

public class Database {
    private static Logger logger = Logger.getLogger("Database");

    private static ArrayList<University> universities = new ArrayList<>();
    private static ArrayList<ModuleMapping> moduleMappings = new ArrayList<>();

    public static ArrayList<University> getUniversities() {
        return universities;
    }

    public static ArrayList<ModuleMapping> getModuleMappings() {
        return moduleMappings;
    }

    public static void addUniversity(University newUniversity) {
        assert newUniversity.getName().length() > 0 : "New university name cannot be empty";
        assert newUniversity.getCountry().length() > 0 : "New university country cannot be empty";

        if (isNewUniversity(newUniversity)) {
            logger.log(Level.FINE, "New university found, adding to list");

            universities.add(newUniversity);
        }
    }

    public static void addModuleMapping(ModuleMapping newModuleMapping) {
        assert newModuleMapping.getPartnerUniversityModule().getCode().length() > 0
                : "Partner University module code cannot be empty";
        assert newModuleMapping.getPartnerUniversityModule().getTitle().length() > 0
                : "Partner University module title cannot be empty";
        assert newModuleMapping.getPartnerUniversityModule().getCredit().length() > 0
                : "Partner University module credit cannot be empty";
        assert newModuleMapping.getNusModule().getCode().length() > 0
                : "NUS module code cannot be empty";
        assert newModuleMapping.getNusModule().getTitle().length() > 0
                : "NUS module title cannot be empty";
        assert newModuleMapping.getNusModule().getCredit().length() > 0
                : "NUS module credit cannot be empty";

        moduleMappings.add(newModuleMapping);
    }

    private static boolean isNewUniversity(University newUniversity) {
        assert newUniversity.getName().length() > 0 : "New university name cannot be empty";
        assert newUniversity.getCountry().length() > 0 : "New university country cannot be empty";

        for (University university : universities) {
            if (university.getName().equals(newUniversity.getName())) {
                return false;
            }
        }
        return true;
    }
}