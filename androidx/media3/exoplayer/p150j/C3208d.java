package androidx.media3.exoplayer.p150j;

import android.os.SystemClock;
import androidx.media3.common.C2652bn;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p145h.p147b.C3050f;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.j.d */
/* compiled from: PG */
public abstract class C3208d implements C3197ad {

    /* renamed from: a */
    protected final C2652bn f9626a;

    /* renamed from: b */
    protected final int f9627b;

    /* renamed from: c */
    protected final int[] f9628c;

    /* renamed from: d */
    public final C2680x[] f9629d;

    /* renamed from: e */
    private final long[] f9630e;

    /* renamed from: f */
    private int f9631f;

    public C3208d(C2652bn bnVar, int[] iArr) {
        int length = iArr.length;
        int i = 0;
        C2601a.m6832d(length > 0);
        bnVar.getClass();
        this.f9626a = bnVar;
        this.f9627b = length;
        this.f9629d = new C2680x[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f9629d[i2] = bnVar.f7357d[iArr[i2]];
        }
        Arrays.sort(this.f9629d, C3207c.f9625a);
        this.f9628c = new int[this.f9627b];
        while (true) {
            int i3 = this.f9627b;
            if (i < i3) {
                this.f9628c[i] = bnVar.mo6305a(this.f9629d[i]);
                i++;
            } else {
                this.f9630e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: e */
    public int mo7025e(long j, List list) {
        return list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3208d dVar = (C3208d) obj;
            return this.f9626a == dVar.f9626a && Arrays.equals(this.f9628c, dVar.f9628c);
        }
    }

    /* renamed from: f */
    public final int mo7027f(int i) {
        return this.f9628c[i];
    }

    /* renamed from: g */
    public final int mo7028g() {
        return this.f9628c[mo7021a()];
    }

    /* renamed from: h */
    public final int mo7029h(int i) {
        for (int i2 = 0; i2 < this.f9627b; i2++) {
            if (this.f9628c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int hashCode() {
        int i = this.f9631f;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f9626a) * 31) + Arrays.hashCode(this.f9628c);
        this.f9631f = identityHashCode;
        return identityHashCode;
    }

    /* renamed from: i */
    public final int mo7031i(C2680x xVar) {
        for (int i = 0; i < this.f9627b; i++) {
            if (this.f9629d[i] == xVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public final int mo7032j() {
        return this.f9628c.length;
    }

    /* renamed from: k */
    public final C2680x mo7033k(int i) {
        return this.f9629d[i];
    }

    /* renamed from: l */
    public final C2680x mo7034l() {
        return this.f9629d[mo7021a()];
    }

    /* renamed from: m */
    public final C2652bn mo7035m() {
        return this.f9626a;
    }

    /* renamed from: n */
    public void mo7036n() {
    }

    /* renamed from: o */
    public void mo7037o() {
    }

    /* renamed from: p */
    public void mo7038p(float f) {
    }

    /* renamed from: q */
    public final boolean mo7039q(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean r = mo7040r(i, elapsedRealtime);
        int i2 = 0;
        while (true) {
            if (i2 < this.f9627b) {
                if (r) {
                    break;
                }
                r = i2 != i && !mo7040r(i2, elapsedRealtime);
                i2++;
            } else if (!r) {
                return false;
            }
        }
        long[] jArr = this.f9630e;
        jArr[i] = Math.max(jArr[i], C2612ak.m6970at(elapsedRealtime, j));
        return true;
    }

    /* renamed from: r */
    public final boolean mo7040r(int i, long j) {
        return this.f9630e[i] > j;
    }

    /* renamed from: s */
    public final /* synthetic */ boolean mo7041s(long j, C3050f fVar, List list) {
        return false;
    }
}
