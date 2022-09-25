package p5488io.p5490b.p5497e.p5502e.p5504b;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p5649d.C72638a;
import org.p5649d.C72639b;
import org.p5649d.C72640c;
import p5488io.p5490b.C70094g;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5500c.C69846e;
import p5488io.p5490b.p5497e.p5500c.C69847f;
import p5488io.p5490b.p5497e.p5509f.C70037c;
import p5488io.p5490b.p5497e.p5509f.C70038d;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5497e.p5513j.C70081b;
import p5488io.p5490b.p5497e.p5513j.C70082c;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.b.d */
/* compiled from: PG */
public final class C69895d extends AtomicInteger implements C70094g, C72640c {

    /* renamed from: a */
    static final C69893b[] f186309a = new C69893b[0];

    /* renamed from: b */
    static final C69893b[] f186310b = new C69893b[0];
    private static final long serialVersionUID = -2117620485640801370L;

    /* renamed from: c */
    final C72639b f186311c;

    /* renamed from: d */
    final C69822d f186312d;

    /* renamed from: e */
    final int f186313e;

    /* renamed from: f */
    final int f186314f;

    /* renamed from: g */
    volatile C69846e f186315g;

    /* renamed from: h */
    volatile boolean f186316h;

    /* renamed from: i */
    final C70081b f186317i = new C70081b();

    /* renamed from: j */
    volatile boolean f186318j;

    /* renamed from: k */
    final AtomicReference f186319k;

    /* renamed from: l */
    final AtomicLong f186320l;

    /* renamed from: m */
    C72640c f186321m;

    /* renamed from: n */
    long f186322n;

    /* renamed from: o */
    long f186323o;

    /* renamed from: p */
    int f186324p;

    /* renamed from: q */
    int f186325q;

    /* renamed from: r */
    final int f186326r;

    public C69895d(C72639b bVar, C69822d dVar, int i) {
        AtomicReference atomicReference = new AtomicReference();
        this.f186319k = atomicReference;
        this.f186320l = new AtomicLong();
        this.f186311c = bVar;
        this.f186312d = dVar;
        this.f186313e = Integer.MAX_VALUE;
        this.f186314f = i;
        this.f186326r = Math.max(1, 1073741823);
        atomicReference.lazySet(f186309a);
    }

    /* renamed from: a */
    public final void mo61494a(C72640c cVar) {
        if (C70079c.m101977h(this.f186321m, cVar)) {
            this.f186321m = cVar;
            this.f186311c.mo61494a(this);
            if (!this.f186318j) {
                int i = this.f186313e;
                if (i == Integer.MAX_VALUE) {
                    cVar.mo61489e(Long.MAX_VALUE);
                } else {
                    cVar.mo61489e((long) i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C69847f mo61508b() {
        C69846e eVar = this.f186315g;
        if (eVar == null) {
            if (this.f186313e == Integer.MAX_VALUE) {
                eVar = new C70038d(this.f186314f);
            } else {
                eVar = new C70037c(this.f186313e);
            }
            this.f186315g = eVar;
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo61509c() {
        C69846e eVar = this.f186315g;
        if (eVar != null) {
            eVar.mo61475c();
        }
    }

    /* renamed from: e */
    public final void mo61489e(long j) {
        if (C70079c.m101976g(j)) {
            C70082c.m101981a(this.f186320l, j);
            mo61510h();
        }
    }

    /* renamed from: f */
    public final void mo61497f(Throwable th) {
        if (this.f186316h) {
            C70101a.m102023e(th);
        } else if (C70085f.m101987d(this.f186317i, th)) {
            this.f186316h = true;
            mo61510h();
        } else {
            C70101a.m102023e(th);
        }
    }

    /* renamed from: g */
    public final void mo61498g(Object obj) {
        C69893b[] bVarArr;
        C69893b[] bVarArr2;
        if (!this.f186316h) {
            try {
                C72638a aVar = (C72638a) this.f186312d.mo25875a(obj);
                C69841j.m101337b(aVar, "The mapper returned a null Publisher");
                if (aVar instanceof Callable) {
                    try {
                        Object call = ((Callable) aVar).call();
                        if (call != null) {
                            if (get() == 0 && compareAndSet(0, 1)) {
                                long j = this.f186320l.get();
                                C69847f fVar = this.f186315g;
                                if (j == 0 || (fVar != null && !fVar.mo61476i())) {
                                    if (fVar == null) {
                                        fVar = mo61508b();
                                    }
                                    if (!fVar.mo61477j(call)) {
                                        mo61497f(new IllegalStateException("Scalar queue full?!"));
                                        return;
                                    }
                                } else {
                                    this.f186311c.mo61498g(call);
                                    if (j != Long.MAX_VALUE) {
                                        this.f186320l.decrementAndGet();
                                    }
                                    if (this.f186313e != Integer.MAX_VALUE && !this.f186318j) {
                                        int i = this.f186325q + 1;
                                        this.f186325q = i;
                                        int i2 = this.f186326r;
                                        if (i == i2) {
                                            this.f186325q = 0;
                                            this.f186321m.mo61489e((long) i2);
                                        }
                                    }
                                }
                                if (decrementAndGet() == 0) {
                                    return;
                                }
                            } else if (!mo61508b().mo61477j(call)) {
                                mo61497f(new IllegalStateException("Scalar queue full?!"));
                                return;
                            } else if (getAndIncrement() != 0) {
                                return;
                            }
                            mo61511i();
                        } else if (this.f186313e != Integer.MAX_VALUE && !this.f186318j) {
                            int i3 = this.f186325q + 1;
                            this.f186325q = i3;
                            int i4 = this.f186326r;
                            if (i3 == i4) {
                                this.f186325q = 0;
                                this.f186321m.mo61489e((long) i4);
                            }
                        }
                    } catch (Throwable th) {
                        C69813f.m101292a(th);
                        C70085f.m101987d(this.f186317i, th);
                        mo61510h();
                    }
                } else {
                    long j2 = this.f186322n;
                    this.f186322n = 1 + j2;
                    C69893b bVar = new C69893b(this, j2);
                    do {
                        bVarArr = (C69893b[]) this.f186319k.get();
                        if (bVarArr == f186310b) {
                            C70079c.m101974c(bVar);
                            return;
                        }
                        int length = bVarArr.length;
                        bVarArr2 = new C69893b[(length + 1)];
                        System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                        bVarArr2[length] = bVar;
                    } while (!C69894c.m101474a(this.f186319k, bVarArr, bVarArr2));
                    aVar.mo61634d(bVar);
                }
            } catch (Throwable th2) {
                C69813f.m101292a(th2);
                this.f186321m.mo61490lP();
                mo61497f(th2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo61510h() {
        if (getAndIncrement() == 0) {
            mo61511i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo61511i() {
        long j;
        long j2;
        int i;
        boolean z;
        long j3;
        int i2;
        C72639b bVar = this.f186311c;
        int i3 = 1;
        while (!mo61513k()) {
            C69846e eVar = this.f186315g;
            long j4 = this.f186320l.get();
            boolean z2 = j4 == Long.MAX_VALUE;
            long j5 = -1;
            if (eVar != null) {
                j = 0;
                while (true) {
                    long j6 = 0;
                    Object obj = null;
                    while (true) {
                        if (j4 == 0) {
                            break;
                        }
                        Object lN = eVar.mo61479lN();
                        if (!mo61513k()) {
                            if (lN == null) {
                                obj = lN;
                                break;
                            }
                            bVar.mo61498g(lN);
                            j++;
                            j6++;
                            j4--;
                            obj = lN;
                        } else {
                            return;
                        }
                    }
                    if (j6 != 0) {
                        if (z2) {
                            j4 = Long.MAX_VALUE;
                        } else {
                            j4 = this.f186320l.addAndGet(-j6);
                        }
                    }
                    if (j4 == 0 || obj == null) {
                        break;
                    }
                }
            } else {
                j = 0;
            }
            boolean z3 = this.f186316h;
            C69846e eVar2 = this.f186315g;
            C69893b[] bVarArr = (C69893b[]) this.f186319k.get();
            int length = bVarArr.length;
            if (!z3 || ((eVar2 != null && !eVar2.mo61476i()) || length != 0)) {
                if (length != 0) {
                    i = i3;
                    long j7 = this.f186323o;
                    int i4 = this.f186324p;
                    if (length <= i4 || bVarArr[i4].f186301a != j7) {
                        if (length <= i4) {
                            i4 = 0;
                        }
                        for (int i5 = 0; i5 < length && bVarArr[i4].f186301a != j7; i5++) {
                            i4++;
                            if (i4 == length) {
                                i4 = 0;
                            }
                        }
                        this.f186324p = i4;
                        this.f186323o = bVarArr[i4].f186301a;
                    }
                    int i6 = i4;
                    boolean z4 = false;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            z = z4;
                            break;
                        } else if (!mo61513k()) {
                            C69893b bVar2 = bVarArr[i6];
                            Object obj2 = null;
                            while (!mo61513k()) {
                                C69847f fVar = bVar2.f186306f;
                                if (fVar != null) {
                                    long j8 = 0;
                                    while (j2 != 0) {
                                        try {
                                            obj2 = fVar.mo61479lN();
                                            if (obj2 == null) {
                                                break;
                                            }
                                            bVar.mo61498g(obj2);
                                            if (!mo61513k()) {
                                                j2 += j5;
                                                j8++;
                                                j5 = -1;
                                            } else {
                                                return;
                                            }
                                        } catch (Throwable th) {
                                            Throwable th2 = th;
                                            C69813f.m101292a(th2);
                                            C70079c.m101974c(bVar2);
                                            C70085f.m101987d(this.f186317i, th2);
                                            this.f186321m.mo61490lP();
                                            if (!mo61513k()) {
                                                mo61512j(bVar2);
                                                i7++;
                                                z4 = true;
                                                i2 = 1;
                                            } else {
                                                return;
                                            }
                                        }
                                    }
                                    long j9 = j8;
                                    if (j9 != 0) {
                                        j2 = !z2 ? this.f186320l.addAndGet(-j9) : Long.MAX_VALUE;
                                        bVar2.mo61507b(j9);
                                    }
                                    if (!(j2 == 0 || obj2 == null)) {
                                        j5 = -1;
                                    }
                                }
                                boolean z5 = bVar2.f186305e;
                                C69847f fVar2 = bVar2.f186306f;
                                if (z5 && (fVar2 == null || fVar2.mo61476i())) {
                                    mo61512j(bVar2);
                                    if (!mo61513k()) {
                                        j++;
                                        z4 = true;
                                    } else {
                                        return;
                                    }
                                }
                                if (j2 == 0) {
                                    z = z4;
                                    break;
                                }
                                i6++;
                                if (i6 == length) {
                                    i6 = 0;
                                }
                                i2 = 1;
                                i7 += i2;
                                j5 = -1;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                    this.f186324p = i6;
                    this.f186323o = bVarArr[i6].f186301a;
                    j3 = j;
                } else {
                    i = i3;
                    j3 = j;
                    z = false;
                }
                if (j3 != 0 && !this.f186318j) {
                    this.f186321m.mo61489e(j3);
                }
                int i8 = i;
                if (!z) {
                    i3 = addAndGet(-i8);
                    if (i3 == 0) {
                        return;
                    }
                } else {
                    i3 = i8;
                }
            } else {
                Throwable c = C70085f.m101986c(this.f186317i);
                if (c == C70085f.f186815a) {
                    return;
                }
                if (c == null) {
                    bVar.mo61499lK();
                    return;
                } else {
                    bVar.mo61497f(c);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo61512j(C69893b bVar) {
        C69893b[] bVarArr;
        C69893b[] bVarArr2;
        do {
            bVarArr = (C69893b[]) this.f186319k.get();
            int length = bVarArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (bVarArr[i] == bVar) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        bVarArr2 = f186309a;
                    } else {
                        C69893b[] bVarArr3 = new C69893b[(length - 1)];
                        System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                        System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                        bVarArr2 = bVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C69894c.m101474a(this.f186319k, bVarArr, bVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo61513k() {
        if (this.f186318j) {
            mo61509c();
            return true;
        } else if (this.f186317i.get() == null) {
            return false;
        } else {
            mo61509c();
            Throwable c = C70085f.m101986c(this.f186317i);
            if (c != C70085f.f186815a) {
                this.f186311c.mo61497f(c);
            }
            return true;
        }
    }

    /* renamed from: lK */
    public final void mo61499lK() {
        if (!this.f186316h) {
            this.f186316h = true;
            mo61510h();
        }
    }

    /* renamed from: lP */
    public final void mo61490lP() {
        C69846e eVar;
        C69893b[] bVarArr;
        if (!this.f186318j) {
            this.f186318j = true;
            this.f186321m.mo61490lP();
            C69893b[] bVarArr2 = (C69893b[]) this.f186319k.get();
            C69893b[] bVarArr3 = f186310b;
            if (!(bVarArr2 == bVarArr3 || (bVarArr = (C69893b[]) this.f186319k.getAndSet(bVarArr3)) == bVarArr3)) {
                for (C69893b c : bVarArr) {
                    C70079c.m101974c(c);
                }
                Throwable c2 = C70085f.m101986c(this.f186317i);
                if (!(c2 == null || c2 == C70085f.f186815a)) {
                    C70101a.m102023e(c2);
                }
            }
            if (getAndIncrement() == 0 && (eVar = this.f186315g) != null) {
                eVar.mo61475c();
            }
        }
    }
}
