package com.facebook.litho.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;

/* renamed from: com.facebook.litho.widget.dz */
/* compiled from: PG */
final class C6521dz extends EditText {
    public C6521dz(Context context) {
        super(context);
    }

    public final void invalidate() {
    }

    public final void setBackground(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        super.setBackground(drawable);
    }
}
