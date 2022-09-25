package com.google.android.libraries.lens.view.utils;

import com.google.android.libraries.lens.common.text.C24141q;
import com.google.android.libraries.lens.p2014e.p2015a.C24194m;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.p2014e.p2015a.C24196o;
import com.google.android.libraries.lens.p2014e.p2015a.C24197p;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2069am.C25334j;
import com.google.android.libraries.lens.view.p2069am.C25336l;
import com.google.android.libraries.lens.view.p2177w.C28185a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56223ad;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56233an;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56235ap;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56241av;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw;

/* renamed from: com.google.android.libraries.lens.view.utils.ak */
/* compiled from: PG */
public final class C28109ak {
    /* renamed from: a */
    public static C24197p m52387a(int i, C56241av avVar) {
        C56224ae aeVar = avVar.f149797e;
        if (aeVar == null) {
            aeVar = C56224ae.f149753h;
        }
        int a = C56223ad.m87941a(aeVar.f149761g);
        boolean z = true;
        if (!(a == 0 || a == 1)) {
            z = false;
        }
        C58838bb.m90868c(z);
        String e = C24141q.m44843e(avVar, C58836b.f156633a);
        C24196o oVar = (C24196o) C24197p.f66134e.createBuilder();
        String str = avVar.f149795c;
        oVar.copyOnWrite();
        str.getClass();
        ((C24197p) oVar.instance).f66138c = str;
        C24194m mVar = (C24194m) C24195n.f66127f.createBuilder();
        C56224ae aeVar2 = avVar.f149797e;
        if (aeVar2 == null) {
            aeVar2 = C56224ae.f149753h;
        }
        float f = aeVar2.f149756b;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66130b = f;
        C56224ae aeVar3 = avVar.f149797e;
        if (aeVar3 == null) {
            aeVar3 = C56224ae.f149753h;
        }
        float f2 = aeVar3.f149757c;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66129a = f2;
        C56224ae aeVar4 = avVar.f149797e;
        float f3 = (aeVar4 == null ? C56224ae.f149753h : aeVar4).f149757c;
        if (aeVar4 == null) {
            aeVar4 = C56224ae.f149753h;
        }
        float f4 = aeVar4.f149758d;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66131c = f3 + f4;
        C56224ae aeVar5 = avVar.f149797e;
        float f5 = (aeVar5 == null ? C56224ae.f149753h : aeVar5).f149756b;
        if (aeVar5 == null) {
            aeVar5 = C56224ae.f149753h;
        }
        float f6 = aeVar5.f149759e;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66132d = f5 + f6;
        C56224ae aeVar6 = avVar.f149797e;
        if (aeVar6 == null) {
            aeVar6 = C56224ae.f149753h;
        }
        float f7 = aeVar6.f149760f;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66133e = f7;
        oVar.copyOnWrite();
        C24195n nVar = (C24195n) mVar.build();
        nVar.getClass();
        ((C24197p) oVar.instance).f66137b = nVar;
        oVar.copyOnWrite();
        e.getClass();
        ((C24197p) oVar.instance).f66139d = e;
        oVar.copyOnWrite();
        ((C24197p) oVar.instance).f66136a = i;
        return (C24197p) oVar.build();
    }

    /* renamed from: b */
    public static C58833ax m52388b(C56242aw awVar, C25333i iVar, C56226ag agVar) {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (C56224ae aeVar : agVar.f149765b) {
            int i3 = 0;
            for (C56235ap apVar : awVar.f149801a) {
                for (C56233an anVar : apVar.f149783b) {
                    for (C56241av avVar : anVar.f149778b) {
                        C56224ae aeVar2 = avVar.f149797e;
                        if (aeVar2 == null) {
                            aeVar2 = C56224ae.f149753h;
                        }
                        if (C28185a.m52694l(aeVar, aeVar2, iVar)) {
                            i = Math.min(i, i3);
                            i2 = Math.max(i2, i3);
                        }
                        i3++;
                    }
                }
            }
        }
        if (i2 < i) {
            return C58836b.f156633a;
        }
        C25334j jVar = (C25334j) C25336l.f68957d.createBuilder();
        jVar.copyOnWrite();
        ((C25336l) jVar.instance).f68959a = i;
        jVar.copyOnWrite();
        ((C25336l) jVar.instance).f68960b = i2;
        return C58833ax.m90834k((C25336l) jVar.build());
    }
}
