package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.material.floatingactionbutton.i */
/* compiled from: PG */
final class C44670i extends Property {
    public C44670i(Class cls) {
        super(cls, "width");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getLayoutParams().width);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.getLayoutParams().width = ((Float) obj2).intValue();
        view.requestLayout();
    }
}
