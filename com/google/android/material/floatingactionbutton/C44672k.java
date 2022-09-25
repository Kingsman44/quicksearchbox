package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.material.floatingactionbutton.k */
/* compiled from: PG */
final class C44672k extends Property {
    public C44672k(Class cls) {
        super(cls, "paddingStart");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) C2043bi.m5583l((View) obj));
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        C2043bi.m5556aj(view, ((Float) obj2).intValue(), view.getPaddingTop(), C2043bi.m5582k(view), view.getPaddingBottom());
    }
}
