package com.google.android.libraries.p576aq.p578b;

import android.graphics.ColorFilter;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: com.google.android.libraries.aq.b.u */
/* compiled from: PG */
final class C10534u extends Property {
    public C10534u(Class cls) {
        super(cls, "color filter");
    }

    public final /* synthetic */ Object get(Object obj) {
        return ((ImageView) obj).getDrawable().getColorFilter();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).getDrawable().mutate().setColorFilter((ColorFilter) obj2);
    }
}
