package p5488io.p5490b.p5497e.p5502e.p5507e;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import org.p5649d.C72639b;
import org.p5649d.C72640c;
import p5488io.p5490b.C70094g;
import p5488io.p5490b.p5495c.C69814g;
import p5488io.p5490b.p5497e.p5500c.C69845d;
import p5488io.p5490b.p5497e.p5500c.C69847f;
import p5488io.p5490b.p5497e.p5509f.C70037c;
import p5488io.p5490b.p5497e.p5512i.C70079c;

/* renamed from: io.b.e.e.e.c */
/* compiled from: PG */
final class C69999c extends AtomicInteger implements C70094g {
    private static final long serialVersionUID = -4470634016609963609L;

    /* renamed from: a */
    final C72639b[] f186581a;

    /* renamed from: b */
    final AtomicLongArray f186582b;

    /* renamed from: c */
    final long[] f186583c;

    /* renamed from: d */
    final int f186584d;

    /* renamed from: e */
    final int f186585e;

    /* renamed from: f */
    C72640c f186586f;

    /* renamed from: g */
    C69847f f186587g;

    /* renamed from: h */
    Throwable f186588h;

    /* renamed from: i */
    volatile boolean f186589i;

    /* renamed from: j */
    int f186590j;

    /* renamed from: k */
    volatile boolean f186591k;

    /* renamed from: l */
    final AtomicInteger f186592l = new AtomicInteger();

    /* renamed from: m */
    int f186593m;

    /* renamed from: n */
    int f186594n;

    public C69999c(C72639b[] bVarArr, int i) {
        this.f186581a = bVarArr;
        this.f186584d = i;
        this.f186585e = i - (i >> 2);
        int length = bVarArr.length;
        int i2 = length + length;
        AtomicLongArray atomicLongArray = new AtomicLongArray(i2 + 1);
        this.f186582b = atomicLongArray;
        atomicLongArray.lazySet(i2, (long) length);
        this.f186583c = new long[length];
    }

    /* renamed from: a */
    public final void mo61494a(C72640c cVar) {
        if (C70079c.m101977h(this.f186586f, cVar)) {
            this.f186586f = cVar;
            if (cVar instanceof C69845d) {
                C69845d dVar = (C69845d) cVar;
                int lM = dVar.mo61478lM(7);
                if (lM == 1) {
                    this.f186594n = 1;
                    this.f186587g = dVar;
                    this.f186589i = true;
                    mo61565c();
                    mo61564b();
                    return;
                } else if (lM == 2) {
                    this.f186594n = 2;
                    this.f186587g = dVar;
                    mo61565c();
                    cVar.mo61489e((long) this.f186584d);
                    return;
                }
            }
            this.f186587g = new C70037c(this.f186584d);
            mo61565c();
            cVar.mo61489e((long) this.f186584d);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x014b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61564b() {
        /*
            r21 = this;
            r1 = r21
            int r0 = r21.getAndIncrement()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            int r0 = r1.f186594n
            r2 = 1
            r4 = 0
            r7 = 1
            if (r0 != r7) goto L_0x009b
            io.b.e.c.f r0 = r1.f186587g
            org.d.b[] r8 = r1.f186581a
            java.util.concurrent.atomic.AtomicLongArray r9 = r1.f186582b
            long[] r10 = r1.f186583c
            int r11 = r10.length
            int r12 = r1.f186590j
            r13 = 1
        L_0x001e:
            r14 = 0
        L_0x001f:
            boolean r15 = r1.f186591k
            if (r15 == 0) goto L_0x0027
            r0.mo61475c()
            return
        L_0x0027:
            boolean r15 = r0.mo61476i()
            if (r15 == 0) goto L_0x0039
            int r0 = r8.length
            r6 = 0
        L_0x002f:
            if (r6 >= r0) goto L_0x014a
            r2 = r8[r6]
            r2.mo61499lK()
            int r6 = r6 + 1
            goto L_0x002f
        L_0x0039:
            long r15 = r9.get(r12)
            r17 = r10[r12]
            int r19 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r19 == 0) goto L_0x0080
            int r15 = r11 + r12
            long r15 = r9.get(r15)
            int r19 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r19 != 0) goto L_0x0080
            java.lang.Object r14 = r0.mo61479lN()     // Catch:{ all -> 0x006a }
            if (r14 != 0) goto L_0x005f
            int r0 = r8.length
            r6 = 0
        L_0x0055:
            if (r6 >= r0) goto L_0x014a
            r2 = r8[r6]
            r2.mo61499lK()
            int r6 = r6 + 1
            goto L_0x0055
        L_0x005f:
            r15 = r8[r12]
            r15.mo61498g(r14)
            long r17 = r17 + r2
            r10[r12] = r17
            r14 = 0
            goto L_0x0081
        L_0x006a:
            r0 = move-exception
            r2 = r0
            p5488io.p5490b.p5495c.C69813f.m101292a(r2)
            org.d.c r0 = r1.f186586f
            r0.mo61490lP()
            int r0 = r8.length
            r6 = 0
        L_0x0076:
            if (r6 >= r0) goto L_0x014a
            r3 = r8[r6]
            r3.mo61497f(r2)
            int r6 = r6 + 1
            goto L_0x0076
        L_0x0080:
            int r14 = r14 + r7
        L_0x0081:
            int r12 = r12 + 1
            if (r12 != r11) goto L_0x0086
            r12 = 0
        L_0x0086:
            if (r14 != r11) goto L_0x001f
            int r14 = r21.get()
            if (r14 != r13) goto L_0x0099
            r1.f186590j = r12
            int r13 = -r13
            int r13 = r1.addAndGet(r13)
            if (r13 != 0) goto L_0x001e
            goto L_0x014a
        L_0x0099:
            r13 = r14
            goto L_0x001e
        L_0x009b:
            io.b.e.c.f r0 = r1.f186587g
            org.d.b[] r8 = r1.f186581a
            java.util.concurrent.atomic.AtomicLongArray r9 = r1.f186582b
            long[] r10 = r1.f186583c
            int r11 = r10.length
            int r12 = r1.f186590j
            int r13 = r1.f186593m
            r14 = 1
        L_0x00a9:
            r15 = 0
        L_0x00aa:
            boolean r6 = r1.f186591k
            if (r6 == 0) goto L_0x00b2
            r0.mo61475c()
            return
        L_0x00b2:
            boolean r6 = r1.f186589i
            if (r6 == 0) goto L_0x00c9
            java.lang.Throwable r7 = r1.f186588h
            if (r7 == 0) goto L_0x00c9
            r0.mo61475c()
            int r0 = r8.length
            r6 = 0
        L_0x00bf:
            if (r6 >= r0) goto L_0x014a
            r2 = r8[r6]
            r2.mo61497f(r7)
            int r6 = r6 + 1
            goto L_0x00bf
        L_0x00c9:
            boolean r7 = r0.mo61476i()
            if (r6 == 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00e0
            int r0 = r8.length
            r6 = 0
        L_0x00d3:
            if (r6 >= r0) goto L_0x014a
            r2 = r8[r6]
            r2.mo61499lK()
            int r6 = r6 + 1
            goto L_0x00d3
        L_0x00dd:
            if (r7 == 0) goto L_0x00e0
            goto L_0x00fa
        L_0x00e0:
            long r6 = r9.get(r12)
            r18 = r10[r12]
            int r20 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r20 == 0) goto L_0x012b
            int r6 = r11 + r12
            long r6 = r9.get(r6)
            int r20 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r20 != 0) goto L_0x012b
            java.lang.Object r6 = r0.mo61479lN()     // Catch:{ all -> 0x0115 }
            if (r6 != 0) goto L_0x00fc
        L_0x00fa:
            r2 = 1
            goto L_0x0139
        L_0x00fc:
            r7 = r8[r12]
            r7.mo61498g(r6)
            long r18 = r18 + r2
            r10[r12] = r18
            int r13 = r13 + 1
            int r6 = r1.f186585e
            if (r13 != r6) goto L_0x0112
            org.d.c r6 = r1.f186586f
            long r2 = (long) r13
            r6.mo61489e(r2)
            r13 = 0
        L_0x0112:
            r2 = 1
            r15 = 0
            goto L_0x012d
        L_0x0115:
            r0 = move-exception
            r2 = r0
            p5488io.p5490b.p5495c.C69813f.m101292a(r2)
            org.d.c r0 = r1.f186586f
            r0.mo61490lP()
            int r0 = r8.length
            r6 = 0
        L_0x0121:
            if (r6 >= r0) goto L_0x014a
            r3 = r8[r6]
            r3.mo61497f(r2)
            int r6 = r6 + 1
            goto L_0x0121
        L_0x012b:
            r2 = 1
            int r15 = r15 + r2
        L_0x012d:
            int r12 = r12 + 1
            if (r12 != r11) goto L_0x0132
            r12 = 0
        L_0x0132:
            if (r15 == r11) goto L_0x0139
            r2 = 1
            r7 = 1
            goto L_0x00aa
        L_0x0139:
            int r3 = r21.get()
            if (r3 != r14) goto L_0x014b
            r1.f186590j = r12
            r1.f186593m = r13
            int r3 = -r14
            int r14 = r1.addAndGet(r3)
            if (r14 != 0) goto L_0x014c
        L_0x014a:
            return
        L_0x014b:
            r14 = r3
        L_0x014c:
            r2 = 1
            r7 = 1
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5502e.p5507e.C69999c.mo61564b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo61565c() {
        C72639b[] bVarArr = this.f186581a;
        int length = bVarArr.length;
        int i = 0;
        while (i < length && !this.f186591k) {
            int i2 = i + 1;
            this.f186592l.lazySet(i2);
            bVarArr[i].mo61494a(new C69998b(this, i, length));
            i = i2;
        }
    }

    /* renamed from: f */
    public final void mo61497f(Throwable th) {
        this.f186588h = th;
        this.f186589i = true;
        mo61564b();
    }

    /* renamed from: g */
    public final void mo61498g(Object obj) {
        if (this.f186594n != 0 || this.f186587g.mo61477j(obj)) {
            mo61564b();
            return;
        }
        this.f186586f.mo61490lP();
        mo61497f(new C69814g("Queue is full?"));
    }

    /* renamed from: lK */
    public final void mo61499lK() {
        this.f186589i = true;
        mo61564b();
    }
}
