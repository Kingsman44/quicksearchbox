package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.j.j */
/* compiled from: PG */
public final /* synthetic */ class C95704j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95706l f267940a;

    /* renamed from: b */
    public final /* synthetic */ C90427h f267941b;

    public /* synthetic */ C95704j(C95706l lVar, C90427h hVar) {
        this.f267940a = lVar;
        this.f267941b = hVar;
    }

    public final void run() {
        C95706l lVar = this.f267940a;
        C90427h hVar = this.f267941b;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (lVar.f267946d) {
            C95696b b = lVar.mo89660b(hVar);
            if (b.f267920b != 0) {
                b.mo89650a(1, (Long) null);
            }
        }
    }
}
