package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.aq.b.b */
/* compiled from: PG */
final class C10515b extends Property {
    public C10515b(Class cls) {
        super(cls, "text color");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((TextView) obj).getCurrentTextColor());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((TextView) obj).setTextColor(((Integer) obj2).intValue());
    }
}
