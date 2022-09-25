package com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p;

import com.google.android.apps.gsa.nga.api.a.af;
import com.google.android.apps.gsa.nga.api.a.bj;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125158g;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125161j;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.p5533i.C70862aj;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70988ao;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70989ap;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70990aq;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70991ar;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70992as;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70993at;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70994au;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70995av;
import p5535j.p5536a.p5545c.p5548c.p5549a.C70996aw;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71003bc;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71004bd;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71005be;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71006bf;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71008bh;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71009bi;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71013bm;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71014bn;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71015bo;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71016bp;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71019bs;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.p.f */
/* compiled from: PG */
final class C126177f implements C126181j {

    /* renamed from: a */
    final /* synthetic */ C126178g f347679a;

    /* renamed from: b */
    private final long f347680b;

    /* renamed from: c */
    private final long f347681c;

    public C126177f(C126178g gVar, long j, long j2) {
        this.f347679a = gVar;
        this.f347680b = j;
        this.f347681c = j2;
    }

    /* renamed from: a */
    public final C70862aj mo107430a(C70862aj ajVar) {
        C126178g gVar = this.f347679a;
        return new C126183l(gVar, gVar.f347685c, ajVar);
    }

    /* renamed from: b */
    public final C70862aj mo107431b(C70862aj ajVar) {
        return new C126184m(this, ajVar);
    }

    /* renamed from: c */
    public final void mo107432c(int i, int i2) {
        C37258g gVar = C37176a.f96854aY;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C70989ap apVar = (C70989ap) C70990aq.f189302d.createBuilder();
        apVar.copyOnWrite();
        C70990aq aqVar = (C70990aq) apVar.instance;
        aqVar.f189304a |= 1;
        aqVar.f189305b = i;
        apVar.copyOnWrite();
        C70990aq aqVar2 = (C70990aq) apVar.instance;
        aqVar2.f189304a |= 2;
        aqVar2.f189306c = i2;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C70990aq aqVar3 = (C70990aq) apVar.build();
        aqVar3.getClass();
        auVar.f189322i = aqVar3;
        auVar.f189314a |= 128;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* renamed from: d */
    public final void mo107433d(List list, List list2) {
        C37258g gVar = C37176a.f97265iL;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C71004bd bdVar = (C71004bd) C71005be.f189366c.createBuilder();
        bdVar.copyOnWrite();
        C71005be beVar = (C71005be) bdVar.instance;
        C62971cq cqVar = beVar.f189368a;
        if (!cqVar.mo58948c()) {
            beVar.f189368a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) beVar.f189368a);
        bdVar.copyOnWrite();
        C71005be beVar2 = (C71005be) bdVar.instance;
        C62971cq cqVar2 = beVar2.f189369b;
        if (!cqVar2.mo58948c()) {
            beVar2.f189369b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) list2, (List) beVar2.f189369b);
        C71005be beVar3 = (C71005be) bdVar.build();
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        beVar3.getClass();
        auVar.f189327n = beVar3;
        auVar.f189314a |= 4096;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* renamed from: e */
    public final void mo107434e(bj bjVar, C125160i iVar) {
        C37258g gVar = C37176a.f97087et;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C70995av E = this.f347679a.mo107446E(bjVar);
        C125158g gVar2 = (C125158g) C125161j.f345284g.createBuilder();
        gVar2.copyOnWrite();
        ((C125161j) gVar2.instance).f345287b = iVar.getNumber();
        E.copyOnWrite();
        C70996aw awVar = (C70996aw) E.instance;
        C125161j jVar = (C125161j) gVar2.build();
        C70996aw awVar2 = C70996aw.f189329s;
        jVar.getClass();
        awVar.f189332b = jVar;
        awVar.f189331a |= 1;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C70996aw awVar3 = (C70996aw) E.build();
        awVar3.getClass();
        auVar.f189317d = awVar3;
        auVar.f189314a |= 4;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* renamed from: f */
    public final void mo107435f() {
        mo107436g(C37176a.f96874as, (C70994au) null);
    }

    /* renamed from: g */
    public final void mo107436g(C37258g gVar, C70994au auVar) {
        C37252a j = gVar.mo40816j("dictation", String.valueOf(this.f347680b));
        C37253b bVar = (C37253b) j;
        bVar.mo40795s("oration", String.valueOf(this.f347681c));
        if (auVar != null) {
            bVar.mo40792p(C70994au.f189312q, auVar);
        }
        this.f347679a.f347684b.mo19974a(j);
    }

    /* renamed from: h */
    public final void mo107437h(bj bjVar) {
        AtomicReference atomicReference = this.f347679a.f347689g;
        af afVar = bjVar.a;
        if (afVar == null) {
            afVar = af.w;
        }
        atomicReference.set(afVar);
        C37258g gVar = C37176a.f96870ao;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C70995av E = this.f347679a.mo107446E(bjVar);
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C70996aw awVar = (C70996aw) E.build();
        awVar.getClass();
        auVar.f189317d = awVar;
        auVar.f189314a |= 4;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* renamed from: i */
    public final void mo107438i(boolean z) {
        int i = true != z ? 2 : 3;
        C37258g gVar = C37176a.f97092ey;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C71016bp bpVar = (C71016bp) C71019bs.f189393e.createBuilder();
        bpVar.copyOnWrite();
        C71019bs bsVar = (C71019bs) bpVar.instance;
        bsVar.f189396b = i - 1;
        bsVar.f189395a |= 1;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C71019bs bsVar2 = (C71019bs) bpVar.build();
        bsVar2.getClass();
        auVar.f189325l = bsVar2;
        auVar.f189314a |= 1024;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* renamed from: j */
    public final void mo107439j(boolean z, boolean z2) {
        C71013bm bmVar = (C71013bm) C71014bn.f189381e.createBuilder();
        bmVar.copyOnWrite();
        C71014bn bnVar = (C71014bn) bmVar.instance;
        bnVar.f189384b = 1;
        bnVar.f189383a = 1 | bnVar.f189383a;
        bmVar.copyOnWrite();
        C71014bn bnVar2 = (C71014bn) bmVar.instance;
        bnVar2.f189383a |= 2;
        bnVar2.f189385c = z;
        bmVar.copyOnWrite();
        C71014bn bnVar3 = (C71014bn) bmVar.instance;
        bnVar3.f189383a |= 4;
        bnVar3.f189386d = z2;
        C37258g gVar = C37176a.f97011dW;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C71009bi biVar = (C71009bi) C71015bo.f189387c.createBuilder();
        biVar.copyOnWrite();
        C71015bo boVar = (C71015bo) biVar.instance;
        C71014bn bnVar4 = (C71014bn) bmVar.build();
        bnVar4.getClass();
        boVar.f189390b = bnVar4;
        boVar.f189389a = 3;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C71015bo boVar2 = (C71015bo) biVar.build();
        boVar2.getClass();
        auVar.f189324k = boVar2;
        auVar.f189314a |= 512;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* renamed from: k */
    public final void mo107440k(boolean z) {
        C37258g gVar = C37176a.f97099fE;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C71009bi biVar = (C71009bi) C71015bo.f189387c.createBuilder();
        C71013bm bmVar = (C71013bm) C71014bn.f189381e.createBuilder();
        bmVar.copyOnWrite();
        C71014bn bnVar = (C71014bn) bmVar.instance;
        bnVar.f189384b = 2;
        bnVar.f189383a |= 1;
        bmVar.copyOnWrite();
        C71014bn bnVar2 = (C71014bn) bmVar.instance;
        bnVar2.f189383a = 2 | bnVar2.f189383a;
        bnVar2.f189385c = z;
        biVar.copyOnWrite();
        C71015bo boVar = (C71015bo) biVar.instance;
        C71014bn bnVar3 = (C71014bn) bmVar.build();
        bnVar3.getClass();
        boVar.f189390b = bnVar3;
        boVar.f189389a = 3;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C71015bo boVar2 = (C71015bo) biVar.build();
        boVar2.getClass();
        auVar.f189324k = boVar2;
        auVar.f189314a |= 512;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* renamed from: l */
    public final void mo107441l(C51809dy dyVar) {
        C37258g gVar = C37176a.f96932bx;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C70988ao D = C126178g.m206338D(dyVar);
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        D.getClass();
        auVar.f189319f = D;
        auVar.f189314a |= 16;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* renamed from: m */
    public final void mo107442m(C71003bc bcVar) {
        C37258g gVar = C37176a.f96873ar;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C70991ar arVar = (C70991ar) C70992as.f189307c.createBuilder();
        arVar.copyOnWrite();
        C70992as asVar = (C70992as) arVar.instance;
        bcVar.getClass();
        asVar.f189310b = bcVar;
        asVar.f189309a |= 1;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C70992as asVar2 = (C70992as) arVar.build();
        asVar2.getClass();
        auVar.f189320g = asVar2;
        auVar.f189314a |= 32;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* renamed from: n */
    public final void mo107443n(C51809dy dyVar) {
        C70988ao D = C126178g.m206338D(dyVar);
        if (C126178g.m206339G(D)) {
            this.f347679a.f347686d.set(true);
        }
        C37258g gVar = C37176a.f96871ap;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        D.getClass();
        auVar.f189319f = D;
        auVar.f189314a |= 16;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* renamed from: o */
    public final void mo107444o(int i) {
        C37258g gVar = C37176a.f97206hF;
        C70993at atVar = (C70993at) C70994au.f189311p.createBuilder();
        C71006bf bfVar = (C71006bf) C71008bh.f189371c.createBuilder();
        bfVar.copyOnWrite();
        C71008bh bhVar = (C71008bh) bfVar.instance;
        bhVar.f189374b = i - 1;
        bhVar.f189373a |= 1;
        atVar.copyOnWrite();
        C70994au auVar = (C70994au) atVar.instance;
        C71008bh bhVar2 = (C71008bh) bfVar.build();
        bhVar2.getClass();
        auVar.f189326m = bhVar2;
        auVar.f189314a |= 2048;
        mo107436g(gVar, (C70994au) atVar.build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r4 != 5) goto L_0x0081;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107445p(com.google.android.apps.gsa.nga.engine.dictation.h r4, int r5) {
        /*
            r3 = this;
            j.a.c.c.a.bs r0 = p5535j.p5536a.p5545c.p5548c.p5549a.C71019bs.f189393e
            com.google.protobuf.bn r0 = r0.createBuilder()
            j.a.c.c.a.bp r0 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71016bp) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            j.a.c.c.a.bs r1 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71019bs) r1
            int r5 = r5 + -1
            r1.f189397c = r5
            int r5 = r1.f189395a
            r2 = 2
            r5 = r5 | r2
            r1.f189395a = r5
            com.google.android.apps.gsa.nga.engine.dictation.h r5 = com.google.android.apps.gsa.nga.engine.dictation.h.a
            com.google.android.apps.search.assistant.surfaces.dictation.a.a.j r5 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j.UNKNOWN
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r5 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a.UNKNOWN_STATUS
            com.google.android.apps.search.assistant.surfaces.dictation.a.cg r5 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125106cg.KEYBOARD_TIP_EVENT_UNSPECIFIED
            int r4 = r4.ordinal()
            r5 = 4
            if (r4 == 0) goto L_0x0072
            r1 = 1
            if (r4 == r1) goto L_0x0063
            if (r4 == r2) goto L_0x0054
            r1 = 3
            if (r4 == r1) goto L_0x0045
            if (r4 == r5) goto L_0x0036
            r1 = 5
            if (r4 == r1) goto L_0x0072
            goto L_0x0081
        L_0x0036:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            j.a.c.c.a.bs r4 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71019bs) r4
            r4.f189398d = r5
            int r1 = r4.f189395a
            r5 = r5 | r1
            r4.f189395a = r5
            goto L_0x0081
        L_0x0045:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            j.a.c.c.a.bs r4 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71019bs) r4
            r4.f189398d = r1
            int r1 = r4.f189395a
            r5 = r5 | r1
            r4.f189395a = r5
            goto L_0x0081
        L_0x0054:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            j.a.c.c.a.bs r4 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71019bs) r4
            r4.f189398d = r2
            int r1 = r4.f189395a
            r5 = r5 | r1
            r4.f189395a = r5
            goto L_0x0081
        L_0x0063:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            j.a.c.c.a.bs r4 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71019bs) r4
            r4.f189398d = r1
            int r1 = r4.f189395a
            r5 = r5 | r1
            r4.f189395a = r5
            goto L_0x0081
        L_0x0072:
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            j.a.c.c.a.bs r4 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71019bs) r4
            r1 = 0
            r4.f189398d = r1
            int r1 = r4.f189395a
            r5 = r5 | r1
            r4.f189395a = r5
        L_0x0081:
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97209hI
            j.a.c.c.a.au r5 = p5535j.p5536a.p5545c.p5548c.p5549a.C70994au.f189311p
            com.google.protobuf.bn r5 = r5.createBuilder()
            j.a.c.c.a.at r5 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70993at) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            j.a.c.c.a.au r1 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70994au) r1
            com.google.protobuf.bv r0 = r0.build()
            j.a.c.c.a.bs r0 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71019bs) r0
            r0.getClass()
            r1.f189325l = r0
            int r0 = r1.f189314a
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.f189314a = r0
            com.google.protobuf.bv r5 = r5.build()
            j.a.c.c.a.au r5 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70994au) r5
            r3.mo107436g(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126177f.mo107445p(com.google.android.apps.gsa.nga.engine.dictation.h, int):void");
    }
}
