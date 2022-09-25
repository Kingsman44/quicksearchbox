package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.C57996c;
import com.google.p4449cd.p4456g.p4458b.C57982a;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.q */
/* compiled from: PG */
final class C113478q extends C57982a implements C57974a {

    /* renamed from: a */
    final C57981b f314199a;

    /* renamed from: b */
    final C22871g f314200b;

    /* renamed from: c */
    final C113440aa f314201c;

    /* renamed from: d */
    final long f314202d;

    /* renamed from: e */
    final C68214a f314203e;

    /* renamed from: f */
    final C86124t f314204f;

    public C113478q(C57981b bVar, C22871g gVar, C113440aa aaVar, long j, C68214a aVar, C86124t tVar) {
        this.f314200b = gVar;
        this.f314201c = aaVar;
        this.f314199a = bVar;
        this.f314202d = j;
        this.f314203e = aVar;
        this.f314204f = tVar;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20337c(Object obj) {
        C88344ye yeVar = (C88344ye) obj;
        synchronized (this.f155059g) {
            if (this.f155061i) {
                C58976aa aaVar = C58975e.f156826a;
                C113440aa aaVar2 = this.f314201c;
                new C90873ag(aaVar2.f314114d.mo28209i(aaVar2.f314113c.mo100136b(), "udcStatus.isPersonalResponseAllowed()", new C113487z(aaVar2, yeVar, C118919a.m197403a())), this.f314200b, "handle s3RequestFuture", new C113476o(this)).mo85223a(C113477p.f314198a);
            }
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        mo100239e();
    }

    /* renamed from: e */
    public final void mo100239e() {
        this.f314200b.mo28213m("send request that acts as a heartbeat to keep the connection open", this.f314202d, new C113475n(this));
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        if (z) {
            mo20388jK();
            return;
        }
        synchronized (this.f155059g) {
            if (this.f314204f.mo79746e(C90063do.f249319bL) && ((C111248k) this.f314203e.mo27525b()).mo99077b()) {
                ((C111248k) this.f314203e.mo27525b()).mo99076a(C111255r.STREAMING, "End request sent");
            }
            mo54591h(C118919a.m197405c());
            this.f155061i = false;
        }
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        mo54590g(th);
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C60870cx jJ = super.mo20440jJ(aVar);
        this.f314199a.mo20440jJ(this);
        return jJ;
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        mo54589f(true);
        this.f314199a.mo20388jK();
    }
}
