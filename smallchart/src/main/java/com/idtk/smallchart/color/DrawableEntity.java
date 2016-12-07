package com.idtk.smallchart.color;

import android.graphics.drawable.Drawable;

/**
 * Created by gary on 16-12-7.
 */

public class DrawableEntity {

    private Drawable drawable;
    private int length;

    public DrawableEntity(Drawable drawable, int length) {
        this.drawable = drawable;
        this.length = length;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
