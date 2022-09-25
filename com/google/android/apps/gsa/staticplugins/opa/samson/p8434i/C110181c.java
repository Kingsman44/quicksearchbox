package com.google.android.apps.gsa.staticplugins.opa.samson.p8434i;

import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.notificationlistener.C83390g;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.i.c */
/* compiled from: PG */
public final /* synthetic */ class C110181c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C110183e f307015a;

    /* renamed from: b */
    public final /* synthetic */ C83390g f307016b;

    public /* synthetic */ C110181c(C110183e eVar, C83390g gVar) {
        this.f307015a = eVar;
        this.f307016b = gVar;
    }

    public final void run() {
        C110183e eVar = this.f307015a;
        C83390g gVar = this.f307016b;
        C58976aa aaVar = C58975e.f156826a;
        eVar.f307019a.mo83493h(gVar);
        StatusBarNotification[] g = eVar.f307019a.mo83492g();
        if (g != null && g.length != 0) {
            eVar.mo98458h(1, g);
        }
    }
}
