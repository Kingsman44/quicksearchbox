package com.google.android.apps.gsa.staticplugins.opa.morris2.p8384e;

import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.e.e */
/* compiled from: PG */
public final /* synthetic */ class C109515e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109517g f305020a;

    /* renamed from: b */
    public final /* synthetic */ StatusBarNotification f305021b;

    public /* synthetic */ C109515e(C109517g gVar, StatusBarNotification statusBarNotification) {
        this.f305020a = gVar;
        this.f305021b = statusBarNotification;
    }

    public final void run() {
        C109517g gVar = this.f305020a;
        StatusBarNotification statusBarNotification = this.f305021b;
        C58976aa aaVar = C58975e.f156826a;
        statusBarNotification.getKey();
        gVar.mo97881h(C87739bu.DELIVER_REMOVED_NOTIFICATIONS, "removed_notifications", statusBarNotification);
    }
}
