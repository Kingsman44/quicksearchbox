package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8327b;

import com.google.android.apps.gsa.binaries.satin.app.C74253ra;
import com.google.android.apps.gsa.binaries.satin.app.rc;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113449b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113450c;
import com.google.p4449cd.p4456g.p4457a.C57978d;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.b.e */
/* compiled from: PG */
final class C107885e implements C113450c {

    /* renamed from: a */
    final /* synthetic */ C107886f f300187a;

    public C107885e(C107886f fVar) {
        this.f300187a = fVar;
    }

    /* renamed from: a */
    public final C113449b mo96324a(long j) {
        C113449b bVar = new C113449b();
        C89356b b = this.f300187a.f300194g.mo78026b("TapasSearchGraph", C118575h.GRAPH_TAPAS_SEARCH, C118575h.WORKER_TAPAS_SEARCH);
        C57978d dVar = new C57978d();
        bVar.mo20440jJ(dVar);
        C74253ra raVar = (C74253ra) this.f300187a.f300191d.mo27525b();
        raVar.f207694d = b;
        raVar.f207695e = dVar;
        C68225k.m98529a(raVar.f207694d, C89356b.class);
        C68225k.m98529a(raVar.f207695e, C57978d.class);
        new C90873ag(new rc(raVar.f207691a, raVar.f207692b, raVar.f207693c, raVar.f207694d, raVar.f207695e).b.mo60297gq(), this.f300187a.f300190c, "Sets up streaming Tapas search pipeline", new C107876a(this, bVar)).mo85223a(new C107882b(this, j, bVar));
        return bVar;
    }
}
