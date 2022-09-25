package com.google.android.libraries.p576aq.p578b;

import android.util.Property;
import android.view.View;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.aq.b.g */
/* compiled from: PG */
final class C10520g extends Property {
    public C10520g(Class cls) {
        super(cls, "background alpha");
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        View view = (View) obj;
        return Float.valueOf(view.getBackground() != null ? (float) view.getBackground().getAlpha() : 0.0f);
    }

    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        Float f = (Float) obj2;
        if (view.getBackground() != null) {
            view.getBackground().mutate().setAlpha(Math.min(PrivateKeyType.INVALID, Math.max(0, f.intValue())));
        }
    }
}
