/* Generated by: FreeCC 0.9.3. Do not edit. CommentTag.java */
package org.owasp.orizon.mirage.jsp.parser;

public class CommentTag extends BaseNode {
    private String image;
    public String toString() {
        return super.toString()+" - "+getImage();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image=image;
    }

    public CommentTag(int id) {
        super(id);
    }

    public CommentTag() {
        super(JspConstants.COMMENTTAG);
    }

}