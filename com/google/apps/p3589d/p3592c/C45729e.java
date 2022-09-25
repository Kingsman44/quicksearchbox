package com.google.apps.p3589d.p3592c;

import com.google.apps.p3589d.p3593d.C45743b;
import com.google.apps.p3589d.p3593d.C45745d;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3600k.C45945j;

/* renamed from: com.google.apps.d.c.e */
/* compiled from: PG */
public final class C45729e {

    /* renamed from: a */
    public final C45755n f120234a;

    /* renamed from: b */
    public final C45755n f120235b;

    /* renamed from: c */
    private final C45763v f120236c;

    public C45729e(C45755n nVar, C45755n nVar2, C45763v vVar) {
        this.f120234a = nVar;
        this.f120235b = nVar2;
        this.f120236c = vVar;
    }

    /* renamed from: a */
    public final int mo49845a() {
        C45755n nVar = this.f120234a;
        if (nVar != null) {
            return ((C45743b) nVar.f120318g).f120262d;
        }
        C45755n nVar2 = this.f120235b;
        if (nVar2 == null) {
            C45763v vVar = this.f120236c;
            if (vVar != null) {
                return ((C45745d) vVar.f120343b).f120265a;
            }
            throw C45945j.m82039a();
        } else if (C45728d.m81508b(nVar2)) {
            return ((C45743b) nVar2.f120318g).f120261c;
        } else {
            boolean k = nVar2.mo49891k();
            C45743b bVar = (C45743b) nVar2.f120318g;
            return k ? bVar.f120260b : bVar.f120262d;
        }
    }

    /* renamed from: b */
    public final C45729e mo49846b(C45755n nVar, C45755n nVar2) {
        return nVar == this.f120235b ? new C45729e((C45755n) null, nVar2, (C45763v) null) : nVar == this.f120234a ? new C45729e(nVar2, (C45755n) null, (C45763v) null) : this;
    }

    /* renamed from: c */
    public final boolean mo49847c(C45763v vVar) {
        return this.f120236c == vVar;
    }
}
