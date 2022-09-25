package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.ab */
/* compiled from: PG */
final class C10495ab extends Property {
    public C10495ab(Class cls) {
        super(cls, "elevation");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getElevation());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setElevation(((Float) obj2).floatValue());
    }
}
