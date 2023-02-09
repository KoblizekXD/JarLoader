package com.koblizek.jarloader;

import java.io.File;

public class JarClassLoader {
    private final File jarFile;

    public JarClassLoader(File jarFile) {
        this.jarFile = jarFile;
    }
}
