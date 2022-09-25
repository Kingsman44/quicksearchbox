package com.google.android.libraries.lens.view.infopanel;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bv */
/* compiled from: PG */
final class C27068bv extends Property {
    public C27068bv(Class cls) {
        super(cls, "alpha");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getAlpha());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setAlpha(((Float) obj2).floatValue());
    }
}
