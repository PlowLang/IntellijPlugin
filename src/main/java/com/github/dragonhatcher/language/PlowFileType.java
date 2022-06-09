package com.github.dragonhatcher.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PlowFileType extends LanguageFileType {

    public static final PlowFileType INSTANCE = new PlowFileType();

    private PlowFileType() {
        super(PlowLanguage.INSTANCE);
    }

    @Override
    public @NonNls @NotNull String getName() {
        return "Plow File";
    }

    @Override
    public @NotNull String getDescription() {
        return "Plow language file";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "plow";
    }

    @Override
    public @Nullable Icon getIcon() {
        return null;
    }
}
