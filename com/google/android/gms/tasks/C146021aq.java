package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.tasks.aq */
/* compiled from: PG */
public final class C146021aq {
    @Deprecated
    /* renamed from: a */
    public static C146006ab m237847a(Executor executor, Callable callable) {
        C143919bh.m233971n(executor, "Executor must not be null");
        C143919bh.m233971n(callable, "Callback must not be null");
        C146014aj ajVar = new C146014aj();
        executor.execute(new C146017am(ajVar, callable));
        return ajVar;
    }

    /* renamed from: b */
    public static C146006ab m237848b() {
        C146014aj ajVar = new C146014aj();
        ajVar.mo122511y();
        return ajVar;
    }

    /* renamed from: c */
    public static C146006ab m237849c(Exception exc) {
        C146014aj ajVar = new C146014aj();
        ajVar.mo122507u(exc);
        return ajVar;
    }

    /* renamed from: d */
    public static C146006ab m237850d(Object obj) {
        C146014aj ajVar = new C146014aj();
        ajVar.mo122508v(obj);
        return ajVar;
    }

    /* renamed from: e */
    public static C146006ab m237851e(C146006ab abVar, long j, TimeUnit timeUnit) {
        C143919bh.m233971n(abVar, "Task must not be null");
        C143919bh.m233960c(j > 0, "Timeout must be positive");
        C143919bh.m233971n(timeUnit, "TimeUnit must not be null");
        C146023c cVar = new C146023c();
        C146010af afVar = new C146010af(cVar);
        C144861c cVar2 = new C144861c(Looper.getMainLooper());
        cVar2.postDelayed(new C146015ak(afVar), timeUnit.toMillis(j));
        abVar.mo122497p(new C146016al(cVar2, afVar, cVar));
        return afVar.f394698a;
    }

    /* renamed from: f */
    public static Object m237852f(C146006ab abVar) {
        C143919bh.m233965h("Must not be called on the main application thread");
        C143919bh.m233971n(abVar, "Task must not be null");
        if (abVar.mo122490i()) {
            return m237855i(abVar);
        }
        C146018an anVar = new C146018an();
        m237854h(abVar, anVar);
        anVar.f394714a.await();
        return m237855i(abVar);
    }

    /* renamed from: g */
    public static Object m237853g(C146006ab abVar, long j, TimeUnit timeUnit) {
        C143919bh.m233965h("Must not be called on the main application thread");
        C143919bh.m233971n(abVar, "Task must not be null");
        C143919bh.m233971n(timeUnit, "TimeUnit must not be null");
        if (abVar.mo122490i()) {
            return m237855i(abVar);
        }
        C146018an anVar = new C146018an();
        m237854h(abVar, anVar);
        if (anVar.f394714a.await(j, timeUnit)) {
            return m237855i(abVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* renamed from: h */
    public static void m237854h(C146006ab abVar, C146019ao aoVar) {
        abVar.mo122495n(C146013ai.f394701b, aoVar);
        abVar.mo122494m(C146013ai.f394701b, aoVar);
        abVar.mo122492k(C146013ai.f394701b, aoVar);
    }

    /* renamed from: i */
    private static Object m237855i(C146006ab abVar) {
        if (abVar.mo122491j()) {
            return abVar.mo122488g();
        }
        if (abVar.mo122489h()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abVar.mo122487f());
    }
}
