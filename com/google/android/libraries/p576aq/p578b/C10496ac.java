package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.ac */
/* compiled from: PG */
final class C10496ac extends Property {
    public C10496ac(Class cls) {
        super(cls, "enabled");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Boolean.valueOf(((View) obj).isEnabled());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setEnabled(((Boolean) obj2).booleanValue());
    }
}
