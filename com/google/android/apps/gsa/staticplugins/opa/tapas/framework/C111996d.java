package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.d */
/* compiled from: PG */
public final /* synthetic */ class C111996d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f311142a;

    public /* synthetic */ C111996d(C60870cx cxVar) {
        this.f311142a = cxVar;
    }

    public final void run() {
        this.f311142a.cancel(true);
    }
}
