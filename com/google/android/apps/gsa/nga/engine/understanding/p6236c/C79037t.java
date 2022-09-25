package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.engine.ab.a.b;
import com.google.android.apps.gsa.nga.engine.ab.a.g;
import com.google.android.apps.gsa.nga.engine.ab.a.i;
import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.engine.understanding.C79008c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80413ae;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80417ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80426f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80431k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80432l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80433m;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80434n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80436p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80438r;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80442v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80512a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80517f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.t */
/* compiled from: PG */
public final /* synthetic */ class C79037t implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C79039v f217344a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f217345b;

    /* renamed from: c */
    public final /* synthetic */ C80431k f217346c;

    /* renamed from: d */
    public final /* synthetic */ C80413ae f217347d;

    /* renamed from: e */
    public final /* synthetic */ C74965n f217348e;

    /* renamed from: f */
    public final /* synthetic */ boolean f217349f;

    /* renamed from: g */
    public final /* synthetic */ C74757n f217350g;

    public /* synthetic */ C79037t(C79039v vVar, C58485gu guVar, C80431k kVar, C80413ae aeVar, C74965n nVar, boolean z, C74757n nVar2) {
        this.f217344a = vVar;
        this.f217345b = guVar;
        this.f217346c = kVar;
        this.f217347d = aeVar;
        this.f217348e = nVar;
        this.f217349f = z;
        this.f217350g = nVar2;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Optional optional;
        C79039v vVar = this.f217344a;
        C58485gu guVar = this.f217345b;
        C80431k kVar = this.f217346c;
        C80413ae aeVar = this.f217347d;
        C74965n nVar = this.f217348e;
        boolean z = this.f217349f;
        C74757n nVar2 = this.f217350g;
        Optional optional2 = (Optional) obj;
        optional2.isPresent();
        guVar.size();
        kVar.copyOnWrite();
        C80432l lVar = (C80432l) kVar.instance;
        C80432l lVar2 = C80432l.f220749e;
        C62971cq cqVar = lVar.f220753c;
        if (!cqVar.mo58948c()) {
            lVar.f220753c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) lVar.f220753c);
        Objects.requireNonNull(kVar);
        optional2.ifPresent(new C79032o(kVar));
        C80433m mVar = (C80433m) C80434n.f220756h.createBuilder();
        C80438r rVar = C80438r.NGA_REWRITE;
        mVar.copyOnWrite();
        C80434n nVar3 = (C80434n) mVar.instance;
        nVar3.f220763f = rVar.f220782f;
        nVar3.f220758a |= 32;
        mVar.copyOnWrite();
        C80434n nVar4 = (C80434n) mVar.instance;
        aeVar.getClass();
        nVar4.f220759b = aeVar;
        nVar4.f220758a |= 1;
        mVar.copyOnWrite();
        C80434n nVar5 = (C80434n) mVar.instance;
        C80432l lVar3 = (C80432l) kVar.build();
        lVar3.getClass();
        nVar5.f220761d = lVar3;
        nVar5.f220758a |= 4;
        C83320io k = nVar.mo71336k();
        mVar.copyOnWrite();
        C80434n nVar6 = (C80434n) mVar.instance;
        k.getClass();
        nVar6.f220764g = k;
        nVar6.f220758a |= 64;
        String languageTag = nVar.mo71342q().toLanguageTag();
        mVar.copyOnWrite();
        C80434n nVar7 = (C80434n) mVar.instance;
        languageTag.getClass();
        nVar7.f220758a |= 2;
        nVar7.f220760c = languageTag;
        mVar.copyOnWrite();
        C80434n nVar8 = (C80434n) mVar.instance;
        nVar8.f220758a |= 8;
        nVar8.f220762e = z;
        C80434n nVar9 = (C80434n) mVar.build();
        C79850ah c = vVar.f217355d.mo74252c(5, nVar.mo71336k());
        try {
            C80436p a = vVar.f217353b.mo72046a(nVar9);
            c.mo74257d();
            if (c != null) {
                c.mo74255b();
            }
            if (a != null) {
                Collection.EL.stream(vVar.f217354c).forEach(new C79033p());
            }
            Optional ofNullable = Optional.ofNullable(a);
            if (ofNullable.isEmpty()) {
                vVar.f217357f.mo74237c(C89849ae.NGA_GENIE_REWRITING_FAILURE, nVar.mo71336k());
                return C58485gu.m89845m();
            }
            vVar.f217357f.mo74237c(C89849ae.NGA_GENIE_REWRITING_SUCCESS, nVar.mo71336k());
            C80436p pVar = (C80436p) ofNullable.get();
            C80442v vVar2 = pVar.f220772e;
            if (vVar2 == null) {
                vVar2 = C80442v.f220789e;
            }
            boolean z2 = vVar2.f220792b;
            C62971cq<C80417ai> cqVar2 = pVar.f220769b;
            C58480gp e = C58485gu.m89837e();
            for (C80417ai aiVar : cqVar2) {
                C79008c cVar = new C79008c();
                i d = nVar2.mo71151d();
                g gVar = new g();
                gVar.b = Optional.m71637of(nVar2.mo71164r());
                gVar.b(aiVar.f220710b);
                d.h(new b(gVar.a()));
                d.l(C80517f.GENIE);
                C80426f fVar = aiVar.f220713e;
                if (fVar == null) {
                    fVar = C80426f.f220738f;
                }
                d.e(fVar);
                d.k(z2);
                cVar.mo73740b(d.a());
                if ((aiVar.f220709a & 4) != 0) {
                    C61752n nVar10 = aiVar.f220711c;
                    if (nVar10 == null) {
                        nVar10 = C61752n.f166808f;
                    }
                    C80512a aVar = (C80512a) C80513b.f221014e.createBuilder();
                    aVar.copyOnWrite();
                    ((C80513b) aVar.instance).f221018c = 20000.0f;
                    C80515d dVar = C80515d.GENIE;
                    aVar.copyOnWrite();
                    ((C80513b) aVar.instance).f221019d = dVar.getNumber();
                    aVar.copyOnWrite();
                    nVar10.getClass();
                    ((C80513b) aVar.instance).f221016a = nVar10;
                    optional = Optional.m71637of((C80513b) aVar.build());
                } else {
                    optional = Optional.empty();
                }
                Objects.requireNonNull(cVar);
                optional.ifPresent(new C79038u(cVar));
                e.mo55395g(cVar.mo73739a());
            }
            if (z2) {
                C79008c cVar2 = new C79008c();
                i d2 = nVar2.mo71151d();
                d2.l(C80517f.ORIGINAL);
                d2.k(true);
                cVar2.mo73740b(d2.a());
                e.mo55395g(cVar2.mo73739a());
            }
            return e.mo55394f();
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
