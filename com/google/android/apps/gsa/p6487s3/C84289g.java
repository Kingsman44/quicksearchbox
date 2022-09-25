package com.google.android.apps.gsa.p6487s3;

import com.google.p4449cd.p4456g.C57996c;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.p5208h.C66607ce;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.C70286co;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.s3.g */
/* compiled from: PG */
final class C84289g extends C57975a {

    /* renamed from: a */
    private final C70862aj f229378a;

    /* renamed from: b */
    private final C84295m f229379b;

    /* renamed from: c */
    private C57996c f229380c;

    /* renamed from: d */
    private final C70286co f229381d;

    /* renamed from: e */
    private final AtomicBoolean f229382e = new AtomicBoolean(false);

    public C84289g(C70862aj ajVar, C84295m mVar, C70286co coVar) {
        this.f229378a = ajVar;
        this.f229379b = mVar;
        this.f229381d = coVar;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C66607ce ceVar = (C66607ce) obj;
        if (!this.f229381d.mo61973e()) {
            this.f229378a.mo20123c(ceVar);
        } else if (this.f229382e.compareAndSet(false, true)) {
            this.f229378a.mo20122b(Status.f186904b.asException());
            this.f229380c.mo21018g();
        }
    }

    /* renamed from: d */
    public final void mo20338d(C57996c cVar) {
        this.f229380c = cVar;
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        if (!this.f229382e.get()) {
            if (!z) {
                this.f229378a.mo20121a();
            } else if (this.f229382e.compareAndSet(false, true)) {
                this.f229378a.mo20122b(Status.f186904b.asException());
                this.f229380c.mo21018g();
                this.f229381d.mo61974f();
            }
        }
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        if (!this.f229382e.get()) {
            C84292j.m134451c(this.f229379b, th, 65549);
            this.f229378a.mo20122b(Status.f186913k.mo61678e(th).asException());
            this.f229381d.mo61974f();
        }
    }
}
