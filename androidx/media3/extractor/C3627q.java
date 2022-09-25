package androidx.media3.extractor;

import androidx.media3.common.C2591ar;
import androidx.media3.common.C2671o;
import androidx.media3.common.p136b.C2612ak;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: androidx.media3.extractor.q */
/* compiled from: PG */
public final class C3627q implements C3327ab {

    /* renamed from: a */
    public final byte[] f11564a = new byte[4096];

    /* renamed from: b */
    public final long f11565b;

    /* renamed from: c */
    public long f11566c;

    /* renamed from: d */
    public byte[] f11567d = new byte[65536];

    /* renamed from: e */
    public int f11568e;

    /* renamed from: f */
    public int f11569f;

    /* renamed from: g */
    private final C2671o f11570g;

    static {
        C2591ar.m6797b("media3.extractor");
    }

    public C3627q(C2671o oVar, long j, long j2) {
        this.f11570g = oVar;
        this.f11566c = j;
        this.f11565b = j2;
    }

    /* renamed from: r */
    private final int m10450r(byte[] bArr, int i, int i2) {
        int i3 = this.f11569f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f11567d, 0, bArr, i, min);
        m10451s(min);
        return min;
    }

    /* renamed from: s */
    private final void m10451s(int i) {
        int i2 = this.f11569f - i;
        this.f11569f = i2;
        this.f11568e = 0;
        byte[] bArr = this.f11567d;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f11567d = bArr2;
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        int r = m10450r(bArr, i, i2);
        if (r == 0) {
            r = mo7635b(bArr, i, i2, 0, true);
        }
        mo7637h(r);
        return r;
    }

    /* renamed from: b */
    public final int mo7635b(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a = this.f11570g.mo5879a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    /* renamed from: c */
    public final int mo7636c(int i) {
        int min = Math.min(this.f11569f, i);
        m10451s(min);
        return min;
    }

    /* renamed from: d */
    public final long mo7311d() {
        return this.f11565b;
    }

    /* renamed from: e */
    public final long mo7312e() {
        return this.f11566c + ((long) this.f11568e);
    }

    /* renamed from: f */
    public final long mo7313f() {
        return this.f11566c;
    }

    /* renamed from: g */
    public final void mo7314g(int i) {
        mo7319n(i, false);
    }

    /* renamed from: h */
    public final void mo7637h(int i) {
        if (i != -1) {
            this.f11566c += (long) i;
        }
    }

    /* renamed from: i */
    public final void mo7638i(int i) {
        int i2 = this.f11568e + i;
        int length = this.f11567d.length;
        if (i2 > length) {
            this.f11567d = Arrays.copyOf(this.f11567d, C2612ak.m6981f(length + length, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: j */
    public final void mo7315j(byte[] bArr, int i, int i2) {
        mo7320o(bArr, i, i2, false);
    }

    /* renamed from: k */
    public final void mo7316k(byte[] bArr, int i, int i2) {
        mo7321p(bArr, i, i2, false);
    }

    /* renamed from: l */
    public final void mo7317l() {
        this.f11568e = 0;
    }

    /* renamed from: m */
    public final void mo7318m(int i) {
        mo7639q(i);
    }

    /* renamed from: n */
    public final boolean mo7319n(int i, boolean z) {
        mo7638i(i);
        int i2 = this.f11569f - this.f11568e;
        while (i2 < i) {
            i2 = mo7635b(this.f11567d, this.f11568e, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f11569f = this.f11568e + i2;
        }
        this.f11568e += i;
        return true;
    }

    /* renamed from: o */
    public final boolean mo7320o(byte[] bArr, int i, int i2, boolean z) {
        if (!mo7319n(i2, z)) {
            return false;
        }
        System.arraycopy(this.f11567d, this.f11568e - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: p */
    public final boolean mo7321p(byte[] bArr, int i, int i2, boolean z) {
        int r = m10450r(bArr, i, i2);
        while (r < i2 && r != -1) {
            r = mo7635b(bArr, i, i2, r, z);
        }
        mo7637h(r);
        return r != -1;
    }

    /* renamed from: q */
    public final void mo7639q(int i) {
        int c = mo7636c(i);
        while (c < i && c != -1) {
            c = mo7635b(this.f11564a, -c, Math.min(i, c + 4096), c, false);
        }
        mo7637h(c);
    }
}
