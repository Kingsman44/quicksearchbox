package com.google.apps.p3589d.p3595f;

import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45717h;
import com.google.apps.p3589d.p3591b.C45724o;

/* renamed from: com.google.apps.d.f.k */
/* compiled from: PG */
public final /* synthetic */ class C45808k implements C45717h {

    /* renamed from: a */
    public final /* synthetic */ C45724o f120470a;

    public /* synthetic */ C45808k(C45724o oVar) {
        this.f120470a = oVar;
    }

    /* renamed from: a */
    public final void mo49821a(Object obj, Object obj2) {
        C45724o oVar = this.f120470a;
        C45814q qVar = (C45814q) obj2;
        C45809l lVar = (C45809l) oVar.f120221a.get((Integer) obj);
        if (lVar != null) {
            int a = lVar.mo49922a();
            C45712c cVar = new C45712c(qVar.mo49940a());
            while (cVar.hasNext()) {
                Integer valueOf = Integer.valueOf(((Integer) cVar.next()).intValue());
                if (!oVar.f120221a.containsKey(valueOf)) {
                    oVar.f120221a.put(valueOf, new C45797a(a, true));
                }
            }
        }
    }
}
