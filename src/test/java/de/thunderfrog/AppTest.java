package de.thunderfrog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * whenCamelCaseTrue
     */
    @Test
    public void whenCamelCaseTrue(){
        String toBeCamelCase = "string-ding-maven";
        String result = StringWizard.camelCase(true,toBeCamelCase,'-');
        assertEquals("StringDingMaven",result);
    }

    /**
     * whenCamelCaseFalse
     */
    @Test
    public void whenCamelCaseFalse(){
        String toBeCamelCase = "string-ding-maven";
        String result = StringWizard.camelCase(false,toBeCamelCase,'-');
        assertEquals("stringDingMaven",result);
    }

}
