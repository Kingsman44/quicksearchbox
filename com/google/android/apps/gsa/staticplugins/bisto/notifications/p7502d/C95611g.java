package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.g */
/* compiled from: PG */
public final /* synthetic */ class C95611g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95615k f267579a;

    /* renamed from: b */
    public final /* synthetic */ C83390g f267580b;

    public /* synthetic */ C95611g(C95615k kVar, C83390g gVar) {
        this.f267579a = kVar;
        this.f267580b = gVar;
    }

    public final void run() {
        boolean z;
        C95615k kVar = this.f267579a;
        C83390g gVar = this.f267580b;
        C58976aa aaVar = C58975e.f156826a;
        if (kVar.f267596i.get()) {
            gVar.mo76691b();
            return;
        }
        kVar.f267593f.mo83493h(gVar);
        StatusBarNotification[] g = kVar.f267593f.mo83492g();
        synchronized (kVar.f267588a) {
            long j = kVar.f267592e;
            if (g != null) {
                if (j != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (StatusBarNotification statusBarNotification : g) {
                        if (statusBarNotification.getPostTime() >= j) {
                            arrayList.add(statusBarNotification);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        g = null;
                    } else {
                        g = new StatusBarNotification[arrayList.size()];
                        arrayList.toArray(g);
                    }
                }
            }
            z = !kVar.f267589b;
            kVar.f267589b = true;
        }
        kVar.f267594g.mo89578a(g);
        if (g != null && g.length > 0 && !z) {
            kVar.mo89571k(g);
        }
    }
}
