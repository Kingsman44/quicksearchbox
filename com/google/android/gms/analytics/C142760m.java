package com.google.android.gms.analytics;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.analytics.m */
/* compiled from: PG */
final class C142760m extends FutureTask {

    /* renamed from: a */
    final /* synthetic */ C142761n f387395a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C142760m(C142761n nVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f387395a = nVar;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f387395a.f387396a.f387403f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            Log.e("GAv4", "MeasurementExecutor: job failed with ".concat(String.valueOf(String.valueOf(th))));
        }
        super.setException(th);
    }
}
