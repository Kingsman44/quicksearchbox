package p5488io.grpc.p5525e;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70277cf;
import p5488io.grpc.C70280ci;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70766ff;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.cc */
/* compiled from: PG */
final class C70414cc implements C70556hj {

    /* renamed from: a */
    public final Object f187654a = new Object();

    /* renamed from: b */
    public final C70766ff f187655b;

    /* renamed from: c */
    public Runnable f187656c;

    /* renamed from: d */
    public Runnable f187657d;

    /* renamed from: e */
    public Runnable f187658e;

    /* renamed from: f */
    public C70555hi f187659f;

    /* renamed from: g */
    public Collection f187660g = new LinkedHashSet();

    /* renamed from: h */
    public Status f187661h;

    /* renamed from: i */
    private final C70248bs f187662i = C70248bs.m102395a(C70248bs.m102396b(C70414cc.class), (String) null);

    /* renamed from: j */
    private final Executor f187663j;

    /* renamed from: k */
    private C70280ci f187664k;

    /* renamed from: l */
    private long f187665l;

    public C70414cc(Executor executor, C70766ff ffVar) {
        this.f187663j = executor;
        this.f187655b = ffVar;
    }

    /* renamed from: d */
    private final C70413cb m102756d(C70277cf cfVar, C70906u[] uVarArr) {
        int size;
        C70413cb cbVar = new C70413cb(this, cfVar, uVarArr);
        this.f187660g.add(cbVar);
        synchronized (this.f187654a) {
            size = this.f187660g.size();
        }
        if (size == 1) {
            this.f187655b.mo62446c(this.f187656c);
        }
        return cbVar;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = new java.util.ArrayList();
        r2 = r1.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r3 >= r2) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r4 = (p5488io.grpc.p5525e.C70413cb) r1.get(r3);
        r5 = r4.f187650a;
        r5 = r13.mo61957a();
        r6 = ((p5488io.grpc.p5525e.C70576ic) r4.f187650a).f188147a;
        r5 = p5488io.grpc.p5525e.C70460dv.m102875c(r5, r6.mo62572h());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        if (r5 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        r7 = r12.f187663j;
        r6 = r6.f189017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r6 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        r7 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r6 = r4.f187651b.mo61696a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8 = r4.f187650a;
        r5 = r5.mo61824e(((p5488io.grpc.p5525e.C70576ic) r8).f188149c, ((p5488io.grpc.p5525e.C70576ic) r8).f188148b, ((p5488io.grpc.p5525e.C70576ic) r8).f188147a, r4.f187652c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        r4.f187651b.mo61702f(r6);
        r5 = r4.mo62152q(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r5 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        r7.execute(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        r0.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007c, code lost:
        r4.f187651b.mo61702f(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        r13 = r12.f187654a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (mo62135b() != false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008e, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        r12.f187660g.removeAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        if (r12.f187660g.isEmpty() == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        r12.f187660g = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        if (mo62135b() != false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00aa, code lost:
        r12.f187655b.mo62446c(r12.f187657d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r12.f187661h == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b5, code lost:
        r0 = r12.f187658e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b7, code lost:
        if (r0 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        r12.f187655b.mo62446c(r0);
        r12.f187658e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c1, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c2, code lost:
        r12.f187655b.mo62445b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62134a(p5488io.grpc.C70280ci r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f187654a
            monitor-enter(r0)
            r12.f187664k = r13     // Catch:{ all -> 0x00cd }
            long r1 = r12.f187665l     // Catch:{ all -> 0x00cd }
            r3 = 1
            long r1 = r1 + r3
            r12.f187665l = r1     // Catch:{ all -> 0x00cd }
            if (r13 == 0) goto L_0x00cb
            boolean r1 = r12.mo62135b()     // Catch:{ all -> 0x00cd }
            if (r1 != 0) goto L_0x0016
            goto L_0x00cb
        L_0x0016:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00cd }
            java.util.Collection r2 = r12.f187660g     // Catch:{ all -> 0x00cd }
            r1.<init>(r2)     // Catch:{ all -> 0x00cd }
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r1.size()
            r3 = 0
        L_0x0028:
            if (r3 >= r2) goto L_0x0085
            java.lang.Object r4 = r1.get(r3)
            io.grpc.e.cb r4 = (p5488io.grpc.p5525e.C70413cb) r4
            io.grpc.cf r5 = r4.f187650a
            io.grpc.ce r5 = r13.mo61957a()
            io.grpc.cf r6 = r4.f187650a
            io.grpc.e.ic r6 = (p5488io.grpc.p5525e.C70576ic) r6
            io.grpc.i r6 = r6.f188147a
            boolean r7 = r6.mo62572h()
            io.grpc.e.ar r5 = p5488io.grpc.p5525e.C70460dv.m102875c(r5, r7)
            if (r5 == 0) goto L_0x0082
            java.util.concurrent.Executor r7 = r12.f187663j
            java.util.concurrent.Executor r6 = r6.f189017c
            if (r6 == 0) goto L_0x004d
            r7 = r6
        L_0x004d:
            io.grpc.al r6 = r4.f187651b
            io.grpc.al r6 = r6.mo61696a()
            io.grpc.cf r8 = r4.f187650a     // Catch:{ all -> 0x007b }
            r9 = r8
            io.grpc.e.ic r9 = (p5488io.grpc.p5525e.C70576ic) r9     // Catch:{ all -> 0x007b }
            io.grpc.di r9 = r9.f188149c     // Catch:{ all -> 0x007b }
            r10 = r8
            io.grpc.e.ic r10 = (p5488io.grpc.p5525e.C70576ic) r10     // Catch:{ all -> 0x007b }
            io.grpc.de r10 = r10.f188148b     // Catch:{ all -> 0x007b }
            io.grpc.e.ic r8 = (p5488io.grpc.p5525e.C70576ic) r8     // Catch:{ all -> 0x007b }
            io.grpc.i r8 = r8.f188147a     // Catch:{ all -> 0x007b }
            io.grpc.u[] r11 = r4.f187652c     // Catch:{ all -> 0x007b }
            io.grpc.e.ao r5 = r5.mo61824e(r9, r10, r8, r11)     // Catch:{ all -> 0x007b }
            io.grpc.al r8 = r4.f187651b
            r8.mo61702f(r6)
            java.lang.Runnable r5 = r4.mo62152q(r5)
            if (r5 == 0) goto L_0x0077
            r7.execute(r5)
        L_0x0077:
            r0.add(r4)
            goto L_0x0082
        L_0x007b:
            r13 = move-exception
            io.grpc.al r0 = r4.f187651b
            r0.mo61702f(r6)
            throw r13
        L_0x0082:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0085:
            java.lang.Object r13 = r12.f187654a
            monitor-enter(r13)
            boolean r1 = r12.mo62135b()     // Catch:{ all -> 0x00c8 }
            if (r1 != 0) goto L_0x0090
            monitor-exit(r13)     // Catch:{ all -> 0x00c8 }
            return
        L_0x0090:
            java.util.Collection r1 = r12.f187660g     // Catch:{ all -> 0x00c8 }
            r1.removeAll(r0)     // Catch:{ all -> 0x00c8 }
            java.util.Collection r0 = r12.f187660g     // Catch:{ all -> 0x00c8 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00a4
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch:{ all -> 0x00c8 }
            r0.<init>()     // Catch:{ all -> 0x00c8 }
            r12.f187660g = r0     // Catch:{ all -> 0x00c8 }
        L_0x00a4:
            boolean r0 = r12.mo62135b()     // Catch:{ all -> 0x00c8 }
            if (r0 != 0) goto L_0x00c1
            io.grpc.ff r0 = r12.f187655b     // Catch:{ all -> 0x00c8 }
            java.lang.Runnable r1 = r12.f187657d     // Catch:{ all -> 0x00c8 }
            r0.mo62446c(r1)     // Catch:{ all -> 0x00c8 }
            io.grpc.Status r0 = r12.f187661h     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c1
            java.lang.Runnable r0 = r12.f187658e     // Catch:{ all -> 0x00c8 }
            if (r0 == 0) goto L_0x00c1
            io.grpc.ff r1 = r12.f187655b     // Catch:{ all -> 0x00c8 }
            r1.mo62446c(r0)     // Catch:{ all -> 0x00c8 }
            r0 = 0
            r12.f187658e = r0     // Catch:{ all -> 0x00c8 }
        L_0x00c1:
            monitor-exit(r13)     // Catch:{ all -> 0x00c8 }
            io.grpc.ff r13 = r12.f187655b
            r13.mo62445b()
            return
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00c8 }
            throw r0
        L_0x00cb:
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            return
        L_0x00cd:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00cd }
            goto L_0x00d1
        L_0x00d0:
            throw r13
        L_0x00d1:
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70414cc.mo62134a(io.grpc.ci):void");
    }

    /* renamed from: b */
    public final boolean mo62135b() {
        boolean z;
        synchronized (this.f187654a) {
            z = !this.f187660g.isEmpty();
        }
        return z;
    }

    /* renamed from: c */
    public final C70248bs mo61901c() {
        return this.f187662i;
    }

    /* renamed from: e */
    public final C70372ao mo61824e(C70338di diVar, C70334de deVar, C70851i iVar, C70906u[] uVarArr) {
        C70372ao dfVar;
        C70766ff ffVar;
        try {
            C70576ic icVar = new C70576ic(diVar, deVar, iVar);
            C70280ci ciVar = null;
            long j = -1;
            while (true) {
                synchronized (this.f187654a) {
                    Status status = this.f187661h;
                    if (status != null) {
                        dfVar = new C70444df(status, C70373ap.PROCESSED, uVarArr);
                        ffVar = this.f187655b;
                        break;
                    }
                    C70280ci ciVar2 = this.f187664k;
                    if (ciVar2 == null) {
                        dfVar = m102756d(icVar, uVarArr);
                        ffVar = this.f187655b;
                        break;
                    }
                    if (ciVar != null) {
                        if (j == this.f187665l) {
                            dfVar = m102756d(icVar, uVarArr);
                            ffVar = this.f187655b;
                            break;
                        }
                    }
                    j = this.f187665l;
                    C70375ar c = C70460dv.m102875c(ciVar2.mo61957a(), iVar.mo62572h());
                    if (c != null) {
                        dfVar = c.mo61824e(icVar.f188149c, icVar.f188148b, icVar.f188147a, uVarArr);
                        ffVar = this.f187655b;
                        break;
                    }
                    ciVar = ciVar2;
                }
            }
            ffVar.mo62445b();
            return dfVar;
        } catch (Throwable th) {
            this.f187655b.mo62445b();
            throw th;
        }
    }

    /* renamed from: f */
    public final Runnable mo61825f(C70555hi hiVar) {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r2.f187655b.mo62445b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61831l(p5488io.grpc.Status r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f187654a
            monitor-enter(r0)
            io.grpc.Status r1 = r2.f187661h     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0009:
            r2.f187661h = r3     // Catch:{ all -> 0x002e }
            io.grpc.ff r3 = r2.f187655b     // Catch:{ all -> 0x002e }
            io.grpc.e.ca r1 = new io.grpc.e.ca     // Catch:{ all -> 0x002e }
            r1.<init>(r2)     // Catch:{ all -> 0x002e }
            r3.mo62446c(r1)     // Catch:{ all -> 0x002e }
            boolean r3 = r2.mo62135b()     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x0027
            java.lang.Runnable r3 = r2.f187658e     // Catch:{ all -> 0x002e }
            if (r3 == 0) goto L_0x0027
            io.grpc.ff r1 = r2.f187655b     // Catch:{ all -> 0x002e }
            r1.mo62446c(r3)     // Catch:{ all -> 0x002e }
            r3 = 0
            r2.f187658e = r3     // Catch:{ all -> 0x002e }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            io.grpc.ff r3 = r2.f187655b
            r3.mo62445b()
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70414cc.mo61831l(io.grpc.Status):void");
    }

    /* renamed from: m */
    public final void mo61832m(Status status) {
        Collection<C70413cb> collection;
        Runnable runnable;
        mo61831l(status);
        synchronized (this.f187654a) {
            collection = this.f187660g;
            runnable = this.f187658e;
            this.f187658e = null;
            if (!collection.isEmpty()) {
                this.f187660g = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (C70413cb cbVar : collection) {
                Runnable q = cbVar.mo62152q(new C70444df(status, C70373ap.REFUSED, cbVar.f187652c));
                if (q != null) {
                    q.run();
                }
            }
            C70766ff ffVar = this.f187655b;
            ffVar.mo62446c(runnable);
            ffVar.mo62445b();
        }
    }
}
