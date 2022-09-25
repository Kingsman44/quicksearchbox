package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.aq.b.af */
/* compiled from: PG */
final class C10499af extends Property {
    public C10499af(Class cls) {
        super(cls, "text");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return ((TextView) obj).getText().toString();
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((TextView) obj).setText((String) obj2);
    }
}
