package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.n */
/* compiled from: PG */
final class C10527n extends Property {
    public C10527n(Class cls) {
        super(cls, "padding bottom");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) ((View) obj).getPaddingBottom());
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.setPadding(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), ((Float) obj2).intValue());
    }
}
