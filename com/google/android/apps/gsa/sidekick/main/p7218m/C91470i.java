package com.google.android.apps.gsa.sidekick.main.p7218m;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.p375ai.p378b.C7744ii;

/* renamed from: com.google.android.apps.gsa.sidekick.main.m.i */
/* compiled from: PG */
public final /* synthetic */ class C91470i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C91473l f255134a;

    /* renamed from: b */
    public final /* synthetic */ C7744ii f255135b;

    public /* synthetic */ C91470i(C91473l lVar, C7744ii iiVar) {
        this.f255134a = lVar;
        this.f255135b = iiVar;
    }

    public final void run() {
        C91473l lVar = this.f255134a;
        C7744ii iiVar = this.f255135b;
        int size = lVar.f255139c.size();
        C91472k[] kVarArr = new C91472k[size];
        lVar.f255139c.toArray(kVarArr);
        for (int i = 0; i < size; i++) {
            C91472k kVar = kVarArr[i];
            if (lVar.f255145i != 0) {
                kVar.mo85819b();
            } else if (iiVar != null) {
                kVar.mo85818a();
            }
        }
    }
}
