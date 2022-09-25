package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8584a;

import com.google.android.apps.gsa.binaries.satin.app.C74202or;
import com.google.android.apps.gsa.binaries.satin.app.ot;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113448a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113449b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113450c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8583g.p8586b.C113461n;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4449cd.p4456g.p4457a.C57978d;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.g.a.e */
/* compiled from: PG */
final class C113436e implements C113450c {

    /* renamed from: a */
    final C113448a f314103a;

    /* renamed from: b */
    final C22871g f314104b;

    /* renamed from: c */
    final C68214a f314105c;

    /* renamed from: d */
    final C113461n f314106d;

    /* renamed from: e */
    final Optional f314107e;

    /* renamed from: f */
    final C84466a f314108f;

    public C113436e(C113448a aVar, C22871g gVar, C84466a aVar2, C68214a aVar3, C113461n nVar, Optional optional) {
        this.f314103a = aVar;
        this.f314104b = gVar;
        this.f314108f = aVar2;
        C59104x b = C113437f.f314109a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GrpcTapasSearchCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(27878)).mo56352E("taskGraphFactory: %s#%d", aVar2, aVar2.hashCode());
        this.f314106d = nVar;
        this.f314105c = aVar3;
        this.f314107e = optional;
    }

    /* renamed from: a */
    public final C113449b mo96324a(long j) {
        C113449b bVar = new C113449b();
        C89356b b = this.f314108f.mo78026b("TapasSearchGraph", C118575h.GRAPH_TAPAS_SEARCH, C118575h.WORKER_TAPAS_SEARCH);
        C57978d dVar = new C57978d();
        bVar.mo20440jJ(dVar);
        C74202or orVar = (C74202or) this.f314105c.mo27525b();
        orVar.f207205b = b;
        orVar.f207206c = dVar;
        C68225k.m98529a(orVar.f207205b, C89356b.class);
        C68225k.m98529a(orVar.f207206c, C57978d.class);
        new C90873ag(new ot(orVar.f207204a, orVar.f207205b, orVar.f207206c).b.mo60297gq(), this.f314104b, "Sets up streaming Tapas search pipeline", new C113434c(this, bVar)).mo85223a(new C113435d(this, j, bVar));
        return bVar;
    }
}
