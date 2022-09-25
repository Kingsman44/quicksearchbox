package kotlinx.coroutines.p5573a;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.p5579e.C71693aa;
import kotlinx.coroutines.p5579e.C71696ad;
import kotlinx.coroutines.p5579e.C71708ap;
import kotlinx.coroutines.p5579e.C71721c;
import kotlinx.coroutines.p5583i.C71783i;
import kotlinx.coroutines.p5583i.C71784j;
import kotlinx.p5572a.C71340c;
import kotlinx.p5572a.C71343f;
import p5462h.C69677g;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.s */
/* compiled from: PG */
public final class C71386s extends C71377j {

    /* renamed from: c */
    private final int f190585c;

    /* renamed from: d */
    private final C71387t f190586d;

    /* renamed from: e */
    private final ReentrantLock f190587e;

    /* renamed from: f */
    private Object[] f190588f;

    /* renamed from: g */
    private int f190589g;

    /* renamed from: h */
    private final C71340c f190590h;

    public C71386s(int i, C71387t tVar) {
        C69664n.m101061g(tVar, "onBufferOverflow");
        this.f190585c = i;
        this.f190586d = tVar;
        if (i > 0) {
            this.f190587e = new ReentrantLock();
            int min = Math.min(i, 8);
            Object[] objArr = new Object[min];
            C69531o.m100924b(objArr, C71378k.f190568a, 0, min);
            this.f190588f = objArr;
            this.f190590h = new C71340c(0, C71343f.f190534a);
            return;
        }
        throw new IllegalArgumentException("ArrayChannel capacity must be at least 1, but " + i + " was specified");
    }

    /* renamed from: J */
    private final C71708ap m104128J(int i) {
        if (i < this.f190585c) {
            this.f190590h.f190526b = i + 1;
            return null;
        }
        C71387t tVar = this.f190586d;
        C71387t tVar2 = C71387t.SUSPEND;
        int ordinal = tVar.ordinal();
        if (ordinal == 0) {
            return C71378k.f190570c;
        }
        if (ordinal == 1) {
            return null;
        }
        if (ordinal == 2) {
            return C71378k.f190569b;
        }
        throw new C69677g();
    }

    /* renamed from: K */
    private final void m104129K(int i, Object obj) {
        int i2 = this.f190585c;
        if (i < i2) {
            int length = this.f190588f.length;
            if (i >= length) {
                int min = Math.min(length + length, i2);
                Object[] objArr = new Object[min];
                for (int i3 = 0; i3 < i; i3++) {
                    Object[] objArr2 = this.f190588f;
                    objArr[i3] = objArr2[(this.f190589g + i3) % objArr2.length];
                }
                C69531o.m100924b(objArr, C71378k.f190568a, i, min);
                this.f190588f = objArr;
                this.f190589g = 0;
            }
            Object[] objArr3 = this.f190588f;
            objArr3[(this.f190589g + i) % objArr3.length] = obj;
            return;
        }
        boolean z = C71600ba.f191036a;
        Object[] objArr4 = this.f190588f;
        int i4 = this.f190589g;
        int length2 = objArr4.length;
        objArr4[i4 % length2] = null;
        objArr4[(i + i4) % length2] = obj;
        this.f190589g = (i4 + 1) % length2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo62705E() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final boolean mo62706F() {
        return this.f190590h.f190526b == this.f190585c && this.f190586d == C71387t.SUSPEND;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo62707a() {
        ReentrantLock reentrantLock = this.f190587e;
        reentrantLock.lock();
        try {
            int i = this.f190590h.f190526b;
            if (i == 0) {
                Object z = mo62750z();
                if (z == null) {
                    z = C71378k.f190571d;
                }
                return z;
            }
            Object[] objArr = this.f190588f;
            int i2 = this.f190589g;
            Object obj = objArr[i2];
            C71366at atVar = null;
            objArr[i2] = null;
            this.f190590h.f190526b = i - 1;
            Object obj2 = C71378k.f190571d;
            boolean z2 = false;
            if (i == this.f190585c) {
                C71366at atVar2 = null;
                while (true) {
                    C71366at A = mo62745A();
                    if (A == null) {
                        atVar = atVar2;
                        break;
                    } else if (A.mo62702mm((C71693aa) null) != null) {
                        boolean z3 = C71600ba.f191036a;
                        obj2 = A.mo62695a();
                        atVar = A;
                        z2 = true;
                        break;
                    } else {
                        A.mo62724e();
                        atVar2 = A;
                    }
                }
            }
            if (obj2 != C71378k.f190571d && !(obj2 instanceof C71352af)) {
                this.f190590h.f190526b = i;
                Object[] objArr2 = this.f190588f;
                objArr2[(this.f190589g + i) % objArr2.length] = obj2;
            }
            this.f190589g = (this.f190589g + 1) % this.f190588f.length;
            reentrantLock.unlock();
            if (z2) {
                C69664n.m101058d(atVar);
                atVar.mo62703mn();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r8 != kotlinx.coroutines.p5583i.C71784j.f191303b) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r9.f190590h.f190526b = r1;
        r9.f190588f[r9.f190589g] = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if ((r8 instanceof kotlinx.coroutines.p5573a.C71352af) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        r2 = r8;
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        throw new java.lang.IllegalStateException("performAtomicTrySelect(describeTryOffer) returned " + r8);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62708b(kotlinx.coroutines.p5583i.C71783i r10) {
        /*
            r9 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r9.f190587e
            r0.lock()
            kotlinx.a.c r1 = r9.f190590h     // Catch:{ all -> 0x00c6 }
            int r1 = r1.f190526b     // Catch:{ all -> 0x00c6 }
            if (r1 != 0) goto L_0x0017
            kotlinx.coroutines.a.af r10 = r9.mo62750z()     // Catch:{ all -> 0x00c6 }
            if (r10 != 0) goto L_0x0013
            kotlinx.coroutines.e.ap r10 = kotlinx.coroutines.p5573a.C71378k.f190571d     // Catch:{ all -> 0x00c6 }
        L_0x0013:
            r0.unlock()
            return r10
        L_0x0017:
            java.lang.Object[] r2 = r9.f190588f     // Catch:{ all -> 0x00c6 }
            int r3 = r9.f190589g     // Catch:{ all -> 0x00c6 }
            r4 = r2[r3]     // Catch:{ all -> 0x00c6 }
            r5 = 0
            r2[r3] = r5     // Catch:{ all -> 0x00c6 }
            kotlinx.a.c r2 = r9.f190590h     // Catch:{ all -> 0x00c6 }
            int r3 = r1 + -1
            r2.f190526b = r3     // Catch:{ all -> 0x00c6 }
            kotlinx.coroutines.e.ap r2 = kotlinx.coroutines.p5573a.C71378k.f190571d     // Catch:{ all -> 0x00c6 }
            int r3 = r9.f190585c     // Catch:{ all -> 0x00c6 }
            r6 = 0
            r7 = 1
            if (r1 != r3) goto L_0x0083
        L_0x002e:
            kotlinx.coroutines.a.f r3 = r9.mo62740f()     // Catch:{ all -> 0x00c6 }
            java.lang.Object r8 = r10.mo63017t(r3)     // Catch:{ all -> 0x00c6 }
            if (r8 != 0) goto L_0x004b
            kotlinx.coroutines.e.ad r5 = r3.mo62934h()     // Catch:{ all -> 0x00c6 }
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)     // Catch:{ all -> 0x00c6 }
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)     // Catch:{ all -> 0x00c6 }
            r2 = r5
            kotlinx.coroutines.a.at r2 = (kotlinx.coroutines.p5573a.C71366at) r2     // Catch:{ all -> 0x00c6 }
            java.lang.Object r2 = r2.mo62695a()     // Catch:{ all -> 0x00c6 }
        L_0x0049:
            r6 = 1
            goto L_0x0083
        L_0x004b:
            kotlinx.coroutines.e.ap r3 = kotlinx.coroutines.p5573a.C71378k.f190571d     // Catch:{ all -> 0x00c6 }
            if (r8 == r3) goto L_0x0083
            java.lang.Object r3 = kotlinx.coroutines.p5579e.C71721c.f191196b     // Catch:{ all -> 0x00c6 }
            if (r8 == r3) goto L_0x002e
            java.lang.Object r2 = kotlinx.coroutines.p5583i.C71784j.f191303b     // Catch:{ all -> 0x00c6 }
            if (r8 != r2) goto L_0x0065
            kotlinx.a.c r10 = r9.f190590h     // Catch:{ all -> 0x00c6 }
            r10.f190526b = r1     // Catch:{ all -> 0x00c6 }
            java.lang.Object[] r10 = r9.f190588f     // Catch:{ all -> 0x00c6 }
            int r1 = r9.f190589g     // Catch:{ all -> 0x00c6 }
            r10[r1] = r4     // Catch:{ all -> 0x00c6 }
            r0.unlock()
            return r8
        L_0x0065:
            boolean r2 = r8 instanceof kotlinx.coroutines.p5573a.C71352af     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x006c
            r2 = r8
            r5 = r2
            goto L_0x0049
        L_0x006c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c6 }
            r1.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            r1.append(r2)     // Catch:{ all -> 0x00c6 }
            r1.append(r8)     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00c6 }
            r10.<init>(r1)     // Catch:{ all -> 0x00c6 }
            throw r10     // Catch:{ all -> 0x00c6 }
        L_0x0083:
            kotlinx.coroutines.e.ap r3 = kotlinx.coroutines.p5573a.C71378k.f190571d     // Catch:{ all -> 0x00c6 }
            if (r2 == r3) goto L_0x0099
            boolean r3 = r2 instanceof kotlinx.coroutines.p5573a.C71352af     // Catch:{ all -> 0x00c6 }
            if (r3 != 0) goto L_0x0099
            kotlinx.a.c r10 = r9.f190590h     // Catch:{ all -> 0x00c6 }
            r10.f190526b = r1     // Catch:{ all -> 0x00c6 }
            java.lang.Object[] r10 = r9.f190588f     // Catch:{ all -> 0x00c6 }
            int r3 = r9.f190589g     // Catch:{ all -> 0x00c6 }
            int r3 = r3 + r1
            int r1 = r10.length     // Catch:{ all -> 0x00c6 }
            int r3 = r3 % r1
            r10[r3] = r2     // Catch:{ all -> 0x00c6 }
            goto L_0x00af
        L_0x0099:
            boolean r10 = r10.mo63015A()     // Catch:{ all -> 0x00c6 }
            if (r10 != 0) goto L_0x00af
            kotlinx.a.c r10 = r9.f190590h     // Catch:{ all -> 0x00c6 }
            r10.f190526b = r1     // Catch:{ all -> 0x00c6 }
            java.lang.Object[] r10 = r9.f190588f     // Catch:{ all -> 0x00c6 }
            int r1 = r9.f190589g     // Catch:{ all -> 0x00c6 }
            r10[r1] = r4     // Catch:{ all -> 0x00c6 }
            java.lang.Object r10 = kotlinx.coroutines.p5583i.C71784j.f191303b     // Catch:{ all -> 0x00c6 }
            r0.unlock()
            return r10
        L_0x00af:
            int r10 = r9.f190589g     // Catch:{ all -> 0x00c6 }
            int r10 = r10 + r7
            java.lang.Object[] r1 = r9.f190588f     // Catch:{ all -> 0x00c6 }
            int r1 = r1.length     // Catch:{ all -> 0x00c6 }
            int r10 = r10 % r1
            r9.f190589g = r10     // Catch:{ all -> 0x00c6 }
            r0.unlock()
            if (r6 == 0) goto L_0x00c5
            p5462h.p5473f.p5475b.C69664n.m101058d(r5)
            kotlinx.coroutines.a.at r5 = (kotlinx.coroutines.p5573a.C71366at) r5
            r5.mo62703mn()
        L_0x00c5:
            return r4
        L_0x00c6:
            r10 = move-exception
            r0.unlock()
            goto L_0x00cc
        L_0x00cb:
            throw r10
        L_0x00cc:
            goto L_0x00cb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.p5573a.C71386s.mo62708b(kotlinx.coroutines.i.i):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo62709j(boolean z) {
        ReentrantLock reentrantLock = this.f190587e;
        reentrantLock.lock();
        try {
            int i = this.f190590h.f190526b;
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr = this.f190588f;
                int i3 = this.f190589g;
                Object obj = objArr[i3];
                objArr[i3] = C71378k.f190568a;
                this.f190589g = (i3 + 1) % objArr.length;
            }
            this.f190590h.f190526b = 0;
            reentrantLock.unlock();
            super.mo62709j(z);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo62710m(C71362ap apVar) {
        ReentrantLock reentrantLock = this.f190587e;
        reentrantLock.lock();
        try {
            return super.mo62710m(apVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo62711n() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo62712o() {
        return this.f190590h.f190526b == 0;
    }

    /* renamed from: p */
    public final boolean mo62743p() {
        ReentrantLock reentrantLock = this.f190587e;
        reentrantLock.lock();
        try {
            return super.mo62743p();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Object mo62747r(C71366at atVar) {
        ReentrantLock reentrantLock = this.f190587e;
        reentrantLock.lock();
        try {
            return super.mo62747r(atVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final Object mo62713s(Object obj) {
        C71364ar h;
        ReentrantLock reentrantLock = this.f190587e;
        reentrantLock.lock();
        int i = this.f190590h.f190526b;
        C71352af z = mo62750z();
        if (z != null) {
            reentrantLock.unlock();
            return z;
        }
        C71708ap J = m104128J(i);
        if (J != null) {
            reentrantLock.unlock();
            return J;
        }
        if (i == 0) {
            do {
                try {
                    h = mo62741h();
                    if (h == null) {
                        i = 0;
                    } else if (h instanceof C71352af) {
                        this.f190590h.f190526b = 0;
                        reentrantLock.unlock();
                        return h;
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } while (h.mo62696b(obj, (C71693aa) null) == null);
            boolean z2 = C71600ba.f191036a;
            this.f190590h.f190526b = 0;
            reentrantLock.unlock();
            h.mo62697c(obj);
            return h.mo62699f();
        }
        m104129K(i, obj);
        C71708ap apVar = C71378k.f190569b;
        reentrantLock.unlock();
        return apVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final Object mo62714t(Object obj, C71783i iVar) {
        Object t;
        ReentrantLock reentrantLock = this.f190587e;
        reentrantLock.lock();
        int i = this.f190590h.f190526b;
        C71352af z = mo62750z();
        if (z != null) {
            reentrantLock.unlock();
            return z;
        }
        C71708ap J = m104128J(i);
        if (J != null) {
            reentrantLock.unlock();
            return J;
        }
        if (i == 0) {
            do {
                try {
                    C71382o y = mo62749y(obj);
                    t = iVar.mo63017t(y);
                    if (t == null) {
                        this.f190590h.f190526b = 0;
                        C71696ad h = y.mo62934h();
                        C69664n.m101058d(h);
                        reentrantLock.unlock();
                        C69664n.m101058d(h);
                        C71364ar arVar = (C71364ar) h;
                        arVar.mo62697c(obj);
                        return arVar.mo62699f();
                    } else if (t == C71378k.f190570c) {
                        i = 0;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } while (t == C71721c.f191196b);
            if (t != C71784j.f191303b) {
                if (!(t instanceof C71352af)) {
                    throw new IllegalStateException("performAtomicTrySelect(describeTryOffer) returned " + t);
                }
            }
            this.f190590h.f190526b = 0;
            return t;
        }
        if (!iVar.mo63015A()) {
            this.f190590h.f190526b = i;
            Object obj2 = C71784j.f191303b;
            reentrantLock.unlock();
            return obj2;
        }
        m104129K(i, obj);
        C71708ap apVar = C71378k.f190569b;
        reentrantLock.unlock();
        return apVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final String mo62715x() {
        int i = this.f190585c;
        int i2 = this.f190590h.f190526b;
        return "(buffer:capacity=" + i + ",size=" + i2 + ")";
    }
}
