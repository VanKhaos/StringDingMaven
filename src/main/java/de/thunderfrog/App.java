package de.thunderfrog;

public class App 
{
    public static void main( String[] args )
    {
        //  AppInfo
        MyAppInfo.createAppInfo("String Ding Maven", "Christian Richter", "1.0.2");

        //  CamelCase String True
        String myString = "string-ding-maven";
        System.out.println(myString);
        String camelStringTrue = StringWizard.camelCase(true,myString,'-');
        System.out.println(camelStringTrue);

        //  CamelCase String False
        String camelStringFalse = StringWizard.camelCase(false,myString,'-');
        System.out.println(camelStringFalse);
    }

}
