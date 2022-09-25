package com.google.android.libraries.p576aq.p578b;

import android.graphics.drawable.ShapeDrawable;
import android.util.Property;

/* renamed from: com.google.android.libraries.aq.b.y */
/* compiled from: PG */
final class C10538y extends Property {
    public C10538y(Class cls) {
        super(cls, "intrinsic width");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((ShapeDrawable) obj).getIntrinsicWidth());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ShapeDrawable) obj).setIntrinsicWidth(((Integer) obj2).intValue());
    }
}
