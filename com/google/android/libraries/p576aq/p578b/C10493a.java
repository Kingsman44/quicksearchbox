package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.aq.b.a */
/* compiled from: PG */
final class C10493a extends Property {
    public C10493a(Class cls) {
        super(cls, "text size");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((TextView) obj).getTextSize());
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((TextView) obj).setTextSize(0, ((Float) obj2).floatValue());
    }
}
