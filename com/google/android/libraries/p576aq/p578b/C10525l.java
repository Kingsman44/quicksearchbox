package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.l */
/* compiled from: PG */
final class C10525l extends Property {
    public C10525l(Class cls) {
        super(cls, "padding top");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getPaddingTop());
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.setPadding(view.getPaddingStart(), ((Float) obj2).intValue(), view.getPaddingEnd(), view.getPaddingBottom());
    }
}
