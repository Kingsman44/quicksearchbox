package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.fa */
/* compiled from: PG */
final class C145356fa extends FutureTask implements Comparable {

    /* renamed from: a */
    final boolean f392902a;

    /* renamed from: b */
    final /* synthetic */ C145358fc f392903b;

    /* renamed from: c */
    private final long f392904c;

    /* renamed from: d */
    private final String f392905d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145356fa(C145358fc fcVar, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.f392903b = fcVar;
        long andIncrement = C145358fc.f392910a.getAndIncrement();
        this.f392904c = andIncrement;
        this.f392905d = str;
        this.f392902a = z;
        if (andIncrement == Long.MAX_VALUE) {
            fcVar.f393011w.mo120965ar().f392795c.mo120894a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C145356fa faVar = (C145356fa) obj;
        boolean z = this.f392902a;
        if (z != faVar.f392902a) {
            return !z ? 1 : -1;
        }
        long j = this.f392904c;
        long j2 = faVar.f392904c;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f392903b.f393011w.mo120965ar().f392796d.mo120895b("Two tasks share the same index. index", Long.valueOf(this.f392904c));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f392903b.f393011w.mo120965ar().f392795c.mo120895b(this.f392905d, th);
        if ((th instanceof C145353ey) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145356fa(C145358fc fcVar, Callable callable, boolean z) {
        super(callable);
        this.f392903b = fcVar;
        long andIncrement = C145358fc.f392910a.getAndIncrement();
        this.f392904c = andIncrement;
        this.f392905d = "Task exception on worker thread";
        this.f392902a = z;
        if (andIncrement == Long.MAX_VALUE) {
            fcVar.f393011w.mo120965ar().f392795c.mo120894a("Tasks index overflow");
        }
    }
}
