package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.bz */
/* compiled from: PG */
final class C13773bz implements C13870dv {

    /* renamed from: a */
    final /* synthetic */ C13811cj f41959a;

    /* renamed from: b */
    private C13869du f41960b = C13869du.UNKNOWN;

    /* renamed from: c */
    private C13869du f41961c = C13869du.UNKNOWN;

    public C13773bz(C13811cj cjVar) {
        this.f41959a = cjVar;
    }

    /* renamed from: a */
    public final void mo21260a(C13871dw dwVar, C13869du duVar) {
        if (dwVar == C13871dw.NETWORK) {
            if (this.f41960b != duVar) {
                this.f41960b = duVar;
                if ((duVar == C13869du.SLOW || duVar == C13869du.NO_PROGRESS) && ((Boolean) this.f41959a.f42065i.mo17428b()).booleanValue()) {
                    C58976aa aaVar = C58975e.f156826a;
                    this.f41959a.f42072p.set(true);
                    this.f41959a.mo21264e();
                }
            } else {
                return;
            }
        }
        if (dwVar == C13871dw.EMBEDDED) {
            if (this.f41961c != duVar) {
                this.f41961c = duVar;
            } else {
                return;
            }
        }
        if (((Boolean) this.f41959a.f42073q.mo17428b()).booleanValue() && this.f41960b == C13869du.NO_PROGRESS && this.f41961c == C13869du.NO_PROGRESS) {
            C58976aa aaVar2 = C58975e.f156826a;
            this.f41959a.f42074r.mo21296g();
            this.f41959a.f42061e.f42086b.mo19974a(C37179a.f97477aw);
            C13889t tVar = this.f41959a.f42079w;
            if (tVar != null) {
                tVar.mo21340b();
            }
        }
    }
}
