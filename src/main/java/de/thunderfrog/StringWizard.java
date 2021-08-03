package de.thunderfrog;

import org.apache.commons.text.CaseUtils;

public class StringWizard {

    /**
     * Function to CamleCase Strings
     * @param bol capitalizes the first letter (true/false)
     * @param string input String
     * @param delimiter , - |
     */
    public static void camelCase(boolean bol, String string, char delimiter){
        System.out.println(CaseUtils.toCamelCase(string, bol, delimiter));
    }
}
