package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.ai */
/* compiled from: PG */
public final /* synthetic */ class C98604ai implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C98610ao f275393a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f275394b;

    public /* synthetic */ C98604ai(C98610ao aoVar, C60870cx cxVar) {
        this.f275393a = aoVar;
        this.f275394b = cxVar;
    }

    public final void run() {
        C98610ao aoVar = this.f275393a;
        this.f275394b.cancel(true);
        aoVar.mo91218a();
    }
}
