package com.google.android.libraries.onegoogle.account.disc;

import android.util.Property;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.onegoogle.account.disc.bb */
/* compiled from: PG */
final class C30201bb extends Property {
    public C30201bb(Class cls) {
        super(cls, "ringThickness");
    }

    public final /* synthetic */ Object get(Object obj) {
        return Integer.valueOf(((RingView) obj).f81595d);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        RingView ringView = (RingView) obj;
        int intValue = ((Integer) obj2).intValue();
        if (intValue != ringView.f81595d) {
            boolean z = false;
            if (!(ringView.f81593b == -1 || ringView.f81594c == -1)) {
                z = true;
            }
            C58838bb.m90884s(z, "setRingThicknessAndRadius should be called before setCurrThickness");
            ringView.f81595d = intValue;
            ringView.mo35617a();
        }
    }
}
