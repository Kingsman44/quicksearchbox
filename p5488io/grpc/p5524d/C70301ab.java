package p5488io.grpc.p5524d;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70766ff;
import p5488io.grpc.C70910y;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70374aq;
import p5488io.grpc.p5525e.C70658ld;
import p5488io.grpc.p5525e.C70659le;
import p5488io.grpc.p5525e.C70670lp;
import p5488io.grpc.p5525e.C70672lr;

/* renamed from: io.grpc.d.ab */
/* compiled from: PG */
final class C70301ab implements C70658ld {

    /* renamed from: a */
    final C70670lp f187378a;

    /* renamed from: b */
    public C70374aq f187379b;

    /* renamed from: c */
    public final C70766ff f187380c;

    /* renamed from: d */
    public int f187381d;

    /* renamed from: e */
    public final ArrayDeque f187382e = new ArrayDeque();

    /* renamed from: f */
    public Status f187383f;

    /* renamed from: g */
    public C70334de f187384g;

    /* renamed from: h */
    public boolean f187385h;

    /* renamed from: i */
    final /* synthetic */ C70302ac f187386i;

    /* renamed from: j */
    private int f187387j;

    public C70301ab(C70302ac acVar, C70338di diVar) {
        this.f187386i = acVar;
        this.f187380c = new C70766ff(acVar.f187393f.f187407l);
        List list = acVar.f187393f.f187405j;
        String str = diVar.f187497b;
        this.f187378a = C70670lp.m103314m(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r2.f187380c.mo62445b();
        r2.f187386i.mo61992a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m102505r(p5488io.grpc.Status r3, p5488io.grpc.C70334de r4) {
        /*
            r2 = this;
            io.grpc.d.ac r0 = r2.f187386i
            io.grpc.d.ae r0 = r0.f187393f
            boolean r0 = r0.f187399d
            io.grpc.Status r3 = p5488io.grpc.p5524d.C70304ae.m102526b(r3, r0)
            monitor-enter(r2)
            boolean r0 = r2.f187385h     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0011
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            return
        L_0x0011:
            java.util.ArrayDeque r0 = r2.f187382e     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0039
            r0 = 1
            r2.f187385h = r0     // Catch:{ all -> 0x0049 }
            io.grpc.d.ac r0 = r2.f187386i     // Catch:{ all -> 0x0049 }
            io.grpc.d.t r0 = r0.f187388a     // Catch:{ all -> 0x0049 }
            io.grpc.e.lp r0 = r0.f187452a     // Catch:{ all -> 0x0049 }
            r0.mo62416e()     // Catch:{ all -> 0x0049 }
            io.grpc.d.ac r0 = r2.f187386i     // Catch:{ all -> 0x0049 }
            io.grpc.d.t r0 = r0.f187388a     // Catch:{ all -> 0x0049 }
            io.grpc.e.lp r0 = r0.f187452a     // Catch:{ all -> 0x0049 }
            r0.mo62423n()     // Catch:{ all -> 0x0049 }
            io.grpc.ff r0 = r2.f187380c     // Catch:{ all -> 0x0049 }
            io.grpc.d.aa r1 = new io.grpc.d.aa     // Catch:{ all -> 0x0049 }
            r1.<init>(r2, r3, r4)     // Catch:{ all -> 0x0049 }
            r0.mo62446c(r1)     // Catch:{ all -> 0x0049 }
            goto L_0x003d
        L_0x0039:
            r2.f187383f = r3     // Catch:{ all -> 0x0049 }
            r2.f187384g = r4     // Catch:{ all -> 0x0049 }
        L_0x003d:
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            io.grpc.ff r3 = r2.f187380c
            r3.mo62445b()
            io.grpc.d.ac r3 = r2.f187386i
            r3.mo61992a()
            return
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5524d.C70301ab.m102505r(io.grpc.Status, io.grpc.de):void");
    }

    /* renamed from: a */
    public final C70256c mo61771a() {
        return this.f187386i.f187393f.f187401f;
    }

    /* renamed from: b */
    public final C70670lp mo61772b() {
        return this.f187378a;
    }

    /* renamed from: c */
    public final void mo61773c(Status status) {
        if (mo61991q(Status.f186904b.withDescription("server cancelled stream"))) {
            this.f187386i.f187388a.mo62015q(status);
            this.f187386i.mo61992a();
        }
    }

    /* renamed from: d */
    public final void mo61758d() {
    }

    /* renamed from: e */
    public final void mo61774e(Status status, C70334de deVar) {
        this.f187386i.f187388a.mo62015q(Status.f186902OK);
        if (this.f187386i.f187393f.f187398c != Integer.MAX_VALUE) {
            int a = C70304ae.m102525a(deVar) + (status.getDescription() == null ? 0 : status.getDescription().length());
            if (a > this.f187386i.f187393f.f187398c) {
                status = Status.f186911i.withDescription(String.format(Locale.US, "Response header metadata larger than %d: %d", new Object[]{Integer.valueOf(this.f187386i.f187393f.f187398c), Integer.valueOf(a)}));
                deVar = new C70334de();
            }
        }
        m102505r(status, deVar);
    }

    /* renamed from: f */
    public final void mo61760f() {
    }

    /* renamed from: g */
    public final void mo61761g(int i) {
        C70323t tVar = this.f187386i.f187388a;
        synchronized (tVar) {
            if (!tVar.f187459h) {
                int i2 = tVar.f187456e;
                tVar.f187456e = i + i2;
                while (tVar.f187456e > 0 && !tVar.f187457f.isEmpty()) {
                    tVar.f187456e--;
                    tVar.f187455d.mo62446c(new C70320q(tVar, (C70672lr) tVar.f187457f.poll()));
                }
                if (tVar.f187457f.isEmpty() && tVar.f187458g) {
                    tVar.f187458g = false;
                    tVar.f187455d.mo62446c(new C70321r(tVar));
                }
                int i3 = tVar.f187456e;
                tVar.f187455d.mo62445b();
                if (i2 <= 0 && i3 > 0) {
                    synchronized (this) {
                        if (!this.f187385h) {
                            this.f187380c.mo62446c(new C70327x(this));
                        }
                    }
                }
            }
        }
        this.f187380c.mo62445b();
    }

    /* renamed from: h */
    public final void mo61762h(C70910y yVar) {
    }

    /* renamed from: i */
    public final void mo61775i(C70659le leVar) {
        this.f187386i.f187388a.mo62014p(leVar);
    }

    /* renamed from: j */
    public final void mo61776j(C70334de deVar) {
        int a;
        if (this.f187386i.f187393f.f187398c == Integer.MAX_VALUE || (a = C70304ae.m102525a(deVar)) <= this.f187386i.f187393f.f187398c) {
            synchronized (this) {
                if (!this.f187385h) {
                    this.f187386i.f187388a.f187452a.mo62412a();
                    this.f187380c.mo62446c(new C70329z(this, deVar));
                    this.f187380c.mo62445b();
                    return;
                }
                return;
            }
        }
        this.f187386i.f187388a.mo62015q(Status.f186904b.withDescription("Client cancelled the RPC"));
        m102505r(Status.f186911i.withDescription(String.format(Locale.US, "Response header metadata larger than %d: %d", new Object[]{Integer.valueOf(this.f187386i.f187393f.f187398c), Integer.valueOf(a)})), new C70334de());
    }

    /* renamed from: k */
    public final void mo61777k() {
    }

    /* renamed from: l */
    public final void mo61778l() {
    }

    /* renamed from: m */
    public final void mo61779m() {
        String str = this.f187386i.f187392e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r2.f187380c.mo62445b();
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
            boolean r0 = r2.f187385h     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            return
        L_0x0007:
            io.grpc.e.lp r0 = r2.f187378a     // Catch:{ all -> 0x004d }
            r0.mo62420i()     // Catch:{ all -> 0x004d }
            io.grpc.e.lp r0 = r2.f187378a     // Catch:{ all -> 0x004d }
            r0.mo62421j()     // Catch:{ all -> 0x004d }
            io.grpc.d.ac r0 = r2.f187386i     // Catch:{ all -> 0x004d }
            io.grpc.d.t r0 = r0.f187388a     // Catch:{ all -> 0x004d }
            io.grpc.e.lp r0 = r0.f187452a     // Catch:{ all -> 0x004d }
            r0.mo62417f()     // Catch:{ all -> 0x004d }
            io.grpc.d.ac r0 = r2.f187386i     // Catch:{ all -> 0x004d }
            io.grpc.d.t r0 = r0.f187388a     // Catch:{ all -> 0x004d }
            io.grpc.e.lp r0 = r0.f187452a     // Catch:{ all -> 0x004d }
            r0.mo62418g()     // Catch:{ all -> 0x004d }
            int r0 = r2.f187387j     // Catch:{ all -> 0x004d }
            int r0 = r0 + 1
            r2.f187387j = r0     // Catch:{ all -> 0x004d }
            io.grpc.d.ad r0 = new io.grpc.d.ad     // Catch:{ all -> 0x004d }
            r0.<init>(r3)     // Catch:{ all -> 0x004d }
            int r3 = r2.f187381d     // Catch:{ all -> 0x004d }
            if (r3 <= 0) goto L_0x0041
            int r3 = r3 + -1
            r2.f187381d = r3     // Catch:{ all -> 0x004d }
            io.grpc.ff r3 = r2.f187380c     // Catch:{ all -> 0x004d }
            io.grpc.d.u r1 = new io.grpc.d.u     // Catch:{ all -> 0x004d }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x004d }
            r3.mo62446c(r1)     // Catch:{ all -> 0x004d }
            goto L_0x0046
        L_0x0041:
            java.util.ArrayDeque r3 = r2.f187382e     // Catch:{ all -> 0x004d }
            r3.add(r0)     // Catch:{ all -> 0x004d }
        L_0x0046:
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            io.grpc.ff r3 = r2.f187380c
            r3.mo62445b()
            return
        L_0x004d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5524d.C70301ab.mo61768n(java.io.InputStream):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000b, code lost:
        if (r2.f187381d <= 0) goto L_0x000f;
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
            boolean r0 = r2.f187385h     // Catch:{ all -> 0x0010 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)
            return r1
        L_0x0008:
            int r0 = r2.f187381d     // Catch:{ all -> 0x0010 }
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
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5524d.C70301ab.mo61769o():boolean");
    }

    /* renamed from: p */
    public final synchronized void mo61990p(C70374aq aqVar) {
        this.f187379b = aqVar;
    }

    /* renamed from: q */
    public final boolean mo61991q(Status status) {
        synchronized (this) {
            if (this.f187385h) {
                return false;
            }
            this.f187385h = true;
            while (true) {
                C70672lr lrVar = (C70672lr) this.f187382e.poll();
                if (lrVar != null) {
                    while (true) {
                        InputStream g = lrVar.mo61868g();
                        if (g != null) {
                            try {
                                g.close();
                            } catch (Throwable th) {
                                C70304ae.f187396a.logp(Level.WARNING, "io.grpc.inprocess.InProcessTransport$InProcessStream$InProcessServerStream", "internalCancel", "Exception closing stream", th);
                            }
                        }
                    }
                } else {
                    this.f187386i.f187388a.f187452a.mo62423n();
                    this.f187380c.mo62446c(new C70328y(this, status));
                    this.f187380c.mo62445b();
                    return true;
                }
            }
        }
    }
}
