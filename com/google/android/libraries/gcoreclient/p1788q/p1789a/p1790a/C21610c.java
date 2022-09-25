package com.google.android.libraries.gcoreclient.p1788q.p1789a.p1790a;

import com.google.android.gms.location.reporting.C144964b;
import com.google.android.gms.location.reporting.p10843a.C144963e;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h;
import com.google.android.libraries.gcoreclient.p1763h.p1764a.p1766b.C21543k;
import com.google.android.libraries.gcoreclient.p1788q.p1791b.C21628b;

@Deprecated
/* renamed from: com.google.android.libraries.gcoreclient.q.a.a.c */
/* compiled from: PG */
abstract class C21610c implements C21628b {

    /* renamed from: a */
    protected final C144963e f59979a;

    public C21610c(C144963e eVar) {
        this.f59979a = eVar;
    }

    /* renamed from: a */
    public final int mo27023a() {
        C144963e eVar = this.f59979a;
        eVar.mo120469b();
        Integer num = eVar.f391934b.f391928g;
        if (num != null) {
            return num.intValue();
        }
        throw new SecurityException("Device tag restricted to approved apps");
    }

    /* renamed from: b */
    public final boolean mo27024b() {
        C144963e eVar = this.f59979a;
        eVar.mo120469b();
        return eVar.f391934b.f391924c;
    }

    /* renamed from: c */
    public final C21551h mo26997c() {
        return new C21543k(this.f59979a.f391933a);
    }

    /* renamed from: d */
    public final boolean mo27025d() {
        C144963e eVar = this.f59979a;
        eVar.mo120469b();
        return C144964b.m235615a(eVar.f391934b.f391923b) == 1;
    }

    /* renamed from: e */
    public final boolean mo27026e() {
        C144963e eVar = this.f59979a;
        eVar.mo120469b();
        return eVar.f391934b.mo120463a();
    }

    /* renamed from: f */
    public final boolean mo27027f() {
        C144963e eVar = this.f59979a;
        eVar.mo120469b();
        return C144964b.m235615a(eVar.f391934b.f391922a) == 1;
    }
}
