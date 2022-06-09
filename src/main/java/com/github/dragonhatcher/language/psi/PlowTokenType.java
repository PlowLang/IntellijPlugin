package com.github.dragonhatcher.language.psi;

import com.github.dragonhatcher.language.PlowLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PlowTokenType extends IElementType {

    public PlowTokenType(@NotNull @NonNls String debugName) {
        super(debugName, PlowLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "PlowTokenType." + super.toString();
    }

    public static PlowTokenType KEYWORD = new PlowTokenType("KEYWORD");
    public static PlowTokenType PUNCUATION = new PlowTokenType("PUNCUATION");
    public static PlowTokenType IDENTIFIER = new PlowTokenType("IDENTIFIER");
    public static PlowTokenType NUMBER = new PlowTokenType("NUMBER");
    public static PlowTokenType STRING = new PlowTokenType("STRING");

}