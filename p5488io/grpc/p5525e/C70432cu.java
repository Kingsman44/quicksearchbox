package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70910y;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.cu */
/* compiled from: PG */
class C70432cu implements C70372ao {

    /* renamed from: a */
    private volatile boolean f187698a;

    /* renamed from: b */
    private C70374aq f187699b;

    /* renamed from: c */
    private Status f187700c;

    /* renamed from: d */
    private List f187701d = new ArrayList();

    /* renamed from: e */
    public C70372ao f187702e;

    /* renamed from: f */
    private C70431ct f187703f;

    /* renamed from: g */
    private long f187704g;

    /* renamed from: h */
    private long f187705h;

    /* renamed from: i */
    private List f187706i = new ArrayList();

    /* renamed from: s */
    private final void m102769s(Runnable runnable) {
        C58838bb.m90884s(this.f187699b != null, "May only be called after start");
        synchronized (this) {
            if (!this.f187698a) {
                this.f187701d.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: t */
    private final void m102770t(C70374aq aqVar) {
        for (Runnable run : this.f187706i) {
            run.run();
        }
        this.f187706i = null;
        this.f187702e.mo61767m(aqVar);
    }

    /* renamed from: u */
    private final void m102771u(C70372ao aoVar) {
        C70372ao aoVar2 = this.f187702e;
        C58838bb.m90887v(aoVar2 == null, "realStream already set to %s", aoVar2);
        this.f187702e = aoVar;
        this.f187705h = System.nanoTime();
    }

    /* renamed from: a */
    public final C70256c mo61755a() {
        C70372ao aoVar;
        synchronized (this) {
            aoVar = this.f187702e;
        }
        if (aoVar != null) {
            return aoVar.mo61755a();
        }
        return C70256c.f187254a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo61756b(p5488io.grpc.p5525e.C70469ed r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            io.grpc.e.aq r0 = r5.f187699b     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0007:
            io.grpc.e.ao r0 = r5.f187702e     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x001f
            java.lang.String r0 = "buffered_nanos"
            long r1 = r5.f187705h     // Catch:{ all -> 0x0036 }
            long r3 = r5.f187704g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.mo62190b(r0, r1)     // Catch:{ all -> 0x0036 }
            io.grpc.e.ao r0 = r5.f187702e     // Catch:{ all -> 0x0036 }
            r0.mo61756b(r6)     // Catch:{ all -> 0x0036 }
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "buffered_nanos"
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0036 }
            long r3 = r5.f187704g     // Catch:{ all -> 0x0036 }
            long r1 = r1 - r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0036 }
            r6.mo62190b(r0, r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "waiting_for_connection"
            r6.mo62189a(r0)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70432cu.mo61756b(io.grpc.e.ed):void");
    }

    /* renamed from: c */
    public void mo61757c(Status status) {
        boolean z = true;
        C58838bb.m90884s(this.f187699b != null, "May only be called after start");
        C58838bb.m90866a(status, "reason");
        synchronized (this) {
            if (this.f187702e == null) {
                m102771u(C70566ht.f188130c);
                this.f187700c = status;
                z = false;
            }
        }
        if (z) {
            m102769s(new C70425cn(this, status));
            return;
        }
        mo62153r();
        mo62133p();
        this.f187699b.mo62080a(status, C70373ap.PROCESSED, new C70334de());
    }

    /* renamed from: d */
    public final void mo61758d() {
        C58838bb.m90884s(this.f187699b != null, "May only be called after start");
        if (this.f187698a) {
            this.f187702e.mo61758d();
        } else {
            m102769s(new C70424cm(this));
        }
    }

    /* renamed from: e */
    public final void mo61759e() {
        C58838bb.m90884s(this.f187699b != null, "May only be called after start");
        m102769s(new C70426co(this));
    }

    /* renamed from: f */
    public final void mo61760f() {
        C58838bb.m90884s(this.f187699b == null, "May only be called before start");
        this.f187706i.add(new C70416ce(this));
    }

    /* renamed from: g */
    public final void mo61761g(int i) {
        C58838bb.m90884s(this.f187699b != null, "May only be called after start");
        if (this.f187698a) {
            this.f187702e.mo61761g(i);
        } else {
            m102769s(new C70415cd(this, i));
        }
    }

    /* renamed from: h */
    public final void mo61762h(C70910y yVar) {
        C58838bb.m90884s(this.f187699b == null, "May only be called before start");
        C58838bb.m90866a(yVar, "compressor");
        this.f187706i.add(new C70417cf(this, yVar));
    }

    /* renamed from: i */
    public final void mo61763i(C70153aq aqVar) {
        C58838bb.m90884s(this.f187699b == null, "May only be called before start");
        this.f187706i.add(new C70421cj(this, aqVar));
    }

    /* renamed from: j */
    public final void mo61764j(C70156at atVar) {
        C58838bb.m90884s(this.f187699b == null, "May only be called before start");
        C58838bb.m90866a(atVar, "decompressorRegistry");
        this.f187706i.add(new C70418cg(this, atVar));
    }

    /* renamed from: k */
    public final void mo61765k(int i) {
        C58838bb.m90884s(this.f187699b == null, "May only be called before start");
        this.f187706i.add(new C70419ch(this, i));
    }

    /* renamed from: l */
    public final void mo61766l(int i) {
        C58838bb.m90884s(this.f187699b == null, "May only be called before start");
        this.f187706i.add(new C70420ci(this, i));
    }

    /* renamed from: m */
    public final void mo61767m(C70374aq aqVar) {
        Status status;
        boolean z;
        C58838bb.m90884s(this.f187699b == null, "already started");
        synchronized (this) {
            status = this.f187700c;
            z = this.f187698a;
            if (!z) {
                C70431ct ctVar = new C70431ct(aqVar);
                this.f187703f = ctVar;
                aqVar = ctVar;
            }
            this.f187699b = aqVar;
            this.f187704g = System.nanoTime();
        }
        if (status != null) {
            aqVar.mo62080a(status, C70373ap.PROCESSED, new C70334de());
        } else if (z) {
            m102770t(aqVar);
        }
    }

    /* renamed from: n */
    public final void mo61768n(InputStream inputStream) {
        C58838bb.m90884s(this.f187699b != null, "May only be called after start");
        C58838bb.m90866a(inputStream, "message");
        if (this.f187698a) {
            this.f187702e.mo61768n(inputStream);
        } else {
            m102769s(new C70423cl(this, inputStream));
        }
    }

    /* renamed from: o */
    public final boolean mo61769o() {
        if (this.f187698a) {
            return this.f187702e.mo61769o();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo62133p() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r3 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        m102770t(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return new p5488io.grpc.p5525e.C70422ck(r2);
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Runnable mo62152q(p5488io.grpc.p5525e.C70372ao r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            io.grpc.e.ao r0 = r2.f187702e     // Catch:{ all -> 0x0026 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            return r1
        L_0x0008:
            java.lang.String r0 = "stream"
            com.google.common.base.C58838bb.m90866a(r3, r0)     // Catch:{ all -> 0x0026 }
            r2.m102771u(r3)     // Catch:{ all -> 0x0026 }
            io.grpc.e.aq r3 = r2.f187699b     // Catch:{ all -> 0x0026 }
            if (r3 != 0) goto L_0x0019
            r2.f187701d = r1     // Catch:{ all -> 0x0026 }
            r0 = 1
            r2.f187698a = r0     // Catch:{ all -> 0x0026 }
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            if (r3 != 0) goto L_0x001d
            return r1
        L_0x001d:
            r2.m102770t(r3)
            io.grpc.e.ck r3 = new io.grpc.e.ck
            r3.<init>(r2)
            return r3
        L_0x0026:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70432cu.mo62152q(io.grpc.e.ao):java.lang.Runnable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r2.f187697c.isEmpty() == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r2.f187697c = null;
        r2.f187696b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r4 = r2.f187697c;
        r2.f187697c = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r3 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if (r3.hasNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        ((java.lang.Runnable) r3.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r4.clear();
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0054, code lost:
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005e, code lost:
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r3 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        monitor-enter(r2);
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62153r() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            monitor-enter(r6)
            java.util.List r1 = r6.f187701d     // Catch:{ all -> 0x006d }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x004f
            r0 = 0
            r6.f187701d = r0     // Catch:{ all -> 0x006d }
            r1 = 1
            r6.f187698a = r1     // Catch:{ all -> 0x006d }
            io.grpc.e.ct r2 = r6.f187703f     // Catch:{ all -> 0x006d }
            monitor-exit(r6)     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x004e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x001e:
            monitor-enter(r2)
            java.util.List r4 = r2.f187697c     // Catch:{ all -> 0x004b }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x004b }
            if (r4 == 0) goto L_0x002d
            r2.f187697c = r0     // Catch:{ all -> 0x004b }
            r2.f187696b = r1     // Catch:{ all -> 0x004b }
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            return
        L_0x002d:
            java.util.List r4 = r2.f187697c     // Catch:{ all -> 0x004b }
            r2.f187697c = r3     // Catch:{ all -> 0x004b }
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            java.util.Iterator r3 = r4.iterator()
        L_0x0036:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L_0x0036
        L_0x0046:
            r4.clear()
            r3 = r4
            goto L_0x001e
        L_0x004b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004b }
            throw r0
        L_0x004e:
            return
        L_0x004f:
            java.util.List r1 = r6.f187701d     // Catch:{ all -> 0x006d }
            r6.f187701d = r0     // Catch:{ all -> 0x006d }
            monitor-exit(r6)     // Catch:{ all -> 0x006d }
            java.util.Iterator r0 = r1.iterator()
        L_0x0058:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L_0x0058
        L_0x0068:
            r1.clear()
            r0 = r1
            goto L_0x0005
        L_0x006d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006d }
            goto L_0x0071
        L_0x0070:
            throw r0
        L_0x0071:
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70432cu.mo62153r():void");
    }
}
