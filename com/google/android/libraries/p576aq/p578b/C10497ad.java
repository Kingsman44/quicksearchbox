package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.ad */
/* compiled from: PG */
final class C10497ad extends Property {
    public C10497ad(Class cls) {
        super(cls, "visibility");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((View) obj).getVisibility());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setVisibility(((Integer) obj2).intValue());
    }
}
