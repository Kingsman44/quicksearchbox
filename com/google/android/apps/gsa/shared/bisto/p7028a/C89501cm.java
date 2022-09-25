package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124549e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.cm */
/* compiled from: PG */
final class C89501cm {

    /* renamed from: a */
    public final SettableFuture f242541a = new SettableFuture();

    /* renamed from: b */
    private final C89496ch f242542b;

    /* renamed from: c */
    private C89495cg f242543c;

    /* renamed from: d */
    private C60870cx f242544d;

    private C89501cm(C89496ch chVar) {
        this.f242542b = chVar;
    }

    /* renamed from: a */
    static C60870cx m145720a(C60888db dbVar, C89496ch chVar, String str, C124549e eVar, Duration duration) {
        C58976aa aaVar = C58975e.f156826a;
        C89501cm cmVar = new C89501cm(chVar);
        cmVar.f242541a.mo4106b(new C89497ci(cmVar), C60826bg.f164896a);
        C89498cj cjVar = new C89498cj(str, eVar, cmVar);
        cmVar.f242543c = cjVar;
        cmVar.f242544d = dbVar.mo29164d(new C89499ck(cmVar), duration.toNanos(), TimeUnit.NANOSECONDS);
        chVar.mo83360B(Collections.emptySet(), cjVar);
        C60856cj.m92911t(chVar.mo83408n(str), new C89500cl(eVar, cmVar), dbVar);
        return cmVar.f242541a;
    }

    /* renamed from: b */
    public final synchronized void mo83442b() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f242544d;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f242544d = null;
        }
        C89495cg cgVar = this.f242543c;
        if (cgVar != null) {
            this.f242542b.mo83379U(cgVar);
            this.f242543c = null;
        }
    }

    /* renamed from: c */
    public final synchronized void mo83443c(C124548d dVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo83442b();
        if (!this.f242541a.isDone()) {
            this.f242541a.mo57356n(dVar);
        }
    }

    /* renamed from: d */
    public final synchronized void mo83444d() {
        C58976aa aaVar = C58975e.f156826a;
        mo83442b();
        if (!this.f242541a.isDone()) {
            this.f242541a.mo57357o(new TimeoutException());
        }
    }
}
