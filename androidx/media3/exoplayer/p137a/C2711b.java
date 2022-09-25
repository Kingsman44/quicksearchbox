package androidx.media3.exoplayer.p137a;

import androidx.media3.common.C2651bm;
import androidx.media3.exoplayer.p145h.C3036as;
import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.a.b */
/* compiled from: PG */
public final class C2711b {

    /* renamed from: a */
    public final long f7527a;

    /* renamed from: b */
    public final C2651bm f7528b;

    /* renamed from: c */
    public final int f7529c;

    /* renamed from: d */
    public final C3036as f7530d;

    /* renamed from: e */
    public final long f7531e;

    /* renamed from: f */
    public final C2651bm f7532f;

    /* renamed from: g */
    public final int f7533g;

    /* renamed from: h */
    public final C3036as f7534h;

    /* renamed from: i */
    public final long f7535i;

    /* renamed from: j */
    public final long f7536j;

    public C2711b(long j, C2651bm bmVar, int i, C3036as asVar, long j2, C2651bm bmVar2, int i2, C3036as asVar2, long j3, long j4) {
        this.f7527a = j;
        this.f7528b = bmVar;
        this.f7529c = i;
        this.f7530d = asVar;
        this.f7531e = j2;
        this.f7532f = bmVar2;
        this.f7533g = i2;
        this.f7534h = asVar2;
        this.f7535i = j3;
        this.f7536j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2711b bVar = (C2711b) obj;
            return this.f7527a == bVar.f7527a && this.f7529c == bVar.f7529c && this.f7531e == bVar.f7531e && this.f7533g == bVar.f7533g && this.f7535i == bVar.f7535i && this.f7536j == bVar.f7536j && C58832aw.m90831a(this.f7528b, bVar.f7528b) && C58832aw.m90831a(this.f7530d, bVar.f7530d) && C58832aw.m90831a(this.f7532f, bVar.f7532f) && C58832aw.m90831a(this.f7534h, bVar.f7534h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7527a), this.f7528b, Integer.valueOf(this.f7529c), this.f7530d, Long.valueOf(this.f7531e), this.f7532f, Integer.valueOf(this.f7533g), this.f7534h, Long.valueOf(this.f7535i), Long.valueOf(this.f7536j)});
    }
}
