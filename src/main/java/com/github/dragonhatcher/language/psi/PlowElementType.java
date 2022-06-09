package com.github.dragonhatcher.language.psi;

import com.github.dragonhatcher.language.PlowLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PlowElementType extends IElementType {

    public PlowElementType(@NotNull @NonNls String debugName) {
        super(debugName, PlowLanguage.INSTANCE);
    }

}