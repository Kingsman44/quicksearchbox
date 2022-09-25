package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.measurement.internal.fc */
/* compiled from: PG */
public final class C145358fc extends C145381fz {

    /* renamed from: a */
    public static final AtomicLong f392910a = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: b */
    public C145357fb f392911b;

    /* renamed from: c */
    public C145357fb f392912c;

    /* renamed from: d */
    public final Object f392913d = new Object();

    /* renamed from: e */
    public final Semaphore f392914e = new Semaphore(2);

    /* renamed from: f */
    public volatile boolean f392915f;

    /* renamed from: g */
    private final PriorityBlockingQueue f392916g = new PriorityBlockingQueue();

    /* renamed from: h */
    private final BlockingQueue f392917h = new LinkedBlockingQueue();

    /* renamed from: i */
    private final Thread.UncaughtExceptionHandler f392918i = new C145354ez(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: j */
    private final Thread.UncaughtExceptionHandler f392919j = new C145354ez(this, "Thread death: Uncaught exception on network thread");

    public C145358fc(C145361ff ffVar) {
        super(ffVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2.f393011w.mo120965ar().f392798f.mo120894a("Timed out waiting for ".concat(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4 = r2.f393011w.mo120965ar().f392798f;
        r4.mo120894a("Interrupted waiting for " + r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r3 = r3.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r3 != null) goto L_0x0027;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0028 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo120956a(java.util.concurrent.atomic.AtomicReference r3, long r4, java.lang.String r6, java.lang.Runnable r7) {
        /*
            r2 = this;
            java.lang.String r0 = "Interrupted waiting for "
            monitor-enter(r3)
            com.google.android.gms.measurement.internal.ff r1 = r2.f393011w     // Catch:{ all -> 0x0042 }
            com.google.android.gms.measurement.internal.fc r1 = r1.mo120966as()     // Catch:{ all -> 0x0042 }
            r1.mo120960h(r7)     // Catch:{ all -> 0x0042 }
            r3.wait(r4)     // Catch:{ InterruptedException -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L_0x0027
            com.google.android.gms.measurement.internal.ff r4 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()
            com.google.android.gms.measurement.internal.dv r4 = r4.f392798f
            java.lang.String r5 = "Timed out waiting for "
            java.lang.String r5 = r5.concat(r6)
            r4.mo120894a(r5)
        L_0x0027:
            return r3
        L_0x0028:
            com.google.android.gms.measurement.internal.ff r4 = r2.f393011w     // Catch:{ all -> 0x0042 }
            com.google.android.gms.measurement.internal.dx r4 = r4.mo120965ar()     // Catch:{ all -> 0x0042 }
            com.google.android.gms.measurement.internal.dv r4 = r4.f392798f     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r5.<init>(r0)     // Catch:{ all -> 0x0042 }
            r5.append(r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0042 }
            r4.mo120894a(r5)     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            r3 = 0
            return r3
        L_0x0042:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145358fc.mo120956a(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo120834b() {
        return false;
    }

    /* renamed from: c */
    public final Future mo120957c(Callable callable) {
        mo121002k();
        C143919bh.m233958a(callable);
        C145356fa faVar = new C145356fa(this, callable, false);
        if (Thread.currentThread() == this.f392911b) {
            if (!this.f392916g.isEmpty()) {
                this.f393011w.mo120965ar().f392798f.mo120894a("Callable skipped the worker queue.");
            }
            faVar.run();
        } else {
            mo120958d(faVar);
        }
        return faVar;
    }

    /* renamed from: d */
    public final void mo120958d(C145356fa faVar) {
        synchronized (this.f392913d) {
            this.f392916g.add(faVar);
            C145357fb fbVar = this.f392911b;
            if (fbVar == null) {
                C145357fb fbVar2 = new C145357fb(this, "Measurement Worker", this.f392916g);
                this.f392911b = fbVar2;
                fbVar2.setUncaughtExceptionHandler(this.f392918i);
                this.f392911b.start();
            } else {
                fbVar.mo120954a();
            }
        }
    }

    /* renamed from: f */
    public final void mo120959f(Runnable runnable) {
        mo121002k();
        C143919bh.m233958a(runnable);
        C145356fa faVar = new C145356fa(this, runnable, false, "Task exception on network thread");
        synchronized (this.f392913d) {
            this.f392917h.add(faVar);
            C145357fb fbVar = this.f392912c;
            if (fbVar == null) {
                C145357fb fbVar2 = new C145357fb(this, "Measurement Network", this.f392917h);
                this.f392912c = fbVar2;
                fbVar2.setUncaughtExceptionHandler(this.f392919j);
                this.f392912c.start();
            } else {
                fbVar.mo120954a();
            }
        }
    }

    /* renamed from: g */
    public final void mo120904g() {
        if (Thread.currentThread() != this.f392911b) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: h */
    public final void mo120960h(Runnable runnable) {
        mo121002k();
        C143919bh.m233958a(runnable);
        mo120958d(new C145356fa(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: i */
    public final void mo120961i(Runnable runnable) {
        mo121002k();
        C143919bh.m233958a(runnable);
        mo120958d(new C145356fa(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: j */
    public final boolean mo120962j() {
        return Thread.currentThread() == this.f392911b;
    }
}
