package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.aj */
/* compiled from: PG */
public final /* synthetic */ class C98605aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C98610ao f275395a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f275396b;

    public /* synthetic */ C98605aj(C98610ao aoVar, C60870cx cxVar) {
        this.f275395a = aoVar;
        this.f275396b = cxVar;
    }

    public final void run() {
        C98610ao aoVar = this.f275395a;
        this.f275396b.cancel(true);
        aoVar.mo91218a();
    }
}
