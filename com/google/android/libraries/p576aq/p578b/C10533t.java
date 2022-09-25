package com.google.android.libraries.p576aq.p578b;

import android.content.res.ColorStateList;
import android.util.Property;
import android.view.View;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.libraries.aq.b.t */
/* compiled from: PG */
final class C10533t extends Property {
    public C10533t(Class cls) {
        super(cls, "background tint color");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ColorStateList n = C2043bi.m5585n((View) obj);
        return Integer.valueOf(n != null ? n.getDefaultColor() : 0);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        C2043bi.m5531Y((View) obj, ColorStateList.valueOf(((Integer) obj2).intValue()));
    }
}
