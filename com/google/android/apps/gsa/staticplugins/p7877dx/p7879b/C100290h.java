package com.google.android.apps.gsa.staticplugins.p7877dx.p7879b;

import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.common.base.C58817ah;
import p5451f.p5452a.p5453a.p5454a.C69451p;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.b.h */
/* compiled from: PG */
public final /* synthetic */ class C100290h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C100295m f280453a;

    public /* synthetic */ C100290h(C100295m mVar) {
        this.f280453a = mVar;
    }

    public final Object apply(Object obj) {
        C100295m mVar = this.f280453a;
        C69451p pVar = (C69451p) obj;
        if (pVar.equals(C69451p.LOW_ACTIVITY) || pVar.equals(C69451p.NO_ACTIVITY)) {
            return Double.valueOf(mVar.f280460c.mo79747m(C89972ak.f246546U));
        }
        if (pVar.equals(C69451p.MEDIUM_ACTIVITY)) {
            return Double.valueOf(mVar.f280460c.mo79747m(C89972ak.f246548W));
        }
        if (pVar.equals(C69451p.HIGH_ACTIVITY)) {
            return Double.valueOf(mVar.f280460c.mo79747m(C89972ak.f246539N));
        }
        return Double.valueOf(mVar.f280460c.mo79747m(C89972ak.f246557ae));
    }
}
