/* Generated by: FreeCC 0.9.3. Token.java */
package org.owasp.orizon.mirage.java.parser;

/**
 * Describes the input token stream.
 */
public class Token implements Node,JavaConstants {
    private Node parent;
    private String inputSource="";
    private java.util.Map<String,Object>attributes;
    /**
     * An integer that describes the kind of this token.  This numbering
     * system is determined by JavaCCParser, and a table of these numbers is
     * stored in the file ...Constants.java.
     */
    int kind;
    /**
     * beginLine and beginColumn describe the position of the first character
     * of this token; endLine and endColumn describe the position of the
     * last character of this token.
     */
    int beginLine,beginColumn,endLine,endColumn;
    /**
     * The string image of the token.
     */
    String image;
    /**
     * A reference to the next regular (non-special) token from the input
     * stream.  If this is the last token from the input stream, or if the
     * token manager has not read tokens beyond this one, this field is
     * set to null.  This is true only if this token is also a regular
     * token.  Otherwise, see below for a description of the contents of
     * this field.
     */
    Token next;
    /**
     * This field is used to access special tokens that occur prior to this
     * token, but after the immediately preceding regular (non-special) token.
     * If there are no such special tokens, this field is set to null.
     * When there are more than one such special token, this field refers
     * to the last of these special tokens, which in turn refers to the next
     * previous special token through its specialToken field, and so on
     * until the first special token (whose specialToken field is null).
     * The next fields of special tokens refer to other special tokens that
     * immediately follow it (without an intervening regular token).  If there
     * is no such token, this field is null.
     */
    Token specialToken;
    private boolean unparsed;
    /**
     * No-argument constructor
     */
    public Token() {
    }

    /**
     * Constructs a new token for the specified Image.
     */
    public Token(int kind) {
        this(kind,null);
    }

    /**
     * Constructs a new token for the specified Image and Kind.
     */
    public Token(int kind,String image) {
        this.kind=kind;
        this.image=image;
    }

    public int getId() {
        return kind;
    }

    public String getNormalizedText() {
        return image;
    }

    public String getRawText() {
        return image;
    }

    public String toString() {
        return getNormalizedText();
    }

    public Object getAttribute(String name) {
        return attributes==null?null:
        attributes.get(name);
    }

    public void setAttribute(String name,Object value) {
        if (attributes==null) {
            attributes=new java.util.HashMap<String,Object>();
        }
        attributes.put(name,value);
    }

    public boolean hasAttribute(String name) {
        return attributes==null?false:
        attributes.containsKey(name);
    }

    public java.util.Set<String>getAttributeNames() {
        if (attributes==null) return java.util.Collections.emptySet();
        return attributes.keySet();
    }

    public static Token newToken(int ofKind,String image) {
        switch(ofKind) {
            case WHITESPACE:
            return new Whitespace(ofKind,image);
            case SINGLE_LINE_COMMENT:
            return new Comment(ofKind,image);
            case FORMAL_COMMENT:
            return new JavaDocComment(ofKind,image);
            case MULTI_LINE_COMMENT:
            return new Comment(ofKind,image);
            case ABSTRACT:
            return new KeyWord(ofKind,image);
            case ASSERT:
            return new KeyWord(ofKind,image);
            case BOOLEAN:
            return new KeyWord(ofKind,image);
            case BREAK:
            return new KeyWord(ofKind,image);
            case BYTE:
            return new KeyWord(ofKind,image);
            case CASE:
            return new KeyWord(ofKind,image);
            case CATCH:
            return new KeyWord(ofKind,image);
            case CHAR:
            return new KeyWord(ofKind,image);
            case CLASS:
            return new KeyWord(ofKind,image);
            case CONST:
            return new KeyWord(ofKind,image);
            case CONTINUE:
            return new KeyWord(ofKind,image);
            case _DEFAULT:
            return new KeyWord(ofKind,image);
            case DO:
            return new KeyWord(ofKind,image);
            case DOUBLE:
            return new KeyWord(ofKind,image);
            case ELSE:
            return new KeyWord(ofKind,image);
            case ENUM:
            return new KeyWord(ofKind,image);
            case EXTENDS:
            return new KeyWord(ofKind,image);
            case FALSE:
            return new Literal(ofKind,image);
            case FINAL:
            return new KeyWord(ofKind,image);
            case FINALLY:
            return new KeyWord(ofKind,image);
            case FLOAT:
            return new KeyWord(ofKind,image);
            case FOR:
            return new KeyWord(ofKind,image);
            case GOTO:
            return new KeyWord(ofKind,image);
            case IF:
            return new KeyWord(ofKind,image);
            case IMPLEMENTS:
            return new KeyWord(ofKind,image);
            case IMPORT:
            return new KeyWord(ofKind,image);
            case INSTANCEOF:
            return new KeyWord(ofKind,image);
            case INT:
            return new KeyWord(ofKind,image);
            case INTERFACE:
            return new KeyWord(ofKind,image);
            case LONG:
            return new KeyWord(ofKind,image);
            case NATIVE:
            return new KeyWord(ofKind,image);
            case NEW:
            return new KeyWord(ofKind,image);
            case NULL:
            return new Literal(ofKind,image);
            case PACKAGE:
            return new KeyWord(ofKind,image);
            case PRIVATE:
            return new KeyWord(ofKind,image);
            case PROTECTED:
            return new KeyWord(ofKind,image);
            case PUBLIC:
            return new KeyWord(ofKind,image);
            case RETURN:
            return new KeyWord(ofKind,image);
            case SHORT:
            return new KeyWord(ofKind,image);
            case STATIC:
            return new KeyWord(ofKind,image);
            case STRICTFP:
            return new KeyWord(ofKind,image);
            case SUPER:
            return new KeyWord(ofKind,image);
            case SWITCH:
            return new KeyWord(ofKind,image);
            case SYNCHRONIZED:
            return new KeyWord(ofKind,image);
            case THIS:
            return new KeyWord(ofKind,image);
            case THROW:
            return new KeyWord(ofKind,image);
            case THROWS:
            return new KeyWord(ofKind,image);
            case TRANSIENT:
            return new KeyWord(ofKind,image);
            case TRUE:
            return new Literal(ofKind,image);
            case TRY:
            return new KeyWord(ofKind,image);
            case VOID:
            return new KeyWord(ofKind,image);
            case VOLATILE:
            return new KeyWord(ofKind,image);
            case WHILE:
            return new KeyWord(ofKind,image);
            case INTEGER_LITERAL:
            return new Literal(ofKind,image);
            case FLOATING_POINT_LITERAL:
            return new Literal(ofKind,image);
            case CHARACTER_LITERAL:
            return new Literal(ofKind,image);
            case STRING_LITERAL:
            return new Literal(ofKind,image);
            case LPAREN:
            return new Delimiter(ofKind,image);
            case RPAREN:
            return new Delimiter(ofKind,image);
            case LBRACE:
            return new Delimiter(ofKind,image);
            case RBRACE:
            return new Delimiter(ofKind,image);
            case LBRACKET:
            return new Delimiter(ofKind,image);
            case RBRACKET:
            return new Delimiter(ofKind,image);
            case SEMICOLON:
            return new Delimiter(ofKind,image);
            case COMMA:
            return new Delimiter(ofKind,image);
            case DOT:
            return new Delimiter(ofKind,image);
            case ASSIGN:
            return new Operator(ofKind,image);
            case GT:
            return new Operator(ofKind,image);
            case LT:
            return new Operator(ofKind,image);
            case BANG:
            return new Operator(ofKind,image);
            case TILDE:
            return new Operator(ofKind,image);
            case HOOK:
            return new Operator(ofKind,image);
            case COLON:
            return new Operator(ofKind,image);
            case EQ:
            return new Operator(ofKind,image);
            case LE:
            return new Operator(ofKind,image);
            case GE:
            return new Operator(ofKind,image);
            case NE:
            return new Operator(ofKind,image);
            case SC_OR:
            return new Operator(ofKind,image);
            case SC_AND:
            return new Operator(ofKind,image);
            case INCR:
            return new Operator(ofKind,image);
            case DECR:
            return new Operator(ofKind,image);
            case PLUS:
            return new Operator(ofKind,image);
            case MINUS:
            return new Operator(ofKind,image);
            case STAR:
            return new Operator(ofKind,image);
            case SLASH:
            return new Operator(ofKind,image);
            case BIT_AND:
            return new Operator(ofKind,image);
            case BIT_OR:
            return new Operator(ofKind,image);
            case XOR:
            return new Operator(ofKind,image);
            case REM:
            return new Operator(ofKind,image);
            case LSHIFT:
            return new Operator(ofKind,image);
            case RSIGNEDSHIFT:
            return new Operator(ofKind,image);
            case RUNSIGNEDSHIFT:
            return new Operator(ofKind,image);
            case PLUSASSIGN:
            return new Operator(ofKind,image);
            case MINUSASSIGN:
            return new Operator(ofKind,image);
            case STARASSIGN:
            return new Operator(ofKind,image);
            case SLASHASSIGN:
            return new Operator(ofKind,image);
            case ANDASSIGN:
            return new Operator(ofKind,image);
            case ORASSIGN:
            return new Operator(ofKind,image);
            case XORASSIGN:
            return new Operator(ofKind,image);
            case REMASSIGN:
            return new Operator(ofKind,image);
            case LSHIFTASSIGN:
            return new Operator(ofKind,image);
            case RSIGNEDSHIFTASSIGN:
            return new Operator(ofKind,image);
            case RUNSIGNEDSHIFTASSIGN:
            return new Operator(ofKind,image);
            case IDENTIFIER:
            return new Identifier(ofKind,image);
        }
        return new Token(ofKind,image);
    }

    public void setInputSource(String inputSource) {
        this.inputSource=inputSource;
    }

    public String getInputSource() {
        return inputSource;
    }

    public void setBeginColumn(int beginColumn) {
        this.beginColumn=beginColumn;
    }

    public void setEndColumn(int endColumn) {
        this.endColumn=endColumn;
    }

    public void setBeginLine(int beginLine) {
        this.beginLine=beginLine;
    }

    public void setEndLine(int endLine) {
        this.endLine=endLine;
    }

    public int getBeginLine() {
        return beginLine;
    }

    public int getBeginColumn() {
        return beginColumn;
    }

    public int getEndLine() {
        return endLine;
    }

    public int getEndColumn() {
        return endColumn;
    }

    public int getChildCount() {
        return 0;
    }

    public Node getChild(int i) {
        return null;
    }

    public void setChild(int i,Node n) {
        throw new UnsupportedOperationException();
    }

    public void addChild(Node n) {
        throw new UnsupportedOperationException();
    }

    public void addChild(int i,Node n) {
        throw new UnsupportedOperationException();
    }

    public Node removeChild(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean removeChild(Node n) {
        return false;
    }

    public int indexOf(Node n) {
        return-1;
    }

    public boolean isUnparsed() {
        return unparsed;
    }

    public void setUnparsed(boolean unparsed) {
        this.unparsed=unparsed;
    }

    public void clearChildren() {
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent=parent;
    }

    public void open() {
    }

    public void close() {
    }

}