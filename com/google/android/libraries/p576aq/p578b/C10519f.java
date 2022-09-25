package com.google.android.libraries.p576aq.p578b;

import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.f */
/* compiled from: PG */
final class C10519f extends Property {
    public C10519f(Class cls) {
        super(cls, "background drawable");
    }

    public final /* synthetic */ Object get(Object obj) {
        return ((View) obj).getBackground();
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((View) obj).setBackground((Drawable) obj2);
    }
}
