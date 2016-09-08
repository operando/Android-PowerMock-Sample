package com.os.operando.android.powermock.sample;


import java.util.HashSet;
import java.util.Set;

public class ProgrammingLanguageList {

    private final Set<String> languages = new HashSet<>();

    public boolean add(String l) {
        return languages.add(l);
    }

    public boolean remove(String l) {
        return languages.remove(l);
    }
}
