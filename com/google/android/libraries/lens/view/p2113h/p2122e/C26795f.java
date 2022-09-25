package com.google.android.libraries.lens.view.p2113h.p2122e;

import com.google.android.libraries.lens.view.p2113h.p2115b.p2119d.C26715i;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26774z;
import com.google.android.libraries.lens.view.p2113h.p2126h.p2127a.C26878u;

/* renamed from: com.google.android.libraries.lens.view.h.e.f */
/* compiled from: PG */
public final /* synthetic */ class C26795f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26784ai f73058a;

    /* renamed from: b */
    public final /* synthetic */ boolean f73059b;

    public /* synthetic */ C26795f(C26784ai aiVar, boolean z) {
        this.f73058a = aiVar;
        this.f73059b = z;
    }

    public final void run() {
        C26784ai aiVar = this.f73058a;
        boolean z = this.f73059b;
        aiVar.f73014f = z;
        aiVar.mo32155y();
        if (!z) {
            aiVar.f73013e.incrementAndGet();
        }
        if (z) {
            aiVar.f72989Q.mo33207b();
        } else {
            aiVar.f72989Q.mo33206a();
        }
        synchronized (aiVar.f73016h) {
            C26878u uVar = aiVar.f73017i;
            if (uVar != null) {
                uVar.mo32249f(z);
            }
        }
        aiVar.f73032x.f72677m = z;
        if (aiVar.f72979G == C26774z.LENS_TELECAMERA) {
            C26715i iVar = (C26715i) aiVar.f73031w;
            if (z) {
                iVar.mo32028f();
            } else {
                iVar.mo32030h();
            }
        }
        if (z) {
            aiVar.f73034z.mo31949a(aiVar.f73033y.mo31955a());
        } else {
            aiVar.f73033y.mo31956b();
        }
    }
}
