package p5488io.grpc.p5527g;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p5488io.grpc.C70132a;
import p5488io.grpc.C70239bj;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5525e.C70372ao;
import p5488io.grpc.p5525e.C70373ap;
import p5488io.grpc.p5525e.C70387bc;
import p5488io.grpc.p5525e.C70452dn;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5525e.C70466ea;
import p5488io.grpc.p5525e.C70467eb;
import p5488io.grpc.p5525e.C70468ec;
import p5488io.grpc.p5525e.C70496fd;
import p5488io.grpc.p5525e.C70498ff;
import p5488io.grpc.p5525e.C70555hi;
import p5488io.grpc.p5525e.C70633kf;
import p5488io.grpc.p5525e.C70670lp;
import p5488io.grpc.p5525e.C70679ly;
import p5488io.grpc.p5527g.p5528a.C70790c;
import p5488io.grpc.p5527g.p5528a.p5529a.C70772a;
import p5488io.grpc.p5527g.p5528a.p5529a.C70782k;
import p5488io.grpc.p5527g.p5528a.p5529a.C70786o;
import p5589m.C71828e;
import p5589m.C71835l;

/* renamed from: io.grpc.g.y */
/* compiled from: PG */
public final class C70844y implements C70387bc, C70826g, C70817ak {

    /* renamed from: D */
    private static final Map f188967D;

    /* renamed from: a */
    public static final Logger f188968a = Logger.getLogger(C70844y.class.getName());

    /* renamed from: A */
    public final int f188969A;

    /* renamed from: B */
    public final C70679ly f188970B;

    /* renamed from: C */
    final C70239bj f188971C;

    /* renamed from: E */
    private final C70248bs f188972E;

    /* renamed from: F */
    private int f188973F;

    /* renamed from: G */
    private final C70633kf f188974G;

    /* renamed from: H */
    private final ScheduledExecutorService f188975H;

    /* renamed from: I */
    private final int f188976I;

    /* renamed from: J */
    private boolean f188977J;

    /* renamed from: K */
    private boolean f188978K;

    /* renamed from: L */
    private final C70468ec f188979L;

    /* renamed from: b */
    public final InetSocketAddress f188980b;

    /* renamed from: c */
    public final String f188981c;

    /* renamed from: d */
    public final String f188982d;

    /* renamed from: e */
    public final Random f188983e = new Random();

    /* renamed from: f */
    public final int f188984f;

    /* renamed from: g */
    public C70555hi f188985g;

    /* renamed from: h */
    public C70827h f188986h;

    /* renamed from: i */
    public C70819am f188987i;

    /* renamed from: j */
    public final Object f188988j;

    /* renamed from: k */
    public final Map f188989k;

    /* renamed from: l */
    public final Executor f188990l;

    /* renamed from: m */
    public int f188991m;

    /* renamed from: n */
    public C70843x f188992n;

    /* renamed from: o */
    public C70256c f188993o;

    /* renamed from: p */
    public Status f188994p;

    /* renamed from: q */
    public C70467eb f188995q;

    /* renamed from: r */
    public boolean f188996r;

    /* renamed from: s */
    public final SocketFactory f188997s;

    /* renamed from: t */
    public SSLSocketFactory f188998t;

    /* renamed from: u */
    public HostnameVerifier f188999u;

    /* renamed from: v */
    public int f189000v;

    /* renamed from: w */
    public final Deque f189001w;

    /* renamed from: x */
    public final C70790c f189002x;

    /* renamed from: y */
    public C70498ff f189003y;

    /* renamed from: z */
    public final Runnable f189004z;

    static {
        EnumMap enumMap = new EnumMap(C70772a.class);
        enumMap.put(C70772a.NO_ERROR, Status.f186915m.withDescription("No error: A GRPC status of OK should have been sent"));
        enumMap.put(C70772a.PROTOCOL_ERROR, Status.f186915m.withDescription("Protocol error"));
        enumMap.put(C70772a.INTERNAL_ERROR, Status.f186915m.withDescription("Internal error"));
        enumMap.put(C70772a.FLOW_CONTROL_ERROR, Status.f186915m.withDescription("Flow control error"));
        enumMap.put(C70772a.STREAM_CLOSED, Status.f186915m.withDescription("Stream closed"));
        enumMap.put(C70772a.FRAME_TOO_LARGE, Status.f186915m.withDescription("Frame too large"));
        enumMap.put(C70772a.REFUSED_STREAM, Status.f186916n.withDescription("Refused stream"));
        enumMap.put(C70772a.CANCEL, Status.f186904b.withDescription("Cancelled"));
        enumMap.put(C70772a.COMPRESSION_ERROR, Status.f186915m.withDescription("Compression error"));
        enumMap.put(C70772a.CONNECT_ERROR, Status.f186915m.withDescription("Connect error"));
        enumMap.put(C70772a.ENHANCE_YOUR_CALM, Status.f186911i.withDescription("Enhance your calm"));
        enumMap.put(C70772a.INADEQUATE_SECURITY, Status.f186909g.withDescription("Inadequate security"));
        f188967D = Collections.unmodifiableMap(enumMap);
    }

    public C70844y(C70834o oVar, InetSocketAddress inetSocketAddress, String str, String str2, C70256c cVar, C58881cr crVar, C70239bj bjVar, Runnable runnable) {
        Object obj = new Object();
        this.f188988j = obj;
        this.f188989k = new HashMap();
        this.f189000v = 0;
        this.f189001w = new LinkedList();
        this.f188979L = new C70839t(this);
        C58838bb.m90866a(inetSocketAddress, "address");
        this.f188980b = inetSocketAddress;
        this.f188981c = str;
        this.f188976I = 4194304;
        this.f188984f = 65535;
        Executor executor = oVar.f188908a;
        C58838bb.m90866a(executor, "executor");
        this.f188990l = executor;
        this.f188974G = new C70633kf(oVar.f188908a);
        ScheduledExecutorService scheduledExecutorService = oVar.f188909b;
        C58838bb.m90866a(scheduledExecutorService, "scheduledExecutorService");
        this.f188975H = scheduledExecutorService;
        this.f188973F = 3;
        this.f188997s = SocketFactory.getDefault();
        this.f188998t = oVar.f188911d;
        this.f188999u = oVar.f188912e;
        C70790c cVar2 = oVar.f188913f;
        C58838bb.m90866a(cVar2, "connectionSpec");
        this.f189002x = cVar2;
        C58838bb.m90866a(crVar, "stopwatchFactory");
        this.f188982d = C70460dv.m102877e("okhttp", str2);
        this.f188971C = bjVar;
        this.f189004z = runnable;
        this.f188969A = Integer.MAX_VALUE;
        this.f188970B = oVar.f188910c.mo62425a();
        this.f188972E = C70248bs.m102395a(C70248bs.m102396b(getClass()), inetSocketAddress.toString());
        C70132a a = C70256c.m102407a();
        a.mo61688b(C70452dn.f187763b, cVar);
        this.f188993o = a.mo61687a();
        synchronized (obj) {
        }
    }

    /* renamed from: b */
    public static Status m103669b(C70772a aVar) {
        Status status = (Status) f188967D.get(aVar);
        if (status != null) {
            return status;
        }
        Status status2 = Status.f186905c;
        int i = aVar.f188718s;
        return status2.withDescription("Unknown http2 error code: " + i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m103670d(p5589m.C71847x r16) {
        /*
            m.e r0 = new m.e
            r0.<init>()
        L_0x0005:
            r1 = 1
            r3 = r16
            long r1 = r3.mo62472a(r0, r1)
            r4 = -1
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0191
            long r1 = r0.f191356b
            long r1 = r1 + r4
            byte r1 = r0.mo63061b(r1)
            r2 = 10
            if (r1 != r2) goto L_0x0005
            long r6 = r0.f191356b
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x002b
            r10 = r6
            goto L_0x002c
        L_0x002b:
            r10 = r8
        L_0x002c:
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x0036
        L_0x0032:
            r1 = r4
            r3 = r1
            goto L_0x00e3
        L_0x0036:
            m.s r1 = r0.f191355a
            if (r1 != 0) goto L_0x003b
            goto L_0x0032
        L_0x003b:
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0092
        L_0x003f:
            int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x0050
            m.s r1 = r1.f191379g
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            int r3 = r1.f191375c
            int r14 = r1.f191374b
            int r3 = r3 - r14
            long r14 = (long) r3
            long r6 = r6 - r14
            goto L_0x003f
        L_0x0050:
            if (r1 != 0) goto L_0x0053
            goto L_0x0032
        L_0x0053:
            r14 = r12
        L_0x0054:
            int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a7
            byte[] r3 = r1.f191373a
            int r8 = r1.f191375c
            long r8 = (long) r8
            int r4 = r1.f191374b
            long r4 = (long) r4
            long r4 = r4 + r10
            long r4 = r4 - r6
            long r4 = java.lang.Math.min(r8, r4)
            int r5 = (int) r4
            int r4 = r1.f191374b
            long r8 = (long) r4
            long r8 = r8 + r14
            long r8 = r8 - r6
            int r4 = (int) r8
        L_0x006d:
            if (r4 >= r5) goto L_0x007c
            byte r8 = r3[r4]
            if (r8 != r2) goto L_0x0079
            int r1 = r1.f191374b
            int r4 = r4 - r1
            long r1 = (long) r4
            long r1 = r1 + r6
            goto L_0x00a9
        L_0x0079:
            int r4 = r4 + 1
            goto L_0x006d
        L_0x007c:
            int r3 = r1.f191375c
            int r4 = r1.f191374b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r14 = r6 + r3
            m.s r1 = r1.f191378f
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            r6 = r14
            r4 = -1
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0054
        L_0x0092:
            r3 = r12
        L_0x0093:
            int r5 = r1.f191375c
            int r6 = r1.f191374b
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r3
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x00a5
            m.s r1 = r1.f191378f
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            r3 = r5
            goto L_0x0093
        L_0x00a5:
            if (r1 != 0) goto L_0x00ac
        L_0x00a7:
            r1 = -1
        L_0x00a9:
            r3 = -1
            goto L_0x00e3
        L_0x00ac:
            r5 = r12
        L_0x00ad:
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a7
            byte[] r7 = r1.f191373a
            int r8 = r1.f191375c
            long r8 = (long) r8
            int r14 = r1.f191374b
            long r14 = (long) r14
            long r14 = r14 + r10
            long r14 = r14 - r3
            long r8 = java.lang.Math.min(r8, r14)
            int r9 = (int) r8
            int r8 = r1.f191374b
            long r14 = (long) r8
            long r14 = r14 + r5
            long r14 = r14 - r3
            int r5 = (int) r14
        L_0x00c6:
            if (r5 >= r9) goto L_0x00d5
            byte r6 = r7[r5]
            if (r6 != r2) goto L_0x00d2
            int r1 = r1.f191374b
            int r5 = r5 - r1
            long r1 = (long) r5
            long r1 = r1 + r3
            goto L_0x00a9
        L_0x00d2:
            int r5 = r5 + 1
            goto L_0x00c6
        L_0x00d5:
            int r5 = r1.f191375c
            int r6 = r1.f191374b
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r3
            m.s r1 = r1.f191378f
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            r3 = r5
            goto L_0x00ad
        L_0x00e3:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00ec
            java.lang.String r0 = p5589m.p5590a.C71820a.m105121a(r0, r1)
            return r0
        L_0x00ec:
            m.e r1 = new m.e
            r1.<init>()
            r2 = 32
            long r4 = r0.f191356b
            long r2 = java.lang.Math.min(r2, r4)
            long r6 = r0.f191356b
            r8 = 0
            r10 = r2
            p5589m.C71824ab.m105127a(r6, r8, r10)
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x015b
            long r4 = r1.f191356b
            long r4 = r4 + r2
            r1.f191356b = r4
            m.s r4 = r0.f191355a
            r5 = r12
        L_0x010d:
            p5462h.p5473f.p5475b.C69664n.m101058d(r4)
            int r7 = r4.f191375c
            int r8 = r4.f191374b
            int r7 = r7 - r8
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x011e
            long r5 = r5 - r7
            m.s r4 = r4.f191378f
            goto L_0x010d
        L_0x011e:
            int r7 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x015b
            p5462h.p5473f.p5475b.C69664n.m101058d(r4)
            m.s r7 = r4.mo63124b()
            int r8 = r7.f191374b
            int r6 = (int) r5
            int r8 = r8 + r6
            r7.f191374b = r8
            int r5 = (int) r2
            int r8 = r8 + r5
            int r5 = r7.f191375c
            int r5 = java.lang.Math.min(r8, r5)
            r7.f191375c = r5
            m.s r5 = r1.f191355a
            if (r5 != 0) goto L_0x0148
            r7.f191379g = r7
            m.s r5 = r7.f191379g
            r7.f191378f = r5
            m.s r5 = r7.f191378f
            r1.f191355a = r5
            goto L_0x0150
        L_0x0148:
            m.s r5 = r5.f191379g
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)
            r5.mo63126d(r7)
        L_0x0150:
            int r5 = r7.f191375c
            int r6 = r7.f191374b
            int r5 = r5 - r6
            long r5 = (long) r5
            long r2 = r2 - r5
            m.s r4 = r4.f191378f
            r5 = r12
            goto L_0x011e
        L_0x015b:
            java.io.EOFException r2 = new java.io.EOFException
            long r3 = r0.f191356b
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r3 = java.lang.Math.min(r3, r5)
            long r5 = r1.f191356b
            m.i r0 = r1.mo63073j(r5)
            java.lang.String r0 = r0.mo63095c()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "\\n not found: limit="
            r1.<init>(r5)
            r1.append(r3)
            java.lang.String r3 = " content="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = "…"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L_0x0191:
            java.io.EOFException r1 = new java.io.EOFException
            long r2 = r0.f191356b
            m.i r0 = r0.mo63073j(r2)
            java.lang.String r0 = r0.mo63095c()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "\\n not found: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            goto L_0x01ac
        L_0x01ab:
            throw r1
        L_0x01ac:
            goto L_0x01ab
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5527g.C70844y.m103670d(m.x):java.lang.String");
    }

    /* renamed from: t */
    private final void m103671t() {
        if (this.f188994p != null && this.f188989k.isEmpty() && this.f189001w.isEmpty() && !this.f188996r) {
            this.f188996r = true;
            C70498ff ffVar = this.f189003y;
            if (ffVar != null) {
                ffVar.mo62221d();
            }
            C70467eb ebVar = this.f188995q;
            if (ebVar != null) {
                Throwable g = mo62551g();
                synchronized (ebVar) {
                    if (!ebVar.f187816d) {
                        ebVar.f187816d = true;
                        ebVar.f187817e = g;
                        Map map = ebVar.f187815c;
                        ebVar.f187815c = null;
                        for (Map.Entry entry : map.entrySet()) {
                            C70467eb.m102898a((Executor) entry.getValue(), new C70466ea((C70496fd) entry.getKey()));
                        }
                    }
                }
                this.f188995q = null;
            }
            if (!this.f188977J) {
                this.f188977J = true;
                this.f188986h.mo62458i(C70772a.NO_ERROR, new byte[0]);
            }
            this.f188986h.close();
        }
    }

    /* renamed from: a */
    public final void mo62539a(Throwable th) {
        mo62556n(0, C70772a.INTERNAL_ERROR, Status.f186916n.mo61678e(th));
    }

    /* renamed from: c */
    public final C70248bs mo61901c() {
        return this.f188972E;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C70372ao mo61824e(C70338di diVar, C70334de deVar, C70851i iVar, C70906u[] uVarArr) {
        Object obj;
        C58838bb.m90866a(diVar, "method");
        C58838bb.m90866a(deVar, "headers");
        C70670lp l = C70670lp.m103313l(uVarArr, this.f188993o);
        Object obj2 = this.f188988j;
        synchronized (obj2) {
            try {
                obj = obj2;
                C70838s sVar = new C70838s(diVar, deVar, this.f188986h, this, this.f188987i, this.f188988j, this.f188976I, this.f188984f, this.f188981c, this.f188982d, l, this.f188970B, iVar);
                return sVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: f */
    public final Runnable mo61825f(C70555hi hiVar) {
        this.f188985g = hiVar;
        C70825f fVar = new C70825f(this.f188974G, this);
        C70823d dVar = new C70823d(fVar, new C70782k(C71835l.m105188a(fVar)));
        synchronized (this.f188988j) {
            this.f188986h = new C70827h(this, dVar);
            this.f188987i = new C70819am(this, this.f188986h);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f188974G.execute(new C70841v(this, countDownLatch, fVar));
        try {
            synchronized (this.f188988j) {
                C70827h hVar = this.f188986h;
                try {
                    ((C70828i) hVar.f188896b).f188898b.mo62451b();
                } catch (IOException e) {
                    hVar.f188895a.mo62539a(e);
                }
                C70786o oVar = new C70786o();
                oVar.mo62481c(7, this.f188984f);
                C70827h hVar2 = this.f188986h;
                hVar2.f188897c.mo62516f(2, oVar);
                try {
                    ((C70828i) hVar2.f188896b).f188898b.mo62456g(oVar);
                } catch (IOException e2) {
                    hVar2.f188895a.mo62539a(e2);
                }
            }
            countDownLatch.countDown();
            this.f188974G.execute(new C70842w(this));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    /* renamed from: g */
    public final Throwable mo62551g() {
        synchronized (this.f188988j) {
            Status status = this.f188994p;
            if (status != null) {
                StatusException asException = status.asException();
                return asException;
            }
            StatusException asException2 = Status.f186916n.withDescription("Connection closed").asException();
            return asException2;
        }
    }

    /* renamed from: h */
    public final void mo62552h(int i, Status status, C70373ap apVar, boolean z, C70772a aVar, C70334de deVar) {
        synchronized (this.f188988j) {
            C70838s sVar = (C70838s) this.f188989k.remove(Integer.valueOf(i));
            if (sVar != null) {
                if (aVar != null) {
                    this.f188986h.mo62455f(i, C70772a.CANCEL);
                }
                if (status != null) {
                    C70837r rVar = sVar.f188954f;
                    if (deVar == null) {
                        deVar = new C70334de();
                    }
                    rVar.mo62131j(status, apVar, z, deVar);
                }
                if (!mo62559r()) {
                    m103671t();
                    mo62553i(sVar);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo62553i(C70838s sVar) {
        if (this.f188978K && this.f189001w.isEmpty() && this.f188989k.isEmpty()) {
            this.f188978K = false;
            C70498ff ffVar = this.f189003y;
            if (ffVar != null) {
                ffVar.mo62220c();
            }
        }
        if (sVar.f187721s) {
            this.f188979L.mo62188c(sVar, false);
        }
    }

    /* renamed from: j */
    public final void mo62554j(C70772a aVar, String str) {
        mo62556n(0, aVar, m103669b(aVar).mo61677b(str));
    }

    /* renamed from: k */
    public final void mo62555k(C70838s sVar) {
        if (!this.f188978K) {
            this.f188978K = true;
            C70498ff ffVar = this.f189003y;
            if (ffVar != null) {
                ffVar.mo62219b();
            }
        }
        if (sVar.f187721s) {
            this.f188979L.mo62188c(sVar, true);
        }
    }

    /* renamed from: l */
    public final void mo61831l(Status status) {
        synchronized (this.f188988j) {
            if (this.f188994p == null) {
                this.f188994p = status;
                this.f188985g.mo62207c(status);
                m103671t();
            }
        }
    }

    /* renamed from: m */
    public final void mo61832m(Status status) {
        mo61831l(status);
        synchronized (this.f188988j) {
            Iterator it = this.f188989k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                it.remove();
                ((C70838s) entry.getValue()).f188954f.mo62131j(status, C70373ap.PROCESSED, false, new C70334de());
                mo62553i((C70838s) entry.getValue());
            }
            for (C70838s sVar : this.f189001w) {
                sVar.f188954f.mo62131j(status, C70373ap.MISCARRIED, true, new C70334de());
                mo62553i(sVar);
            }
            this.f189001w.clear();
            m103671t();
        }
    }

    /* renamed from: n */
    public final void mo62556n(int i, C70772a aVar, Status status) {
        synchronized (this.f188988j) {
            if (this.f188994p == null) {
                this.f188994p = status;
                this.f188985g.mo62207c(status);
            }
            if (aVar != null && !this.f188977J) {
                this.f188977J = true;
                this.f188986h.mo62458i(aVar, new byte[0]);
            }
            Iterator it = this.f188989k.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getKey()).intValue() > i) {
                    it.remove();
                    ((C70838s) entry.getValue()).f188954f.mo62131j(status, C70373ap.REFUSED, false, new C70334de());
                    mo62553i((C70838s) entry.getValue());
                }
            }
            for (C70838s sVar : this.f189001w) {
                sVar.f188954f.mo62131j(status, C70373ap.MISCARRIED, true, new C70334de());
                mo62553i(sVar);
            }
            this.f189001w.clear();
            m103671t();
        }
    }

    /* renamed from: o */
    public final C70256c mo61932o() {
        return this.f188993o;
    }

    /* renamed from: p */
    public final void mo62557p(C70838s sVar) {
        boolean z = true;
        C58838bb.m90884s(sVar.f188954f.f188946w == -1, "StreamId already assigned");
        this.f188989k.put(Integer.valueOf(this.f188973F), sVar);
        mo62555k(sVar);
        C70837r rVar = sVar.f188954f;
        int i = this.f188973F;
        if (rVar.f188946w != -1) {
            z = false;
        }
        C58838bb.m90885t(z, "the stream has been started with id %s", i);
        rVar.f188946w = i;
        C70819am amVar = rVar.f188941h;
        int i2 = amVar.f188876c;
        if (rVar != null) {
            rVar.f188945v = new C70816aj(amVar, i, i2, rVar);
            rVar.f188947x.f188954f.mo61921d();
            if (rVar.f188943t) {
                C70827h hVar = rVar.f188940g;
                try {
                    ((C70828i) hVar.f188896b).f188898b.mo62459j(false, rVar.f188946w, rVar.f188935b);
                } catch (IOException e) {
                    hVar.f188895a.mo62539a(e);
                }
                rVar.f188947x.f188952d.mo62413b();
                rVar.f188935b = null;
                C71828e eVar = rVar.f188936c;
                if (eVar.f191356b > 0) {
                    rVar.f188941h.mo62530a(rVar.f188937d, rVar.f188945v, eVar, rVar.f188938e);
                }
                rVar.f188943t = false;
            }
            C70337dh dhVar = sVar.f188950b.f187496a;
            if (dhVar == C70337dh.UNARY || dhVar == C70337dh.SERVER_STREAMING) {
                boolean z2 = sVar.f188955g;
            } else {
                this.f188986h.mo62453d();
            }
            int i3 = this.f188973F;
            if (i3 >= 2147483645) {
                this.f188973F = Integer.MAX_VALUE;
                mo62556n(Integer.MAX_VALUE, C70772a.NO_ERROR, Status.f186916n.withDescription("Stream ids exhausted"));
                return;
            }
            this.f188973F = i3 + 2;
            return;
        }
        throw new NullPointerException("stream");
    }

    /* renamed from: q */
    public final boolean mo62558q(int i) {
        boolean z;
        synchronized (this.f188988j) {
            z = false;
            if (i < this.f188973F && (i & 1) == 1) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: r */
    public final boolean mo62559r() {
        boolean z = false;
        while (!this.f189001w.isEmpty() && this.f188989k.size() < this.f189000v) {
            mo62557p((C70838s) this.f189001w.poll());
            z = true;
        }
        return z;
    }

    /* renamed from: s */
    public final C70816aj[] mo62528s() {
        C70816aj[] ajVarArr;
        synchronized (this.f188988j) {
            ajVarArr = new C70816aj[this.f188989k.size()];
            int i = 0;
            for (C70838s sVar : this.f188989k.values()) {
                ajVarArr[i] = sVar.f188954f.mo62545f();
                i++;
            }
        }
        return ajVarArr;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("logId", String.valueOf(this.f188972E.f187246a));
        b.mo56102b("address", this.f188980b);
        return b.toString();
    }
}
