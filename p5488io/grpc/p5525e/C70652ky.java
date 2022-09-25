package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70152ap;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70173bh;
import p5488io.grpc.C70243bn;
import p5488io.grpc.C70244bo;
import p5488io.grpc.C70247br;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70701ef;
import p5488io.grpc.C70706ek;
import p5488io.grpc.C70709en;
import p5488io.grpc.C70711ep;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ky */
/* compiled from: PG */
public final class C70652ky extends C70701ef implements C70247br {

    /* renamed from: b */
    public static final Logger f188339b = Logger.getLogger(C70652ky.class.getName());

    /* renamed from: c */
    public static final C70659le f188340c = new C70643kp();

    /* renamed from: d */
    public Executor f188341d;

    /* renamed from: e */
    public final C70173bh f188342e;

    /* renamed from: f */
    public final C70173bh f188343f;

    /* renamed from: g */
    public final List f188344g;

    /* renamed from: h */
    public final C70706ek[] f188345h;

    /* renamed from: i */
    public final long f188346i;

    /* renamed from: j */
    public Status f188347j;

    /* renamed from: k */
    public boolean f188348k;

    /* renamed from: l */
    public final Object f188349l = new Object();

    /* renamed from: m */
    public boolean f188350m;

    /* renamed from: n */
    public final Set f188351n = new HashSet();

    /* renamed from: o */
    public final C70148al f188352o;

    /* renamed from: p */
    public final C70156at f188353p;

    /* renamed from: q */
    public final C70244bo f188354q;

    /* renamed from: r */
    public final C70359ab f188355r;

    /* renamed from: s */
    public final C70152ap f188356s;

    /* renamed from: t */
    private final C70248bs f188357t;

    /* renamed from: u */
    private final C70567hu f188358u;

    /* renamed from: v */
    private boolean f188359v;

    /* renamed from: w */
    private boolean f188360w;

    /* renamed from: x */
    private boolean f188361x;

    /* renamed from: y */
    private final C70472eg f188362y;

    public C70652ky(C70656lb lbVar, C70472eg egVar, C70148al alVar) {
        C70567hu huVar = lbVar.f188373e;
        C58838bb.m90866a(huVar, "executorPool");
        this.f188358u = huVar;
        C70470ee eeVar = lbVar.f188369a;
        HashMap hashMap = new HashMap();
        for (C70711ep a : eeVar.f187820a.values()) {
            for (C70709en enVar : a.mo62431a()) {
                hashMap.put(enVar.f188450a.f187497b, enVar);
            }
        }
        Collections.unmodifiableList(new ArrayList(eeVar.f187820a.values()));
        this.f188342e = new C70471ef(Collections.unmodifiableMap(hashMap));
        C70173bh bhVar = lbVar.f188372d;
        C58838bb.m90866a(bhVar, "fallbackRegistry");
        this.f188343f = bhVar;
        C58838bb.m90866a(egVar, "transportServer");
        this.f188362y = egVar;
        this.f188357t = C70248bs.m102395a("Server", String.valueOf(m103273f()));
        C58838bb.m90866a(alVar, "rootContext");
        this.f188352o = alVar.mo61716n();
        this.f188353p = lbVar.f188374f;
        this.f188344g = Collections.unmodifiableList(new ArrayList(lbVar.f188370b));
        List list = lbVar.f188371c;
        this.f188345h = (C70706ek[]) list.toArray(new C70706ek[list.size()]);
        this.f188346i = lbVar.f188376h;
        C70244bo boVar = lbVar.f188382n;
        this.f188354q = boVar;
        this.f188355r = new C70359ab(C70675lu.f188403a);
        this.f188356s = lbVar.f188377i;
        C70243bn bnVar = (C70243bn) boVar.f187241g.put(Long.valueOf(C70244bo.m102391a(this)), new C70243bn());
        C70244bo.m102392b(boVar.f187237c, this);
    }

    /* renamed from: f */
    private final List m103273f() {
        List unmodifiableList;
        synchronized (this.f188349l) {
            unmodifiableList = Collections.unmodifiableList(this.f188362y.mo61815a());
        }
        return unmodifiableList;
    }

    /* renamed from: a */
    public final List mo62394a() {
        List f;
        synchronized (this.f188349l) {
            C58838bb.m90884s(this.f188359v, "Not started");
            C58838bb.m90884s(!this.f188361x, "Already terminated");
            f = m103273f();
        }
        return f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r1 = r2.size();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r3 >= r1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        ((p5488io.grpc.p5525e.C70660lf) r2.get(r3)).mo61838m(r0);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo62395b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f188349l
            monitor-enter(r0)
            boolean r1 = r5.f188360w     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            goto L_0x001d
        L_0x0009:
            r1 = 1
            r5.f188360w = r1     // Catch:{ all -> 0x0053 }
            boolean r2 = r5.f188359v     // Catch:{ all -> 0x0053 }
            if (r2 != 0) goto L_0x0015
            r5.f188350m = r1     // Catch:{ all -> 0x0053 }
            r5.mo62397e()     // Catch:{ all -> 0x0053 }
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x001d
            io.grpc.e.eg r0 = r5.f188362y
            r0.mo61816b()
        L_0x001d:
            io.grpc.Status r0 = p5488io.grpc.Status.f186916n
            java.lang.String r1 = "Server shutdownNow invoked"
            io.grpc.Status r0 = r0.withDescription(r1)
            java.lang.Object r1 = r5.f188349l
            monitor-enter(r1)
            io.grpc.Status r2 = r5.f188347j     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x002e
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            return
        L_0x002e:
            r5.f188347j = r0     // Catch:{ all -> 0x0050 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0050 }
            java.util.Set r3 = r5.f188351n     // Catch:{ all -> 0x0050 }
            r2.<init>(r3)     // Catch:{ all -> 0x0050 }
            boolean r3 = r5.f188348k     // Catch:{ all -> 0x0050 }
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004f
            int r1 = r2.size()
            r3 = 0
        L_0x0041:
            if (r3 >= r1) goto L_0x004f
            java.lang.Object r4 = r2.get(r3)
            io.grpc.e.lf r4 = (p5488io.grpc.p5525e.C70660lf) r4
            r4.mo61838m(r0)
            int r3 = r3 + 1
            goto L_0x0041
        L_0x004f:
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0050 }
            throw r0
        L_0x0053:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            goto L_0x0057
        L_0x0056:
            throw r1
        L_0x0057:
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70652ky.mo62395b():void");
    }

    /* renamed from: c */
    public final C70248bs mo61901c() {
        return this.f188357t;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo62396d() {
        synchronized (this.f188349l) {
            C58838bb.m90884s(!this.f188359v, "Already started");
            C58838bb.m90884s(!this.f188360w, "Shutting down");
            this.f188362y.mo61817c(new C70644kq(this));
            Executor executor = (Executor) this.f188358u.mo62162a();
            C58838bb.m90866a(executor, "executor");
            this.f188341d = executor;
            this.f188359v = true;
        }
    }

    /* renamed from: e */
    public final void mo62397e() {
        synchronized (this.f188349l) {
            if (this.f188360w && this.f188351n.isEmpty() && this.f188350m) {
                if (!this.f188361x) {
                    this.f188361x = true;
                    C70244bo boVar = this.f188354q;
                    C70244bo.m102393c(boVar.f187237c, this);
                    C70243bn bnVar = (C70243bn) boVar.f187241g.remove(Long.valueOf(C70244bo.m102391a(this)));
                    Executor executor = this.f188341d;
                    if (executor != null) {
                        this.f188341d = (Executor) this.f188358u.mo62163b(executor);
                    }
                    this.f188349l.notifyAll();
                } else {
                    throw new AssertionError("Server already terminated");
                }
            }
        }
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("logId", String.valueOf(this.f188357t.f187246a));
        b.mo56102b("transportServer", this.f188362y);
        return b.toString();
    }
}
