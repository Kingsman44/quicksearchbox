package com.google.android.apps.gsa.staticplugins.p7453bi.p7455b;

import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bi.b.h */
/* compiled from: PG */
public final /* synthetic */ class C94608h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f264610a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f264611b;

    public /* synthetic */ C94608h(C58833ax axVar, C60870cx cxVar) {
        this.f264610a = axVar;
        this.f264611b = cxVar;
    }

    public final void run() {
        C58833ax axVar = this.f264610a;
        C60870cx cxVar = this.f264611b;
        if (((C60870cx) axVar.mo56107c()).isCancelled()) {
            cxVar.cancel(true);
        }
    }
}
