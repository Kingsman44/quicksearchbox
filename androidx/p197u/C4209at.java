package androidx.p197u;

import android.util.Property;
import android.view.View;

/* renamed from: androidx.u.at */
/* compiled from: PG */
final class C4209at extends Property {
    public C4209at(Class cls) {
        super(cls, "translationAlpha");
    }

    public final /* synthetic */ Object get(Object obj) {
        int i = C4211av.f13633b;
        return Float.valueOf(((View) obj).getTransitionAlpha());
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        int i = C4211av.f13633b;
        ((View) obj).setTransitionAlpha(floatValue);
    }
}
