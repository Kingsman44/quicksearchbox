package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.l */
/* compiled from: PG */
public final /* synthetic */ class C15517l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15519n f46476a;

    /* renamed from: b */
    public final /* synthetic */ boolean f46477b;

    public /* synthetic */ C15517l(C15519n nVar, boolean z) {
        this.f46476a = nVar;
        this.f46477b = z;
    }

    public final void run() {
        C15519n nVar = this.f46476a;
        boolean z = this.f46477b;
        if (nVar.f46483d) {
            C58976aa aaVar = C58975e.f156826a;
            if (z) {
                nVar.mo22383e("S3 request source closed");
                return;
            }
            C15527v.m32268b(nVar.f46481b, nVar.f46482c);
            nVar.f46481b.mo20121a();
            nVar.f46483d = false;
        }
    }
}
