package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71808r;
import kotlinx.coroutines.C71810t;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.p5575a.C71431ac;
import kotlinx.coroutines.p5574b.p5575a.C71445b;
import kotlinx.coroutines.p5574b.p5575a.C71446c;
import kotlinx.coroutines.p5574b.p5575a.C71447d;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.df */
/* compiled from: PG */
public class C71556df extends C71445b implements C71547cx, C71577e, C71431ac {

    /* renamed from: a */
    public Object[] f190955a;

    /* renamed from: b */
    public long f190956b;

    /* renamed from: c */
    public long f190957c;

    /* renamed from: f */
    private final int f190958f;

    /* renamed from: g */
    private final int f190959g;

    /* renamed from: h */
    private final C71387t f190960h;

    /* renamed from: i */
    private int f190961i;

    /* renamed from: j */
    private int f190962j;

    public C71556df(int i, int i2, C71387t tVar) {
        C69664n.m101061g(tVar, "onBufferOverflow");
        this.f190958f = i;
        this.f190959g = i2;
        this.f190960h = tVar;
    }

    /* renamed from: e */
    private final int mo62784e() {
        return (int) ((mo62809f() + ((long) this.f190961i)) - this.f190956b);
    }

    /* renamed from: o */
    private final long m104423o() {
        return mo62809f() + ((long) this.f190961i);
    }

    /* renamed from: p */
    private final long m104424p() {
        return mo62809f() + ((long) this.f190961i) + ((long) this.f190962j);
    }

    /* renamed from: q */
    private final long m104425q(C71558dh dhVar) {
        long j = dhVar.f190964a;
        if (j < m104423o()) {
            return j;
        }
        if (this.f190959g <= 0 && j <= mo62809f() && this.f190962j != 0) {
            return j;
        }
        return -1;
    }

    /* renamed from: r */
    private final void m104426r() {
        C71447d[] dVarArr;
        Object[] objArr = this.f190955a;
        C69664n.m101058d(objArr);
        C71557dg.m104446d(objArr, mo62809f(), (Object) null);
        this.f190961i--;
        long f = mo62809f() + 1;
        if (this.f190956b < f) {
            this.f190956b = f;
        }
        if (this.f190957c < f) {
            if (!(this.f190667e == 0 || (dVarArr = this.f190666d) == null)) {
                for (C71447d dVar : dVarArr) {
                    if (dVar != null) {
                        C71558dh dhVar = (C71558dh) dVar;
                        long j = dhVar.f190964a;
                        if (j >= 0 && j < f) {
                            dhVar.f190964a = f;
                        }
                    }
                }
            }
            this.f190957c = f;
        }
        boolean z = C71600ba.f191036a;
    }

    /* renamed from: s */
    private final void m104427s(Object obj) {
        int i = this.f190961i + this.f190962j;
        Object[] objArr = this.f190955a;
        if (objArr == null) {
            objArr = m104430v((Object[]) null, 0, 2);
        } else {
            int length = objArr.length;
            if (i >= length) {
                objArr = m104430v(objArr, i, length + length);
            }
        }
        C71557dg.m104446d(objArr, mo62809f() + ((long) i), obj);
    }

    /* renamed from: t */
    private final void m104428t(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        boolean z = C71600ba.f191036a;
        for (long f = mo62809f(); f < min; f++) {
            Object[] objArr = this.f190955a;
            C69664n.m101058d(objArr);
            C71557dg.m104446d(objArr, f, (Object) null);
        }
        this.f190956b = j;
        this.f190957c = j2;
        this.f190961i = (int) (j3 - min);
        this.f190962j = (int) (j4 - j3);
    }

    /* renamed from: u */
    private final boolean m104429u(Object obj) {
        if (this.f190667e == 0) {
            boolean z = C71600ba.f191036a;
            if (this.f190958f != 0) {
                m104427s(obj);
                int i = this.f190961i + 1;
                this.f190961i = i;
                if (i > this.f190958f) {
                    m104426r();
                }
                this.f190957c = mo62809f() + ((long) this.f190961i);
            }
            return true;
        }
        if (this.f190961i >= this.f190959g && this.f190957c <= this.f190956b) {
            C71387t tVar = this.f190960h;
            C71387t tVar2 = C71387t.SUSPEND;
            int ordinal = tVar.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        m104427s(obj);
        int i2 = this.f190961i + 1;
        this.f190961i = i2;
        if (i2 > this.f190959g) {
            m104426r();
        }
        if (mo62784e() > this.f190958f) {
            m104428t(1 + this.f190956b, this.f190957c, m104423o(), m104424p());
        }
        return true;
    }

    /* renamed from: v */
    private final Object[] m104430v(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.f190955a = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long f = mo62809f();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + f;
                C71557dg.m104446d(objArr2, j, C71557dg.m104443a(objArr, j));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: h.c.g[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: h.c.g[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: h.c.g[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r4 = (kotlinx.coroutines.p5574b.C71558dh) r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p5462h.p5466c.C69577g[] m104431w(p5462h.p5466c.C69577g[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            int r1 = r11.f190667e
            if (r1 == 0) goto L_0x0045
            kotlinx.coroutines.b.a.d[] r1 = r11.f190666d
            if (r1 == 0) goto L_0x0045
            int r2 = r1.length
            r3 = 0
        L_0x000b:
            if (r3 >= r2) goto L_0x0045
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0042
            kotlinx.coroutines.b.dh r4 = (kotlinx.coroutines.p5574b.C71558dh) r4
            h.c.g r5 = r4.f190965b
            if (r5 != 0) goto L_0x0018
            goto L_0x0042
        L_0x0018:
            long r6 = r11.m104425q(r4)
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0042
            r6 = r12
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r7 = r6.length
            if (r0 < r7) goto L_0x0037
            r12 = 2
            int r7 = r7 + r7
            int r12 = java.lang.Math.max(r12, r7)
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r6, r12)
            java.lang.String r6 = "copyOf(this, newSize)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r6)
        L_0x0037:
            int r6 = r0 + 1
            r7 = r12
            h.c.g[] r7 = (p5462h.p5466c.C69577g[]) r7
            r7[r0] = r5
            r0 = 0
            r4.f190965b = r0
            r0 = r6
        L_0x0042:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0045:
            h.c.g[] r12 = (p5462h.p5466c.C69577g[]) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71556df.m104431w(h.c.g[]):h.c.g[]");
    }

    /* renamed from: a */
    public final Object mo20883a(Object obj, C69577g gVar) {
        C69577g[] gVarArr;
        C71554dd ddVar;
        if (mo62806d(obj)) {
            return C69788q.f186170a;
        }
        C71808r rVar = new C71808r(C69555b.m100961b(gVar), 1);
        rVar.mo63041A();
        C69577g[] gVarArr2 = C71446c.f190668a;
        synchronized (this) {
            if (m104429u(obj)) {
                rVar.mo61338mb(C69788q.f186170a);
                gVarArr = m104431w(gVarArr2);
                ddVar = null;
            } else {
                C71554dd ddVar2 = new C71554dd(this, ((long) (this.f190961i + this.f190962j)) + mo62809f(), obj, rVar);
                m104427s(ddVar2);
                this.f190962j++;
                if (this.f190959g == 0) {
                    gVarArr2 = m104431w(gVarArr2);
                }
                gVarArr = gVarArr2;
                ddVar = ddVar2;
            }
        }
        if (ddVar != null) {
            C71810t.m105092b(rVar, ddVar);
        }
        for (C69577g gVar2 : gVarArr) {
            if (gVar2 != null) {
                gVar2.mo61338mb(C69788q.f186170a);
            }
        }
        Object n = rVar.mo63043n();
        if (n == C69554a.COROUTINE_SUSPENDED) {
            C69664n.m101061g(gVar, "frame");
        }
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (n != aVar) {
            n = C69788q.f186170a;
        }
        return n != aVar ? C69788q.f186170a : n;
    }

    /* renamed from: c */
    public final void mo62805c() {
        synchronized (this) {
            m104428t(m104423o(), this.f190957c, m104423o(), m104424p());
        }
    }

    /* renamed from: d */
    public final boolean mo62806d(Object obj) {
        int i;
        boolean z;
        C69577g[] gVarArr = C71446c.f190668a;
        synchronized (this) {
            if (m104429u(obj)) {
                gVarArr = m104431w(gVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (C69577g gVar : gVarArr) {
            if (gVar != null) {
                gVar.mo61338mb(C69788q.f186170a);
            }
        }
        return z;
    }

    /* renamed from: f */
    public final long mo62809f() {
        return Math.min(this.f190957c, this.f190956b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Object mo62810h() {
        Object[] objArr = this.f190955a;
        C69664n.m101058d(objArr);
        return C71557dg.m104443a(objArr, (this.f190956b + ((long) mo62784e())) - 1);
    }

    /* renamed from: i */
    public final /* synthetic */ C71447d mo62787i() {
        return new C71558dh();
    }

    /* renamed from: j */
    public final void mo62811j() {
        if (this.f190959g != 0 || this.f190962j > 1) {
            Object[] objArr = this.f190955a;
            C69664n.m101058d(objArr);
            while (this.f190962j > 0 && C71557dg.m104443a(objArr, (mo62809f() + ((long) (this.f190961i + this.f190962j))) - 1) == C71557dg.f190963a) {
                this.f190962j--;
                C71557dg.m104446d(objArr, mo62809f() + ((long) (this.f190961i + this.f190962j)), (Object) null);
            }
        }
    }

    /* renamed from: k */
    public final C69577g[] mo62812k(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        C71447d[] dVarArr;
        boolean z = C71600ba.f191036a;
        if (j > this.f190957c) {
            return C71446c.f190668a;
        }
        long f = mo62809f();
        long j5 = ((long) this.f190961i) + f;
        if (this.f190959g == 0 && this.f190962j > 0) {
            j5++;
        }
        int i2 = 0;
        if (!(this.f190667e == 0 || (dVarArr = this.f190666d) == null)) {
            for (C71447d dVar : dVarArr) {
                if (dVar != null) {
                    long j6 = ((C71558dh) dVar).f190964a;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.f190957c) {
            return C71446c.f190668a;
        }
        long o = m104423o();
        if (this.f190667e > 0) {
            i = Math.min(this.f190962j, this.f190959g - ((int) (o - j5)));
        } else {
            i = this.f190962j;
        }
        C69577g[] gVarArr = C71446c.f190668a;
        long j7 = ((long) this.f190962j) + o;
        if (i > 0) {
            gVarArr = new C69577g[i];
            Object[] objArr = this.f190955a;
            C69664n.m101058d(objArr);
            j3 = o;
            while (true) {
                if (o >= j7) {
                    j2 = j5;
                    break;
                }
                Object a = C71557dg.m104443a(objArr, o);
                j2 = j5;
                if (a != C71557dg.f190963a) {
                    C69664n.m101059e(a, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C71554dd ddVar = (C71554dd) a;
                    int i3 = i2 + 1;
                    gVarArr[i2] = ddVar.f190947d;
                    C71557dg.m104446d(objArr, o, C71557dg.f190963a);
                    C71557dg.m104446d(objArr, j3, ddVar.f190946c);
                    j4 = 1;
                    j3++;
                    if (i3 >= i) {
                        break;
                    }
                    i2 = i3;
                } else {
                    j4 = 1;
                }
                o += j4;
                j5 = j2;
            }
        } else {
            j2 = j5;
            j3 = o;
        }
        C69577g[] gVarArr2 = gVarArr;
        int i4 = (int) (j3 - f);
        long j8 = this.f190667e == 0 ? j3 : j2;
        long max = Math.max(this.f190956b, j3 - ((long) Math.min(this.f190958f, i4)));
        if (this.f190959g == 0 && max < j7) {
            Object[] objArr2 = this.f190955a;
            C69664n.m101058d(objArr2);
            if (C69664n.m101066l(C71557dg.m104443a(objArr2, max), C71557dg.f190963a)) {
                j3++;
                max++;
            }
        }
        m104428t(max, j8, j3, j7);
        mo62811j();
        if (gVarArr2.length == 0) {
            return gVarArr2;
        }
        return m104431w(gVarArr2);
    }

    /* renamed from: l */
    public final /* synthetic */ C71447d[] mo62788l() {
        return (C71447d[]) new C71558dh[2];
    }

    /* renamed from: mo */
    public final C71587n mo62783mo(C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        return C71557dg.m104444b(this, oVar, i, tVar);
    }

    /* renamed from: mp */
    public final Object mo38165mp(C71588o oVar, C69577g gVar) {
        return m104422g(this, oVar, gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v29, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: kotlinx.coroutines.cp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: kotlinx.coroutines.b.df} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v32, resolved type: kotlinx.coroutines.b.df} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    static /* synthetic */ java.lang.Object m104422g(kotlinx.coroutines.p5574b.C71556df r19, kotlinx.coroutines.p5574b.C71588o r20, p5462h.p5466c.C69577g r21) {
        /*
            r1 = r19
            r0 = r20
            r2 = r21
            boolean r3 = r2 instanceof kotlinx.coroutines.p5574b.C71555de
            if (r3 == 0) goto L_0x0019
            r3 = r2
            kotlinx.coroutines.b.de r3 = (kotlinx.coroutines.p5574b.C71555de) r3
            int r4 = r3.f190954g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f190954g = r4
            goto L_0x001e
        L_0x0019:
            kotlinx.coroutines.b.de r3 = new kotlinx.coroutines.b.de
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f190952e
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f190954g
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x006f
            if (r5 == r8) goto L_0x005e
            if (r5 == r7) goto L_0x004a
            if (r5 != r6) goto L_0x0042
            java.lang.Object r0 = r3.f190951d
            java.lang.Object r1 = r3.f190950c
            java.lang.Object r5 = r3.f190949b
            java.lang.Object r9 = r3.f190948a
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x0059 }
            r2 = r1
            r1 = r9
        L_0x003c:
            r18 = r5
            r5 = r0
            r0 = r18
            goto L_0x0089
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x004a:
            java.lang.Object r0 = r3.f190951d
            java.lang.Object r1 = r3.f190950c
            java.lang.Object r5 = r3.f190949b
            java.lang.Object r9 = r3.f190948a
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x0059 }
            r2 = r1
            r1 = r9
            goto L_0x012b
        L_0x0059:
            r0 = move-exception
            r2 = r1
            r1 = r9
            goto L_0x015d
        L_0x005e:
            java.lang.Object r1 = r3.f190950c
            java.lang.Object r0 = r3.f190949b
            java.lang.Object r5 = r3.f190948a
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x006a }
            r2 = r1
            r1 = r5
            goto L_0x007c
        L_0x006a:
            r0 = move-exception
            r2 = r1
            r1 = r5
            goto L_0x015d
        L_0x006f:
            p5462h.C69714l.m101134b(r2)
            kotlinx.coroutines.b.a.d r2 = r19.mo62789m()
            kotlinx.coroutines.b.dh r2 = (kotlinx.coroutines.p5574b.C71558dh) r2
            boolean r5 = r0 instanceof kotlinx.coroutines.p5574b.C71576dz     // Catch:{ all -> 0x014e }
            if (r5 != 0) goto L_0x0150
        L_0x007c:
            h.c.o r5 = r3.f185974s     // Catch:{ all -> 0x014e }
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)     // Catch:{ all -> 0x014e }
            kotlinx.coroutines.co r9 = kotlinx.coroutines.C71643cp.f191083c     // Catch:{ all -> 0x014e }
            h.c.l r5 = r5.get(r9)     // Catch:{ all -> 0x014e }
            kotlinx.coroutines.cp r5 = (kotlinx.coroutines.C71643cp) r5     // Catch:{ all -> 0x014e }
        L_0x0089:
            r18 = r5
            r5 = r0
            r0 = r18
        L_0x008e:
            h.c.g[] r9 = kotlinx.coroutines.p5574b.p5575a.C71446c.f190668a     // Catch:{ all -> 0x014e }
            monitor-enter(r1)     // Catch:{ all -> 0x014e }
            r10 = r1
            kotlinx.coroutines.b.df r10 = (kotlinx.coroutines.p5574b.C71556df) r10     // Catch:{ all -> 0x014b }
            r11 = r2
            kotlinx.coroutines.b.dh r11 = (kotlinx.coroutines.p5574b.C71558dh) r11     // Catch:{ all -> 0x014b }
            long r10 = r10.m104425q(r11)     // Catch:{ all -> 0x014b }
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x00a4
            kotlinx.coroutines.e.ap r10 = kotlinx.coroutines.p5574b.C71557dg.f190963a     // Catch:{ all -> 0x014b }
            goto L_0x00d0
        L_0x00a4:
            r9 = r2
            kotlinx.coroutines.b.dh r9 = (kotlinx.coroutines.p5574b.C71558dh) r9     // Catch:{ all -> 0x014b }
            long r14 = r9.f190964a     // Catch:{ all -> 0x014b }
            r9 = r1
            kotlinx.coroutines.b.df r9 = (kotlinx.coroutines.p5574b.C71556df) r9     // Catch:{ all -> 0x014b }
            java.lang.Object[] r9 = r9.f190955a     // Catch:{ all -> 0x014b }
            p5462h.p5473f.p5475b.C69664n.m101058d(r9)     // Catch:{ all -> 0x014b }
            java.lang.Object r9 = kotlinx.coroutines.p5574b.C71557dg.m104443a(r9, r10)     // Catch:{ all -> 0x014b }
            boolean r6 = r9 instanceof kotlinx.coroutines.p5574b.C71554dd     // Catch:{ all -> 0x014b }
            if (r6 == 0) goto L_0x00be
            kotlinx.coroutines.b.dd r9 = (kotlinx.coroutines.p5574b.C71554dd) r9     // Catch:{ all -> 0x014b }
            java.lang.Object r6 = r9.f190946c     // Catch:{ all -> 0x014b }
            goto L_0x00bf
        L_0x00be:
            r6 = r9
        L_0x00bf:
            r16 = 1
            long r10 = r10 + r16
            r9 = r2
            kotlinx.coroutines.b.dh r9 = (kotlinx.coroutines.p5574b.C71558dh) r9     // Catch:{ all -> 0x014b }
            r9.f190964a = r10     // Catch:{ all -> 0x014b }
            r9 = r1
            kotlinx.coroutines.b.df r9 = (kotlinx.coroutines.p5574b.C71556df) r9     // Catch:{ all -> 0x014b }
            h.c.g[] r9 = r9.mo62812k(r14)     // Catch:{ all -> 0x014b }
            r10 = r6
        L_0x00d0:
            monitor-exit(r1)     // Catch:{ all -> 0x014e }
            int r6 = r9.length     // Catch:{ all -> 0x014e }
            r11 = 0
        L_0x00d3:
            if (r11 >= r6) goto L_0x00e1
            r14 = r9[r11]     // Catch:{ all -> 0x014e }
            if (r14 == 0) goto L_0x00de
            h.q r15 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x014e }
            r14.mo61338mb(r15)     // Catch:{ all -> 0x014e }
        L_0x00de:
            int r11 = r11 + 1
            goto L_0x00d3
        L_0x00e1:
            kotlinx.coroutines.e.ap r6 = kotlinx.coroutines.p5574b.C71557dg.f190963a     // Catch:{ all -> 0x014e }
            if (r10 != r6) goto L_0x0132
            r3.f190948a = r1     // Catch:{ all -> 0x014e }
            r3.f190949b = r5     // Catch:{ all -> 0x014e }
            r3.f190950c = r2     // Catch:{ all -> 0x014e }
            r3.f190951d = r0     // Catch:{ all -> 0x014e }
            r3.f190954g = r7     // Catch:{ all -> 0x014e }
            kotlinx.coroutines.r r6 = new kotlinx.coroutines.r     // Catch:{ all -> 0x014e }
            h.c.g r9 = p5462h.p5466c.p5467a.C69555b.m100961b(r3)     // Catch:{ all -> 0x014e }
            r6.<init>(r9, r8)     // Catch:{ all -> 0x014e }
            r6.mo63041A()     // Catch:{ all -> 0x014e }
            monitor-enter(r1)     // Catch:{ all -> 0x014e }
            r9 = r1
            kotlinx.coroutines.b.df r9 = (kotlinx.coroutines.p5574b.C71556df) r9     // Catch:{ all -> 0x012f }
            r10 = r2
            kotlinx.coroutines.b.dh r10 = (kotlinx.coroutines.p5574b.C71558dh) r10     // Catch:{ all -> 0x012f }
            long r9 = r9.m104425q(r10)     // Catch:{ all -> 0x012f }
            int r11 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0110
            r9 = r2
            kotlinx.coroutines.b.dh r9 = (kotlinx.coroutines.p5574b.C71558dh) r9     // Catch:{ all -> 0x012f }
            r9.f190965b = r6     // Catch:{ all -> 0x012f }
            goto L_0x0115
        L_0x0110:
            h.q r9 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x012f }
            r6.mo61338mb(r9)     // Catch:{ all -> 0x012f }
        L_0x0115:
            monitor-exit(r1)     // Catch:{ all -> 0x014e }
            java.lang.Object r6 = r6.mo63043n()     // Catch:{ all -> 0x014e }
            h.c.a.a r9 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x014e }
            if (r6 != r9) goto L_0x0123
            java.lang.String r9 = "frame"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r9)     // Catch:{ all -> 0x014e }
        L_0x0123:
            h.c.a.a r9 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ all -> 0x014e }
            if (r6 == r9) goto L_0x0129
            h.q r6 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x014e }
        L_0x0129:
            if (r6 == r4) goto L_0x012e
        L_0x012b:
            r6 = 3
            goto L_0x008e
        L_0x012e:
            return r4
        L_0x012f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x014e }
            throw r0     // Catch:{ all -> 0x014e }
        L_0x0132:
            if (r0 == 0) goto L_0x0137
            kotlinx.coroutines.C71647ct.m104642f(r0)     // Catch:{ all -> 0x014e }
        L_0x0137:
            r3.f190948a = r1     // Catch:{ all -> 0x014e }
            r3.f190949b = r5     // Catch:{ all -> 0x014e }
            r3.f190950c = r2     // Catch:{ all -> 0x014e }
            r3.f190951d = r0     // Catch:{ all -> 0x014e }
            r6 = 3
            r3.f190954g = r6     // Catch:{ all -> 0x014e }
            java.lang.Object r9 = r5.mo20883a(r10, r3)     // Catch:{ all -> 0x014e }
            if (r9 == r4) goto L_0x014a
            goto L_0x003c
        L_0x014a:
            return r4
        L_0x014b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x014e }
            throw r0     // Catch:{ all -> 0x014e }
        L_0x014e:
            r0 = move-exception
            goto L_0x015d
        L_0x0150:
            r4 = r0
            kotlinx.coroutines.b.dz r4 = (kotlinx.coroutines.p5574b.C71576dz) r4     // Catch:{ all -> 0x014e }
            r3.f190948a = r1     // Catch:{ all -> 0x014e }
            r3.f190949b = r0     // Catch:{ all -> 0x014e }
            r3.f190950c = r2     // Catch:{ all -> 0x014e }
            r3.f190954g = r8     // Catch:{ all -> 0x014e }
            r0 = 0
            throw r0     // Catch:{ all -> 0x014e }
        L_0x015d:
            kotlinx.coroutines.b.a.b r1 = (kotlinx.coroutines.p5574b.p5575a.C71445b) r1
            kotlinx.coroutines.b.a.d r2 = (kotlinx.coroutines.p5574b.p5575a.C71447d) r2
            r1.mo62790n(r2)
            goto L_0x0166
        L_0x0165:
            throw r0
        L_0x0166:
            goto L_0x0165
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5574b.C71556df.m104422g(kotlinx.coroutines.b.df, kotlinx.coroutines.b.o, h.c.g):java.lang.Object");
    }
}
