package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.aq.b.c */
/* compiled from: PG */
final class C10516c extends Property {
    public C10516c(Class cls) {
        super(cls, "max lines");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((TextView) obj).getMaxLines());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((TextView) obj).setMaxLines(((Integer) obj2).intValue());
    }
}
