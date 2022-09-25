package com.google.android.apps.gsa.staticplugins.opa.morris2.p8384e;

import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.e.b */
/* compiled from: PG */
public final /* synthetic */ class C109512b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109517g f305014a;

    /* renamed from: b */
    public final /* synthetic */ StatusBarNotification f305015b;

    public /* synthetic */ C109512b(C109517g gVar, StatusBarNotification statusBarNotification) {
        this.f305014a = gVar;
        this.f305015b = statusBarNotification;
    }

    public final void run() {
        C109517g gVar = this.f305014a;
        StatusBarNotification statusBarNotification = this.f305015b;
        C58976aa aaVar = C58975e.f156826a;
        statusBarNotification.getKey();
        if (gVar.f305029e.mo85405j(C90051dc.f248894bw)) {
            gVar.mo97882i(C87739bu.DELIVER_SINGLE_PARSED_MORRIS_NOTIFICATION, statusBarNotification);
            return;
        }
        gVar.mo97881h(C87739bu.DELIVER_MORRIS_NOTIFICATION, "active_notifications", statusBarNotification);
    }
}
