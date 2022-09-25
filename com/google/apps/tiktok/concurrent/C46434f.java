package com.google.apps.tiktok.concurrent;

import com.google.apps.tiktok.tracing.C47822fd;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.concurrent.f */
/* compiled from: PG */
public final /* synthetic */ class C46434f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f121509a;

    /* renamed from: b */
    public final /* synthetic */ long f121510b;

    /* renamed from: c */
    public final /* synthetic */ TimeUnit f121511c;

    public /* synthetic */ C46434f(C60870cx cxVar, long j, TimeUnit timeUnit) {
        this.f121509a = cxVar;
        this.f121510b = j;
        this.f121511c = timeUnit;
    }

    public final void run() {
        C60870cx cxVar = this.f121509a;
        long j = this.f121510b;
        TimeUnit timeUnit = this.f121511c;
        if (!cxVar.isDone()) {
            ((C59052c) ((C59052c) ((C59052c) C46459k.f121564a.mo56225c()).mo56382g(C47822fd.m84997c())).mo56372aa(54724)).mo56359L("Timeout exceeded waiting on crashApplicationOnFailure future. Waited %s %s. Allowing future %s to continue anyway.", Long.valueOf(j), timeUnit, cxVar);
        }
    }
}
