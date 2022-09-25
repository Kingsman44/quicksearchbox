package com.google.android.apps.gsa.staticplugins.opa.morris2.p8384e;

import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.e.d */
/* compiled from: PG */
public final /* synthetic */ class C109514d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C109517g f305018a;

    /* renamed from: b */
    public final /* synthetic */ C83390g f305019b;

    public /* synthetic */ C109514d(C109517g gVar, C83390g gVar2) {
        this.f305018a = gVar;
        this.f305019b = gVar2;
    }

    public final void run() {
        C109517g gVar = this.f305018a;
        C83390g gVar2 = this.f305019b;
        C58976aa aaVar = C58975e.f156826a;
        gVar.f305028d.mo83493h(gVar2);
        if (gVar.f305029e.mo85405j(C90051dc.f248894bw)) {
            gVar.mo97882i(C87739bu.DELIVER_PARSED_MORRIS_NOTIFICATION, gVar.f305028d.mo83492g());
        } else {
            gVar.mo97881h(C87739bu.DELIVER_ACTIVE_NOTIFICATIONS, "active_notifications", gVar.f305028d.mo83492g());
        }
    }
}
