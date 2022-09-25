package com.google.android.libraries.onegoogle.popovercontainer;

import android.util.Property;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.o */
/* compiled from: PG */
final class C31053o extends Property {
    public C31053o(Class cls) {
        super(cls, "elevationProgress");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((ExpandableDialogView) obj).f83579g);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ExpandableDialogView expandableDialogView = (ExpandableDialogView) obj;
        float floatValue = ((Float) obj2).floatValue();
        expandableDialogView.f83579g = floatValue;
        float f = floatValue * expandableDialogView.f83578f;
        expandableDialogView.f83577e.mo48123U(f);
        C2043bi.m5548ab(expandableDialogView.f83576d, f);
        expandableDialogView.invalidate();
    }
}
