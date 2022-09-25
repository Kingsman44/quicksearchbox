package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.v */
/* compiled from: PG */
final class C10535v extends Property {
    public C10535v(Class cls) {
        super(cls, "activated");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Boolean.valueOf(((View) obj).isActivated());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setActivated(((Boolean) obj2).booleanValue());
    }
}
