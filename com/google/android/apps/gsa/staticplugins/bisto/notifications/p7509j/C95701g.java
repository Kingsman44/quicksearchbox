package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.j.g */
/* compiled from: PG */
public final /* synthetic */ class C95701g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95706l f267935a;

    /* renamed from: b */
    public final /* synthetic */ C90427h f267936b;

    public /* synthetic */ C95701g(C95706l lVar, C90427h hVar) {
        this.f267935a = lVar;
        this.f267936b = hVar;
    }

    public final void run() {
        C95706l lVar = this.f267935a;
        C90427h hVar = this.f267936b;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (lVar.f267946d) {
            lVar.mo89660b(hVar).mo89650a(0, (Long) null);
        }
    }
}
