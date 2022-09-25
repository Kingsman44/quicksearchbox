package com.google.android.libraries.geller.p1818f;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62963cj;
import com.google.protos.p5129p.p5130a.C65720e;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.geller.f.bv */
/* compiled from: PG */
public final /* synthetic */ class C21839bv implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C21841bx f60265a;

    /* renamed from: b */
    public final /* synthetic */ C65720e f60266b;

    public /* synthetic */ C21839bv(C21841bx bxVar, C65720e eVar) {
        this.f60265a = bxVar;
        this.f60266b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx a;
        C21841bx bxVar = this.f60265a;
        C65720e eVar = this.f60266b;
        synchronized (bxVar.f60272b) {
            bxVar.f60274d.keySet().removeAll(new C62963cj(eVar.f178553b, C65720e.f178549c));
            a = bxVar.f60271a.mo27127a(eVar);
            for (C65753ak put : new C62963cj(eVar.f178553b, C65720e.f178549c)) {
                bxVar.f60273c.put(put, a);
            }
        }
        return a;
    }
}
