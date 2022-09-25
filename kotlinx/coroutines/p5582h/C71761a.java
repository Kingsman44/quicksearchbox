package kotlinx.coroutines.p5582h;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.C71600ba;
import kotlinx.p5572a.C71340c;
import kotlinx.p5572a.C71341d;
import kotlinx.p5572a.C71343f;
import kotlinx.p5572a.C71344g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5479i.C69686a;
import p5462h.p5479i.C69690e;
import p5462h.p5479i.C69691f;

/* renamed from: kotlinx.coroutines.h.a */
/* compiled from: PG */
public final class C71761a extends Thread {

    /* renamed from: a */
    public final C71773m f191247a = new C71773m();

    /* renamed from: b */
    public C71762b f191248b = C71762b.DORMANT;

    /* renamed from: c */
    public final C71340c f191249c = new C71340c(0, C71343f.f190534a);

    /* renamed from: d */
    public boolean f191250d;

    /* renamed from: e */
    final /* synthetic */ C71763c f191251e;

    /* renamed from: f */
    private long f191252f;

    /* renamed from: g */
    private long f191253g;

    /* renamed from: h */
    private int f191254h;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker = C71763c.f191261a;

    public C71761a(C71763c cVar, int i) {
        this.f191251e = cVar;
        setDaemon(true);
        C69690e eVar = C69691f.f186056a;
        this.f191254h = ((C69686a) C69691f.f186057b).mo61403d().nextInt();
        mo62993c(i);
    }

    /* renamed from: e */
    private final C71768h m104952e() {
        if (mo62991a(2) == 0) {
            C71768h hVar = (C71768h) this.f191251e.f191266f.mo62954b();
            if (hVar != null) {
                return hVar;
            }
            return (C71768h) this.f191251e.f191267g.mo62954b();
        }
        C71768h hVar2 = (C71768h) this.f191251e.f191267g.mo62954b();
        if (hVar2 != null) {
            return hVar2;
        }
        return (C71768h) this.f191251e.f191266f.mo62954b();
    }

    /* renamed from: f */
    private final C71768h m104953f(boolean z) {
        long j;
        boolean z2 = C71600ba.f191036a;
        int i = (int) (this.f191251e.f191270j.f190530c & 2097151);
        if (i < 2) {
            return null;
        }
        int a = mo62991a(i);
        C71763c cVar = this.f191251e;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            a++;
            if (a > i) {
                a = 1;
            }
            C71761a aVar = (C71761a) cVar.f191269i.mo62965a(a);
            if (aVar != null && aVar != this) {
                if (z) {
                    C71773m mVar = this.f191247a;
                    C71773m mVar2 = aVar.f191247a;
                    C69664n.m101061g(mVar2, "victim");
                    int i3 = mVar2.f191290d.f190526b;
                    int i4 = mVar2.f191289c.f190526b;
                    AtomicReferenceArray atomicReferenceArray = mVar2.f191287a;
                    while (true) {
                        if (i3 == i4) {
                            break;
                        }
                        int i5 = i3 & 127;
                        if (mVar2.f191291e.f190526b == 0) {
                            break;
                        }
                        C71768h hVar = (C71768h) atomicReferenceArray.get(i5);
                        if (hVar != null && hVar.f191277h.f191278a == 1) {
                            while (!atomicReferenceArray.compareAndSet(i5, hVar, (Object) null)) {
                                if (atomicReferenceArray.get(i5) != hVar) {
                                    i3++;
                                }
                            }
                            C71340c.f190525a.decrementAndGet(mVar2.f191291e);
                            mVar.mo63011c(hVar, false);
                            j = -1;
                            break;
                        }
                        i3++;
                    }
                    j = mVar.mo63010b(mVar2, true);
                } else {
                    C71773m mVar3 = this.f191247a;
                    C71773m mVar4 = aVar.f191247a;
                    C69664n.m101061g(mVar4, "victim");
                    C71768h e = mVar4.mo63013e();
                    if (e != null) {
                        mVar3.mo63011c(e, false);
                        j = -1;
                    } else {
                        j = mVar3.mo63010b(mVar4, false);
                    }
                }
                if (j == -1) {
                    return this.f191247a.mo63012d();
                }
                if (j > 0) {
                    j2 = Math.min(j2, j);
                }
            }
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = 0;
        }
        this.f191253g = j2;
        return null;
    }

    /* renamed from: g */
    private final boolean m104954g() {
        return this.nextParkedWorker != C71763c.f191261a;
    }

    /* renamed from: a */
    public final int mo62991a(int i) {
        int i2 = this.f191254h;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f191254h = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r9 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (r9 != null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        if (r9 != null) goto L_0x0083;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.p5582h.C71768h mo62992b(boolean r9) {
        /*
            r8 = this;
            kotlinx.coroutines.h.b r0 = r8.f191248b
            kotlinx.coroutines.h.b r1 = kotlinx.coroutines.p5582h.C71762b.CPU_ACQUIRED
            r2 = 1
            if (r0 != r1) goto L_0x0008
            goto L_0x0052
        L_0x0008:
            kotlinx.coroutines.h.c r0 = r8.f191251e
            kotlinx.a.d r1 = r0.f191270j
        L_0x000c:
            long r3 = r1.f190530c
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r3
            r7 = 42
            long r5 = r5 >> r7
            int r6 = (int) r5
            if (r6 != 0) goto L_0x0040
            if (r9 == 0) goto L_0x002f
            kotlinx.coroutines.h.m r9 = r8.f191247a
            kotlinx.coroutines.h.h r9 = r9.mo63012d()
            if (r9 != 0) goto L_0x0039
            kotlinx.coroutines.h.c r9 = r8.f191251e
            kotlinx.coroutines.h.f r9 = r9.f191267g
            java.lang.Object r9 = r9.mo62954b()
            kotlinx.coroutines.h.h r9 = (kotlinx.coroutines.p5582h.C71768h) r9
            goto L_0x0039
        L_0x002f:
            kotlinx.coroutines.h.c r9 = r8.f191251e
            kotlinx.coroutines.h.f r9 = r9.f191267g
            java.lang.Object r9 = r9.mo62954b()
            kotlinx.coroutines.h.h r9 = (kotlinx.coroutines.p5582h.C71768h) r9
        L_0x0039:
            if (r9 != 0) goto L_0x003f
            kotlinx.coroutines.h.h r9 = r8.m104953f(r2)
        L_0x003f:
            return r9
        L_0x0040:
            kotlinx.a.d r5 = r0.f191270j
            r6 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r6 = r6 + r3
            boolean r3 = r5.mo62674a(r3, r6)
            if (r3 == 0) goto L_0x000c
            kotlinx.coroutines.h.b r0 = kotlinx.coroutines.p5582h.C71762b.CPU_ACQUIRED
            r8.f191248b = r0
        L_0x0052:
            r0 = 0
            if (r9 == 0) goto L_0x007d
            kotlinx.coroutines.h.c r9 = r8.f191251e
            int r9 = r9.f191262b
            int r9 = r9 + r9
            int r9 = r8.mo62991a(r9)
            if (r9 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            if (r2 == 0) goto L_0x006b
            kotlinx.coroutines.h.h r9 = r8.m104952e()
            if (r9 == 0) goto L_0x006b
            goto L_0x0083
        L_0x006b:
            kotlinx.coroutines.h.m r9 = r8.f191247a
            kotlinx.coroutines.h.h r9 = r9.mo63012d()
            if (r9 == 0) goto L_0x0074
            goto L_0x0083
        L_0x0074:
            if (r2 != 0) goto L_0x0084
            kotlinx.coroutines.h.h r9 = r8.m104952e()
            if (r9 == 0) goto L_0x0084
            goto L_0x0083
        L_0x007d:
            kotlinx.coroutines.h.h r9 = r8.m104952e()
            if (r9 == 0) goto L_0x0084
        L_0x0083:
            return r9
        L_0x0084:
            kotlinx.coroutines.h.h r9 = r8.m104953f(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5582h.C71761a.mo62992b(boolean):kotlinx.coroutines.h.h");
    }

    /* renamed from: c */
    public final void mo62993c(int i) {
        String str = this.f191251e.f191265e;
        String valueOf = i == 0 ? "TERMINATED" : String.valueOf(i);
        setName(str + "-worker-" + valueOf);
        this.indexInArray = i;
    }

    /* renamed from: d */
    public final boolean mo62994d(C71762b bVar) {
        C69664n.m101061g(bVar, "newState");
        C71762b bVar2 = this.f191248b;
        boolean z = bVar2 == C71762b.CPU_ACQUIRED;
        if (z) {
            C71341d.f190528a.addAndGet(this.f191251e.f191270j, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f191248b = bVar;
        }
        return z;
    }

    public final void run() {
        loop0:
        while (true) {
            boolean z = false;
            while (!this.f191251e.f191271k.mo62669a() && this.f191248b != C71762b.TERMINATED) {
                C71768h b = mo62992b(this.f191250d);
                long j = -2097152;
                if (b != null) {
                    this.f191253g = 0;
                    int i = b.f191277h.f191278a;
                    this.f191252f = 0;
                    if (this.f191248b == C71762b.PARKING) {
                        boolean z2 = C71600ba.f191036a;
                        this.f191248b = C71762b.BLOCKING;
                    }
                    if (i != 0 && mo62994d(C71762b.BLOCKING)) {
                        this.f191251e.mo62997b();
                    }
                    C71763c.m104960e(b);
                    if (i != 0) {
                        C71341d.f190528a.addAndGet(this.f191251e.f191270j, -2097152);
                        if (this.f191248b != C71762b.TERMINATED) {
                            boolean z3 = C71600ba.f191036a;
                            this.f191248b = C71762b.DORMANT;
                        }
                    }
                } else {
                    this.f191250d = false;
                    if (this.f191253g != 0) {
                        if (!z) {
                            z = true;
                        } else {
                            mo62994d(C71762b.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f191253g);
                            this.f191253g = 0;
                        }
                    } else if (!m104954g()) {
                        C71763c cVar = this.f191251e;
                        if (this.nextParkedWorker == C71763c.f191261a) {
                            C71341d dVar = cVar.f191268h;
                            while (true) {
                                long j2 = dVar.f190530c;
                                int i2 = this.indexInArray;
                                boolean z4 = C71600ba.f191036a;
                                this.nextParkedWorker = cVar.f191269i.mo62965a((int) (j2 & 2097151));
                                if (cVar.f191268h.mo62674a(j2, ((long) i2) | ((2097152 + j2) & j))) {
                                    break;
                                }
                                j = -2097152;
                            }
                        }
                    } else {
                        boolean z5 = C71600ba.f191036a;
                        this.f191249c.f190526b = -1;
                        while (m104954g() && this.f191249c.f190526b == -1 && !this.f191251e.f191271k.mo62669a() && this.f191248b != C71762b.TERMINATED) {
                            mo62994d(C71762b.PARKING);
                            Thread.interrupted();
                            if (this.f191252f == 0) {
                                this.f191252f = System.nanoTime() + this.f191251e.f191264d;
                            }
                            LockSupport.parkNanos(this.f191251e.f191264d);
                            if (System.nanoTime() - this.f191252f >= 0) {
                                this.f191252f = 0;
                                C71763c cVar2 = this.f191251e;
                                synchronized (cVar2.f191269i) {
                                    if (!cVar2.f191271k.mo62669a()) {
                                        if (((int) (cVar2.f191270j.f190530c & 2097151)) > cVar2.f191262b) {
                                            if (this.f191249c.mo62672a(-1, 1)) {
                                                int i3 = this.indexInArray;
                                                mo62993c(0);
                                                cVar2.mo62996a(this, i3, 0);
                                                C71341d dVar2 = cVar2.f191270j;
                                                long andDecrement = C71341d.f190528a.getAndDecrement(dVar2);
                                                C71344g gVar = dVar2.f190529b;
                                                int i4 = (int) (andDecrement & 2097151);
                                                if (i4 != i3) {
                                                    Object a = cVar2.f191269i.mo62965a(i4);
                                                    C69664n.m101058d(a);
                                                    C71761a aVar = (C71761a) a;
                                                    cVar2.f191269i.mo62966b(i3, aVar);
                                                    aVar.mo62993c(i3);
                                                    cVar2.mo62996a(aVar, i4, i3);
                                                }
                                                cVar2.f191269i.mo62966b(i4, (Object) null);
                                                this.f191248b = C71762b.TERMINATED;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        mo62994d(C71762b.TERMINATED);
    }
}
