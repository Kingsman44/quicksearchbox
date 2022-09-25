package com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b;

import com.google.android.gms.common.api.C143708aa;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21550g;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.h.a.b.i */
/* compiled from: PG */
public class C21541i implements C21550g {

    /* renamed from: a */
    private final C143711ad f59943a;

    /* renamed from: b */
    private C21543k f59944b;

    public C21541i(C143711ad adVar) {
        this.f59943a = adVar;
    }

    /* renamed from: b */
    public final void mo26996b() {
        C143711ad adVar = this.f59943a;
        if (adVar instanceof C143708aa) {
            ((C143708aa) adVar).mo119102b();
        }
    }

    /* renamed from: c */
    public final C21551h mo26997c() {
        if (this.f59944b == null) {
            this.f59944b = new C21543k(this.f59943a.mo117629a());
        }
        return this.f59944b;
    }
}
