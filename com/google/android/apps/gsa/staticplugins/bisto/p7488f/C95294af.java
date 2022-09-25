package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95457c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60276mq;
import com.google.common.p4552o.C60278ms;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.af */
/* compiled from: PG */
public final class C95294af {

    /* renamed from: a */
    private final C68214a f266626a;

    /* renamed from: b */
    private final C21370a f266627b;

    /* renamed from: c */
    private final long f266628c;

    /* renamed from: d */
    private long f266629d;

    public C95294af(C68214a aVar, C21370a aVar2) {
        this.f266626a = aVar;
        this.f266627b = aVar2;
        this.f266628c = aVar2.mo26871c();
    }

    /* renamed from: c */
    private final long m157524c() {
        long j = this.f266629d;
        if (j == 0) {
            j = this.f266627b.mo26871c();
            this.f266629d = j;
        }
        return j - this.f266628c;
    }

    /* renamed from: a */
    public final void mo89220a(C31164au auVar) {
        m157524c();
        if (auVar.equals(C95457c.f267101a)) {
            mo89221b(3);
        } else if (auVar.equals(C95457c.f267102b)) {
            mo89221b(4);
        } else if (auVar.equals(C95457c.f267103c)) {
            mo89221b(10);
        } else if (auVar.equals(C95457c.f267104d)) {
            mo89221b(5);
        } else if (auVar.equals(C95457c.f267105e)) {
            mo89221b(6);
        } else if (auVar.equals(C95457c.f267106f)) {
            mo89221b(7);
        } else if (auVar.equals(C95457c.f267107g)) {
            mo89221b(8);
        } else if (auVar.equals(C95457c.f267108h)) {
            mo89221b(9);
        } else {
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: b */
    public final void mo89221b(int i) {
        long c = m157524c();
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        C60276mq mqVar = (C60276mq) C60278ms.f163077d.createBuilder();
        mqVar.copyOnWrite();
        C60278ms msVar = (C60278ms) mqVar.instance;
        msVar.f163080b = i - 1;
        msVar.f163079a |= 1;
        mqVar.copyOnWrite();
        C60278ms msVar2 = (C60278ms) mqVar.instance;
        msVar2.f163079a |= 2;
        msVar2.f163081c = (int) c;
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60278ms msVar3 = (C60278ms) mqVar.build();
        msVar3.getClass();
        nmVar.f163154h = msVar3;
        nmVar.f163147a |= 65536;
        ((C95307m) this.f266626a.mo27525b()).mo83545c(nkVar);
    }
}
