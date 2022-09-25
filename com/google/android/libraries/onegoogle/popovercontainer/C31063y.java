package com.google.android.libraries.onegoogle.popovercontainer;

import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.y */
/* compiled from: PG */
final class C31063y extends Property {
    public C31063y(Class cls) {
        super(cls, "alpha");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getAlpha());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setAlpha(((Float) obj2).floatValue());
    }
}
