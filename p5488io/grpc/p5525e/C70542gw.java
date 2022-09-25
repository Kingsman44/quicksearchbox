package p5488io.grpc.p5525e;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;
import com.google.common.base.C58872ci;
import com.google.common.base.C58881cr;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70244bo;
import p5488io.grpc.C70246bq;
import p5488io.grpc.C70247br;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70280ci;
import p5488io.grpc.C70285cn;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70339dj;
import p5488io.grpc.C70340dk;
import p5488io.grpc.C70341dl;
import p5488io.grpc.C70345dp;
import p5488io.grpc.C70699ed;
import p5488io.grpc.C70765fe;
import p5488io.grpc.C70766ff;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70896k;
import p5488io.grpc.C70898m;
import p5488io.grpc.C70903r;
import p5488io.grpc.C70911z;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.gw */
/* compiled from: PG */
final class C70542gw extends C70286co implements C70247br {

    /* renamed from: a */
    static final Logger f187958a = Logger.getLogger(C70542gw.class.getName());

    /* renamed from: b */
    static final Pattern f187959b = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: c */
    static final Status f187960c = Status.f186916n.withDescription("Channel shutdownNow invoked");

    /* renamed from: d */
    static final Status f187961d = Status.f186916n.withDescription("Channel shutdown invoked");

    /* renamed from: e */
    static final Status f187962e = Status.f186916n.withDescription("Subchannel shutdown invoked");

    /* renamed from: f */
    public static final C70554hh f187963f = new C70554hh((C70552hf) null, new HashMap(), new HashMap(), (C70624jx) null, (Object) null, (Map) null);

    /* renamed from: g */
    public static final C70246bq f187964g = new C70502fj();

    /* renamed from: h */
    public static final C70898m f187965h = new C70509fq();

    /* renamed from: A */
    public final C70414cc f187966A;

    /* renamed from: B */
    public final C70541gv f187967B = new C70541gv(this);

    /* renamed from: C */
    public final AtomicBoolean f187968C = new AtomicBoolean(false);

    /* renamed from: D */
    public boolean f187969D;

    /* renamed from: E */
    public boolean f187970E;

    /* renamed from: F */
    public volatile boolean f187971F;

    /* renamed from: G */
    public final CountDownLatch f187972G = new CountDownLatch(1);

    /* renamed from: H */
    public final C70358aa f187973H;

    /* renamed from: I */
    public final C70359ab f187974I;

    /* renamed from: J */
    public final C70361ad f187975J;

    /* renamed from: K */
    public final C70896k f187976K;

    /* renamed from: L */
    public final C70244bo f187977L;

    /* renamed from: M */
    public final C70536gq f187978M;

    /* renamed from: N */
    public C70554hh f187979N = f187963f;

    /* renamed from: O */
    public final C70554hh f187980O;

    /* renamed from: P */
    public boolean f187981P = false;

    /* renamed from: Q */
    public final boolean f187982Q;

    /* renamed from: R */
    public final C70607jg f187983R = new C70607jg();

    /* renamed from: S */
    public final long f187984S;

    /* renamed from: T */
    public final long f187985T;

    /* renamed from: U */
    public final boolean f187986U;

    /* renamed from: V */
    final C70468ec f187987V;

    /* renamed from: W */
    public C70765fe f187988W;

    /* renamed from: X */
    public final C70588io f187989X;

    /* renamed from: Y */
    public int f187990Y = 1;

    /* renamed from: Z */
    public C70443de f187991Z;

    /* renamed from: aa */
    public final C70512ft f187992aa;

    /* renamed from: ab */
    private final String f187993ab;

    /* renamed from: ac */
    private final C70341dl f187994ac;

    /* renamed from: ad */
    private final C70339dj f187995ad;

    /* renamed from: ae */
    private final C70690u f187996ae;

    /* renamed from: af */
    private final C70567hu f187997af;

    /* renamed from: ag */
    private final C70517fy f187998ag;

    /* renamed from: ah */
    private final C70517fy f187999ah;

    /* renamed from: ai */
    private final long f188000ai;

    /* renamed from: aj */
    private boolean f188001aj;

    /* renamed from: ak */
    private final Set f188002ak = new HashSet(1, 0.75f);

    /* renamed from: al */
    private final C70555hi f188003al;

    /* renamed from: i */
    public final C70248bs f188004i;

    /* renamed from: j */
    public final C70377at f188005j;

    /* renamed from: k */
    public final C70537gr f188006k;

    /* renamed from: l */
    public final Executor f188007l;

    /* renamed from: m */
    public final C70675lu f188008m;

    /* renamed from: n */
    final C70766ff f188009n;

    /* renamed from: o */
    public final C70156at f188010o;

    /* renamed from: p */
    public final C70911z f188011p;

    /* renamed from: q */
    public final C70389be f188012q = new C70389be();

    /* renamed from: r */
    public final C70888j f188013r;

    /* renamed from: s */
    public final String f188014s;

    /* renamed from: t */
    public C70345dp f188015t;

    /* renamed from: u */
    public C70523gd f188016u;

    /* renamed from: v */
    public volatile C70280ci f188017v;

    /* renamed from: w */
    public boolean f188018w;

    /* renamed from: x */
    public final Set f188019x = new HashSet(16, 0.75f);

    /* renamed from: y */
    public Collection f188020y;

    /* renamed from: z */
    public final Object f188021z = new Object();

    public C70542gw(C70549hc hcVar, C70377at atVar, C70567hu huVar, C58881cr crVar, List list, C70675lu luVar) {
        C70549hc hcVar2 = hcVar;
        C70377at atVar2 = atVar;
        C70675lu luVar2 = luVar;
        C70766ff ffVar = new C70766ff(new C70508fp(this));
        this.f188009n = ffVar;
        C70516fx fxVar = new C70516fx(this);
        this.f188003al = fxVar;
        this.f187987V = new C70518fz(this);
        this.f187992aa = new C70512ft(this);
        String str = hcVar2.f188039g;
        C58838bb.m90866a(str, "target");
        this.f187993ab = str;
        C70248bs a = C70248bs.m102395a("Channel", str);
        this.f188004i = a;
        this.f188008m = luVar2;
        C70567hu huVar2 = hcVar2.f188035c;
        C58838bb.m90866a(huVar2, "executorPool");
        this.f187997af = huVar2;
        Executor executor = (Executor) huVar2.mo62162a();
        C58838bb.m90866a(executor, "executor");
        this.f188007l = executor;
        C70567hu huVar3 = hcVar2.f188036d;
        C58838bb.m90866a(huVar3, "offloadExecutorPool");
        C70517fy fyVar = new C70517fy(huVar3);
        this.f187999ah = fyVar;
        C70694y yVar = new C70694y(atVar2, fyVar);
        this.f188005j = yVar;
        new C70694y(atVar2, fyVar);
        C70537gr grVar = new C70537gr(yVar.mo57961b());
        this.f188006k = grVar;
        long a2 = luVar.mo62424a();
        C70361ad adVar = new C70361ad(a, a2, "Channel for '" + str + "'");
        this.f187975J = adVar;
        C70360ac acVar = new C70360ac(adVar, luVar2);
        this.f187976K = acVar;
        C70699ed edVar = C70460dv.f187794m;
        boolean z = hcVar2.f188045m;
        this.f187986U = z;
        C70690u uVar = new C70690u(C70285cn.m102471b());
        this.f187996ae = uVar;
        C70628ka kaVar = new C70628ka(z, uVar);
        Integer valueOf = Integer.valueOf(hcVar2.f188053u.mo62287a());
        edVar.getClass();
        C70339dj djVar = r4;
        C70694y yVar2 = yVar;
        C70517fy fyVar2 = fyVar;
        C70537gr grVar2 = grVar;
        C70339dj djVar2 = new C70339dj(valueOf, edVar, ffVar, kaVar, grVar2, acVar, fyVar2);
        this.f187995ad = djVar;
        C70341dl dlVar = hcVar2.f188038f;
        this.f187994ac = dlVar;
        this.f188015t = m103010t(str, dlVar, djVar);
        this.f187998ag = new C70517fy(huVar);
        C70414cc ccVar = new C70414cc(executor, ffVar);
        this.f187966A = ccVar;
        ccVar.f187659f = fxVar;
        ccVar.f187656c = new C70408bx(fxVar);
        ccVar.f187657d = new C70409by(fxVar);
        ccVar.f187658e = new C70410bz(fxVar);
        Map map = hcVar2.f188047o;
        if (map != null) {
            C70340dk a3 = kaVar.mo62054a(map);
            Status status = a3.f187510a;
            C58838bb.m90887v(status == null, "Default config is invalid: %s", status);
            C70554hh hhVar = (C70554hh) a3.f187511b;
            this.f187980O = hhVar;
            this.f187979N = hhVar;
        } else {
            this.f187980O = null;
        }
        this.f187982Q = true;
        C70536gq gqVar = new C70536gq(this, this.f188015t.mo57969a());
        this.f187978M = gqVar;
        this.f188013r = C70903r.m103829a(gqVar, list);
        C58838bb.m90866a(crVar, "stopwatchSupplier");
        long j = hcVar2.f188044l;
        if (j == -1) {
            this.f188000ai = -1;
        } else {
            C58838bb.m90872g(j >= C70549hc.f188028b, "invalid idleTimeoutMillis %s", j);
            this.f188000ai = hcVar2.f188044l;
        }
        this.f187989X = new C70588io(new C70520ga(this), ffVar, yVar2.mo57961b(), new C58872ci());
        C70156at atVar3 = hcVar2.f188042j;
        C58838bb.m90866a(atVar3, "decompressorRegistry");
        this.f188010o = atVar3;
        C70911z zVar = hcVar2.f188043k;
        C58838bb.m90866a(zVar, "compressorRegistry");
        this.f188011p = zVar;
        this.f188014s = hcVar2.f188040h;
        this.f187985T = 16777216;
        this.f187984S = 1048576;
        C70504fl flVar = new C70504fl(luVar);
        this.f187973H = flVar;
        this.f187974I = flVar.mo62073a();
        C70244bo boVar = hcVar2.f188046n;
        boVar.getClass();
        this.f187977L = boVar;
        C70244bo.m102392b(boVar.f187238d, this);
    }

    /* renamed from: t */
    private static C70345dp m103010t(String str, C70341dl dlVar, C70339dj djVar) {
        URI uri;
        C70345dp c;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri != null && (c = dlVar.mo57975c(uri, djVar)) != null) {
            return c;
        }
        boolean matches = f187959b.matcher(str).matches();
        String str2 = BuildConfig.FLAVOR;
        if (!matches) {
            try {
                C70345dp c2 = dlVar.mo57975c(new URI(dlVar.mo57976d(), str2, "/" + str, (String) null), djVar);
                if (c2 != null) {
                    return c2;
                }
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (sb.length() > 0) {
            str2 = " (" + sb + ")";
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    /* renamed from: a */
    public final C70898m mo39510a(C70338di diVar, C70851i iVar) {
        return this.f188013r.mo39510a(diVar, iVar);
    }

    /* renamed from: b */
    public final String mo39511b() {
        return this.f188013r.mo39511b();
    }

    /* renamed from: c */
    public final C70248bs mo61901c() {
        return this.f188004i;
    }

    /* renamed from: d */
    public final boolean mo61972d(long j, TimeUnit timeUnit) {
        return this.f187972G.await(j, timeUnit);
    }

    /* renamed from: e */
    public final boolean mo61973e() {
        return this.f187968C.get();
    }

    /* renamed from: h */
    public final void mo61976h() {
        this.f188012q.mo62107b();
    }

    /* renamed from: i */
    public final Executor mo62275i(C70851i iVar) {
        Executor executor = iVar.f189017c;
        return executor == null ? this.f188007l : executor;
    }

    /* renamed from: j */
    public final void mo62276j() {
        this.f188009n.mo62447d();
        C70765fe feVar = this.f187988W;
        if (feVar != null) {
            feVar.mo62443a();
            this.f187988W = null;
            this.f187991Z = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo62277k() {
        this.f188009n.mo62447d();
        if (!this.f187968C.get() && !this.f188018w) {
            if (!this.f187987V.f187818b.isEmpty()) {
                this.f187989X.mo62341b(false);
            } else {
                mo62281o();
            }
            if (this.f188016u == null) {
                this.f187976K.mo62076a(2, "Exiting idle mode");
                C70523gd gdVar = new C70523gd(this);
                gdVar.f187914a = new C70685p(this.f187996ae, gdVar);
                this.f188016u = gdVar;
                this.f188015t.mo57972d(new C70526gg(this, gdVar, this.f188015t));
                this.f188001aj = true;
            }
        }
    }

    /* renamed from: l */
    public final void mo62278l() {
        if (this.f187969D) {
            for (C70493fa faVar : this.f188019x) {
                Status status = f187960c;
                faVar.mo62215h(status);
                C70766ff ffVar = faVar.f187857e;
                ffVar.mo62446c(new C70481ep(faVar, status));
                ffVar.mo62445b();
            }
            Iterator it = this.f188002ak.iterator();
            if (it.hasNext()) {
                C70568hv hvVar = (C70568hv) it.next();
                throw null;
            }
        }
    }

    /* renamed from: m */
    public final void mo62279m() {
        if (!this.f187971F && this.f187968C.get() && this.f188019x.isEmpty() && this.f188002ak.isEmpty()) {
            this.f187976K.mo62076a(2, "Terminated");
            C70244bo.m102393c(this.f187977L.f187238d, this);
            this.f187997af.mo62163b(this.f188007l);
            this.f187998ag.mo62237b();
            this.f187999ah.mo62237b();
            this.f188005j.close();
            this.f187971F = true;
            this.f187972G.countDown();
        }
    }

    /* renamed from: n */
    public final void mo62280n() {
        this.f188009n.mo62447d();
        if (this.f188001aj) {
            this.f188015t.mo62055e();
        }
    }

    /* renamed from: o */
    public final void mo62281o() {
        long j = this.f188000ai;
        if (j != -1) {
            C70588io ioVar = this.f187989X;
            long nanos = TimeUnit.MILLISECONDS.toNanos(j);
            long a = ioVar.mo62340a() + nanos;
            ioVar.f188173e = true;
            if (a - ioVar.f188172d < 0 || ioVar.f188174f == null) {
                ScheduledFuture scheduledFuture = ioVar.f188174f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ioVar.f188174f = ioVar.f188169a.schedule(new C70587in(ioVar), nanos, TimeUnit.NANOSECONDS);
            }
            ioVar.f188172d = a;
        }
    }

    /* renamed from: p */
    public final void mo62282p(boolean z) {
        this.f188009n.mo62447d();
        if (z) {
            C58838bb.m90884s(this.f188001aj, "nameResolver is not started");
            C58838bb.m90884s(this.f188016u != null, "lbHelper is null");
        }
        if (this.f188015t != null) {
            mo62276j();
            this.f188015t.mo57971c();
            this.f188001aj = false;
            if (z) {
                this.f188015t = m103010t(this.f187993ab, this.f187994ac, this.f187995ad);
            } else {
                this.f188015t = null;
            }
        }
        C70523gd gdVar = this.f188016u;
        if (gdVar != null) {
            C70685p pVar = gdVar.f187914a;
            pVar.f188422b.mo61961c();
            pVar.f188422b = null;
            this.f188016u = null;
        }
        this.f188017v = null;
    }

    /* renamed from: q */
    public final void mo62283q(C70280ci ciVar) {
        this.f188017v = ciVar;
        this.f187966A.mo62134a(ciVar);
    }

    /* renamed from: r */
    public final void mo61974f() {
        this.f187976K.mo62076a(1, "shutdown() called");
        if (this.f187968C.compareAndSet(false, true)) {
            C70766ff ffVar = this.f188009n;
            ffVar.mo62446c(new C70506fn(this));
            ffVar.mo62445b();
            C70536gq gqVar = this.f187978M;
            C70766ff ffVar2 = gqVar.f187938c.f188009n;
            ffVar2.mo62446c(new C70528gi(gqVar));
            ffVar2.mo62445b();
            C70766ff ffVar3 = this.f188009n;
            ffVar3.mo62446c(new C70503fk(this));
            ffVar3.mo62445b();
        }
    }

    /* renamed from: s */
    public final void mo61975g() {
        this.f187976K.mo62076a(1, "shutdownNow() called");
        mo61974f();
        C70536gq gqVar = this.f187978M;
        C70766ff ffVar = gqVar.f187938c.f188009n;
        ffVar.mo62446c(new C70529gj(gqVar));
        ffVar.mo62445b();
        C70766ff ffVar2 = this.f188009n;
        ffVar2.mo62446c(new C70507fo(this));
        ffVar2.mo62445b();
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56103c("logId", String.valueOf(this.f188004i.f187246a));
        b.mo56102b("target", this.f187993ab);
        return b.toString();
    }
}
