package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p5488io.grpc.C70153aq;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70766ff;
import p5488io.grpc.C70904s;
import p5488io.grpc.C70910y;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.jy */
/* compiled from: PG */
abstract class C70625jy implements C70372ao {

    /* renamed from: e */
    static final C70297cz f188243e = new C70290cs("grpc-previous-rpc-attempts", C70334de.f187481c);

    /* renamed from: f */
    static final C70297cz f188244f = new C70290cs("grpc-retry-pushback-ms", C70334de.f187481c);

    /* renamed from: g */
    public static final Status f188245g = Status.f186904b.withDescription("Stream thrown away because RetriableStream committed");

    /* renamed from: h */
    public static final Random f188246h = new Random();

    /* renamed from: A */
    public C70608jh f188247A;

    /* renamed from: B */
    public C70608jh f188248B;

    /* renamed from: C */
    public long f188249C;

    /* renamed from: D */
    public boolean f188250D;

    /* renamed from: a */
    private final C70334de f188251a;

    /* renamed from: b */
    private Status f188252b;

    /* renamed from: i */
    public final C70338di f188253i;

    /* renamed from: j */
    public final Executor f188254j;

    /* renamed from: k */
    public final Executor f188255k = new C70766ff(new C70589ip());

    /* renamed from: l */
    public final ScheduledExecutorService f188256l;

    /* renamed from: m */
    public final C70626jz f188257m;

    /* renamed from: n */
    public final C70461dw f188258n;

    /* renamed from: o */
    public final boolean f188259o;

    /* renamed from: p */
    public final Object f188260p = new Object();

    /* renamed from: q */
    public final C70607jg f188261q;

    /* renamed from: r */
    public final long f188262r;

    /* renamed from: s */
    public final long f188263s;

    /* renamed from: t */
    public final C70624jx f188264t;

    /* renamed from: u */
    public final C70469ed f188265u = new C70469ed();

    /* renamed from: v */
    public volatile C70612jl f188266v = new C70612jl(new ArrayList(8), Collections.emptyList(), (Collection) null, (C70623jw) null, false, false, false, 0);

    /* renamed from: w */
    public final AtomicBoolean f188267w = new AtomicBoolean();

    /* renamed from: x */
    public final AtomicInteger f188268x = new AtomicInteger();

    /* renamed from: y */
    public long f188269y;

    /* renamed from: z */
    public C70374aq f188270z;

    public C70625jy(C70338di diVar, C70334de deVar, C70607jg jgVar, long j, long j2, Executor executor, ScheduledExecutorService scheduledExecutorService, C70626jz jzVar, C70461dw dwVar, C70624jx jxVar) {
        C70626jz jzVar2 = jzVar;
        C70461dw dwVar2 = dwVar;
        this.f188253i = diVar;
        this.f188261q = jgVar;
        this.f188262r = j;
        this.f188263s = j2;
        this.f188254j = executor;
        this.f188256l = scheduledExecutorService;
        this.f188251a = deVar;
        this.f188257m = jzVar2;
        if (jzVar2 != null) {
            this.f188249C = jzVar2.f188272b;
        }
        this.f188258n = dwVar2;
        boolean z = false;
        C58838bb.m90869d(jzVar2 == null || dwVar2 == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f188259o = dwVar2 != null ? true : z;
        this.f188264t = jxVar;
    }

    /* renamed from: a */
    public final C70256c mo61755a() {
        if (this.f188266v.f188209f != null) {
            return this.f188266v.f188209f.f188235a.mo61755a();
        }
        return C70256c.f187254a;
    }

    /* renamed from: b */
    public final void mo61756b(C70469ed edVar) {
        C70612jl jlVar;
        synchronized (this.f188260p) {
            edVar.mo62190b("closed", this.f188265u);
            jlVar = this.f188266v;
        }
        if (jlVar.f188209f != null) {
            C70469ed edVar2 = new C70469ed();
            jlVar.f188209f.f188235a.mo61756b(edVar2);
            edVar.mo62190b("committed", edVar2);
            return;
        }
        C70469ed edVar3 = new C70469ed();
        for (C70623jw jwVar : jlVar.f188206c) {
            C70469ed edVar4 = new C70469ed();
            jwVar.f188235a.mo61756b(edVar4);
            edVar3.mo62189a(edVar4);
        }
        edVar.mo62190b("open", edVar3);
    }

    /* renamed from: c */
    public final void mo61757c(Status status) {
        C70623jw jwVar;
        C70623jw jwVar2 = new C70623jw(0);
        jwVar2.f188235a = new C70566ht();
        Runnable t = mo62367t(jwVar2);
        if (t != null) {
            t.run();
            C70766ff ffVar = (C70766ff) this.f188255k;
            ffVar.mo62446c(new C70604jd(this, status));
            ffVar.mo62445b();
            return;
        }
        synchronized (this.f188260p) {
            if (this.f188266v.f188206c.contains(this.f188266v.f188209f)) {
                jwVar = this.f188266v.f188209f;
            } else {
                this.f188252b = status;
                jwVar = null;
            }
            C70612jl jlVar = this.f188266v;
            this.f188266v = new C70612jl(jlVar.f188205b, jlVar.f188206c, jlVar.f188207d, jlVar.f188209f, true, jlVar.f188204a, jlVar.f188211h, jlVar.f188208e);
        }
        if (jwVar != null) {
            jwVar.f188235a.mo61757c(status);
        }
    }

    /* renamed from: d */
    public final void mo61758d() {
        C70612jl jlVar = this.f188266v;
        if (jlVar.f188204a) {
            jlVar.f188209f.f188235a.mo61758d();
        } else {
            mo62369v(new C70594iu());
        }
    }

    /* renamed from: e */
    public final void mo61759e() {
        mo62369v(new C70595iv());
    }

    /* renamed from: f */
    public final void mo61760f() {
        mo62369v(new C70598iy());
    }

    /* renamed from: g */
    public final void mo61761g(int i) {
        C70612jl jlVar = this.f188266v;
        if (jlVar.f188204a) {
            jlVar.f188209f.f188235a.mo61761g(i);
        } else {
            mo62369v(new C70599iz(i));
        }
    }

    /* renamed from: h */
    public final void mo61762h(C70910y yVar) {
        mo62369v(new C70591ir(yVar));
    }

    /* renamed from: i */
    public final void mo61763i(C70153aq aqVar) {
        mo62369v(new C70592is(aqVar));
    }

    /* renamed from: j */
    public final void mo61764j(C70156at atVar) {
        mo62369v(new C70593it(atVar));
    }

    /* renamed from: k */
    public final void mo61765k(int i) {
        mo62369v(new C70596iw(i));
    }

    /* renamed from: l */
    public final void mo61766l(int i) {
        mo62369v(new C70597ix(i));
    }

    /* renamed from: m */
    public final void mo61767m(C70374aq aqVar) {
        C70608jh jhVar;
        C70624jx jxVar;
        this.f188270z = aqVar;
        Status p = mo62231p();
        if (p != null) {
            mo61757c(p);
            return;
        }
        synchronized (this.f188260p) {
            this.f188266v.f188205b.add(new C70611jk(this));
        }
        C70623jw s = mo62366s(0, false);
        if (this.f188259o) {
            synchronized (this.f188260p) {
                this.f188266v = this.f188266v.mo62351a(s);
                jhVar = null;
                if (mo62372y(this.f188266v) && ((jxVar = this.f188264t) == null || jxVar.mo62362a())) {
                    jhVar = new C70608jh(this.f188260p);
                    this.f188248B = jhVar;
                }
            }
            if (jhVar != null) {
                jhVar.mo62348b(this.f188256l.schedule(new C70610jj(this, jhVar), this.f188258n.f187803b, TimeUnit.NANOSECONDS));
            }
        }
        mo62370w(s);
    }

    /* renamed from: n */
    public final void mo61768n(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    /* renamed from: o */
    public final boolean mo61769o() {
        for (C70623jw jwVar : this.f188266v.f188206c) {
            if (jwVar.f188235a.mo61769o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public abstract Status mo62231p();

    /* renamed from: q */
    public abstract C70372ao mo62232q(C70334de deVar, C70904s sVar, int i, boolean z);

    /* renamed from: r */
    public abstract void mo62233r();

    /* renamed from: s */
    public final C70623jw mo62366s(int i, boolean z) {
        C70623jw jwVar = new C70623jw(i);
        C70602jb jbVar = new C70602jb(new C70606jf(this, jwVar));
        C70334de deVar = this.f188251a;
        C70334de deVar2 = new C70334de();
        deVar2.mo62032g(deVar);
        if (i > 0) {
            deVar2.mo62033h(f188243e, String.valueOf(i));
        }
        jwVar.f188235a = mo62232q(deVar2, jbVar, i, z);
        return jwVar;
    }

    /* renamed from: t */
    public final Runnable mo62367t(C70623jw jwVar) {
        Set set;
        List list;
        Future future;
        Future future2;
        synchronized (this.f188260p) {
            if (this.f188266v.f188209f != null) {
                return null;
            }
            Collection collection = this.f188266v.f188206c;
            C70612jl jlVar = this.f188266v;
            boolean z = true;
            C58838bb.m90884s(jlVar.f188209f == null, "Already committed");
            List list2 = jlVar.f188205b;
            if (jlVar.f188206c.contains(jwVar)) {
                list = null;
                set = Collections.singleton(jwVar);
            } else {
                list = list2;
                set = Collections.emptyList();
                z = false;
            }
            this.f188266v = new C70612jl(list, set, jlVar.f188207d, jwVar, jlVar.f188210g, z, jlVar.f188211h, jlVar.f188208e);
            this.f188261q.f188196a.addAndGet(-this.f188269y);
            C70608jh jhVar = this.f188247A;
            if (jhVar != null) {
                Future a = jhVar.mo62347a();
                this.f188247A = null;
                future = a;
            } else {
                future = null;
            }
            C70608jh jhVar2 = this.f188248B;
            if (jhVar2 != null) {
                Future a2 = jhVar2.mo62347a();
                this.f188248B = null;
                future2 = a2;
            } else {
                future2 = null;
            }
            C70590iq iqVar = new C70590iq(this, collection, jwVar, future, future2);
            return iqVar;
        }
    }

    /* renamed from: u */
    public final void mo62368u(C70623jw jwVar) {
        Runnable t = mo62367t(jwVar);
        if (t != null) {
            t.run();
        }
    }

    /* renamed from: v */
    public final void mo62369v(C70605je jeVar) {
        Collection<C70623jw> collection;
        synchronized (this.f188260p) {
            if (!this.f188266v.f188204a) {
                this.f188266v.f188205b.add(jeVar);
            }
            collection = this.f188266v.f188206c;
        }
        for (C70623jw a : collection) {
            jeVar.mo62344a(a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        com.google.common.base.C58838bb.m90884s(!r8.f188204a, "Already passThrough");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r0.f188236b == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r4 = r8.f188206c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r8.f188206c.isEmpty() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r4 = java.util.Collections.singletonList(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        r4 = new java.util.ArrayList(r8.f188206c);
        r4.add(r0);
        r4 = java.util.Collections.unmodifiableCollection(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r4 = r8.f188209f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r4 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r6 = r8.f188205b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005e, code lost:
        if (r15 == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        if (r4 != r0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        com.google.common.base.C58838bb.m90884s(r2, "Another RPC attempt has already committed");
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        r10 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006b, code lost:
        r1.f188266v = new p5488io.grpc.p5525e.C70612jl(r10, r11, r8.f188207d, r8.f188209f, r8.f188210g, r15, r8.f188211h, r8.f188208e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        if (mo61769o() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0087, code lost:
        r3 = new p5488io.grpc.p5525e.C70603jc(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00da, code lost:
        r5 = r6.size();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00df, code lost:
        if (r7 >= r5) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e1, code lost:
        r8 = (p5488io.grpc.p5525e.C70605je) r6.get(r7);
        r8.mo62344a(r0);
        r4 = r4 | (r8 instanceof p5488io.grpc.p5525e.C70611jk);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ed, code lost:
        if (r4 == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ef, code lost:
        r8 = r1.f188266v;
        r10 = r8.f188209f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f3, code lost:
        if (r10 == null) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f5, code lost:
        if (r10 == r0) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fa, code lost:
        if (r8.f188210g == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fd, code lost:
        r7 = r7 + 1;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62370w(p5488io.grpc.p5525e.C70623jw r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = 0
            r3 = 0
            r6 = r3
            r4 = 0
            r5 = 0
        L_0x0009:
            java.lang.Object r7 = r1.f188260p
            monitor-enter(r7)
            io.grpc.e.jl r8 = r1.f188266v     // Catch:{ all -> 0x0103 }
            if (r4 == 0) goto L_0x0020
            io.grpc.e.jw r9 = r8.f188209f     // Catch:{ all -> 0x0103 }
            if (r9 == 0) goto L_0x0019
            if (r9 == r0) goto L_0x0019
            monitor-exit(r7)     // Catch:{ all -> 0x0103 }
            goto L_0x008d
        L_0x0019:
            boolean r9 = r8.f188210g     // Catch:{ all -> 0x0103 }
            if (r9 == 0) goto L_0x0020
            monitor-exit(r7)     // Catch:{ all -> 0x0103 }
            goto L_0x008d
        L_0x0020:
            java.util.List r9 = r8.f188205b     // Catch:{ all -> 0x0103 }
            int r9 = r9.size()     // Catch:{ all -> 0x0103 }
            if (r5 != r9) goto L_0x00ad
            boolean r4 = r8.f188204a     // Catch:{ all -> 0x0103 }
            r5 = 1
            r4 = r4 ^ r5
            java.lang.String r6 = "Already passThrough"
            com.google.common.base.C58838bb.m90884s(r4, r6)     // Catch:{ all -> 0x0103 }
            boolean r4 = r0.f188236b     // Catch:{ all -> 0x0103 }
            if (r4 == 0) goto L_0x0039
            java.util.Collection r4 = r8.f188206c     // Catch:{ all -> 0x0103 }
        L_0x0037:
            r11 = r4
            goto L_0x0055
        L_0x0039:
            java.util.Collection r4 = r8.f188206c     // Catch:{ all -> 0x0103 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0103 }
            if (r4 == 0) goto L_0x0046
            java.util.List r4 = java.util.Collections.singletonList(r19)     // Catch:{ all -> 0x0103 }
            goto L_0x0037
        L_0x0046:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0103 }
            java.util.Collection r6 = r8.f188206c     // Catch:{ all -> 0x0103 }
            r4.<init>(r6)     // Catch:{ all -> 0x0103 }
            r4.add(r0)     // Catch:{ all -> 0x0103 }
            java.util.Collection r4 = java.util.Collections.unmodifiableCollection(r4)     // Catch:{ all -> 0x0103 }
            goto L_0x0037
        L_0x0055:
            io.grpc.e.jw r4 = r8.f188209f     // Catch:{ all -> 0x0103 }
            if (r4 == 0) goto L_0x005b
            r15 = 1
            goto L_0x005c
        L_0x005b:
            r15 = 0
        L_0x005c:
            java.util.List r6 = r8.f188205b     // Catch:{ all -> 0x0103 }
            if (r15 == 0) goto L_0x006a
            if (r4 != r0) goto L_0x0063
            r2 = 1
        L_0x0063:
            java.lang.String r4 = "Another RPC attempt has already committed"
            com.google.common.base.C58838bb.m90884s(r2, r4)     // Catch:{ all -> 0x0103 }
            r10 = r3
            goto L_0x006b
        L_0x006a:
            r10 = r6
        L_0x006b:
            io.grpc.e.jl r2 = new io.grpc.e.jl     // Catch:{ all -> 0x0103 }
            java.util.Collection r12 = r8.f188207d     // Catch:{ all -> 0x0103 }
            io.grpc.e.jw r13 = r8.f188209f     // Catch:{ all -> 0x0103 }
            boolean r14 = r8.f188210g     // Catch:{ all -> 0x0103 }
            boolean r3 = r8.f188211h     // Catch:{ all -> 0x0103 }
            int r4 = r8.f188208e     // Catch:{ all -> 0x0103 }
            r9 = r2
            r16 = r3
            r17 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0103 }
            r1.f188266v = r2     // Catch:{ all -> 0x0103 }
            boolean r2 = r18.mo61769o()     // Catch:{ all -> 0x0103 }
            if (r2 == 0) goto L_0x00ab
            io.grpc.e.jc r3 = new io.grpc.e.jc     // Catch:{ all -> 0x0103 }
            r3.<init>(r1)     // Catch:{ all -> 0x0103 }
            monitor-exit(r7)     // Catch:{ all -> 0x0103 }
        L_0x008d:
            if (r3 == 0) goto L_0x009a
            java.util.concurrent.Executor r0 = r1.f188255k
            io.grpc.ff r0 = (p5488io.grpc.C70766ff) r0
            r0.mo62446c(r3)
            r0.mo62445b()
            return
        L_0x009a:
            io.grpc.e.ao r2 = r0.f188235a
            io.grpc.e.jl r3 = r1.f188266v
            io.grpc.e.jw r3 = r3.f188209f
            if (r3 != r0) goto L_0x00a5
            io.grpc.Status r0 = r1.f188252b
            goto L_0x00a7
        L_0x00a5:
            io.grpc.Status r0 = f188245g
        L_0x00a7:
            r2.mo61757c(r0)
            return
        L_0x00ab:
            monitor-exit(r7)     // Catch:{ all -> 0x0103 }
            return
        L_0x00ad:
            boolean r9 = r0.f188236b     // Catch:{ all -> 0x0103 }
            if (r9 == 0) goto L_0x00b3
            monitor-exit(r7)     // Catch:{ all -> 0x0103 }
            return
        L_0x00b3:
            int r9 = r5 + 128
            java.util.List r10 = r8.f188205b     // Catch:{ all -> 0x0103 }
            int r10 = r10.size()     // Catch:{ all -> 0x0103 }
            int r9 = java.lang.Math.min(r9, r10)     // Catch:{ all -> 0x0103 }
            if (r6 != 0) goto L_0x00cd
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0103 }
            java.util.List r8 = r8.f188205b     // Catch:{ all -> 0x0103 }
            java.util.List r5 = r8.subList(r5, r9)     // Catch:{ all -> 0x0103 }
            r6.<init>(r5)     // Catch:{ all -> 0x0103 }
            goto L_0x00d9
        L_0x00cd:
            r6.clear()     // Catch:{ all -> 0x0103 }
            java.util.List r8 = r8.f188205b     // Catch:{ all -> 0x0103 }
            java.util.List r5 = r8.subList(r5, r9)     // Catch:{ all -> 0x0103 }
            r6.addAll(r5)     // Catch:{ all -> 0x0103 }
        L_0x00d9:
            monitor-exit(r7)     // Catch:{ all -> 0x0103 }
            int r5 = r6.size()
            r7 = 0
        L_0x00df:
            if (r7 >= r5) goto L_0x0100
            java.lang.Object r8 = r6.get(r7)
            io.grpc.e.je r8 = (p5488io.grpc.p5525e.C70605je) r8
            r8.mo62344a(r0)
            boolean r8 = r8 instanceof p5488io.grpc.p5525e.C70611jk
            r4 = r4 | r8
            if (r4 == 0) goto L_0x00fd
            io.grpc.e.jl r8 = r1.f188266v
            io.grpc.e.jw r10 = r8.f188209f
            if (r10 == 0) goto L_0x00f8
            if (r10 == r0) goto L_0x00f8
            goto L_0x0100
        L_0x00f8:
            boolean r8 = r8.f188210g
            if (r8 == 0) goto L_0x00fd
            goto L_0x0100
        L_0x00fd:
            int r7 = r7 + 1
            goto L_0x00df
        L_0x0100:
            r5 = r9
            goto L_0x0009
        L_0x0103:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0103 }
            goto L_0x0107
        L_0x0106:
            throw r0
        L_0x0107:
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70625jy.mo62370w(io.grpc.e.jw):void");
    }

    /* renamed from: x */
    public final void mo62371x() {
        Future future;
        synchronized (this.f188260p) {
            C70608jh jhVar = this.f188248B;
            future = null;
            if (jhVar != null) {
                Future a = jhVar.mo62347a();
                this.f188248B = null;
                future = a;
            }
            this.f188266v = this.f188266v.mo62352b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* renamed from: y */
    public final boolean mo62372y(C70612jl jlVar) {
        return jlVar.f188209f == null && jlVar.f188208e < this.f188258n.f187802a && !jlVar.f188211h;
    }
}
