package com.github.dragonhatcher.language.psi;

import com.github.dragonhatcher.language.PlowFileType;
import com.github.dragonhatcher.language.PlowLanguage;
import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class PlowFile extends PsiFileBase {

    public PlowFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, PlowLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return PlowFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Plow File";
    }

}