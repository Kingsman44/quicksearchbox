package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3592c.C45729e;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45763v;

/* renamed from: com.google.apps.d.e.z */
/* compiled from: PG */
public final class C45796z {

    /* renamed from: a */
    public C45723n f120420a;

    /* renamed from: b */
    final /* synthetic */ C45769aa f120421b;

    /* renamed from: c */
    private boolean f120422c;

    public C45796z(C45769aa aaVar, C45723n nVar, boolean z) {
        this.f120421b = aaVar;
        this.f120420a = nVar;
        this.f120422c = z;
    }

    /* renamed from: a */
    public final C45763v mo49918a() {
        C45769aa aaVar = this.f120421b;
        if (aaVar.f120353b) {
            C45796z c = aaVar.mo49903c();
            C45712c cVar = new C45712c(this.f120420a);
            if (cVar.hasNext()) {
                C45755n nVar = (C45755n) cVar.next();
                while (cVar.hasNext()) {
                    C45755n nVar2 = (C45755n) cVar.next();
                    if (!nVar2.mo49891k() || !nVar.mo49893m()) {
                        c.f120420a.f120220a.add(nVar);
                        nVar = nVar2;
                    } else {
                        C45755n b = nVar.mo49886b(this.f120421b.mo49901a(nVar.f120315d, nVar2.f120315d), this.f120421b.mo49901a(nVar.f120316e, nVar2.f120316e));
                        C45769aa aaVar2 = this.f120421b;
                        C45729e eVar = aaVar2.f120352a;
                        if (eVar != null) {
                            C45755n nVar3 = eVar.f120234a;
                            if (nVar3 == null) {
                                nVar3 = eVar.f120235b;
                            }
                            if (nVar3 == nVar || nVar3 == nVar2) {
                                aaVar2.f120352a = nVar3 == nVar ? new C45729e((C45755n) null, b, (C45763v) null) : new C45729e(b, (C45755n) null, (C45763v) null);
                            }
                        }
                        nVar = b;
                    }
                }
                c.f120420a.f120220a.add(nVar);
                this.f120420a = c.f120420a;
            }
        }
        C45763v e = C45763v.m81597e(this.f120420a);
        if (this.f120422c) {
            this.f120421b.f120352a = new C45729e((C45755n) null, (C45755n) null, e);
        }
        return e;
    }

    /* renamed from: b */
    public final void mo49919b(C45796z zVar) {
        if (zVar.f120422c) {
            mo49921d();
        }
    }

    /* renamed from: c */
    public final void mo49920c(C45796z zVar) {
        mo49919b(zVar);
        this.f120420a.mo49832k(zVar.f120420a);
    }

    /* renamed from: d */
    public final void mo49921d() {
        if (this.f120420a.f120220a.isEmpty()) {
            this.f120422c = true;
            return;
        }
        C45769aa aaVar = this.f120421b;
        C45723n nVar = this.f120420a;
        aaVar.f120352a = new C45729e((C45755n) nVar.mo49815d(nVar.f120220a.size() - 1), (C45755n) null, (C45763v) null);
    }
}
