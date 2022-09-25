package com.google.android.apps.gsa.staticplugins.p7761cz;

import com.google.p4449cd.p4456g.C57996c;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.p5208h.C66607ce;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.cz.t */
/* compiled from: PG */
final class C99262t extends C57975a {

    /* renamed from: a */
    private final C70862aj f277688a;

    /* renamed from: b */
    private final C99264v f277689b;

    /* renamed from: c */
    private C57996c f277690c;

    public C99262t(C70862aj ajVar, C99264v vVar) {
        this.f277688a = ajVar;
        this.f277689b = vVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        this.f277688a.mo20123c((C66607ce) obj);
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        this.f277690c = cVar;
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        if (z) {
            this.f277688a.mo20122b(Status.f186904b.asException());
            C99264v vVar = this.f277689b;
            vVar.f155056f.mo54590g(C99267y.m164619e(Status.f186904b.asException()));
        } else {
            this.f277688a.mo20121a();
        }
        C57996c cVar = this.f277690c;
        if (cVar != null) {
            cVar.mo21018g();
        }
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        this.f277688a.mo20122b(Status.f186913k.mo61678e(th).asException());
        this.f277689b.mo20122b(th);
        C57996c cVar = this.f277690c;
        if (cVar != null) {
            cVar.mo21018g();
        }
    }
}
