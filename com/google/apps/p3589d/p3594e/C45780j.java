package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3590a.C45700q;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3593d.C45737ae;
import com.google.apps.p3589d.p3593d.C45763v;

/* renamed from: com.google.apps.d.e.j */
/* compiled from: PG */
public final /* synthetic */ class C45780j implements C45700q {

    /* renamed from: a */
    public final /* synthetic */ C45791u f120374a;

    public /* synthetic */ C45780j(C45791u uVar) {
        this.f120374a = uVar;
    }

    /* renamed from: a */
    public final void mo49795a() {
        C45791u uVar = this.f120374a;
        C45737ae aeVar = uVar.f120407c.f120310b;
        int n = C45791u.m81640n(aeVar, uVar.f120412h.mo49743a()) + 1;
        C45723n nVar = new C45723n(0);
        C45723n nVar2 = new C45723n(0);
        int n2 = C45737ae.m81534n(aeVar.f120249j);
        for (int i = 0; i < n2; i++) {
            nVar2.f120220a.add(C45763v.m81596d());
        }
        nVar.mo49832k(aeVar.f120249j.mo49813b(0, n));
        nVar.f120220a.add(nVar2.mo49829f());
        C45719j jVar = aeVar.f120249j;
        nVar.mo49832k(jVar.mo49813b(n, jVar.f120220a.size()));
        uVar.mo49911m(nVar.mo49829f(), n, true);
    }
}
