package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.C70898m;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.bw */
/* compiled from: PG */
public class C70407bw extends C70898m {

    /* renamed from: c */
    private static final Logger f187626c = Logger.getLogger(C70407bw.class.getName());

    /* renamed from: d */
    private static final C70898m f187627d = new C70400bp();

    /* renamed from: a */
    public final C70148al f187628a;

    /* renamed from: b */
    public C70898m f187629b;

    /* renamed from: e */
    private final ScheduledFuture f187630e;

    /* renamed from: f */
    private final Executor f187631f;

    /* renamed from: g */
    private volatile boolean f187632g;

    /* renamed from: h */
    private C70897l f187633h;

    /* renamed from: i */
    private Status f187634i;

    /* renamed from: j */
    private List f187635j = new ArrayList();

    /* renamed from: k */
    private C70406bv f187636k;

    protected C70407bw(Executor executor, ScheduledExecutorService scheduledExecutorService, C70153aq aqVar) {
        ScheduledFuture<?> scheduledFuture;
        C58838bb.m90866a(executor, "callExecutor");
        this.f187631f = executor;
        C58838bb.m90866a(scheduledExecutorService, "scheduler");
        C70148al m = C70148al.m102135m();
        this.f187628a = m;
        C70153aq b = m.mo61697b();
        if (aqVar == null && b == null) {
            scheduledFuture = null;
        } else {
            long min = aqVar != null ? Math.min(Long.MAX_VALUE, aqVar.mo61720b(TimeUnit.NANOSECONDS)) : Long.MAX_VALUE;
            if (b != null && b.mo61720b(TimeUnit.NANOSECONDS) < min) {
                min = b.mo61720b(TimeUnit.NANOSECONDS);
                Logger logger = f187626c;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(String.format(Locale.US, "Call timeout set to '%d' ns, due to context deadline.", new Object[]{Long.valueOf(min)}));
                    if (aqVar == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(Locale.US, " Explicit call timeout was '%d' ns.", new Object[]{Long.valueOf(aqVar.mo61720b(TimeUnit.NANOSECONDS))}));
                    }
                    logger.logp(Level.FINE, "io.grpc.internal.DelayedClientCall", "scheduleDeadlineIfNeeded", sb.toString());
                }
            }
            long abs = Math.abs(min) / TimeUnit.SECONDS.toNanos(1);
            long abs2 = Math.abs(min) % TimeUnit.SECONDS.toNanos(1);
            StringBuilder sb2 = new StringBuilder();
            if (min < 0) {
                sb2.append("ClientCall started after deadline exceeded. Deadline exceeded after -");
            } else {
                sb2.append("Deadline exceeded after ");
            }
            sb2.append(abs);
            sb2.append(String.format(Locale.US, ".%09d", new Object[]{Long.valueOf(abs2)}));
            sb2.append("s. ");
            scheduledFuture = scheduledExecutorService.schedule(new C70393bi(this, sb2), min, TimeUnit.NANOSECONDS);
        }
        this.f187630e = scheduledFuture;
    }

    /* renamed from: l */
    private final void m102737l(Runnable runnable) {
        synchronized (this) {
            if (!this.f187632g) {
                this.f187635j.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public final void mo27478a(C70897l lVar, C70334de deVar) {
        Status status;
        boolean z;
        C58838bb.m90884s(this.f187633h == null, "already started");
        synchronized (this) {
            C58838bb.m90866a(lVar, "listener");
            this.f187633h = lVar;
            status = this.f187634i;
            z = this.f187632g;
            if (!z) {
                C70406bv bvVar = new C70406bv(lVar);
                this.f187636k = bvVar;
                lVar = bvVar;
            }
        }
        if (status != null) {
            this.f187631f.execute(new C70401bq(this, lVar, status));
        } else if (z) {
            this.f187629b.mo27478a(lVar, deVar);
        } else {
            m102737l(new C70395bk(this, lVar, deVar));
        }
    }

    /* renamed from: b */
    public final C70256c mo62057b() {
        C70898m mVar;
        synchronized (this) {
            mVar = this.f187629b;
        }
        if (mVar != null) {
            return mVar.mo62057b();
        }
        return C70256c.f187254a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo62120c() {
    }

    /* renamed from: d */
    public final void mo27480d(String str, Throwable th) {
        Status status;
        Status status2 = Status.f186904b;
        if (str != null) {
            status = status2.withDescription(str);
        } else {
            status = status2.withDescription("Call cancelled without message");
        }
        if (th != null) {
            status = status.mo61678e(th);
        }
        mo62121e(status, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r4 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r2.f187631f.execute(new p5488io.grpc.p5525e.C70401bq(r2, r4, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        mo62122j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        mo62120c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r0 == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        m102737l(new p5488io.grpc.p5525e.C70396bl(r2, r3));
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62121e(p5488io.grpc.Status r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            io.grpc.m r0 = r2.f187629b     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0010
            io.grpc.m r4 = f187627d     // Catch:{ all -> 0x0035 }
            r2.mo62123k(r4)     // Catch:{ all -> 0x0035 }
            io.grpc.l r4 = r2.f187633h     // Catch:{ all -> 0x0035 }
            r2.f187634i = r3     // Catch:{ all -> 0x0035 }
            r0 = 0
            goto L_0x0014
        L_0x0010:
            if (r4 != 0) goto L_0x0033
            r0 = 1
            r4 = 0
        L_0x0014:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0020
            io.grpc.e.bl r4 = new io.grpc.e.bl
            r4.<init>(r2, r3)
            r2.m102737l(r4)
            goto L_0x002f
        L_0x0020:
            if (r4 == 0) goto L_0x002c
            java.util.concurrent.Executor r0 = r2.f187631f
            io.grpc.e.bq r1 = new io.grpc.e.bq
            r1.<init>(r2, r4, r3)
            r0.execute(r1)
        L_0x002c:
            r2.mo62122j()
        L_0x002f:
            r2.mo62120c()
            return
        L_0x0033:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70407bw.mo62121e(io.grpc.Status, boolean):void");
    }

    /* renamed from: f */
    public final void mo27481f() {
        m102737l(new C70399bo(this));
    }

    /* renamed from: g */
    public final void mo27482g(int i) {
        if (this.f187632g) {
            this.f187629b.mo27482g(i);
        } else {
            m102737l(new C70398bn(this, i));
        }
    }

    /* renamed from: h */
    public final void mo27483h(Object obj) {
        if (this.f187632g) {
            this.f187629b.mo27483h(obj);
        } else {
            m102737l(new C70397bm(this, obj));
        }
    }

    /* renamed from: i */
    public final boolean mo62058i() {
        if (this.f187632g) {
            return this.f187629b.mo62058i();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.hasNext() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r3.f187631f.execute(new p5488io.grpc.p5525e.C70394bj(r3, r0));
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62122j() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r3)
            java.util.List r1 = r3.f187635j     // Catch:{ all -> 0x0042 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0024
            r0 = 0
            r3.f187635j = r0     // Catch:{ all -> 0x0042 }
            r0 = 1
            r3.f187632g = r0     // Catch:{ all -> 0x0042 }
            io.grpc.e.bv r0 = r3.f187636k     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0023
            java.util.concurrent.Executor r1 = r3.f187631f
            io.grpc.e.bj r2 = new io.grpc.e.bj
            r2.<init>(r3, r0)
            r1.execute(r2)
        L_0x0023:
            return
        L_0x0024:
            java.util.List r1 = r3.f187635j     // Catch:{ all -> 0x0042 }
            r3.f187635j = r0     // Catch:{ all -> 0x0042 }
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            java.util.Iterator r0 = r1.iterator()
        L_0x002d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L_0x002d
        L_0x003d:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x0042:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0045:
            throw r0
        L_0x0046:
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70407bw.mo62122j():void");
    }

    /* renamed from: k */
    public final void mo62123k(C70898m mVar) {
        C70898m mVar2 = this.f187629b;
        C58838bb.m90887v(mVar2 == null, "realCall already set to %s", mVar2);
        ScheduledFuture scheduledFuture = this.f187630e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f187629b = mVar;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("realCall", this.f187629b);
        return b.toString();
    }
}
