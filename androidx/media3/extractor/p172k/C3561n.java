package androidx.media3.extractor.p172k;

import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.n */
/* compiled from: PG */
final class C3561n {

    /* renamed from: a */
    public final C3368bf f11223a;

    /* renamed from: b */
    public boolean f11224b;

    /* renamed from: c */
    public boolean f11225c;

    /* renamed from: d */
    public boolean f11226d;

    /* renamed from: e */
    public int f11227e;

    /* renamed from: f */
    public int f11228f;

    /* renamed from: g */
    public long f11229g;

    /* renamed from: h */
    public long f11230h;

    public C3561n(C3368bf bfVar) {
        this.f11223a = bfVar;
    }

    /* renamed from: a */
    public final void mo7474a(byte[] bArr, int i, int i2) {
        if (this.f11225c) {
            int i3 = this.f11228f;
            int i4 = (i + 1) - i3;
            if (i4 < i2) {
                this.f11226d = ((bArr[i4] & 192) >> 6) == 0;
                this.f11225c = false;
                return;
            }
            this.f11228f = i3 + (i2 - i);
        }
    }
}
