package com.google.android.apps.gsa.staticplugins.p7686co.p7690d;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.sidekick.shared.cards.C91681aj;
import com.google.android.apps.gsa.sidekick.shared.cards.C91682ak;
import com.google.android.apps.gsa.sidekick.shared.cards.C91703r;
import com.google.android.apps.gsa.sidekick.shared.cards.C91707v;
import com.google.android.apps.gsa.sidekick.shared.util.C91993l;
import com.google.android.apps.gsa.sidekick.shared.util.C91997p;
import com.google.android.apps.p489g.p490a.C9119d;
import com.google.android.apps.p489g.p490a.C9121f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7724hp;
import com.google.p375ai.p378b.C7726hr;
import com.google.p375ai.p378b.C7728ht;
import com.google.p375ai.p378b.C7732hx;
import com.google.p375ai.p378b.C7739id;
import com.google.p375ai.p378b.C7741if;
import com.google.p375ai.p378b.C7743ih;
import com.google.p375ai.p378b.C7744ii;
import com.google.p375ai.p378b.C8100vn;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.d.e */
/* compiled from: PG */
public final /* synthetic */ class C98287e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98289g f274377a;

    /* renamed from: b */
    public final /* synthetic */ C8142xb f274378b;

    /* renamed from: c */
    public final /* synthetic */ boolean f274379c;

    /* renamed from: d */
    public final /* synthetic */ C7642eo f274380d;

    public /* synthetic */ C98287e(C98289g gVar, C8142xb xbVar, boolean z, C7642eo eoVar) {
        this.f274377a = gVar;
        this.f274378b = xbVar;
        this.f274379c = z;
        this.f274380d = eoVar;
    }

    public final C60870cx apply(Object obj) {
        C7744ii iiVar;
        Object obj2;
        Object obj3;
        C98289g gVar = this.f274377a;
        C8142xb xbVar = this.f274378b;
        boolean z = this.f274379c;
        C7642eo eoVar = this.f274380d;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && !((C7744ii) axVar.mo56107c()).f27069o) {
            C7744ii iiVar2 = (C7744ii) axVar.mo56107c();
            C62940bt r3 = C62942bv.checkIsLite(C9121f.f31398d);
            iiVar2.mo58887l(r3);
            if (iiVar2.f169962ag.mo58857o(r3.f169971d)) {
                C118831d dVar = (C118831d) gVar.f274387f.mo6453a();
                long b = gVar.f274388g.mo26870b();
                C7744ii iiVar3 = (C7744ii) axVar.mo56107c();
                C62940bt r6 = C62942bv.checkIsLite(C9121f.f31398d);
                iiVar3.mo58887l(r6);
                Object l = iiVar3.f169962ag.mo58854l(r6.f169971d);
                if (l == null) {
                    obj3 = r6.f169969b;
                } else {
                    obj3 = r6.mo58889c(l);
                }
                dVar.mo104025g(b - ((C9121f) obj3).f31401b);
            }
            C58480gp e = C58485gu.m89837e();
            e.mo55395g(new C91703r());
            e.mo55395g(new C91707v());
            e.mo55395g(new C91682ak());
            e.mo55395g(new C91681aj(xbVar));
            if (gVar.f274385d.mo79746e(C90010bp.f246910F)) {
                e.mo55395g((C91997p) gVar.f274384c.mo17428b());
            }
            C91993l lVar = new C91993l(e.mo55394f());
            C7744ii iiVar4 = (C7744ii) axVar.mo56107c();
            if (iiVar4 == null) {
                iiVar = null;
            } else {
                C7728ht htVar = (C7728ht) C7744ii.f27054p.createBuilder();
                C62963cj<C7732hx> cjVar = new C62963cj(iiVar4.f27062g, C7744ii.f27053h);
                htVar.copyOnWrite();
                C7744ii iiVar5 = (C7744ii) htVar.instance;
                C62961ch chVar = iiVar5.f27062g;
                if (!chVar.mo58948c()) {
                    iiVar5.f27062g = C62942bv.mutableCopy(chVar);
                }
                for (C7732hx hxVar : cjVar) {
                    iiVar5.f27062g.mo58916g(hxVar.f27037j);
                }
                C7739id idVar = iiVar4.f27064j;
                if (idVar == null) {
                    idVar = C7739id.f27046a;
                }
                htVar.copyOnWrite();
                C7744ii iiVar6 = (C7744ii) htVar.instance;
                idVar.getClass();
                iiVar6.f27064j = idVar;
                iiVar6.f27056a |= 64;
                C62971cq cqVar = iiVar4.f27065k;
                htVar.copyOnWrite();
                C7744ii iiVar7 = (C7744ii) htVar.instance;
                C62971cq cqVar2 = iiVar7.f27065k;
                if (!cqVar2.mo58948c()) {
                    iiVar7.f27065k = C62942bv.mutableCopy(cqVar2);
                }
                C62947c.addAll((Iterable) cqVar, (List) iiVar7.f27065k);
                C62971cq cqVar3 = iiVar4.f27066l;
                htVar.copyOnWrite();
                C7744ii iiVar8 = (C7744ii) htVar.instance;
                C62971cq cqVar4 = iiVar8.f27066l;
                if (!cqVar4.mo58948c()) {
                    iiVar8.f27066l = C62942bv.mutableCopy(cqVar4);
                }
                C62947c.addAll((Iterable) cqVar3, (List) iiVar8.f27066l);
                C62971cq cqVar5 = iiVar4.f27060e;
                htVar.copyOnWrite();
                C7744ii iiVar9 = (C7744ii) htVar.instance;
                iiVar9.mo16955a();
                C62947c.addAll((Iterable) cqVar5, (List) iiVar9.f27060e);
                C7724hp hpVar = iiVar4.f27063i;
                if (hpVar == null) {
                    hpVar = C7724hp.f27005a;
                }
                htVar.copyOnWrite();
                C7744ii iiVar10 = (C7744ii) htVar.instance;
                hpVar.getClass();
                iiVar10.f27063i = hpVar;
                iiVar10.f27056a |= 32;
                htVar.mo16952a(iiVar4.f27067m);
                int c = C8100vn.m22939c(iiVar4.f27059d);
                if (c == 0) {
                    c = 1;
                }
                htVar.copyOnWrite();
                C7744ii iiVar11 = (C7744ii) htVar.instance;
                iiVar11.f27059d = c - 1;
                iiVar11.f27056a |= 4;
                long j = iiVar4.f27058c;
                htVar.copyOnWrite();
                C7744ii iiVar12 = (C7744ii) htVar.instance;
                iiVar12.f27056a |= 2;
                iiVar12.f27058c = j;
                int a = C7743ih.m22832a(iiVar4.f27061f);
                if (a == 0) {
                    a = 1;
                }
                htVar.copyOnWrite();
                C7744ii iiVar13 = (C7744ii) htVar.instance;
                iiVar13.f27061f = a;
                iiVar13.f27056a |= 8;
                C7741if ifVar = iiVar4.f27068n;
                if (ifVar == null) {
                    ifVar = C7741if.f27048b;
                }
                htVar.copyOnWrite();
                C7744ii iiVar14 = (C7744ii) htVar.instance;
                ifVar.getClass();
                iiVar14.f27068n = ifVar;
                iiVar14.f27056a |= 256;
                if ((iiVar4.f27056a & 1) != 0) {
                    C7726hr hrVar = iiVar4.f27057b;
                    if (hrVar == null) {
                        hrVar = C7726hr.f27008i;
                    }
                    C7726hr f = lVar.mo86670f(hrVar);
                    if (f != null) {
                        htVar.copyOnWrite();
                        C7744ii iiVar15 = (C7744ii) htVar.instance;
                        iiVar15.f27057b = f;
                        iiVar15.f27056a |= 1;
                    }
                }
                C62940bt btVar = C9119d.f31392d;
                C62940bt r32 = C62942bv.checkIsLite(C9119d.f31392d);
                iiVar4.mo58887l(r32);
                Object l2 = iiVar4.f169962ag.mo58854l(r32.f169971d);
                if (l2 == null) {
                    obj2 = r32.f169969b;
                } else {
                    obj2 = r32.mo58889c(l2);
                }
                htVar.mo58885m(btVar, (C9119d) obj2);
                iiVar = (C7744ii) htVar.build();
            }
            if (iiVar == null) {
                return C60866ct.f164955a;
            }
            C60870cx g = C60922j.m93044g(gVar.f274382a.mo85617g(), new C98283a(iiVar), C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
            return g;
        } else if (!z) {
            return C60866ct.f164955a;
        } else {
            C58976aa aaVar = C58975e.f156826a;
            C60870cx h = C60922j.m93045h(gVar.mo85725a(eoVar), new C98284b(gVar, xbVar, eoVar), C60826bg.f164896a);
            C90476a aVar2 = C91018d.f254254a;
            return h;
        }
    }
}
