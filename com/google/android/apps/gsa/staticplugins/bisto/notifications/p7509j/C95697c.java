package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j;

import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.j.c */
/* compiled from: PG */
public final /* synthetic */ class C95697c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95706l f267926a;

    /* renamed from: b */
    public final /* synthetic */ C90427h f267927b;

    public /* synthetic */ C95697c(C95706l lVar, C90427h hVar) {
        this.f267926a = lVar;
        this.f267927b = hVar;
    }

    public final void run() {
        C95706l lVar = this.f267926a;
        C90427h hVar = this.f267927b;
        C58976aa aaVar = C58975e.f156826a;
        synchronized (lVar.f267946d) {
            C95696b b = lVar.mo89660b(hVar);
            int i = b.f267920b;
            if (i == 0) {
                b.mo89650a(1, (Long) null);
            } else if (i != 3) {
                b.mo89650a(3, (Long) null);
            }
        }
    }
}
