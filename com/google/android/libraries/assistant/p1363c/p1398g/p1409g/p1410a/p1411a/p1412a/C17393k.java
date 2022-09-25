package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.p4457a.C57975a;
import com.google.speech.p5208h.C66607ce;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70868g;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.a.k */
/* compiled from: PG */
final class C17393k extends C57975a {

    /* renamed from: a */
    public final C17398p f50278a;

    /* renamed from: b */
    public final C70868g f50279b;

    /* renamed from: c */
    public boolean f50280c = true;

    /* renamed from: d */
    public boolean f50281d = false;

    /* renamed from: e */
    private final Executor f50282e;

    public C17393k(C17398p pVar, C70868g gVar, Executor executor) {
        this.f50278a = pVar;
        this.f50279b = gVar;
        this.f50282e = new C60904dr(executor);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20337c(Object obj) {
        C17392j jVar = new C17392j(this, (C66607ce) obj);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(jVar), this.f50282e), "Error on next request", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo23339e(String str) {
        C17390h hVar = new C17390h(this, str);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(hVar), this.f50282e), "Error stopping stream", new Object[0]);
    }

    /* renamed from: gQ */
    public final void mo20339gQ(boolean z) {
        C17391i iVar = new C17391i(this, z);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(iVar), this.f50282e), "Error ending stream", new Object[0]);
    }

    /* renamed from: gR */
    public final void mo20340gR(Throwable th) {
        C17389g gVar = new C17389g(this, th);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(gVar), this.f50282e), "Error on failure", new Object[0]);
    }
}
