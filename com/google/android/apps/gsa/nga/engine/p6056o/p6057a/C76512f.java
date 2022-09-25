package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import com.google.android.apps.gsa.nga.engine.p5897ae.C74798j;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.f */
/* compiled from: PG */
public final class C76512f implements C76530x {

    /* renamed from: a */
    private final C76510d f211727a;

    public C76512f(C76510d dVar) {
        this.f211727a = dVar;
    }

    /* renamed from: a */
    public final Stream mo72222a(C78983aj ajVar, C74965n nVar) {
        Optional m = nVar.mo71338m();
        e eVar = e.be;
        Objects.requireNonNull(eVar);
        if (((Boolean) m.map(new C76511e(eVar)).orElse(false)).booleanValue()) {
            return Stream.CC.empty();
        }
        C74757n a = ajVar.mo73746a();
        if (a.mo71165s()) {
            return Stream.CC.empty();
        }
        C76510d dVar = this.f211727a;
        a.getClass();
        nVar.getClass();
        C74798j jVar = (C74798j) dVar.f211724a.mo17428b();
        jVar.getClass();
        C79851ai aiVar = (C79851ai) dVar.f211725b.mo17428b();
        aiVar.getClass();
        return Stream.CC.m71935of(new C76509c(a, nVar, jVar, aiVar));
    }
}
