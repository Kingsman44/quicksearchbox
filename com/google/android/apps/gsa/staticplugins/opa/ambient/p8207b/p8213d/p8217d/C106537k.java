package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8266b.C107044a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.d.d.k */
/* compiled from: PG */
public final class C106537k implements C107044a {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo95553a(Object obj) {
        String str;
        C106532f fVar = (C106532f) obj;
        C106531e a = C106531e.m177306a(fVar.f297082c);
        if (a == null) {
            a = C106531e.UNKNOWN;
        }
        if (a == C106531e.CAR_BLUETOOTH) {
            str = "CAR_BLUETOOTH";
        } else {
            str = a == C106531e.WIRED ? "WIRED" : a == C106531e.GENERIC_BLUETOOTH ? "GENERIC_BLUETOOTH" : "UNKNOWN";
        }
        Object[] objArr = new Object[2];
        C106529c a2 = C106529c.m177304a(fVar.f297081b);
        if (a2 == null) {
            a2 = C106529c.UNSPECIFIED;
        }
        objArr[0] = true != a2.equals(C106529c.CONNECTED) ? "DISCONNECTED" : "CONNECTED";
        objArr[1] = str;
        return String.format("HEADSET_STATE: %s TYPE:%s", objArr);
    }
}
