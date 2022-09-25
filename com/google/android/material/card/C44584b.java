package com.google.android.material.card;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: com.google.android.material.card.b */
/* compiled from: PG */
final class C44584b extends InsetDrawable {
    public C44584b(Drawable drawable, int i, int i2, int i3, int i4) {
        super(drawable, i, i2, i3, i4);
    }

    public final int getMinimumHeight() {
        return -1;
    }

    public final int getMinimumWidth() {
        return -1;
    }

    public final boolean getPadding(Rect rect) {
        return false;
    }
}
