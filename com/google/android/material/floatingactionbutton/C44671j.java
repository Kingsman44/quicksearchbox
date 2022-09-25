package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.material.floatingactionbutton.j */
/* compiled from: PG */
final class C44671j extends Property {
    public C44671j(Class cls) {
        super(cls, "height");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getLayoutParams().height);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.getLayoutParams().height = ((Float) obj2).intValue();
        view.requestLayout();
    }
}
