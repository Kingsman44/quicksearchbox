package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d;

import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.assistant.p3897e.p3910e.p3911a.C51197l;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.a.d.b */
/* compiled from: PG */
public final /* synthetic */ class C119683b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119692k f333482a;

    /* renamed from: b */
    public final /* synthetic */ C51197l f333483b;

    public /* synthetic */ C119683b(C119692k kVar, C51197l lVar) {
        this.f333482a = kVar;
        this.f333483b = lVar;
    }

    public final void run() {
        C119692k kVar = this.f333482a;
        C51197l lVar = this.f333483b;
        if (!kVar.f333504h) {
            C58976aa aaVar = C58975e.f156826a;
            C32534ai a = kVar.mo104481a(lVar.f133286b);
            a.mo38137d(lVar);
            if ((lVar.f133285a & 8) != 0 && lVar.f133288d) {
                String str = lVar.f133286b;
                a.mo38135c((Throwable) null);
            }
        }
    }
}
