// This is a generated file. Not intended for manual editing.
package com.github.dragonhatcher.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.dragonhatcher.language.psi.impl.*;

public interface PlowTypes {

  IElementType EXTRA = new PlowElementType("EXTRA");
  IElementType LITERAL = new PlowElementType("LITERAL");

  IElementType COMMENT = new PlowTokenType("COMMENT");
  IElementType IDENTIFIER = new PlowTokenType("IDENTIFIER");
  IElementType KEYWORD = new PlowTokenType("KEYWORD");
  IElementType NUMBER = new PlowTokenType("NUMBER");
  IElementType PUNCUATION = new PlowTokenType("PUNCUATION");
  IElementType STRING = new PlowTokenType("STRING");
  IElementType WHITE_SPACE = new PlowTokenType("WHITE_SPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == EXTRA) {
        return new PlowExtraImpl(node);
      }
      else if (type == LITERAL) {
        return new PlowLiteralImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
