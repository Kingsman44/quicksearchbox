package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.cj */
/* compiled from: PG */
public final class C60856cj extends C60863cq {
    /* renamed from: a */
    public static C60852cf m92892a(Iterable iterable) {
        return new C60852cf(false, C58485gu.m89841i(iterable));
    }

    @SafeVarargs
    /* renamed from: b */
    public static C60852cf m92893b(C60870cx... cxVarArr) {
        return new C60852cf(false, C58485gu.m89844l(cxVarArr));
    }

    /* renamed from: c */
    public static C60852cf m92894c(Iterable iterable) {
        return new C60852cf(true, C58485gu.m89841i(iterable));
    }

    @SafeVarargs
    /* renamed from: d */
    public static C60852cf m92895d(C60870cx... cxVarArr) {
        return new C60852cf(true, C58485gu.m89844l(cxVarArr));
    }

    /* renamed from: e */
    public static C60870cx m92896e(Iterable iterable) {
        return new C60818az(C58485gu.m89841i(iterable), true);
    }

    @SafeVarargs
    /* renamed from: f */
    public static C60870cx m92897f(C60870cx... cxVarArr) {
        return new C60818az(C58485gu.m89844l(cxVarArr), true);
    }

    /* renamed from: g */
    public static C60870cx m92898g() {
        C60864cr crVar = C60864cr.f164954a;
        if (crVar != null) {
            return crVar;
        }
        return new C60864cr();
    }

    /* renamed from: i */
    public static C60870cx m92900i(Object obj) {
        if (obj == null) {
            return C60866ct.f164955a;
        }
        return new C60866ct(obj);
    }

    /* renamed from: j */
    public static C60870cx m92901j(C60870cx cxVar) {
        if (cxVar.isDone()) {
            return cxVar;
        }
        C60855ci ciVar = new C60855ci(cxVar);
        cxVar.mo4106b(ciVar, C60826bg.f164896a);
        return ciVar;
    }

    /* renamed from: k */
    public static C60870cx m92902k(C60930r rVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C60915eb ebVar = new C60915eb(rVar);
        ebVar.mo4106b(new C60847ca(scheduledExecutorService.schedule(ebVar, j, timeUnit)), C60826bg.f164896a);
        return ebVar;
    }

    /* renamed from: l */
    public static C60870cx m92903l(Runnable runnable, Executor executor) {
        C60915eb e = C60915eb.m93031e(runnable, (Object) null);
        executor.execute(e);
        return e;
    }

    /* renamed from: m */
    public static C60870cx m92904m(Callable callable, Executor executor) {
        C60915eb ebVar = new C60915eb(callable);
        executor.execute(ebVar);
        return ebVar;
    }

    /* renamed from: n */
    public static C60870cx m92905n(C60930r rVar, Executor executor) {
        C60915eb ebVar = new C60915eb(rVar);
        executor.execute(ebVar);
        return ebVar;
    }

    /* renamed from: o */
    public static C60870cx m92906o(Iterable iterable) {
        return new C60818az(C58485gu.m89841i(iterable), false);
    }

    @SafeVarargs
    /* renamed from: p */
    public static C60870cx m92907p(C60870cx... cxVarArr) {
        return new C60818az(C58485gu.m89844l(cxVarArr), false);
    }

    /* renamed from: q */
    public static C60870cx m92908q(C60870cx cxVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (cxVar.isDone()) {
            return cxVar;
        }
        C60911dy dyVar = new C60911dy(cxVar);
        C60909dw dwVar = new C60909dw(dyVar);
        dyVar.f165026b = scheduledExecutorService.schedule(dwVar, j, timeUnit);
        cxVar.mo4106b(dwVar, C60826bg.f164896a);
        return dyVar;
    }

    /* renamed from: r */
    public static Object m92909r(Future future) {
        C58838bb.m90887v(future.isDone(), "Future was expected to be done: %s", future);
        return C60917ed.m93034a(future);
    }

    /* renamed from: u */
    public static void m92912u(C60870cx cxVar, Future future) {
        if (cxVar instanceof C60873d) {
            ((C60873d) cxVar).mo57355m(future);
        } else if (cxVar != null && cxVar.isCancelled() && future != null) {
            future.cancel(false);
        }
    }

    /* renamed from: h */
    public static C60870cx m92899h(Throwable th) {
        th.getClass();
        return new C60865cs(th);
    }

    /* renamed from: t */
    public static void m92911t(C60870cx cxVar, C60845bz bzVar, Executor executor) {
        bzVar.getClass();
        cxVar.mo4106b(new C60849cc(cxVar, bzVar), executor);
    }

    /* renamed from: s */
    public static Object m92910s(Future future) {
        future.getClass();
        try {
            return C60917ed.m93034a(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new C60827bh((Error) cause);
            }
            throw new C60916ec(cause);
        }
    }
}
