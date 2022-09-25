package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3591b.C45724o;
import com.google.apps.p3589d.p3593d.C45741ai;
import com.google.apps.p3589d.p3593d.C45749h;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3596g.C45837e;
import com.google.apps.p3589d.p3596g.C45838f;
import com.google.apps.p3589d.p3596g.C45839g;

/* renamed from: com.google.apps.d.e.q */
/* compiled from: PG */
public final /* synthetic */ class C45787q implements C45741ai {

    /* renamed from: a */
    public final /* synthetic */ C45724o f120387a;

    /* renamed from: b */
    public final /* synthetic */ C45724o f120388b;

    public /* synthetic */ C45787q(C45724o oVar, C45724o oVar2) {
        this.f120387a = oVar;
        this.f120388b = oVar2;
    }

    /* renamed from: a */
    public final void mo49865a(C45755n nVar) {
        C45724o oVar = this.f120387a;
        C45724o oVar2 = this.f120388b;
        if (nVar.f120319h == 4) {
            String f = nVar.mo49888f();
            Integer num = (Integer) oVar.f120221a.get(f);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            oVar.f120221a.put(f, Integer.valueOf(i));
            if (!oVar2.f120221a.containsKey(f)) {
                C45749h b = C45749h.m81559b(C45763v.m81598f(nVar.mo49886b((C45763v) null, (C45763v) null)));
                C45839g gVar = new C45839g(false, (C45837e) null, (C45838f) null);
                gVar.mo49985a(b.f120310b);
                oVar2.f120221a.put(f, gVar.f120518a.toString());
            }
        }
    }
}
