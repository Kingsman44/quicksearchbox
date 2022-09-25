package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.os.Bundle;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.cy */
/* compiled from: PG */
public final /* synthetic */ class C102970cy implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C102971cz f287537a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f287538b;

    /* renamed from: c */
    public final /* synthetic */ int f287539c;

    public /* synthetic */ C102970cy(C102971cz czVar, Bundle bundle, int i) {
        this.f287537a = czVar;
        this.f287538b = bundle;
        this.f287539c = i;
    }

    public final void run() {
        C102971cz czVar = this.f287537a;
        Bundle bundle = this.f287538b;
        int i = this.f287539c;
        if (czVar.f287543d == null) {
            czVar.f287543d = czVar.f287542c.mo17630a(bundle, czVar.f287540a, C58833ax.m90834k(czVar.f287541b));
            czVar.f287543d.onCreate();
        }
        czVar.f287543d.onShow(bundle, i);
    }
}
