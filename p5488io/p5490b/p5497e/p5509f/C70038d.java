package p5488io.p5490b.p5497e.p5509f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p5488io.p5490b.p5497e.p5500c.C69846e;
import p5488io.p5490b.p5497e.p5513j.C70091l;

/* renamed from: io.b.e.f.d */
/* compiled from: PG */
public final class C70038d implements C69846e {

    /* renamed from: a */
    static final int f186688a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    private static final Object f186689j = new Object();

    /* renamed from: b */
    final AtomicLong f186690b;

    /* renamed from: c */
    final int f186691c;

    /* renamed from: d */
    long f186692d;

    /* renamed from: e */
    final int f186693e;

    /* renamed from: f */
    AtomicReferenceArray f186694f;

    /* renamed from: g */
    final int f186695g;

    /* renamed from: h */
    AtomicReferenceArray f186696h;

    /* renamed from: i */
    final AtomicLong f186697i = new AtomicLong();

    public C70038d(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f186690b = atomicLong;
        int a = C70091l.m101994a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(a + 1);
        this.f186694f = atomicReferenceArray;
        this.f186693e = i2;
        this.f186691c = Math.min(a / 4, f186688a);
        this.f186696h = atomicReferenceArray;
        this.f186695g = i2;
        this.f186692d = (long) (i2 - 1);
        atomicLong.lazySet(0);
    }

    /* renamed from: a */
    private final void m101884a(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        atomicReferenceArray.lazySet(i, obj);
        this.f186690b.lazySet(j + 1);
    }

    /* renamed from: c */
    public final void mo61475c() {
        while (true) {
            if (mo61479lN() == null && mo61476i()) {
                return;
            }
        }
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return this.f186690b.get() == this.f186697i.get();
    }

    /* renamed from: j */
    public final boolean mo61477j(Object obj) {
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.f186694f;
            long j = this.f186690b.get();
            int i = this.f186693e;
            int i2 = ((int) j) & i;
            if (j < this.f186692d) {
                m101884a(atomicReferenceArray, obj, j, i2);
                return true;
            }
            long j2 = ((long) this.f186691c) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.f186692d = j2 - 1;
                m101884a(atomicReferenceArray, obj, j, i2);
                return true;
            }
            long j3 = 1 + j;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                m101884a(atomicReferenceArray, obj, j, i2);
                return true;
            }
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f186694f = atomicReferenceArray2;
            this.f186692d = (j + ((long) i)) - 1;
            atomicReferenceArray2.lazySet(i2, obj);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, f186689j);
            this.f186690b.lazySet(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        AtomicReferenceArray atomicReferenceArray = this.f186696h;
        long j = this.f186697i.get();
        int i = this.f186695g;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        Object obj2 = f186689j;
        if (obj != null) {
            if (obj != obj2) {
                atomicReferenceArray.lazySet(i2, (Object) null);
                this.f186697i.lazySet(j + 1);
                return obj;
            }
        } else if (obj2 != null) {
            return null;
        }
        int i3 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, (Object) null);
        this.f186696h = atomicReferenceArray2;
        Object obj3 = atomicReferenceArray2.get(i2);
        if (obj3 != null) {
            atomicReferenceArray2.lazySet(i2, (Object) null);
            this.f186697i.lazySet(j + 1);
        }
        return obj3;
    }
}
