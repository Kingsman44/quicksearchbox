package p5488io.grpc.p5523c;

import com.google.common.base.C58838bb;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import p5488io.grpc.C70132a;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70700ee;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;
import p5488io.grpc.p5525e.C70372ao;
import p5488io.grpc.p5525e.C70373ap;
import p5488io.grpc.p5525e.C70387bc;
import p5488io.grpc.p5525e.C70452dn;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70555hi;
import p5488io.grpc.p5525e.C70670lp;
import p5488io.grpc.p5525e.C70679ly;

/* renamed from: io.grpc.c.m */
/* compiled from: PG */
final class C70269m implements C70387bc {

    /* renamed from: a */
    public final String f187325a;

    /* renamed from: b */
    public C70555hi f187326b;

    /* renamed from: c */
    public final Object f187327c = new Object();

    /* renamed from: d */
    public final Set f187328d = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: e */
    public final Executor f187329e;

    /* renamed from: f */
    public final int f187330f;

    /* renamed from: g */
    public final C70679ly f187331g;

    /* renamed from: h */
    public boolean f187332h;

    /* renamed from: i */
    public Status f187333i;

    /* renamed from: j */
    public boolean f187334j;

    /* renamed from: k */
    public final C70259c f187335k;

    /* renamed from: l */
    private final C70248bs f187336l;

    /* renamed from: m */
    private final InetSocketAddress f187337m;

    /* renamed from: n */
    private final String f187338n;

    /* renamed from: o */
    private final C70256c f187339o;

    /* renamed from: p */
    private boolean f187340p;

    /* renamed from: q */
    private boolean f187341q;

    public C70269m(C70259c cVar, InetSocketAddress inetSocketAddress, String str, String str2, C70256c cVar2, Executor executor, int i, C70679ly lyVar) {
        C58838bb.m90866a(inetSocketAddress, "address");
        this.f187337m = inetSocketAddress;
        this.f187336l = C70248bs.m102395a(C70248bs.m102396b(getClass()), inetSocketAddress.toString());
        this.f187338n = str;
        this.f187325a = C70460dv.m102877e("cronet", str2);
        this.f187330f = i;
        this.f187329e = executor;
        this.f187335k = cVar;
        this.f187331g = lyVar;
        C70132a a = C70256c.m102407a();
        a.mo61688b(C70452dn.f187762a, C70700ee.PRIVACY_AND_INTEGRITY);
        a.mo61688b(C70452dn.f187763b, cVar2);
        this.f187339o = a.mo61687a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61930a(C70266j jVar, Status status) {
        synchronized (this.f187327c) {
            if (this.f187328d.remove(jVar)) {
                boolean z = true;
                if (status.getCode() != Status.Code.CANCELLED) {
                    if (status.getCode() != Status.Code.DEADLINE_EXCEEDED) {
                        z = false;
                    }
                }
                jVar.f187314o.mo62131j(status, C70373ap.PROCESSED, z, new C70334de());
                mo61931b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo61931b() {
        synchronized (this.f187327c) {
            if (this.f187332h && !this.f187341q && this.f187328d.size() == 0) {
                this.f187341q = true;
                this.f187326b.mo62208d();
            }
        }
    }

    /* renamed from: c */
    public final C70248bs mo61901c() {
        return this.f187336l;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C70372ao mo61824e(C70338di diVar, C70334de deVar, C70851i iVar, C70906u[] uVarArr) {
        C58838bb.m90866a(diVar, "method");
        C58838bb.m90866a(deVar, "headers");
        String str = diVar.f187497b;
        String str2 = this.f187338n;
        return new C70268l(this, "https://" + str2 + "/".concat(str), deVar, diVar, C70670lp.m103313l(uVarArr, this.f187339o), iVar).f187318a;
    }

    /* renamed from: f */
    public final Runnable mo61825f(C70555hi hiVar) {
        this.f187326b = hiVar;
        synchronized (this.f187327c) {
            this.f187334j = true;
        }
        return new C70267k(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x000f, code lost:
        if (r3.f187340p == false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0011, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0012, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0013, code lost:
        r3.f187340p = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0016, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0017, code lost:
        r3.f187326b.mo62207c(r4);
        r2 = r3.f187327c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001e, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.f187332h = true;
        r3.f187333i = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0024, code lost:
        mo61931b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r1 = r3.f187327c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        monitor-enter(r1);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61831l(p5488io.grpc.Status r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f187327c
            monitor-enter(r0)
            boolean r1 = r3.f187332h     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r3.f187327c
            monitor-enter(r1)
            boolean r0 = r3.f187340p     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            return
        L_0x0013:
            r0 = 1
            r3.f187340p = r0     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            io.grpc.e.hi r1 = r3.f187326b
            r1.mo62207c(r4)
            java.lang.Object r2 = r3.f187327c
            monitor-enter(r2)
            r3.f187332h = r0     // Catch:{ all -> 0x0028 }
            r3.f187333i = r4     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            r3.mo61931b()
            return
        L_0x0028:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            throw r4
        L_0x002b:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r4
        L_0x002e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5523c.C70269m.mo61831l(io.grpc.Status):void");
    }

    /* renamed from: m */
    public final void mo61832m(Status status) {
        ArrayList arrayList;
        mo61831l(status);
        synchronized (this.f187327c) {
            arrayList = new ArrayList(this.f187328d);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((C70266j) arrayList.get(i)).mo61757c(status);
        }
        mo61931b();
    }

    /* renamed from: o */
    public final C70256c mo61932o() {
        return this.f187339o;
    }

    public final String toString() {
        String obj = super.toString();
        String obj2 = this.f187337m.toString();
        return obj + "(" + obj2 + ")";
    }
}
