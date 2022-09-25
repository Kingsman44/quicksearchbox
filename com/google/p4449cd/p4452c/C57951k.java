package com.google.p4449cd.p4452c;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.p4449cd.p4453d.C57958d;
import com.google.p4449cd.p4454e.C57967g;

/* renamed from: com.google.cd.c.k */
/* compiled from: PG */
public class C57951k extends C57967g {

    /* renamed from: a */
    private final long f154979a;

    /* renamed from: b */
    private C58833ax f154980b = C58836b.f156633a;

    /* renamed from: c */
    private C57942b f154981c = null;

    /* renamed from: f */
    protected final Object f154982f = new Object();

    public C57951k(C21370a aVar) {
        this.f154979a = aVar.mo26872d();
    }

    /* renamed from: a */
    public void mo54557a(long j) {
        synchronized (this.f154982f) {
            C58838bb.m90883r(!this.f154980b.mo56113h());
            this.f154980b = C58833ax.m90834k(Long.valueOf(j));
        }
    }

    /* renamed from: d */
    public void mo20645d(C57958d dVar, Throwable th, long j) {
        C57944d dVar2 = new C57944d(j, dVar, th);
        synchronized (this.f154982f) {
            this.f154981c = C57942b.m88596b(dVar2, this.f154981c);
        }
    }

    /* renamed from: f */
    public void mo20646f(C57958d dVar, long j) {
        C57946f fVar = new C57946f(j, dVar);
        synchronized (this.f154982f) {
            this.f154981c = C57942b.m88596b(fVar, this.f154981c);
        }
    }

    /* renamed from: h */
    public void mo54558h(C57958d dVar, long j) {
        C57943c cVar = new C57943c(j, dVar);
        synchronized (this.f154982f) {
            this.f154981c = C57942b.m88596b(cVar, this.f154981c);
        }
    }

    /* renamed from: i */
    public void mo54559i(C57958d dVar, long j) {
        C57945e eVar = new C57945e(j, dVar);
        synchronized (this.f154982f) {
            this.f154981c = C57942b.m88596b(eVar, this.f154981c);
        }
    }

    /* renamed from: j */
    public void mo54560j(C57958d dVar, long j) {
        C57947g gVar = new C57947g(j, dVar);
        synchronized (this.f154982f) {
            this.f154981c = C57942b.m88596b(gVar, this.f154981c);
        }
    }

    /* renamed from: k */
    public final C57949i mo54561k() {
        C57950j jVar;
        synchronized (this.f154982f) {
            jVar = new C57950j(this.f154979a, this.f154980b, this.f154981c);
        }
        return jVar;
    }
}
