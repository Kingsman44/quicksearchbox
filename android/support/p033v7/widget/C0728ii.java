package android.support.p033v7.widget;

import android.util.Property;

/* renamed from: android.support.v7.widget.ii */
/* compiled from: PG */
final class C0728ii extends Property {
    public C0728ii(Class cls) {
        super(cls, "thumbPos");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).f1904g);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        SwitchCompat switchCompat = (SwitchCompat) obj;
        switchCompat.f1904g = ((Float) obj2).floatValue();
        switchCompat.invalidate();
    }
}
