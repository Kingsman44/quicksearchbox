package com.google.android.apps.search.podcasts.p10573k.p10574a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.podcasts.k.a.b */
/* compiled from: PG */
public final /* synthetic */ class C140423b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C140433l f381438a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f381439b;

    public /* synthetic */ C140423b(C140433l lVar, Runnable runnable) {
        this.f381438a = lVar;
        this.f381439b = runnable;
    }

    public final void run() {
        C140433l lVar = this.f381438a;
        Runnable runnable = this.f381439b;
        if (((Boolean) lVar.f381470l.mo6453a()).booleanValue()) {
            if (lVar.f381471m == null) {
                lVar.f381462d.add(runnable);
                C58976aa aaVar = C58975e.f156826a;
                lVar.f381465g.bindService(C140433l.f381461c, lVar.f381464f, 1);
                return;
            }
            lVar.f381463e = lVar.f381469k.mo26871c();
            runnable.run();
        }
    }
}
