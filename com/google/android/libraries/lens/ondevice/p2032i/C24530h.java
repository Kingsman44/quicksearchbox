package com.google.android.libraries.lens.ondevice.p2032i;

import com.google.android.libraries.lens.ondevice.p2037n.C24773af;
import com.google.android.libraries.lens.ondevice.p2037n.C24774ag;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24807r;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import com.google.lens.p4701g.C62331d;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.google.android.libraries.lens.ondevice.i.h */
/* compiled from: PG */
public final class C24530h {

    /* renamed from: a */
    public final ConcurrentLinkedQueue f67193a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    private final C21370a f67194b;

    public C24530h(C21370a aVar) {
        this.f67194b = aVar;
    }

    /* renamed from: a */
    public static boolean m45606a(C24805p pVar) {
        return pVar == C24805p.CASCADE_RUN_ERROR || pVar == C24805p.CASCADE_RUN_START || pVar == C24805p.CASCADE_RUN_SUCCESS;
    }

    /* renamed from: b */
    public final void mo29943b(C62331d dVar, C24805p pVar) {
        C58838bb.m90868c(m45606a(pVar));
        C24807r rVar = (C24807r) C24808s.f67804l.createBuilder();
        rVar.copyOnWrite();
        C24808s sVar = (C24808s) rVar.instance;
        sVar.f67811f = dVar.f168273v;
        sVar.f67806a |= 16;
        mo29947f(pVar, (C24808s) rVar.build());
    }

    /* renamed from: c */
    public final void mo29944c(C62331d dVar, int i, C24805p pVar) {
        C58838bb.m90868c(m45606a(pVar));
        C24807r rVar = (C24807r) C24808s.f67804l.createBuilder();
        rVar.copyOnWrite();
        C24808s sVar = (C24808s) rVar.instance;
        sVar.f67811f = dVar.f168273v;
        sVar.f67806a |= 16;
        rVar.copyOnWrite();
        C24808s sVar2 = (C24808s) rVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            sVar2.f67812g = i2;
            sVar2.f67806a |= 32;
            mo29947f(pVar, (C24808s) rVar.build());
            return;
        }
        throw null;
    }

    /* renamed from: d */
    public final void mo29945d(C24805p pVar, String str) {
        C24807r rVar = (C24807r) C24808s.f67804l.createBuilder();
        rVar.copyOnWrite();
        C24808s sVar = (C24808s) rVar.instance;
        str.getClass();
        sVar.f67806a |= 1;
        sVar.f67807b = str;
        mo29947f(pVar, (C24808s) rVar.build());
    }

    /* renamed from: e */
    public final void mo29946e(C62331d dVar, C24805p pVar) {
        C58838bb.m90868c(m45606a(pVar));
        C24807r rVar = (C24807r) C24808s.f67804l.createBuilder();
        rVar.copyOnWrite();
        C24808s sVar = (C24808s) rVar.instance;
        sVar.f67811f = dVar.f168273v;
        sVar.f67806a |= 16;
        rVar.copyOnWrite();
        C24808s sVar2 = (C24808s) rVar.instance;
        sVar2.f67808c = 1;
        sVar2.f67806a |= 2;
        mo29947f(pVar, (C24808s) rVar.build());
    }

    /* renamed from: f */
    public final void mo29947f(C24805p pVar, C24808s sVar) {
        C24773af afVar = (C24773af) C24774ag.f67693e.createBuilder();
        afVar.copyOnWrite();
        C24774ag agVar = (C24774ag) afVar.instance;
        agVar.f67696b = pVar.f67802A;
        agVar.f67695a |= 1;
        long d = this.f67194b.mo26872d();
        afVar.copyOnWrite();
        C24774ag agVar2 = (C24774ag) afVar.instance;
        agVar2.f67695a |= 2;
        agVar2.f67697c = d;
        if (sVar != null) {
            afVar.copyOnWrite();
            C24774ag agVar3 = (C24774ag) afVar.instance;
            agVar3.f67698d = sVar;
            agVar3.f67695a |= 4;
        }
        C24774ag agVar4 = (C24774ag) afVar.build();
        Iterator it = this.f67193a.iterator();
        while (it.hasNext()) {
            ((C24529g) it.next()).mo29942a(agVar4);
        }
    }
}
