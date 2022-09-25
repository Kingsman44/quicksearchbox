package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.r */
/* compiled from: PG */
public final /* synthetic */ class C123070r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C123078z f340629a;

    /* renamed from: b */
    public final /* synthetic */ C60888db f340630b;

    public /* synthetic */ C123070r(C123078z zVar, C60888db dbVar) {
        this.f340629a = zVar;
        this.f340630b = dbVar;
    }

    public final void run() {
        C123078z zVar = this.f340629a;
        C60888db dbVar = this.f340630b;
        synchronized (zVar.f340641c) {
            zVar.f340642d = null;
            zVar.f340643e.cancel(false);
            zVar.f340643e = dbVar.mo29165e(new C123076x(new C123068p(zVar)), C123078z.f340640b.toMillis(), TimeUnit.MILLISECONDS);
            C123047cn.m202382b(zVar.f340643e, C123069q.f340628a, C60826bg.f164896a);
        }
    }
}
