package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.widget.ImageView;

/* renamed from: com.google.android.libraries.aq.b.e */
/* compiled from: PG */
final class C10518e extends Property {
    public C10518e(Class cls) {
        super(cls, "image resource");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return (Integer) ((ImageView) obj).getTag(C10503aj.f35274c.hashCode() | 33554432);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ImageView imageView = (ImageView) obj;
        Integer num = (Integer) obj2;
        imageView.setImageResource(num.intValue());
        imageView.setTag(C10503aj.f35274c.hashCode() | 33554432, num);
    }
}
