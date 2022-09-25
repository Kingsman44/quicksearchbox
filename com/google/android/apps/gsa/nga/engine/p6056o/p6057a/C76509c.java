package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import com.google.android.apps.gsa.nga.engine.p5897ae.C74798j;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80363t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80371a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80378h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82837cg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82840cj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82841ck;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.c */
/* compiled from: PG */
public final class C76509c extends C76498b {

    /* renamed from: d */
    private final C74798j f211723d;

    public C76509c(C74757n nVar, C74965n nVar2, C74798j jVar, C79851ai aiVar) {
        super(nVar, nVar2, aiVar);
        this.f211723d = jVar;
    }

    /* renamed from: b */
    public final C82838ch mo72215b() {
        C82837cg cgVar = (C82837cg) C82838ch.f225874h.createBuilder();
        cgVar.copyOnWrite();
        C82838ch chVar = (C82838ch) cgVar.instance;
        chVar.f225877b = 1003;
        chVar.f225876a |= 1;
        C80371a aVar = (C80371a) C80386p.f220578g.createBuilder();
        C80379i f = mo72217f();
        aVar.copyOnWrite();
        f.getClass();
        ((C80386p) aVar.instance).f220585f = f;
        cgVar.copyOnWrite();
        C82838ch chVar2 = (C82838ch) cgVar.instance;
        C80386p pVar = (C80386p) aVar.build();
        pVar.getClass();
        chVar2.f225881f = pVar;
        chVar2.f225876a |= 16;
        C82841ck ckVar = (C82841ck) C82843cm.f225889f.createBuilder();
        ckVar.mo76626a(this.f211701b.mo71164r());
        ckVar.copyOnWrite();
        ((C82843cm) ckVar.instance).f225894d = C82840cj.m132412a(13);
        C82843cm cmVar = (C82843cm) ckVar.build();
        cgVar.copyOnWrite();
        C82838ch chVar3 = (C82838ch) cgVar.instance;
        cmVar.getClass();
        chVar3.f225882g = cmVar;
        chVar3.f225876a |= 32;
        return (C82838ch) cgVar.build();
    }

    /* renamed from: d */
    public final C60870cx mo72216d() {
        return C60856cj.m92900i(C81442m.m129542d(this.f211701b.mo71164r(), this.f211723d.mo71181e() ? C80363t.OPA_CONVERSATION : C80363t.NO_ON_DEVICE_FULFILLMENT));
    }

    /* renamed from: f */
    public final C80379i mo72217f() {
        C80378h hVar = (C80378h) C80379i.f220555h.createBuilder();
        hVar.copyOnWrite();
        ((C80379i) hVar.instance).f220560d = true;
        hVar.copyOnWrite();
        ((C80379i) hVar.instance).f220561e = true;
        return (C80379i) hVar.build();
    }
}
