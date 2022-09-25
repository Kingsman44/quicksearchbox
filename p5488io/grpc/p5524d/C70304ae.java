package p5488io.grpc.p5524d;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.lang.Thread;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import p5488io.grpc.C70132a;
import p5488io.grpc.C70172bg;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70251bv;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70700ee;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70372ao;
import p5488io.grpc.p5525e.C70387bc;
import p5488io.grpc.p5525e.C70452dn;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70468ec;
import p5488io.grpc.p5525e.C70555hi;
import p5488io.grpc.p5525e.C70567hu;
import p5488io.grpc.p5525e.C70660lf;
import p5488io.grpc.p5525e.C70661lg;
import p5488io.grpc.p5525e.C70670lp;

/* renamed from: io.grpc.d.ae */
/* compiled from: PG */
final class C70304ae implements C70660lf, C70387bc {

    /* renamed from: a */
    public static final Logger f187396a = Logger.getLogger(C70304ae.class.getName());

    /* renamed from: b */
    public final SocketAddress f187397b;

    /* renamed from: c */
    public final int f187398c;

    /* renamed from: d */
    public final boolean f187399d;

    /* renamed from: e */
    public C70661lg f187400e;

    /* renamed from: f */
    public C70256c f187401f;

    /* renamed from: g */
    public C70555hi f187402g;

    /* renamed from: h */
    public boolean f187403h;

    /* renamed from: i */
    public final Set f187404i = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: j */
    public List f187405j;

    /* renamed from: k */
    public final C70256c f187406k;

    /* renamed from: l */
    public final Thread.UncaughtExceptionHandler f187407l = new C70312i();

    /* renamed from: m */
    public final C70468ec f187408m = new C70313j(this);

    /* renamed from: n */
    private final C70248bs f187409n;

    /* renamed from: o */
    private final String f187410o;

    /* renamed from: p */
    private final String f187411p;

    /* renamed from: q */
    private int f187412q;

    /* renamed from: r */
    private C70567hu f187413r;

    /* renamed from: s */
    private ScheduledExecutorService f187414s;

    /* renamed from: t */
    private boolean f187415t;

    /* renamed from: u */
    private Status f187416u;

    public C70304ae(SocketAddress socketAddress, String str, String str2, C70256c cVar, boolean z) {
        this.f187397b = socketAddress;
        this.f187398c = Integer.MAX_VALUE;
        this.f187410o = str;
        this.f187411p = C70460dv.m102877e("inprocess", str2);
        C58838bb.m90866a(cVar, "eagAttrs");
        C70132a a = C70256c.m102407a();
        a.mo61688b(C70452dn.f187762a, C70700ee.PRIVACY_AND_INTEGRITY);
        a.mo61688b(C70452dn.f187763b, cVar);
        a.mo61688b(C70172bg.f187019a, socketAddress);
        a.mo61688b(C70172bg.f187020b, socketAddress);
        this.f187406k = a.mo61687a();
        this.f187409n = C70248bs.m102395a(C70248bs.m102396b(getClass()), socketAddress.toString());
        this.f187399d = z;
    }

    /* renamed from: a */
    public static int m102525a(C70334de deVar) {
        byte[][] g = C70251bv.m102404g(deVar);
        long j = 0;
        for (int i = 0; i < g.length; i += 2) {
            j += (long) (g[i].length + 32 + g[i + 1].length);
        }
        return (int) Math.min(j, 2147483647L);
    }

    /* renamed from: b */
    public static Status m102526b(Status status, boolean z) {
        if (status == null) {
            return null;
        }
        Status withDescription = Status.fromCodeValue(status.getCode().value()).withDescription(status.getDescription());
        return z ? withDescription.mo61678e(status.f186920q) : withDescription;
    }

    /* renamed from: c */
    public final C70248bs mo61901c() {
        return this.f187409n;
    }

    /* renamed from: d */
    public final synchronized void mo61993d(Status status) {
        if (!this.f187403h) {
            this.f187403h = true;
            this.f187402g.mo62207c(status);
        }
    }

    /* renamed from: e */
    public final synchronized C70372ao mo61824e(C70338di diVar, C70334de deVar, C70851i iVar, C70906u[] uVarArr) {
        int a;
        C70670lp l = C70670lp.m103313l(uVarArr, this.f187406k);
        Status status = this.f187416u;
        if (status != null) {
            return new C70316m(l, status);
        }
        deVar.mo62033h(C70460dv.f187791j, this.f187411p);
        if (this.f187412q == Integer.MAX_VALUE || (a = m102525a(deVar)) <= this.f187412q) {
            return new C70302ac(this, diVar, deVar, iVar, this.f187410o, l).f187388a;
        }
        return new C70316m(l, Status.f186911i.withDescription(String.format(Locale.US, "Request metadata larger than %d: %d", new Object[]{Integer.valueOf(this.f187412q), Integer.valueOf(a)})));
    }

    /* renamed from: f */
    public final synchronized Runnable mo61825f(C70555hi hiVar) {
        this.f187402g = hiVar;
        C70308e d = C70308e.m102541d(this.f187397b);
        if (d != null) {
            this.f187412q = Integer.MAX_VALUE;
            C70567hu huVar = d.f187427b;
            this.f187413r = huVar;
            this.f187414s = (ScheduledExecutorService) huVar.mo62162a();
            this.f187405j = d.f187426a;
            this.f187400e = d.mo61997e(this);
        }
        if (this.f187400e == null) {
            Status status = Status.f186916n;
            StringBuilder sb = new StringBuilder("Could not find server: ");
            SocketAddress socketAddress = this.f187397b;
            sb.append(socketAddress);
            Status withDescription = status.withDescription("Could not find server: ".concat(String.valueOf(socketAddress)));
            this.f187416u = withDescription;
            return new C70314k(this, withDescription);
        }
        return new C70315l(this);
    }

    /* renamed from: g */
    public final synchronized void mo61994g() {
        if (!this.f187415t) {
            this.f187415t = true;
            ScheduledExecutorService scheduledExecutorService = this.f187414s;
            if (scheduledExecutorService != null) {
                this.f187414s = (ScheduledExecutorService) this.f187413r.mo62163b(scheduledExecutorService);
            }
            this.f187402g.mo62208d();
            C70661lg lgVar = this.f187400e;
            if (lgVar != null) {
                lgVar.mo62392b();
            }
        }
    }

    /* renamed from: l */
    public final synchronized void mo61831l(Status status) {
        if (!this.f187403h) {
            this.f187416u = status;
            mo61993d(status);
            if (this.f187404i.isEmpty()) {
                mo61994g();
            }
        }
    }

    /* renamed from: lJ */
    public final synchronized void mo61837lJ() {
        mo61831l(Status.f186916n.withDescription("InProcessTransport shutdown by the server-side"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2 >= r1) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        ((p5488io.grpc.p5524d.C70302ac) r0.get(r2)).f187388a.mo61757c(r5);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r1 = r0.size();
        r2 = 0;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61838m(p5488io.grpc.Status r5) {
        /*
            r4 = this;
            java.lang.String r0 = "reason"
            com.google.common.base.C58838bb.m90866a(r5, r0)
            monitor-enter(r4)
            r4.mo61831l(r5)     // Catch:{ all -> 0x002d }
            boolean r0 = r4.f187415t     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r4)     // Catch:{ all -> 0x002d }
            return
        L_0x000f:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x002d }
            java.util.Set r1 = r4.f187404i     // Catch:{ all -> 0x002d }
            r0.<init>(r1)     // Catch:{ all -> 0x002d }
            monitor-exit(r4)     // Catch:{ all -> 0x002d }
            int r1 = r0.size()
            r2 = 0
        L_0x001c:
            if (r2 >= r1) goto L_0x002c
            java.lang.Object r3 = r0.get(r2)
            io.grpc.d.ac r3 = (p5488io.grpc.p5524d.C70302ac) r3
            io.grpc.d.t r3 = r3.f187388a
            r3.mo61757c(r5)
            int r2 = r2 + 1
            goto L_0x001c
        L_0x002c:
            return
        L_0x002d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x002d }
            goto L_0x0031
        L_0x0030:
            throw r5
        L_0x0031:
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5524d.C70304ae.mo61838m(io.grpc.Status):void");
    }

    /* renamed from: o */
    public final C70256c mo61932o() {
        return this.f187406k;
    }

    /* renamed from: p */
    public final ScheduledExecutorService mo61995p() {
        return this.f187414s;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("logId", String.valueOf(this.f187409n.f187246a));
        b.mo56102b("address", this.f187397b);
        return b.toString();
    }
}
