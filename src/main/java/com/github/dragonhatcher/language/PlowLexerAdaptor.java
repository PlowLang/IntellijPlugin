package com.github.dragonhatcher.language;

import com.intellij.lexer.FlexAdapter;

public class PlowLexerAdaptor extends FlexAdapter {
    public PlowLexerAdaptor() {
        super(new PlowLexer(null));
    }

}
