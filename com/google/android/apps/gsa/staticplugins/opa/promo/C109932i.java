package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.app.Notification;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.i */
/* compiled from: PG */
public final /* synthetic */ class C109932i implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C109935l f306302a;

    /* renamed from: b */
    public final /* synthetic */ Notification f306303b;

    public /* synthetic */ C109932i(C109935l lVar, Notification notification) {
        this.f306302a = lVar;
        this.f306303b = notification;
    }

    public final void run() {
        C109935l lVar = this.f306302a;
        Notification notification = this.f306303b;
        if (lVar.mo98261c()) {
            lVar.f306309d.mo5003b("op", C89885b.OKHTTP_HTTP_PROXY_AUTH_VALUE, notification);
        }
    }
}
