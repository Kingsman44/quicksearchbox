package com.google.android.apps.gsa.staticplugins.bisto;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95348az;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95358bi;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.C96058h;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C95880a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96017bm;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96027e;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.C95937g;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7525b.C96002d;
import com.google.android.gms.wearable.C146414i;
import com.google.android.gms.wearable.C146532o;
import com.google.android.libraries.assistant.accessory.p618b.C11011p;
import com.google.android.libraries.p1730f.C21370a;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae */
/* compiled from: PG */
abstract class C95027ae extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f265866a;

    /* renamed from: b */
    private final Object f265867b = new Object();

    /* renamed from: c */
    private boolean f265868c = false;

    /* renamed from: g */
    public final C68326i mo88941g() {
        if (this.f265866a == null) {
            synchronized (this.f265867b) {
                if (this.f265866a == null) {
                    this.f265866a = new C68326i(this);
                }
            }
        }
        return this.f265866a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo88941g().mo17653jN();
    }

    public void onCreate() {
        if (!this.f265868c) {
            this.f265868c = true;
            BistoRealService bistoRealService = (BistoRealService) this;
            amb amb = (amb) mo88941g().mo17653jN();
            C21370a aVar = (C21370a) amb.f197807b.i.mo17428b();
            bistoRealService.f264680d = (C89656k) amb.f197807b.it.mo17428b();
            C90476a aVar2 = (C90476a) amb.f197807b.r.mo17428b();
            bistoRealService.f264681e = (C95850a) amb.f197815f.mo17428b();
            bistoRealService.f264682f = C68219e.m98518a(amb.f197816g);
            bistoRealService.f264683g = C68219e.m98518a(amb.f197807b.a.f202986hS);
            bistoRealService.f264684h = (C95458i) amb.f197807b.jU.mo17428b();
            bistoRealService.f264685i = C68219e.m98518a(amb.f197817h);
            bistoRealService.f264686j = new C95880a(C68219e.m98518a(amb.f197817h), C68219e.m98518a(amb.f197807b.a.f202986hS), C68219e.m98518a(amb.f197816g));
            bistoRealService.f264687k = (C96027e) amb.f197822m.mo17428b();
            bistoRealService.f264688l = (C95937g) amb.f197830u.mo17428b();
            bistoRealService.f264689m = (C96017bm) amb.f197835z.mo17428b();
            bistoRealService.f264690n = (C96002d) amb.f197729B.mo17428b();
            bistoRealService.f264691o = (C95358bi) amb.f197828s.mo17428b();
            bistoRealService.f264692p = (C11011p) amb.f197831v.mo17428b();
            bistoRealService.f264693q = (C146414i) amb.f197834y.mo17428b();
            bistoRealService.f264694r = (C146532o) amb.f197833x.mo17428b();
            bistoRealService.f264695s = C68219e.m98518a(amb.f197807b.v);
            bistoRealService.f264696t = (C95307m) amb.f197818i.mo17428b();
            C95348az azVar = (C95348az) amb.f197730C.mo17428b();
            C96058h hVar = (C96058h) amb.f197731D.mo17428b();
            bistoRealService.f264697u = C68219e.m98518a(amb.f197732E);
            bistoRealService.f264700x = (C90851k) amb.f197807b.s.mo17428b();
        }
        super.onCreate();
    }
}
