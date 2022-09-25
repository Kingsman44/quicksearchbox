package com.google.android.apps.gsa.staticplugins.p7761cz;

import com.google.android.apps.gsa.shared.speech.p7139a.C90522n;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.common.util.concurrent.C60826bg;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import p5488io.grpc.C70286co;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.cz.v */
/* compiled from: PG */
final class C99264v extends C57987f implements C70862aj {

    /* renamed from: a */
    public final C57981b f277693a;

    /* renamed from: b */
    public final C70286co f277694b;

    /* renamed from: c */
    private final C99245c f277695c;

    public C99264v(C57981b bVar, C70286co coVar, C99245c cVar) {
        this.f277693a = bVar;
        this.f277694b = coVar;
        this.f277695c = cVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f277694b.mo61974f();
        this.f155056f.mo54589f(false);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C90523o e = C99267y.m164619e(th);
        if (e.mo79846d()) {
            this.f277695c.mo91389a().mo4106b(new C99263u(this, e), C60826bg.f164896a);
            return;
        }
        this.f155056f.mo54590g(e);
        this.f277693a.mo20388jK();
        this.f277694b.mo61974f();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C66611ci ciVar = (C66611ci) obj;
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a == C66610ch.DONE_ERROR) {
            mo20122b(new C90522n(ciVar.f181210c));
        } else {
            this.f155056f.mo54591h(ciVar);
        }
    }
}
