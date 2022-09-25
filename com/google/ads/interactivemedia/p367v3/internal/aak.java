package com.google.ads.interactivemedia.p367v3.internal;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aak */
/* compiled from: PG */
public abstract class aak implements aba {

    /* renamed from: a */
    protected final C7360vh f20071a;

    /* renamed from: b */
    protected final int f20072b;

    /* renamed from: c */
    protected final int[] f20073c;

    /* renamed from: d */
    private final C6864cy[] f20074d;

    /* renamed from: e */
    private final long[] f20075e;

    /* renamed from: f */
    private int f20076f;

    public aak(C7360vh vhVar, int... iArr) {
        int length = iArr.length;
        int i = 0;
        ary.m19464q(length > 0);
        ary.m19467t(vhVar);
        this.f20071a = vhVar;
        this.f20072b = length;
        this.f20074d = new C6864cy[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f20074d[i2] = vhVar.mo16648a(iArr[i2]);
        }
        Arrays.sort(this.f20074d, aaj.f20070a);
        this.f20073c = new int[this.f20072b];
        while (true) {
            int i3 = this.f20072b;
            if (i < i3) {
                this.f20073c[i] = vhVar.mo16649b(this.f20074d[i]);
                i++;
            } else {
                this.f20075e = new long[i3];
                return;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aak aak = (aak) obj;
            return this.f20071a == aak.f20071a && Arrays.equals(this.f20073c, aak.f20073c);
        }
    }

    /* renamed from: f */
    public void mo14324f() {
    }

    /* renamed from: g */
    public void mo14325g() {
    }

    /* renamed from: h */
    public void mo14326h(float f) {
    }

    public final int hashCode() {
        int i = this.f20076f;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f20071a) * 31) + Arrays.hashCode(this.f20073c);
        this.f20076f = identityHashCode;
        return identityHashCode;
    }

    /* renamed from: i */
    public int mo14327i(long j, List list) {
        return list.size();
    }

    /* renamed from: k */
    public final C7360vh mo14331k() {
        return this.f20071a;
    }

    /* renamed from: l */
    public final int mo14332l() {
        return this.f20073c.length;
    }

    /* renamed from: m */
    public final C6864cy mo14333m(int i) {
        return this.f20074d[i];
    }

    /* renamed from: n */
    public final int mo14334n(int i) {
        return this.f20073c[i];
    }

    /* renamed from: o */
    public final int mo14335o(C6864cy cyVar) {
        for (int i = 0; i < this.f20072b; i++) {
            if (this.f20074d[i] == cyVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: p */
    public final int mo14336p(int i) {
        for (int i2 = 0; i2 < this.f20072b; i2++) {
            if (this.f20073c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final C6864cy mo14337q() {
        return this.f20074d[mo14319a()];
    }

    /* renamed from: r */
    public final int mo14338r() {
        return this.f20073c[mo14319a()];
    }

    /* renamed from: s */
    public final boolean mo14339s(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean t = mo14340t(i, elapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.f20072b) {
                if (t) {
                    break;
                }
                t = i2 != i && !mo14340t(i2, elapsedRealtime);
                i2++;
            } else if (!t) {
                return false;
            }
        }
        long[] jArr = this.f20075e;
        jArr[i] = Math.max(jArr[i], aeu.m18519aj(elapsedRealtime, j));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo14340t(int i, long j) {
        return this.f20075e[i] > j;
    }

    /* renamed from: u */
    public final boolean mo14341u() {
        return false;
    }
}
