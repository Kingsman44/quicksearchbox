package androidx.media3.extractor.p159f;

import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3627q;
import java.util.ArrayDeque;

/* renamed from: androidx.media3.extractor.f.b */
/* compiled from: PG */
final class C3397b {

    /* renamed from: a */
    public final byte[] f10289a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque f10290b = new ArrayDeque();

    /* renamed from: c */
    public final C3402g f10291c = new C3402g();

    /* renamed from: d */
    public int f10292d;

    /* renamed from: e */
    public int f10293e;

    /* renamed from: f */
    public long f10294f;

    /* renamed from: g */
    public C3398c f10295g;

    /* renamed from: a */
    public final long mo7371a(C3327ab abVar, int i) {
        ((C3627q) abVar).mo7321p(this.f10289a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f10289a[i2] & 255));
        }
        return j;
    }
}
