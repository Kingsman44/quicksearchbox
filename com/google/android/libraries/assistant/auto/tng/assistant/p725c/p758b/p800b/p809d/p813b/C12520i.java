package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p813b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4451b.C57938a;
import com.google.p4449cd.p4452c.C57951k;
import com.google.p4449cd.p4453d.C57958d;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.b.i */
/* compiled from: PG */
public final class C12520i extends C57951k {

    /* renamed from: a */
    public final Executor f39440a;

    /* renamed from: b */
    public final C12526o f39441b;

    /* renamed from: c */
    public final C58881cr f39442c;

    /* renamed from: d */
    public int f39443d = 0;

    /* renamed from: e */
    public C58833ax f39444e = C58836b.f156633a;

    /* renamed from: g */
    private final C57938a f39445g;

    /* renamed from: h */
    private final long f39446h;

    public C12520i(C57938a aVar, C12526o oVar, Executor executor, C21370a aVar2) {
        super(aVar2);
        this.f39441b = oVar;
        this.f39445g = aVar;
        this.f39440a = new C60904dr(executor);
        this.f39446h = aVar2.mo26870b();
        this.f39442c = new C12519h(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C12512a mo20644b() {
        return new C12512a(super.mo54561k(), this.f39445g, this.f39446h, this.f39444e);
    }

    /* renamed from: d */
    public final void mo20645d(C57958d dVar, Throwable th, long j) {
        super.mo20645d(dVar, th, j);
        C12518g gVar = new C12518g(this, j);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(gVar), this.f39440a), "Failed to log task future finished", new Object[0]);
    }

    /* renamed from: f */
    public final void mo20646f(C57958d dVar, long j) {
        super.mo20646f(dVar, j);
        C12517f fVar = new C12517f(this, j);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(fVar), this.f39440a), "Failed to log task requested", new Object[0]);
    }
}
