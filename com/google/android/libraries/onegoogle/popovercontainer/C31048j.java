package com.google.android.libraries.onegoogle.popovercontainer;

import android.util.Property;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.j */
/* compiled from: PG */
final class C31048j extends Property {
    public C31048j(Class cls) {
        super(cls, "scrollOffset");
    }

    public final /* synthetic */ Object get(Object obj) {
        int i = ExpandableDialogView.f83539m;
        return Integer.valueOf(((ExpandableDialogView) obj).f83581i);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        int i = ExpandableDialogView.f83539m;
        ((ExpandableDialogView) obj).mo36697i(intValue);
    }
}
