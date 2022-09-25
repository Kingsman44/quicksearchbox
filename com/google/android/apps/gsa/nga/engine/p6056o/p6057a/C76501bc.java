package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80371a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80378h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6407v.C83216f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83251g;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82831ca;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82837cg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82840cj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82841ck;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4543n.p4544a.C59358n;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4985f.p5030q.C65195fb;
import com.google.protos.p4985f.p5030q.C65196fc;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.bc */
/* compiled from: PG */
public final class C76501bc extends C76498b {

    /* renamed from: d */
    public final C83334w f211704d;

    /* renamed from: e */
    public final C83216f f211705e;

    /* renamed from: f */
    public final Optional f211706f;

    /* renamed from: g */
    public final C76092h f211707g;

    /* renamed from: h */
    private final C22871g f211708h;

    /* renamed from: i */
    private final C91142g f211709i;

    public C76501bc(C74757n nVar, C74965n nVar2, C22871g gVar, C79851ai aiVar, C83251g gVar2, Optional optional, C91142g gVar3, C83334w wVar, C76092h hVar) {
        super(nVar, nVar2, aiVar);
        this.f211708h = gVar;
        this.f211704d = wVar;
        this.f211705e = gVar2.mo76652a(C82831ca.POP);
        this.f211706f = optional;
        this.f211709i = gVar3;
        this.f211707g = hVar;
    }

    /* renamed from: b */
    public final C82838ch mo72215b() {
        C82841ck ckVar = (C82841ck) C82843cm.f225889f.createBuilder();
        ckVar.copyOnWrite();
        ((C82843cm) ckVar.instance).f225894d = C82840cj.m132412a(16);
        int b = this.f211701b.mo71152e().mo71143b();
        if (b != 0) {
            if (b == 1) {
                ckVar.mo76626a(this.f211701b.mo71152e().mo71141c().mo71146c());
            }
            C82837cg cgVar = (C82837cg) C82838ch.f225874h.createBuilder();
            cgVar.copyOnWrite();
            C82838ch chVar = (C82838ch) cgVar.instance;
            chVar.f225877b = 1010;
            chVar.f225876a = 1 | chVar.f225876a;
            C82831ca caVar = C82831ca.POP;
            cgVar.copyOnWrite();
            C82838ch chVar2 = (C82838ch) cgVar.instance;
            chVar2.f225879d = caVar.f225800aL;
            chVar2.f225876a |= 4;
            C80371a aVar = (C80371a) C80386p.f220578g.createBuilder();
            C80379i f = mo72217f();
            aVar.copyOnWrite();
            f.getClass();
            ((C80386p) aVar.instance).f220585f = f;
            cgVar.copyOnWrite();
            C82838ch chVar3 = (C82838ch) cgVar.instance;
            C80386p pVar = (C80386p) aVar.build();
            pVar.getClass();
            chVar3.f225881f = pVar;
            chVar3.f225876a = 16 | chVar3.f225876a;
            C82843cm cmVar = (C82843cm) ckVar.build();
            cgVar.copyOnWrite();
            C82838ch chVar4 = (C82838ch) cgVar.instance;
            cmVar.getClass();
            chVar4.f225882g = cmVar;
            chVar4.f225876a |= 32;
            return (C82838ch) cgVar.build();
        }
        throw null;
    }

    /* renamed from: d */
    public final C60870cx mo72216d() {
        C22871g gVar = this.f211708h;
        return gVar.mo28209i(gVar.mo28202b("[NGA] PopFulfillmentCandidate.buildPopResponseFuture", new C76496ay(this)), "[NGA] PopFulfillmentCandidate.fulfill", new C76499ba(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo72220e() {
        C65195fb fbVar = C65195fb.NO_ERROR;
        int b = this.f211701b.mo71152e().mo71143b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0 || i == 1) {
            return true;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: f */
    public final C80379i mo72217f() {
        C80378h hVar = (C80378h) C80379i.f220555h.createBuilder();
        hVar.copyOnWrite();
        ((C80379i) hVar.instance).f220563g = true;
        return (C80379i) hVar.build();
    }

    /* renamed from: g */
    public final int mo72221g(C65196fc fcVar) {
        C58528ij F = C58528ij.m90006F(C89988b.m146549b(C59358n.m92257e().mo56883b(this.f211709i.mo85403h(C90126fx.f251599lp))));
        Stream stream = Collection.EL.stream(fcVar.f176465k);
        Objects.requireNonNull(F);
        if (stream.anyMatch(new C76497az(F))) {
            return 3;
        }
        C52081en enVar = fcVar.f176461g;
        if (enVar == null) {
            enVar = C52081en.f136679i;
        }
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 4) {
                C52076ei eiVar = (C52076ei) epVar.f136693c;
                if ((eiVar.f136666a & 32) == 0) {
                    continue;
                } else {
                    C51809dy dyVar = eiVar.f136668c;
                    if (dyVar == null) {
                        dyVar = C51809dy.f135933f;
                    }
                    if (t.h(dyVar)) {
                        return 3;
                    }
                }
            }
        }
        return 2;
    }
}
