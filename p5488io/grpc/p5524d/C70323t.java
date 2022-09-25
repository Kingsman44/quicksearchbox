package p5488io.grpc.p5524d;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70766ff;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70910y;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70372ao;
import p5488io.grpc.p5525e.C70374aq;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70469ed;
import p5488io.grpc.p5525e.C70659le;
import p5488io.grpc.p5525e.C70670lp;
import p5488io.grpc.p5525e.C70672lr;

/* renamed from: io.grpc.d.t */
/* compiled from: PG */
final class C70323t implements C70372ao {

    /* renamed from: a */
    final C70670lp f187452a;

    /* renamed from: b */
    final C70851i f187453b;

    /* renamed from: c */
    public C70659le f187454c;

    /* renamed from: d */
    public final C70766ff f187455d;

    /* renamed from: e */
    public int f187456e;

    /* renamed from: f */
    public final ArrayDeque f187457f = new ArrayDeque();

    /* renamed from: g */
    public boolean f187458g;

    /* renamed from: h */
    public boolean f187459h;

    /* renamed from: i */
    final /* synthetic */ C70302ac f187460i;

    /* renamed from: j */
    private int f187461j;

    public C70323t(C70302ac acVar, C70851i iVar, C70670lp lpVar) {
        this.f187460i = acVar;
        this.f187455d = new C70766ff(acVar.f187393f.f187407l);
        this.f187453b = iVar;
        this.f187452a = lpVar;
    }

    /* renamed from: a */
    public final C70256c mo61755a() {
        return this.f187460i.f187393f.f187406k;
    }

    /* renamed from: b */
    public final void mo61756b(C70469ed edVar) {
    }

    /* renamed from: c */
    public final void mo61757c(Status status) {
        if (mo62015q(C70304ae.m102526b(status, this.f187460i.f187393f.f187399d))) {
            this.f187460i.f187389b.mo61991q(status);
            this.f187460i.mo61992a();
        }
    }

    /* renamed from: d */
    public final void mo61758d() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r2.f187455d.mo62445b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61759e() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f187459h     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            return
        L_0x0007:
            java.util.ArrayDeque r0 = r2.f187457f     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001a
            io.grpc.ff r0 = r2.f187455d     // Catch:{ all -> 0x0024 }
            io.grpc.d.p r1 = new io.grpc.d.p     // Catch:{ all -> 0x0024 }
            r1.<init>(r2)     // Catch:{ all -> 0x0024 }
            r0.mo62446c(r1)     // Catch:{ all -> 0x0024 }
            goto L_0x001d
        L_0x001a:
            r0 = 1
            r2.f187458g = r0     // Catch:{ all -> 0x0024 }
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            io.grpc.ff r0 = r2.f187455d
            r0.mo62445b()
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0024 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5524d.C70323t.mo61759e():void");
    }

    /* renamed from: f */
    public final void mo61760f() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        r0.f187380c.mo62445b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if (r1 > 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r6 <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (r5.f187459h != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        r5.f187455d.mo62446c(new p5488io.grpc.p5524d.C70317n(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        r5.f187455d.mo62445b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61761g(int r6) {
        /*
            r5 = this;
            io.grpc.d.ac r0 = r5.f187460i
            io.grpc.d.ab r0 = r0.f187389b
            monitor-enter(r0)
            boolean r1 = r0.f187385h     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            return
        L_0x000b:
            int r1 = r0.f187381d     // Catch:{ all -> 0x008a }
            int r6 = r6 + r1
            r0.f187381d = r6     // Catch:{ all -> 0x008a }
        L_0x0010:
            int r6 = r0.f187381d     // Catch:{ all -> 0x008a }
            if (r6 <= 0) goto L_0x0035
            java.util.ArrayDeque r6 = r0.f187382e     // Catch:{ all -> 0x008a }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x0035
            int r6 = r0.f187381d     // Catch:{ all -> 0x008a }
            int r6 = r6 + -1
            r0.f187381d = r6     // Catch:{ all -> 0x008a }
            java.util.ArrayDeque r6 = r0.f187382e     // Catch:{ all -> 0x008a }
            java.lang.Object r6 = r6.poll()     // Catch:{ all -> 0x008a }
            io.grpc.e.lr r6 = (p5488io.grpc.p5525e.C70672lr) r6     // Catch:{ all -> 0x008a }
            io.grpc.ff r2 = r0.f187380c     // Catch:{ all -> 0x008a }
            io.grpc.d.v r3 = new io.grpc.d.v     // Catch:{ all -> 0x008a }
            r3.<init>(r0, r6)     // Catch:{ all -> 0x008a }
            r2.mo62446c(r3)     // Catch:{ all -> 0x008a }
            goto L_0x0010
        L_0x0035:
            java.util.ArrayDeque r6 = r0.f187382e     // Catch:{ all -> 0x008a }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x008a }
            if (r6 == 0) goto L_0x0064
            io.grpc.Status r6 = r0.f187383f     // Catch:{ all -> 0x008a }
            if (r6 == 0) goto L_0x0064
            r6 = 1
            r0.f187385h = r6     // Catch:{ all -> 0x008a }
            io.grpc.d.ac r6 = r0.f187386i     // Catch:{ all -> 0x008a }
            io.grpc.d.t r6 = r6.f187388a     // Catch:{ all -> 0x008a }
            io.grpc.e.lp r6 = r6.f187452a     // Catch:{ all -> 0x008a }
            r6.mo62416e()     // Catch:{ all -> 0x008a }
            io.grpc.d.ac r6 = r0.f187386i     // Catch:{ all -> 0x008a }
            io.grpc.d.t r6 = r6.f187388a     // Catch:{ all -> 0x008a }
            io.grpc.e.lp r6 = r6.f187452a     // Catch:{ all -> 0x008a }
            r6.mo62423n()     // Catch:{ all -> 0x008a }
            io.grpc.Status r6 = r0.f187383f     // Catch:{ all -> 0x008a }
            io.grpc.de r2 = r0.f187384g     // Catch:{ all -> 0x008a }
            io.grpc.ff r3 = r0.f187380c     // Catch:{ all -> 0x008a }
            io.grpc.d.w r4 = new io.grpc.d.w     // Catch:{ all -> 0x008a }
            r4.<init>(r0, r6, r2)     // Catch:{ all -> 0x008a }
            r3.mo62446c(r4)     // Catch:{ all -> 0x008a }
        L_0x0064:
            int r6 = r0.f187381d     // Catch:{ all -> 0x008a }
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            io.grpc.ff r0 = r0.f187380c
            r0.mo62445b()
            if (r1 > 0) goto L_0x0089
            if (r6 <= 0) goto L_0x0089
            monitor-enter(r5)
            boolean r6 = r5.f187459h     // Catch:{ all -> 0x0086 }
            if (r6 != 0) goto L_0x007f
            io.grpc.ff r6 = r5.f187455d     // Catch:{ all -> 0x0086 }
            io.grpc.d.n r0 = new io.grpc.d.n     // Catch:{ all -> 0x0086 }
            r0.<init>(r5)     // Catch:{ all -> 0x0086 }
            r6.mo62446c(r0)     // Catch:{ all -> 0x0086 }
        L_0x007f:
            monitor-exit(r5)     // Catch:{ all -> 0x0086 }
            io.grpc.ff r6 = r5.f187455d
            r6.mo62445b()
            return
        L_0x0086:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0086 }
            throw r6
        L_0x0089:
            return
        L_0x008a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            goto L_0x008e
        L_0x008d:
            throw r6
        L_0x008e:
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5524d.C70323t.mo61761g(int):void");
    }

    /* renamed from: h */
    public final void mo61762h(C70910y yVar) {
    }

    /* renamed from: i */
    public final void mo61763i(C70153aq aqVar) {
        this.f187460i.f187390c.mo62031f(C70460dv.f187783b);
        this.f187460i.f187390c.mo62033h(C70460dv.f187783b, Long.valueOf(Math.max(0, aqVar.mo61720b(TimeUnit.NANOSECONDS))));
    }

    /* renamed from: j */
    public final void mo61764j(C70156at atVar) {
    }

    /* renamed from: k */
    public final void mo61765k(int i) {
    }

    /* renamed from: l */
    public final void mo61766l(int i) {
    }

    /* renamed from: m */
    public final void mo61767m(C70374aq aqVar) {
        this.f187460i.f187389b.mo61990p(aqVar);
        synchronized (this.f187460i.f187393f) {
            this.f187452a.mo62413b();
            C70302ac acVar = this.f187460i;
            acVar.f187393f.f187404i.add(acVar);
            if (C70460dv.m102883k(this.f187453b)) {
                C70302ac acVar2 = this.f187460i;
                acVar2.f187393f.f187408m.mo62188c(acVar2, true);
            }
            C70302ac acVar3 = this.f187460i;
            acVar3.f187393f.f187400e.mo62391a(acVar3.f187389b, acVar3.f187391d.f187497b, acVar3.f187390c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r2.f187455d.mo62445b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        return;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61768n(java.io.InputStream r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f187459h     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            return
        L_0x0007:
            io.grpc.e.lp r0 = r2.f187452a     // Catch:{ all -> 0x004d }
            r0.mo62420i()     // Catch:{ all -> 0x004d }
            io.grpc.e.lp r0 = r2.f187452a     // Catch:{ all -> 0x004d }
            r0.mo62421j()     // Catch:{ all -> 0x004d }
            io.grpc.d.ac r0 = r2.f187460i     // Catch:{ all -> 0x004d }
            io.grpc.d.ab r0 = r0.f187389b     // Catch:{ all -> 0x004d }
            io.grpc.e.lp r0 = r0.f187378a     // Catch:{ all -> 0x004d }
            r0.mo62417f()     // Catch:{ all -> 0x004d }
            io.grpc.d.ac r0 = r2.f187460i     // Catch:{ all -> 0x004d }
            io.grpc.d.ab r0 = r0.f187389b     // Catch:{ all -> 0x004d }
            io.grpc.e.lp r0 = r0.f187378a     // Catch:{ all -> 0x004d }
            r0.mo62418g()     // Catch:{ all -> 0x004d }
            int r0 = r2.f187461j     // Catch:{ all -> 0x004d }
            int r0 = r0 + 1
            r2.f187461j = r0     // Catch:{ all -> 0x004d }
            io.grpc.d.ad r0 = new io.grpc.d.ad     // Catch:{ all -> 0x004d }
            r0.<init>(r3)     // Catch:{ all -> 0x004d }
            int r3 = r2.f187456e     // Catch:{ all -> 0x004d }
            if (r3 <= 0) goto L_0x0041
            int r3 = r3 + -1
            r2.f187456e = r3     // Catch:{ all -> 0x004d }
            io.grpc.ff r3 = r2.f187455d     // Catch:{ all -> 0x004d }
            io.grpc.d.s r1 = new io.grpc.d.s     // Catch:{ all -> 0x004d }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x004d }
            r3.mo62446c(r1)     // Catch:{ all -> 0x004d }
            goto L_0x0046
        L_0x0041:
            java.util.ArrayDeque r3 = r2.f187457f     // Catch:{ all -> 0x004d }
            r3.add(r0)     // Catch:{ all -> 0x004d }
        L_0x0046:
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            io.grpc.ff r3 = r2.f187455d
            r3.mo62445b()
            return
        L_0x004d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5524d.C70323t.mo61768n(java.io.InputStream):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000b, code lost:
        if (r2.f187456e <= 0) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x000f, code lost:
        return false;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo61769o() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f187459h     // Catch:{ all -> 0x0010 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            int r0 = r2.f187456e     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)
            if (r0 <= 0) goto L_0x000f
            r0 = 1
            return r0
        L_0x000f:
            return r1
        L_0x0010:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5524d.C70323t.mo61769o():boolean");
    }

    /* renamed from: p */
    public final synchronized void mo62014p(C70659le leVar) {
        this.f187454c = leVar;
    }

    /* renamed from: q */
    public final boolean mo62015q(Status status) {
        synchronized (this) {
            if (this.f187459h) {
                return false;
            }
            this.f187459h = true;
            while (true) {
                C70672lr lrVar = (C70672lr) this.f187457f.poll();
                if (lrVar != null) {
                    while (true) {
                        InputStream g = lrVar.mo61868g();
                        if (g != null) {
                            try {
                                g.close();
                            } catch (Throwable th) {
                                C70304ae.f187396a.logp(Level.WARNING, "io.grpc.inprocess.InProcessTransport$InProcessStream$InProcessClientStream", "internalCancel", "Exception closing stream", th);
                            }
                        }
                    }
                } else {
                    this.f187460i.f187389b.f187378a.mo62423n();
                    this.f187455d.mo62446c(new C70318o(this, status));
                    this.f187455d.mo62445b();
                    return true;
                }
            }
        }
    }
}
