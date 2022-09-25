package com.google.android.libraries.lens.view.p2113h.p2122e;

import com.google.android.libraries.lens.view.p2113h.p2121d.C26747ap;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26763o;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26861d;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26878u;

/* renamed from: com.google.android.libraries.lens.view.h.e.l */
/* compiled from: PG */
public final /* synthetic */ class C26801l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f73066a;

    /* renamed from: b */
    public final /* synthetic */ C26763o f73067b;

    public /* synthetic */ C26801l(C26784ai aiVar, C26763o oVar) {
        this.f73066a = aiVar;
        this.f73067b = oVar;
    }

    public final void run() {
        C26784ai aiVar = this.f73066a;
        C26763o oVar = this.f73067b;
        aiVar.f73022n = oVar;
        C26878u uVar = aiVar.f73017i;
        if (uVar != null) {
            C26747ap f = oVar.mo32102f();
            if (f != uVar.f73236Y) {
                uVar.f73252n.execute(new C26861d(uVar, f));
                return;
            }
            return;
        }
        aiVar.mo32150s(false);
    }
}
