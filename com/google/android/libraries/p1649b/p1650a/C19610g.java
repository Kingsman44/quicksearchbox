package com.google.android.libraries.p1649b.p1650a;

import com.google.common.p4522b.C58448fk;
import com.google.common.p4522b.C58784rw;
import com.google.common.p4522b.C58785rx;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;

/* renamed from: com.google.android.libraries.b.a.g */
/* compiled from: PG */
public final class C19610g {

    /* renamed from: a */
    public final C19607d f54570a;

    /* renamed from: b */
    public int f54571b = 0;

    /* renamed from: c */
    public int f54572c = 0;

    /* renamed from: d */
    public int f54573d = 0;

    /* renamed from: e */
    public boolean f54574e;

    /* renamed from: f */
    public final C58785rx f54575f = C58448fk.m89722o();

    /* renamed from: g */
    public final C58785rx f54576g = C58448fk.m89722o();

    public C19610g(C19607d dVar) {
        this.f54570a = dVar;
    }

    /* renamed from: a */
    public final synchronized int mo24941a(C60218r rVar) {
        int i;
        C19607d dVar = this.f54570a;
        if (dVar.f54559f.containsKey(rVar)) {
            i = ((Integer) dVar.f54559f.get(rVar)).intValue();
        } else {
            dVar.f54559f.put(rVar, Integer.valueOf(dVar.f54556c));
            i = dVar.f54556c;
            dVar.f54556c = i + 1;
        }
        return i;
    }

    /* renamed from: b */
    public final void mo24942b(int i, C60214n nVar, C58785rx rxVar) {
        C58785rx rxVar2 = this.f54575f;
        Integer valueOf = Integer.valueOf(i);
        C19609f fVar = (C19609f) rxVar2.mo55009a(valueOf, nVar);
        if (fVar != null) {
            rxVar.mo55010b(valueOf, nVar, fVar);
        }
        C58785rx rxVar3 = (C58785rx) this.f54576g.mo55009a(valueOf, nVar);
        if (rxVar3 != null) {
            for (C58784rw rwVar : rxVar3.mo55016g()) {
                int intValue = ((Integer) rwVar.mo55972b()).intValue();
                C60214n nVar2 = (C60214n) rwVar.mo55971a();
                if (!rxVar.mo55021k(Integer.valueOf(intValue), nVar2)) {
                    mo24942b(intValue, nVar2, rxVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo24943c() {
        this.f54571b = 0;
        this.f54575f.mo55019i();
        this.f54576g.mo55019i();
    }

    /* renamed from: d */
    public final synchronized void mo24944d(int i, C60214n nVar, C58785rx rxVar) {
        this.f54576g.mo55010b(Integer.valueOf(i), nVar, rxVar);
    }

    /* renamed from: e */
    public final synchronized void mo24945e(int i, C60214n nVar, C19609f fVar) {
        this.f54575f.mo55010b(Integer.valueOf(i), nVar, fVar);
    }

    /* renamed from: f */
    public final boolean mo24946f() {
        return this.f54574e && this.f54572c > 0 && this.f54573d > 0;
    }
}
