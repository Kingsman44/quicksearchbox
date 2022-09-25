package com.google.android.gms.measurement.internal;

import java.lang.Thread;

/* renamed from: com.google.android.gms.measurement.internal.ez */
/* compiled from: PG */
final class C145354ez implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ C145358fc f392899a;

    /* renamed from: b */
    private final String f392900b;

    public C145354ez(C145358fc fcVar, String str) {
        this.f392899a = fcVar;
        this.f392900b = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f392899a.f393011w.mo120965ar().f392795c.mo120895b(this.f392900b, th);
    }
}
