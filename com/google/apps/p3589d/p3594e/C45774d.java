package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3591b.C45711b;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3592c.C45729e;
import com.google.apps.p3589d.p3593d.C45747f;
import com.google.apps.p3589d.p3593d.C45748g;
import com.google.apps.p3589d.p3593d.C45750i;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45761t;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3596g.C45833ai;

/* renamed from: com.google.apps.d.e.d */
/* compiled from: PG */
final class C45774d extends C45750i {

    /* renamed from: a */
    public C45729e f120364a;

    public C45774d(C45729e eVar) {
        this.f120364a = eVar;
    }

    /* renamed from: a */
    public final C45763v mo49883a(C45763v vVar) {
        C45763v vVar2 = new C45763v(vVar.f120342a.mo49812a(new C45773c(this)));
        loop0:
        while (true) {
            C45723n nVar = new C45723n(0);
            int size = vVar2.f120342a.f120220a.size();
            for (int i = 0; i < size; i++) {
                C45755n a = vVar2.mo49895a(i);
                if (C45748g.f120271C.f120221a.containsKey(a.f120314c)) {
                    for (Integer intValue : new C45711b(nVar)) {
                        int intValue2 = intValue.intValue();
                        if (C45748g.m81556e(vVar2.mo49895a(intValue2).f120314c, a.f120314c)) {
                            C45755n a2 = vVar2.mo49895a(intValue2);
                            C45755n a3 = vVar2.mo49895a(i);
                            C45747f a4 = C45748g.m81553a(C45833ai.m81762a(a2), C45833ai.m81762a(a3));
                            C45723n nVar2 = new C45723n(0);
                            if (!(a2.f120315d == null && a2.f120316e == null)) {
                                nVar2.f120220a.add(C45755n.m81570c().mo49886b(a2.f120315d, a2.f120316e));
                            }
                            nVar2.mo49833l(vVar2.f120342a, intValue2 + 1, i);
                            C45755n b = new C45761t(C45763v.m81597e(nVar2), a4).mo49886b(a3.f120315d, a3.f120316e);
                            C45719j jVar = vVar2.f120342a;
                            C45723n nVar3 = new C45723n(0);
                            nVar3.mo49833l(jVar, 0, intValue2);
                            nVar3.f120220a.add(b);
                            nVar3.mo49833l(jVar, i + 1, jVar.f120220a.size());
                            vVar2 = C45763v.m81597e(nVar3);
                            C45729e b2 = this.f120364a.mo49846b(a3, b);
                            this.f120364a = b2;
                            if (b2.f120235b == a2 || b2.f120234a == a2) {
                                this.f120364a = new C45729e((C45755n) null, (C45755n) null, ((C45761t) b).f120344i);
                            }
                        }
                    }
                }
                if (C45748g.f120270B.f120221a.containsKey(a.f120314c)) {
                    nVar.f120220a.add(Integer.valueOf(i));
                }
            }
            break loop0;
        }
        if (this.f120364a.mo49847c(vVar)) {
            this.f120364a = new C45729e((C45755n) null, (C45755n) null, vVar2);
        }
        return vVar2;
    }
}
