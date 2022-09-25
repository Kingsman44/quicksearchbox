package com.google.android.libraries.p576aq.p578b;

import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: com.google.android.libraries.aq.b.d */
/* compiled from: PG */
final class C10517d extends Property {
    public C10517d(Class cls) {
        super(cls, "drawable");
    }

    public final /* synthetic */ Object get(Object obj) {
        return ((ImageView) obj).getDrawable();
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageDrawable((Drawable) obj2);
    }
}
