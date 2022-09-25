package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.j */
/* compiled from: PG */
final class C10523j extends Property {
    public C10523j(Class cls) {
        super(cls, "padding start");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getPaddingStart());
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.setPadding(((Float) obj2).intValue(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }
}
