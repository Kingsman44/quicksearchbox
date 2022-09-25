package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3592c.C45729e;
import com.google.apps.p3589d.p3593d.C45732a;
import com.google.apps.p3589d.p3593d.C45743b;
import com.google.apps.p3589d.p3593d.C45745d;
import com.google.apps.p3589d.p3593d.C45750i;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3600k.C45945j;

/* renamed from: com.google.apps.d.e.a */
/* compiled from: PG */
final class C45768a extends C45750i {

    /* renamed from: a */
    private final int f120349a;

    /* renamed from: b */
    private final C45769aa f120350b;

    /* renamed from: c */
    private final C45796z f120351c;

    public C45768a(int i, C45763v vVar, C45729e eVar) {
        this.f120349a = i;
        C45769aa aaVar = new C45769aa(true);
        this.f120350b = aaVar;
        this.f120351c = aaVar.mo49902b(vVar, eVar);
    }

    /* renamed from: a */
    public final C45763v mo49883a(C45763v vVar) {
        C45796z c = this.f120350b.mo49903c();
        C45712c cVar = new C45712c(vVar.f120342a);
        while (cVar.hasNext()) {
            C45755n nVar = (C45755n) cVar.next();
            int i = this.f120349a;
            C45732a aVar = nVar.f120318g;
            C45743b bVar = (C45743b) aVar;
            if (i == bVar.f120260b) {
                c.mo49920c(this.f120351c);
                c.f120420a.f120220a.add(nVar);
            } else if (i != bVar.f120261c || (nVar.f120315d == null && nVar.f120316e == null)) {
                if (aVar.mo49861d(i)) {
                    nVar = nVar.mo49862a(this);
                }
                c.f120420a.f120220a.add(nVar);
            } else {
                if (!nVar.mo49891k()) {
                    c.f120420a.f120220a.add(nVar.mo49886b((C45763v) null, (C45763v) null));
                }
                c.mo49920c(this.f120351c);
                c.f120420a.f120220a.add(C45755n.m81570c().mo49886b(nVar.f120315d, nVar.f120316e));
            }
        }
        if (((C45745d) vVar.f120343b).f120266b == this.f120349a) {
            c.mo49920c(this.f120351c);
        }
        return c.mo49918a();
    }

    /* renamed from: c */
    public final C45729e mo49900c() {
        C45729e eVar = this.f120350b.f120352a;
        C45945j.m82042d(eVar);
        return eVar;
    }
}
