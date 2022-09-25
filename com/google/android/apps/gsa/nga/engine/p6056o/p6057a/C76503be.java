package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.ai.a.a.bx;
import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.be */
/* compiled from: PG */
public final class C76503be implements C76530x {

    /* renamed from: a */
    private final C76502bd f211717a;

    /* renamed from: b */
    private final bx f211718b;

    public C76503be(C76502bd bdVar, bx bxVar) {
        this.f211717a = bdVar;
        this.f211718b = bxVar;
    }

    /* renamed from: a */
    public final Stream mo72222a(C78983aj ajVar, C74965n nVar) {
        if (!this.f211718b.a(nVar.mo71342q())) {
            return Stream.CC.empty();
        }
        C74757n a = ajVar.mo73746a();
        if (a.mo71165s()) {
            return Stream.CC.empty();
        }
        if (ajVar.mo73747b().isPresent()) {
            return Stream.CC.empty();
        }
        C76502bd bdVar = this.f211717a;
        a.getClass();
        nVar.getClass();
        C22871g gVar = (C22871g) bdVar.f211710a.mo17428b();
        gVar.getClass();
        C79851ai aiVar = (C79851ai) bdVar.f211711b.mo17428b();
        aiVar.getClass();
        C83251g gVar2 = (C83251g) bdVar.f211712c.mo17428b();
        gVar2.getClass();
        Optional optional = (Optional) bdVar.f211713d.mo17428b();
        optional.getClass();
        C91142g gVar3 = (C91142g) bdVar.f211714e.mo17428b();
        gVar3.getClass();
        C83334w wVar = (C83334w) bdVar.f211715f.mo17428b();
        wVar.getClass();
        C76092h hVar = (C76092h) bdVar.f211716g.mo17428b();
        hVar.getClass();
        return Stream.CC.m71935of(new C76501bc(a, nVar, gVar, aiVar, gVar2, optional, gVar3, wVar, hVar));
    }
}
