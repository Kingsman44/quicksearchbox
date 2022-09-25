package androidx.media3.cast;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.media3.common.C2590aq;
import androidx.media3.common.C2649bk;
import androidx.media3.common.C2650bl;
import androidx.media3.common.C2651bm;
import java.util.Arrays;

/* renamed from: androidx.media3.cast.ac */
/* compiled from: PG */
final class C2536ac extends C2651bm {

    /* renamed from: a */
    public static final C2536ac f7007a = new C2536ac(new int[0], new SparseArray());

    /* renamed from: b */
    public final int[] f7008b;

    /* renamed from: d */
    private final SparseIntArray f7009d;

    /* renamed from: e */
    private final C2590aq[] f7010e;

    /* renamed from: f */
    private final long[] f7011f;

    /* renamed from: g */
    private final long[] f7012g;

    /* renamed from: h */
    private final boolean[] f7013h;

    public C2536ac(int[] iArr, SparseArray sparseArray) {
        int length = iArr.length;
        this.f7009d = new SparseIntArray(length);
        this.f7008b = Arrays.copyOf(iArr, length);
        this.f7011f = new long[length];
        this.f7012g = new long[length];
        this.f7013h = new boolean[length];
        this.f7010e = new C2590aq[length];
        int i = 0;
        while (true) {
            int[] iArr2 = this.f7008b;
            if (i < iArr2.length) {
                int i2 = iArr2[i];
                this.f7009d.put(i2, i);
                C2535ab abVar = (C2535ab) sparseArray.get(i2, C2535ab.f7001a);
                this.f7010e[i] = abVar.f7005e;
                this.f7011f[i] = abVar.f7002b;
                long[] jArr = this.f7012g;
                long j = abVar.f7003c;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                jArr[i] = j;
                this.f7013h[i] = abVar.f7004d;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo6020a(Object obj) {
        if (obj instanceof Integer) {
            return this.f7009d.get(((Integer) obj).intValue(), -1);
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo6021b() {
        return this.f7008b.length;
    }

    /* renamed from: c */
    public final int mo6022c() {
        return this.f7008b.length;
    }

    /* renamed from: d */
    public final C2649bk mo6023d(int i, C2649bk bkVar, boolean z) {
        Integer valueOf = Integer.valueOf(this.f7008b[i]);
        bkVar.mo6291j(valueOf, valueOf, i, this.f7011f[i], 0);
        return bkVar;
    }

    /* renamed from: e */
    public final C2650bl mo6024e(int i, C2650bl blVar, long j) {
        long j2 = this.f7011f[i];
        boolean z = j2 != -9223372036854775807L;
        boolean z2 = j2 == -9223372036854775807L;
        Integer valueOf = Integer.valueOf(this.f7008b[i]);
        C2590aq aqVar = this.f7010e[i];
        blVar.mo6293b(valueOf, aqVar, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z, z2, this.f7013h[i] ? aqVar.f7156e : null, this.f7012g[i], j2, i, i, 0);
        return blVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2536ac)) {
            return false;
        }
        C2536ac acVar = (C2536ac) obj;
        return Arrays.equals(this.f7008b, acVar.f7008b) && Arrays.equals(this.f7011f, acVar.f7011f) && Arrays.equals(this.f7012g, acVar.f7012g) && Arrays.equals(this.f7013h, acVar.f7013h);
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo6026f(int i) {
        return Integer.valueOf(this.f7008b[i]);
    }

    public final int hashCode() {
        return (((((Arrays.hashCode(this.f7008b) * 31) + Arrays.hashCode(this.f7011f)) * 31) + Arrays.hashCode(this.f7012g)) * 31) + Arrays.hashCode(this.f7013h);
    }
}
