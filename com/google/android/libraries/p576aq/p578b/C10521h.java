package com.google.android.libraries.p576aq.p578b;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.h */
/* compiled from: PG */
final class C10521h extends Property {
    public C10521h(Class cls) {
        super(cls, "background color");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Drawable background = ((View) obj).getBackground();
        return Integer.valueOf(background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setBackgroundColor(((Integer) obj2).intValue());
    }
}
