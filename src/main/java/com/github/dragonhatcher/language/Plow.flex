import com.github.dragonhatcher.language.psi.PlowTypes;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.github.dragonhatcher.language.psi.PlowTokenType;

%%

%class PlowLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
EOL_COMMENT="//"[^\r\n]*
IDENTIFIER=[a-zA-Z_][a-zA-Z_0-9]*
NUMBER=[0-9]+
STRING=\"[^\"]\"

%state YY_INITIAL

%%

{EOL_COMMENT}                                   { return PlowTypes.COMMENT; }

{WHITE_SPACE}+                                              { return TokenType.WHITE_SPACE; }
"var" | "let" | "if" | "else" | "when" | "while" | "for" |
"in" | "continue" | "break" | "this" | "super" | "class" |
"struct" | "enum" | "interface" | "func" | "return" | "as" |
"is" | "public" | "private" | "protected" | "internal" |
"override" | "static" | "mutating" | "final" | "open" |
"abstract" | "import" | "extern" | "export" | "nil" |
"true" | "false"                                            { return PlowTokenType.KEYWORD; }
"::" | "->" | "<=" | ">=" | "==" | "!=" | "&&" | "||" |
"(" | ")" | "[" | "]" | "{" | "}" | "<" | ">" | "," | "." |
":" | ";" | "?" | "=" | "+" | "-" | "*" | "/" | "!"         { return PlowTokenType.PUNCUATION; }
{IDENTIFIER}                                                { return PlowTokenType.IDENTIFIER; }
{NUMBER}                                                    { return PlowTokenType.NUMBER; }
{STRING}                                                    { return PlowTokenType.STRING; }

//{ yybegin(YYINITIAL); return PlowTypes.KEY; }
//
//<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return PlowTypes.SEPARATOR; }
//
//<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
//
//<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }