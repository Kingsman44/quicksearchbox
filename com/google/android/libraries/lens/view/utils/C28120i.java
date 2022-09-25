package com.google.android.libraries.lens.view.utils;

import android.util.Pair;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.view.gleam.C26551eb;
import com.google.android.libraries.lens.view.p2069am.C25296ad;
import com.google.android.libraries.lens.view.p2069am.C25298af;
import com.google.android.libraries.lens.view.p2069am.C25299ag;
import com.google.android.libraries.lens.view.p2069am.C25300ah;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.lens.p4699e.C62225f;
import com.google.lens.p4699e.C62243x;
import com.google.lens.p4707j.C62578l;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56310h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56318p;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56326x;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.utils.i */
/* compiled from: PG */
public final class C28120i {
    /* renamed from: a */
    public static C58833ax m52397a(C56327y yVar) {
        for (C56320r rVar : yVar.f150143f) {
            C56318p pVar = rVar.f150101h;
            if (pVar == null) {
                pVar = C56318p.f150087c;
            }
            if ((pVar.f150089a & 4) != 0) {
                C56318p pVar2 = rVar.f150101h;
                if (pVar2 == null) {
                    pVar2 = C56318p.f150087c;
                }
                return C58833ax.m90834k(pVar2.f150090b);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public static C58485gu m52398b(C56235ap apVar, C25333i iVar) {
        C58480gp e = C58485gu.m89837e();
        for (C56233an anVar : apVar.f149783b) {
            C56224ae aeVar = anVar.f149779c;
            if (aeVar == null) {
                aeVar = C56224ae.f149753h;
            }
            C24195n g = C28185a.m52689g(aeVar, iVar);
            Iterable h = C58557jl.m90127h(anVar.f149778b, new C28112b(iVar));
            C25299ag agVar = (C25299ag) C25300ah.f68813c.createBuilder();
            agVar.copyOnWrite();
            g.getClass();
            ((C25300ah) agVar.instance).f68815a = g;
            agVar.copyOnWrite();
            C25300ah ahVar = (C25300ah) agVar.instance;
            C62971cq cqVar = ahVar.f68816b;
            if (!cqVar.mo58948c()) {
                ahVar.f68816b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(h, (List) ahVar.f68816b);
            e.mo55395g((C25300ah) agVar.build());
        }
        return e.mo55394f();
    }

    /* renamed from: c */
    public static C56235ap m52399c(C56327y yVar) {
        if (C26551eb.m49044i(yVar)) {
            for (C56320r rVar : yVar.f150143f) {
                C56326x a = C56326x.m87970a(rVar.f150103j);
                if (a == null) {
                    a = C56326x.UNKNOWN;
                }
                if (C58832aw.m90831a(a, C56326x.NONE)) {
                    C56310h hVar = rVar.f150100g;
                    if (hVar == null) {
                        hVar = C56310h.f150072g;
                    }
                    C56235ap apVar = hVar.f150077d;
                    return apVar == null ? C56235ap.f149780e : apVar;
                }
            }
        }
        return C56235ap.f149780e;
    }

    /* renamed from: d */
    public static C58485gu m52400d(C56327y yVar, C25333i iVar) {
        C58485gu guVar;
        int i;
        C62243x xVar;
        C58480gp e = C58485gu.m89837e();
        if (C26551eb.m49044i(yVar)) {
            guVar = (C58485gu) Collection.EL.stream(yVar.f150143f).filter(C28113c.f76510a).filter(C28114d.f76511a).filter(C28115e.f76512a).map(C28116f.f76513a).collect(C58370cn.f155946a);
        } else {
            guVar = C58485gu.m89845m();
        }
        int size = guVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Pair pair = (Pair) guVar.get(i2);
            C56310h hVar = (C56310h) pair.second;
            Iterable h = C58557jl.m90127h(hVar.f150078e, new C28117g(iVar));
            C25296ad adVar = (C25296ad) C25298af.f68805h.createBuilder();
            int i3 = hVar.f150075b;
            if (i3 == 7) {
                for (C62578l lVar : new C62963cj(((C62243x) hVar.f150076c).f168047c, C62243x.f168043d)) {
                    if (hVar.f150075b == 7) {
                        xVar = (C62243x) hVar.f150076c;
                    } else {
                        xVar = C62243x.f168044e;
                    }
                    boolean anyMatch = Collection.EL.stream(new C62963cj(xVar.f168046a, C62243x.f168042b)).anyMatch(C28118h.f76515a);
                    if (lVar == C62578l.DLH_DISH && anyMatch) {
                        adVar.copyOnWrite();
                        C25298af afVar = (C25298af) adVar.instance;
                        lVar.getClass();
                        C62961ch chVar = afVar.f68812f;
                        if (!chVar.mo58948c()) {
                            afVar.f68812f = C62942bv.mutableCopy(chVar);
                        }
                        afVar.f68812f.mo58916g(lVar.getNumber());
                    }
                }
                i = 4;
            } else if (i3 == 10) {
                C62225f fVar = (C62225f) hVar.f150076c;
                adVar.copyOnWrite();
                C25298af afVar2 = (C25298af) adVar.instance;
                fVar.getClass();
                afVar2.f68808b = fVar;
                afVar2.f68807a = 10;
                i = 5;
            }
            adVar.copyOnWrite();
            C25298af afVar3 = (C25298af) adVar.instance;
            C62971cq cqVar = afVar3.f68809c;
            if (!cqVar.mo58948c()) {
                afVar3.f68809c = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll(h, (List) afVar3.f68809c);
            adVar.copyOnWrite();
            ((C25298af) adVar.instance).f68810d = i - 2;
            String str = (String) pair.first;
            adVar.copyOnWrite();
            str.getClass();
            ((C25298af) adVar.instance).f68811e = str;
            e.mo55395g((C25298af) adVar.build());
        }
        return e.mo55394f();
    }
}
