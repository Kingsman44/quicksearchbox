package com.google.ads.interactivemedia.p367v3.internal;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pm */
/* compiled from: PG */
public final class C7203pm implements C7053jy {

    /* renamed from: a */
    public static final /* synthetic */ int f23492a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f23493b;

    /* renamed from: c */
    private final int f23494c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List f23495d;

    /* renamed from: e */
    private final aee f23496e;

    /* renamed from: f */
    private final SparseIntArray f23497f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C7206pp f23498g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseArray f23499h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final SparseBooleanArray f23500i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final SparseBooleanArray f23501j;

    /* renamed from: k */
    private final C7199pi f23502k;

    /* renamed from: l */
    private C7198ph f23503l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C7056ka f23504m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f23505n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f23506o;

    /* renamed from: p */
    private boolean f23507p;

    /* renamed from: q */
    private boolean f23508q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C7208pr f23509r;

    /* renamed from: s */
    private int f23510s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f23511t;

    static {
        int i = C7200pj.f23484b;
    }

    public C7203pm() {
        this(1, 112800);
    }

    /* renamed from: r */
    static /* synthetic */ void m21492r(C7203pm pmVar) {
        pmVar.f23505n++;
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f23504m = kaVar;
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        C7198ph phVar;
        ary.m19464q(this.f23493b != 2);
        int size = this.f23495d.size();
        for (int i = 0; i < size; i++) {
            aes aes = (aes) this.f23495d.get(i);
            if (aes.mo14600d() == -9223372036854775807L || !(aes.mo14600d() == 0 || aes.mo14598b() == j2)) {
                aes.mo14601e();
                aes.mo14597a(j2);
            }
        }
        if (!(j2 == 0 || (phVar = this.f23503l) == null)) {
            phVar.mo16082b(j2);
        }
        this.f23496e.mo14547a(0);
        this.f23497f.clear();
        for (int i2 = 0; i2 < this.f23499h.size(); i2++) {
            ((C7208pr) this.f23499h.valueAt(i2)).mo16258b();
        }
        this.f23510s = 0;
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        byte[] i = this.f23496e.mo14555i();
        jvVar.mo16094g(i, 0, 940);
        int i2 = 0;
        while (i2 < 188) {
            int i3 = 0;
            while (i3 < 5) {
                if (i[(i3 * 188) + i2] != 71) {
                    i2++;
                } else {
                    i3++;
                }
            }
            jvVar.mo16091d(i2);
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int mo16112h(C7050jv jvVar, C7067kl klVar) {
        boolean z;
        int i;
        C7050jv jvVar2 = jvVar;
        C7067kl klVar2 = klVar;
        long m = jvVar.mo16100m();
        if (!this.f23506o) {
            i = 2;
            z = false;
        } else if (m != -1 && this.f23493b != 2 && !this.f23502k.mo16274a()) {
            return this.f23502k.mo16277d(jvVar2, klVar2, this.f23511t);
        } else {
            if (!this.f23507p) {
                this.f23507p = true;
                if (this.f23502k.mo16275b() != -9223372036854775807L) {
                    C7198ph phVar = r3;
                    z = false;
                    i = 2;
                    C7198ph phVar2 = new C7198ph(this.f23502k.mo16276c(), this.f23502k.mo16275b(), m, this.f23511t, this.f23494c);
                    this.f23503l = phVar;
                    this.f23504m.mo16115am(phVar.mo16081a());
                } else {
                    i = 2;
                    z = false;
                    this.f23504m.mo16115am(new C7069kn(this.f23502k.mo16275b()));
                }
            } else {
                i = 2;
                z = false;
            }
            if (this.f23508q) {
                this.f23508q = z;
                mo16109e(0, 0);
                if (jvVar.mo16099l() != 0) {
                    klVar2.f22624a = 0;
                    return 1;
                }
            }
            C7198ph phVar3 = this.f23503l;
            if (phVar3 != null && phVar3.mo16083c()) {
                return phVar3.mo16084d(jvVar2, klVar2);
            }
        }
        byte[] i2 = this.f23496e.mo14555i();
        if (9400 - this.f23496e.mo14553g() < 188) {
            int d = this.f23496e.mo14550d();
            if (d > 0) {
                System.arraycopy(i2, this.f23496e.mo14553g(), i2, z, d);
            }
            this.f23496e.mo14549c(i2, d);
        }
        while (this.f23496e.mo14550d() < 188) {
            int e = this.f23496e.mo14551e();
            int a = jvVar2.mo14388a(i2, e, 9400 - e);
            if (a == -1) {
                return -1;
            }
            this.f23496e.mo14552f(e + a);
        }
        int g = this.f23496e.mo14553g();
        int e2 = this.f23496e.mo14551e();
        int f = C7135mz.m21203f(this.f23496e.mo14555i(), g, e2);
        this.f23496e.mo14554h(f);
        int i3 = f + 188;
        if (i3 > e2) {
            int i4 = this.f23510s + (f - g);
            this.f23510s = i4;
            if (this.f23493b == i && i4 > 376) {
                throw new C6886dt("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f23510s = z;
        }
        int e3 = this.f23496e.mo14551e();
        if (i3 > e3) {
            return z;
        }
        int v = this.f23496e.mo14568v();
        if ((8388608 & v) != 0) {
            this.f23496e.mo14554h(i3);
            return z;
        }
        int i5 = (4194304 & v) != 0 ? 1 : 0;
        int i6 = (v >> 8) & 8191;
        int i7 = v & 32;
        C7208pr prVar = (v & 16) != 0 ? (C7208pr) this.f23499h.get(i6) : null;
        if (prVar == null) {
            this.f23496e.mo14554h(i3);
            return z;
        }
        if (this.f23493b != i) {
            int i8 = v & 15;
            int i9 = this.f23497f.get(i6, i8 - 1);
            this.f23497f.put(i6, i8);
            if (i9 == i8) {
                this.f23496e.mo14554h(i3);
                return z;
            } else if (i8 != ((i9 + 1) & 15)) {
                prVar.mo16258b();
            }
        }
        if (i7 != 0) {
            int n = this.f23496e.mo14560n();
            i5 |= (this.f23496e.mo14560n() & 64) != 0 ? 2 : 0;
            this.f23496e.mo14557k(n - 1);
        }
        boolean z2 = this.f23506o;
        if (this.f23493b == i || z2 || !this.f23501j.get(i6, z)) {
            this.f23496e.mo14552f(i3);
            prVar.mo16259c(this.f23496e, i5);
            this.f23496e.mo14552f(e3);
        }
        if (this.f23493b != i && !z2 && this.f23506o && m != -1) {
            this.f23508q = true;
        }
        this.f23496e.mo14554h(i3);
        return z ? 1 : 0;
    }

    public C7203pm(int i, int i2) {
        this(1, new aes(0), new C7168oe((byte[]) null), 112800);
    }

    public C7203pm(int i, aes aes, C7206pp ppVar, int i2) {
        this.f23498g = ppVar;
        this.f23494c = 112800;
        this.f23493b = i;
        this.f23495d = Collections.singletonList(aes);
        this.f23496e = new aee(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f23500i = sparseBooleanArray;
        this.f23501j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f23499h = sparseArray;
        this.f23497f = new SparseIntArray();
        this.f23502k = new C7199pi(112800);
        this.f23511t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray a = ppVar.mo16223a();
        int size = a.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f23499h.put(a.keyAt(i3), (C7208pr) a.valueAt(i3));
        }
        this.f23499h.put(0, new C7195pe(new C7201pk(this)));
        this.f23509r = null;
    }
}
