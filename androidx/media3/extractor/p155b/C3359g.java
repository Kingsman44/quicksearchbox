package androidx.media3.extractor.p155b;

import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3351az;
import androidx.media3.extractor.C3365bc;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.b.g */
/* compiled from: PG */
final class C3359g {

    /* renamed from: a */
    protected final C3368bf f10155a;

    /* renamed from: b */
    public final int f10156b;

    /* renamed from: c */
    public final int f10157c;

    /* renamed from: d */
    public int f10158d;

    /* renamed from: e */
    public int f10159e;

    /* renamed from: f */
    public int f10160f;

    /* renamed from: g */
    public int f10161g;

    /* renamed from: h */
    public int f10162h;

    /* renamed from: i */
    public long[] f10163i;

    /* renamed from: j */
    public int[] f10164j;

    /* renamed from: k */
    private final long f10165k;

    /* renamed from: l */
    private final int f10166l;

    public C3359g(int i, int i2, long j, int i3, C3368bf bfVar) {
        i2 = i2 != 1 ? 2 : i2;
        this.f10165k = j;
        this.f10166l = i3;
        this.f10155a = bfVar;
        this.f10156b = m9728c(i, i2 == 2 ? 1667497984 : 1651965952);
        this.f10157c = i2 == 2 ? m9728c(i, 1650720768) : -1;
        this.f10163i = new long[512];
        this.f10164j = new int[512];
    }

    /* renamed from: c */
    private static int m9728c(int i, int i2) {
        return ((i / 10) + 48) | (((i % 10) + 48) << 8) | i2;
    }

    /* renamed from: d */
    private final C3365bc m9729d(int i) {
        return new C3365bc(((long) this.f10164j[i]) * mo7350a(1), this.f10163i[i]);
    }

    /* renamed from: a */
    public final long mo7350a(int i) {
        return (this.f10165k * ((long) i)) / ((long) this.f10166l);
    }

    /* renamed from: b */
    public final C3351az mo7351b(long j) {
        int a = (int) (j / mo7350a(1));
        int c = C2612ak.m6978c(this.f10164j, a, true, true);
        if (this.f10164j[c] == a) {
            C3365bc d = m9729d(c);
            return new C3351az(d, d);
        }
        C3365bc d2 = m9729d(c);
        int i = c + 1;
        return i < this.f10163i.length ? new C3351az(d2, m9729d(i)) : new C3351az(d2, d2);
    }
}
