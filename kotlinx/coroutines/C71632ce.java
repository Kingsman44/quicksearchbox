package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.p5579e.C71725g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ce */
/* compiled from: PG */
public final class C71632ce extends C71631cd implements C71606bg {

    /* renamed from: c */
    private final Executor f191074c;

    public C71632ce(Executor executor) {
        C69664n.m101061g(executor, "executor");
        this.f191074c = executor;
        C71725g.m104879a(executor);
    }

    /* renamed from: c */
    private static final void m104604c(C69585o oVar, RejectedExecutionException rejectedExecutionException) {
        C71647ct.m104639c(oVar, C71629cb.m104602a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: h */
    private static final ScheduledFuture m104605h(ScheduledExecutorService scheduledExecutorService, Runnable runnable, C69585o oVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            m104604c(oVar, e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo62765a(long j, C71807q qVar) {
        Executor executor = this.f191074c;
        ScheduledFuture scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = m104605h(scheduledExecutorService, new C71678dn(this, qVar), ((C71808r) qVar).f191338b, j);
        }
        if (scheduledFuture != null) {
            qVar.mo63035f(new C71804n(scheduledFuture));
        } else {
            C71602bc.f191039c.mo62765a(j, qVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r3 = this;
            java.util.concurrent.Executor r0 = r3.f191074c
            r1 = 1
            boolean r2 = r0 instanceof java.util.concurrent.ExecutorService
            if (r1 == r2) goto L_0x0008
            r0 = 0
        L_0x0008:
            if (r0 == 0) goto L_0x000d
            r0.shutdown()
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71632ce.close():void");
    }

    /* renamed from: d */
    public final void mo62766d(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(runnable, "block");
        try {
            this.f191074c.execute(runnable);
        } catch (RejectedExecutionException e) {
            m104604c(oVar, e);
            C71613bn.f191049c.mo62766d(oVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C71632ce) && ((C71632ce) obj).f191074c == this.f191074c;
    }

    /* renamed from: g */
    public final C71615bp mo62769g(long j, Runnable runnable, C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        Executor executor = this.f191074c;
        ScheduledFuture scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = m104605h(scheduledExecutorService, runnable, oVar, j);
        }
        if (scheduledFuture != null) {
            return new C71614bo(scheduledFuture);
        }
        return C71602bc.f191039c.mo62769g(j, runnable, oVar);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f191074c);
    }

    public final String toString() {
        return this.f191074c.toString();
    }
}
