package com.google.android.libraries.onegoogle.popovercontainer;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.l */
/* compiled from: PG */
final class C31050l extends Property {
    public C31050l(Class cls) {
        super(cls, "backgroundColor");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Drawable background = ((View) obj).getBackground();
        return Integer.valueOf(background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setBackgroundColor(((Integer) obj2).intValue());
    }
}
