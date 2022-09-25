package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134763n;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134766q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.e */
/* compiled from: PG */
public final class C134725e {

    /* renamed from: a */
    public final C134766q f366875a;

    /* renamed from: b */
    public boolean f366876b;

    /* renamed from: c */
    public boolean f366877c;

    /* renamed from: d */
    public C134736p f366878d = C134733m.f366887a;

    /* renamed from: e */
    public C134740t f366879e = C134738r.f366892a;

    /* renamed from: f */
    public C134731k f366880f = C134730j.f366885a;

    public C134725e(C134766q qVar) {
        C69664n.m101061g(qVar, "surface");
        this.f366875a = qVar;
    }

    /* renamed from: a */
    public final void mo111915a() {
        mo111916b(false);
        this.f366876b = false;
        this.f366878d = C134733m.f366887a;
        this.f366879e = C134738r.f366892a;
        this.f366880f = C134730j.f366885a;
    }

    /* renamed from: b */
    public final void mo111916b(boolean z) {
        boolean z2 = true;
        if (!this.f366876b && !z) {
            z2 = false;
        }
        this.f366876b = z2;
        this.f366877c = z;
    }

    /* renamed from: c */
    public final boolean mo111917c() {
        C134736p pVar = this.f366878d;
        if (pVar instanceof C134732l) {
            return false;
        }
        if (!(pVar instanceof C134733m) || (this.f366875a instanceof C134763n)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        C134766q qVar = this.f366875a;
        C134736p pVar = this.f366878d;
        C134740t tVar = this.f366879e;
        C134731k kVar = this.f366880f;
        boolean z = this.f366877c;
        boolean z2 = this.f366876b;
        return qVar + " | launch:" + pVar + " | render:" + tVar + " | image:" + kVar + " | visible:" + z + " | everVisible:" + z2;
    }
}
