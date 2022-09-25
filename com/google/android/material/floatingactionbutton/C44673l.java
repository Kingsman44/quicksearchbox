package com.google.android.material.floatingactionbutton;

import android.util.Property;
import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.material.floatingactionbutton.l */
/* compiled from: PG */
final class C44673l extends Property {
    public C44673l(Class cls) {
        super(cls, "paddingEnd");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf((float) C2043bi.m5582k((View) obj));
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        C2043bi.m5556aj(view, C2043bi.m5583l(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
    }
}
