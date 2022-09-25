package com.google.android.apps.gsa.shared.p7045k;

import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.shared.k.v */
/* compiled from: PG */
public final class C89826v {

    /* renamed from: a */
    public static final C59071e f243137a = C59071e.m91332i("com.google.android.apps.gsa.shared.k.v");

    /* renamed from: b */
    public final C89810f f243138b;

    /* renamed from: c */
    public final C90021c f243139c;

    /* renamed from: d */
    public final C22871g f243140d;

    /* renamed from: e */
    public final Set f243141e = new HashSet();

    /* renamed from: f */
    public final Map f243142f = new ConcurrentHashMap();

    /* renamed from: g */
    private final C89795ac f243143g;

    /* renamed from: h */
    private final C22871g f243144h;

    public C89826v(C89810f fVar, C89795ac acVar, C90021c cVar, C22871g gVar, C22871g gVar2) {
        this.f243138b = fVar;
        this.f243143g = acVar;
        this.f243139c = cVar;
        this.f243144h = gVar;
        this.f243140d = gVar2;
    }

    /* renamed from: a */
    public final void mo83673a(C89809e eVar, C89825u uVar, int i) {
        ((C59052c) ((C59052c) f243137a.mo56224b()).mo56372aa(10523)).mo56354G("Fetch Eureka info of device [id=%s] over %s", eVar.mo83648d(), true != eVar.mo83656j() ? "HTTP" : "HTTPS");
        new C90873ag(this.f243143g.mo83643a(eVar), this.f243144h, "Wait for Eureka Info result", new C89817m(this, eVar, uVar, i)).mo85223a(new C89818n(this, eVar, uVar, i));
    }

    /* renamed from: b */
    public final void mo83674b(C89809e eVar, C89825u uVar, int i) {
        ((C59052c) ((C59052c) f243137a.mo56224b()).mo56372aa(10524)).mo56354G("(Fallback) Fetch Eureka info of device [id=%s] over %s", eVar.mo83648d(), true != eVar.mo83656j() ? "HTTP" : "HTTPS");
        new C90873ag(this.f243143g.mo83643a(eVar), this.f243144h, "Wait for Eureka Info result returned from fallback request", new C89815k(this, eVar, uVar, i)).mo85223a(new C89816l(this, eVar, uVar, i));
    }

    /* renamed from: c */
    public final void mo83675c(C89809e eVar, C89825u uVar, int i) {
        if (eVar.mo83656j() && eVar.mo83645a() == 0) {
            this.f243140d.mo28213m("Fallback to HTTP request", this.f243139c.mo79743a(C90082eg.f249996cF), new C89821q(this, eVar, uVar));
        } else if (((long) i) < this.f243139c.mo79743a(C90082eg.f249995cE)) {
            C22871g gVar = this.f243140d;
            Object[] objArr = new Object[1];
            objArr[0] = true != eVar.mo83656j() ? "HTTP" : "HTTPS";
            gVar.mo28213m(String.format("Retry %s request", objArr), this.f243139c.mo79743a(C90082eg.f249996cF), new C89822r(this, eVar, uVar, i));
        }
    }

    /* renamed from: d */
    public final void mo83676d(C89809e eVar, C89825u uVar, int i) {
        if (((long) i) < this.f243139c.mo79743a(C90082eg.f249995cE)) {
            this.f243140d.mo28213m("Retry HTTP request after fallback", this.f243139c.mo79743a(C90082eg.f249996cF), new C89820p(this, eVar, uVar, i));
        }
    }

    /* renamed from: e */
    public final void mo83677e(C89794ab abVar, C89809e eVar, C89825u uVar) {
        C89830z zVar = new C89830z();
        zVar.f243148a = abVar.f243046k;
        zVar.f243149b = abVar.f243047l;
        String d = eVar.mo83648d();
        C89807c cVar = new C89807c(eVar, zVar, abVar);
        this.f243142f.put(d, cVar);
        this.f243141e.contains(d);
        uVar.mo83672a(d, cVar);
    }

    /* renamed from: f */
    public final void mo83678f(String str, boolean z) {
        if (z) {
            this.f243141e.add(str);
        } else {
            this.f243141e.remove(str);
        }
    }

    /* renamed from: g */
    public final void mo83679g() {
        this.f243138b.mo83669a();
    }
}
