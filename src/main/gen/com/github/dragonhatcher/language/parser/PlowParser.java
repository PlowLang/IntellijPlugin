// This is a generated file. Not intended for manual editing.
package com.github.dragonhatcher.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.dragonhatcher.language.psi.PlowTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PlowParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return plowFile(b, l + 1);
  }

  /* ********************************************************** */
  // COMMENT|WHITE_SPACE
  public static boolean extra(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "extra")) return false;
    if (!nextTokenIs(b, "<extra>", COMMENT, WHITE_SPACE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTRA, "<extra>");
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, WHITE_SPACE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // extra|KEYWORD|PUNCUATION|IDENTIFIER|literal
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    r = extra(b, l + 1);
    if (!r) r = consumeToken(b, KEYWORD);
    if (!r) r = consumeToken(b, PUNCUATION);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = literal(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // NUMBER|STRING
  public static boolean literal(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "literal")) return false;
    if (!nextTokenIs(b, "<literal>", NUMBER, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LITERAL, "<literal>");
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean plowFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "plowFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "plowFile", c)) break;
    }
    return true;
  }

}
