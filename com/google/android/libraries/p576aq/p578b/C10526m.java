package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.m */
/* compiled from: PG */
final class C10526m extends Property {
    public C10526m(Class cls) {
        super(cls, "padding end");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getPaddingEnd());
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
    }
}
