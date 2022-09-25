package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.tn */
/* compiled from: PG */
final class C7312tn implements abx {

    /* renamed from: a */
    private final abx f23826a;

    /* renamed from: b */
    private final int f23827b;

    /* renamed from: c */
    private final C7311tm f23828c;

    /* renamed from: d */
    private final byte[] f23829d;

    /* renamed from: e */
    private int f23830e;

    public C7312tn(abx abx, int i, C7311tm tmVar) {
        ary.m19462o(i > 0);
        this.f23826a = abx;
        this.f23827b = i;
        this.f23828c = tmVar;
        this.f23829d = new byte[1];
        this.f23830e = i;
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        int i3 = this.f23830e;
        if (i3 == 0) {
            int i4 = 0;
            if (this.f23826a.mo14388a(this.f23829d, 0, 1) != -1) {
                int i5 = (this.f23829d[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int a = this.f23826a.mo14388a(bArr2, i4, i6);
                        if (a != -1) {
                            i4 += a;
                            i6 -= a;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.f23828c.mo16532a(new aee(bArr2, i5));
                    }
                }
                i3 = this.f23827b;
                this.f23830e = i3;
            }
            return -1;
        }
        int a2 = this.f23826a.mo14388a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.f23830e -= a2;
        }
        return a2;
    }

    /* renamed from: b */
    public final void mo14402b(adh adh) {
        ary.m19467t(adh);
        this.f23826a.mo14402b(adh);
    }

    /* renamed from: c */
    public final long mo14389c(acb acb) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        return this.f23826a.mo14390d();
    }

    /* renamed from: e */
    public final Map mo14403e() {
        return this.f23826a.mo14403e();
    }

    /* renamed from: f */
    public final void mo14391f() {
        throw new UnsupportedOperationException();
    }
}
