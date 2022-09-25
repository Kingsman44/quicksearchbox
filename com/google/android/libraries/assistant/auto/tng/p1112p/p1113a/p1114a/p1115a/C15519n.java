package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.p5208h.C66607ce;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.n */
/* compiled from: PG */
final class C15519n extends C57975a {

    /* renamed from: a */
    public final C15526u f46480a;

    /* renamed from: b */
    public final C70868g f46481b;

    /* renamed from: c */
    public final ArrayDeque f46482c;

    /* renamed from: d */
    public boolean f46483d = true;

    /* renamed from: e */
    public boolean f46484e = false;

    /* renamed from: f */
    private final Executor f46485f;

    public C15519n(C15526u uVar, C70868g gVar, ArrayDeque arrayDeque, Executor executor) {
        this.f46480a = uVar;
        this.f46481b = gVar;
        this.f46482c = arrayDeque;
        this.f46485f = executor;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C15515j jVar = new C15515j(this, (C66607ce) obj);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(jVar), this.f46485f), "Error on next request", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo22383e(String str) {
        C15516k kVar = new C15516k(this, str);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(kVar), this.f46485f), "Error stopping stream", new Object[0]);
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C15517l lVar = new C15517l(this, z);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(lVar), this.f46485f), "Error ending stream", new Object[0]);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C15518m mVar = new C15518m(this, th);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(mVar), this.f46485f), "Error on failure", new Object[0]);
    }
}
