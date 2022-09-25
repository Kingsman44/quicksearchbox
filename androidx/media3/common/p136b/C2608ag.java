package androidx.media3.common.p136b;

import java.util.Arrays;

/* renamed from: androidx.media3.common.b.ag */
/* compiled from: PG */
public final class C2608ag {

    /* renamed from: a */
    private long[] f7240a;

    /* renamed from: b */
    private Object[] f7241b;

    /* renamed from: c */
    private int f7242c;

    /* renamed from: d */
    private int f7243d;

    public C2608ag() {
        this((byte[]) null);
    }

    public C2608ag(byte[] bArr) {
        this.f7240a = new long[10];
        this.f7241b = new Object[10];
    }

    /* renamed from: g */
    private final Object m6898g(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (this.f7243d > 0) {
            long j3 = j - this.f7240a[this.f7242c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = m6899h();
            j2 = j3;
        }
        return obj;
    }

    /* renamed from: h */
    private final Object m6899h() {
        C2601a.m6832d(this.f7243d > 0);
        Object[] objArr = this.f7241b;
        int i = this.f7242c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f7242c = (i + 1) % objArr.length;
        this.f7243d--;
        return obj;
    }

    /* renamed from: a */
    public final synchronized int mo6173a() {
        return this.f7243d;
    }

    /* renamed from: b */
    public final synchronized Object mo6174b(long j) {
        return m6898g(j, false);
    }

    /* renamed from: c */
    public final synchronized Object mo6175c() {
        if (this.f7243d == 0) {
            return null;
        }
        return m6899h();
    }

    /* renamed from: d */
    public final synchronized Object mo6176d(long j) {
        return m6898g(j, true);
    }

    /* renamed from: e */
    public final synchronized void mo6177e(long j, Object obj) {
        int i = this.f7243d;
        if (i > 0) {
            if (j <= this.f7240a[((this.f7242c + i) - 1) % this.f7241b.length]) {
                mo6178f();
            }
        }
        int length = this.f7241b.length;
        if (this.f7243d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            Object[] objArr = new Object[i2];
            int i3 = this.f7242c;
            int i4 = length - i3;
            System.arraycopy(this.f7240a, i3, jArr, 0, i4);
            System.arraycopy(this.f7241b, this.f7242c, objArr, 0, i4);
            int i5 = this.f7242c;
            if (i5 > 0) {
                System.arraycopy(this.f7240a, 0, jArr, i4, i5);
                System.arraycopy(this.f7241b, 0, objArr, i4, this.f7242c);
            }
            this.f7240a = jArr;
            this.f7241b = objArr;
            this.f7242c = 0;
        }
        int i6 = this.f7242c;
        int i7 = this.f7243d;
        Object[] objArr2 = this.f7241b;
        int length2 = (i6 + i7) % objArr2.length;
        this.f7240a[length2] = j;
        objArr2[length2] = obj;
        this.f7243d = i7 + 1;
    }

    /* renamed from: f */
    public final synchronized void mo6178f() {
        this.f7242c = 0;
        this.f7243d = 0;
        Arrays.fill(this.f7241b, (Object) null);
    }
}
