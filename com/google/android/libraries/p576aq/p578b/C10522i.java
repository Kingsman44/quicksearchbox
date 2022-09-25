package com.google.android.libraries.p576aq.p578b;

import android.graphics.PorterDuff;
import android.util.Property;
import android.view.View;

/* renamed from: com.google.android.libraries.aq.b.i */
/* compiled from: PG */
final class C10522i extends Property {
    public C10522i(Class cls) {
        super(cls, "background color filter");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return (Integer) ((View) obj).getTag(C10503aj.f35275d.hashCode() | 33554432);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        Integer num = (Integer) obj2;
        view.getBackground().mutate().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        view.setTag(C10503aj.f35275d.hashCode() | 33554432, num);
    }
}
