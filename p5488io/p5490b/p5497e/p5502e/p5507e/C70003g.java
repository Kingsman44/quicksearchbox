package p5488io.p5490b.p5497e.p5502e.p5507e;

import org.p5649d.C72639b;
import org.p5649d.C72640c;
import p5488io.p5490b.p5495c.C69814g;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5497e.p5513j.C70085f;

/* renamed from: io.b.e.e.e.g */
/* compiled from: PG */
final class C70003g extends C70002f {
    private static final long serialVersionUID = -5737965195918321883L;

    public C70003g(C72639b bVar, int i, int i2) {
        super(bVar, i, i2);
    }

    /* renamed from: b */
    public final void mo61568b() {
        if (getAndIncrement() == 0) {
            mo61572h();
        }
    }

    /* renamed from: c */
    public final void mo61569c() {
        this.f186608f.decrementAndGet();
        mo61568b();
    }

    /* renamed from: f */
    public final void mo61570f(Throwable th) {
        C70085f.m101987d(this.f186605c, th);
        this.f186608f.decrementAndGet();
        mo61568b();
    }

    /* renamed from: g */
    public final void mo61571g(C70001e eVar, Object obj) {
        if (get() != 0 || !compareAndSet(0, 1)) {
            if (!eVar.mo61566b().mo61477j(obj) && C70079c.m101974c(eVar)) {
                C70085f.m101987d(this.f186605c, new C69814g("Queue full?!"));
                this.f186608f.decrementAndGet();
            }
            if (getAndIncrement() != 0) {
                return;
            }
        } else {
            if (this.f186606d.get() != 0) {
                this.f186603a.mo61498g(obj);
                if (this.f186606d.get() != Long.MAX_VALUE) {
                    this.f186606d.decrementAndGet();
                }
                long j = eVar.f186601d + 1;
                if (j >= ((long) eVar.f186600c)) {
                    eVar.f186601d = 0;
                    ((C72640c) eVar.get()).mo61489e(j);
                } else {
                    eVar.f186601d = j;
                }
            } else if (!eVar.mo61566b().mo61477j(obj)) {
                C70079c.m101974c(eVar);
                C70085f.m101987d(this.f186605c, new C69814g("Queue full?!"));
                this.f186608f.decrementAndGet();
                mo61572h();
                return;
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        mo61572h();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        r18 = r1;
        r19 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (r13 != 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r15 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        if (((java.lang.Throwable) r0.f186605c.get()) == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        r3.mo61497f(p5488io.p5490b.p5497e.p5513j.C70085f.m101986c(r0.f186605c));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0086, code lost:
        r3.mo61499lK();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        if (r15 == false) goto L_0x008d;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61572h() {
        /*
            r20 = this;
            r0 = r20
            io.b.e.e.e.e[] r1 = r0.f186604b
            int r2 = r1.length
            org.d.b r3 = r0.f186603a
            r5 = 1
        L_0x0008:
            java.util.concurrent.atomic.AtomicLong r6 = r0.f186606d
            long r6 = r6.get()
            r10 = 0
        L_0x0010:
            int r13 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x0093
            boolean r13 = r0.f186607e
            if (r13 == 0) goto L_0x001c
            r20.mo61567a()
            return
        L_0x001c:
            java.util.concurrent.atomic.AtomicInteger r13 = r0.f186608f
            int r13 = r13.get()
            r14 = 0
            r15 = 1
        L_0x0024:
            if (r14 >= r2) goto L_0x006a
            r4 = r1[r14]
            io.b.e.c.e r12 = r4.f186602e
            if (r12 == 0) goto L_0x005f
            java.lang.Object r12 = r12.mo61479lN()
            if (r12 == 0) goto L_0x005f
            r3.mo61498g(r12)
            long r8 = r4.f186601d
            r16 = 1
            long r8 = r8 + r16
            int r12 = r4.f186600c
            r18 = r1
            r19 = r2
            long r1 = (long) r12
            int r12 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x0054
            r1 = 0
            r4.f186601d = r1
            java.lang.Object r1 = r4.get()
            org.d.c r1 = (org.p5649d.C72640c) r1
            r1.mo61489e(r8)
            goto L_0x0056
        L_0x0054:
            r4.f186601d = r8
        L_0x0056:
            long r10 = r10 + r16
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x005d
            goto L_0x0097
        L_0x005d:
            r15 = 0
            goto L_0x0063
        L_0x005f:
            r18 = r1
            r19 = r2
        L_0x0063:
            int r14 = r14 + 1
            r1 = r18
            r2 = r19
            goto L_0x0024
        L_0x006a:
            r18 = r1
            r19 = r2
            if (r13 != 0) goto L_0x008a
            if (r15 == 0) goto L_0x008d
            io.b.e.j.b r1 = r0.f186605c
            java.lang.Object r1 = r1.get()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0086
            io.b.e.j.b r1 = r0.f186605c
            java.lang.Throwable r1 = p5488io.p5490b.p5497e.p5513j.C70085f.m101986c(r1)
            r3.mo61497f(r1)
            return
        L_0x0086:
            r3.mo61499lK()
            return
        L_0x008a:
            if (r15 == 0) goto L_0x008d
            goto L_0x0097
        L_0x008d:
            r1 = r18
            r2 = r19
            goto L_0x0010
        L_0x0093:
            r18 = r1
            r19 = r2
        L_0x0097:
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x00dc
            boolean r1 = r0.f186607e
            if (r1 == 0) goto L_0x00a3
            r20.mo61567a()
            return
        L_0x00a3:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f186608f
            int r1 = r1.get()
            r2 = r19
            r4 = 0
        L_0x00ac:
            if (r4 >= r2) goto L_0x00bf
            r8 = r18[r4]
            io.b.e.c.e r8 = r8.f186602e
            if (r8 == 0) goto L_0x00bc
            boolean r8 = r8.mo61476i()
            if (r8 != 0) goto L_0x00bc
            r12 = 0
            goto L_0x00c0
        L_0x00bc:
            int r4 = r4 + 1
            goto L_0x00ac
        L_0x00bf:
            r12 = 1
        L_0x00c0:
            if (r1 != 0) goto L_0x00de
            if (r12 == 0) goto L_0x00de
            io.b.e.j.b r1 = r0.f186605c
            java.lang.Object r1 = r1.get()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x00d8
            io.b.e.j.b r1 = r0.f186605c
            java.lang.Throwable r1 = p5488io.p5490b.p5497e.p5513j.C70085f.m101986c(r1)
            r3.mo61497f(r1)
            return
        L_0x00d8:
            r3.mo61499lK()
            return
        L_0x00dc:
            r2 = r19
        L_0x00de:
            r8 = 0
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x00f3
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x00f3
            java.util.concurrent.atomic.AtomicLong r1 = r0.f186606d
            long r6 = -r10
            r1.addAndGet(r6)
        L_0x00f3:
            int r1 = r20.get()
            if (r1 != r5) goto L_0x0101
            int r1 = -r5
            int r5 = r0.addAndGet(r1)
            if (r5 != 0) goto L_0x0102
            return
        L_0x0101:
            r5 = r1
        L_0x0102:
            r1 = r18
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5502e.p5507e.C70003g.mo61572h():void");
    }
}
