package com.google.android.apps.gsa.staticplugins.chime;

import com.google.android.libraries.notifications.p2293h.C30016i;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.k */
/* compiled from: PG */
abstract class C97729k {
    /* renamed from: c */
    static C97727i m161982c(C30016i iVar) {
        C97643a aVar = new C97643a();
        aVar.f272722a = iVar;
        aVar.f272723b = 1;
        return aVar;
    }

    /* renamed from: a */
    public abstract C30016i mo90785a();

    /* renamed from: b */
    public abstract int mo90786b();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C97729k)) {
            C97729k kVar = (C97729k) obj;
            if (!mo90785a().equals(kVar.mo90785a()) || mo90786b() != kVar.mo90786b()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
