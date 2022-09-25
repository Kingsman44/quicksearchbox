package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.libraries.aq.b.p */
/* compiled from: PG */
final class C10529p extends Property {
    public C10529p(Class cls) {
        super(cls, "top margin");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((ViewGroup.MarginLayoutParams) ((View) obj).getLayoutParams()).topMargin);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = ((Float) obj2).intValue();
        view.requestLayout();
    }
}
