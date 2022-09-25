package com.google.android.libraries.p576aq.p578b;

import android.graphics.drawable.ShapeDrawable;
import android.util.Property;

/* renamed from: com.google.android.libraries.aq.b.z */
/* compiled from: PG */
final class C10539z extends Property {
    public C10539z(Class cls) {
        super(cls, "intrinsic height");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((ShapeDrawable) obj).getIntrinsicHeight());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ShapeDrawable) obj).setIntrinsicHeight(((Integer) obj2).intValue());
    }
}
