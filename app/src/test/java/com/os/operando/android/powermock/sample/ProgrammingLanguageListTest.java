package com.os.operando.android.powermock.sample;

import org.junit.Test;
import org.powermock.reflect.Whitebox;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ProgrammingLanguageListTest {

    @Test
    public void setInternalStateTest() {
        ProgrammingLanguageList programmingLanguageList = new ProgrammingLanguageList();
        String languageJava = "java";
        Set<String> mockSet = new HashSet<>();
        mockSet.add(languageJava);

        // private フィールドをセットする
        // Mockitoにも同じような機能はあるらしい
//        Whitebox.setInternalState(programmingLanguageList, "languages", mockSet);
        Whitebox.setInternalState(programmingLanguageList, mockSet);

        assertTrue(programmingLanguageList.remove(languageJava));
    }

    @Test
    public void getInternalStateTest() {
        ProgrammingLanguageList programmingLanguageList = new ProgrammingLanguageList();
        String languageJava = "java";

        programmingLanguageList.add(languageJava);

        // private フィールドを取得する
        // Mockitoにも同じような機能はあるらしい
//        Set<String> set = Whitebox.getInternalState(programmingLanguageList, "languages");
        Set<String> set = Whitebox.getInternalState(programmingLanguageList, Set.class);

        assertEquals(1, set.size());
        assertSame(languageJava, set.iterator().next());
    }
}
