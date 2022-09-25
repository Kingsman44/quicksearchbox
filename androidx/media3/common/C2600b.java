package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.p136b.C2601a;
import java.util.Arrays;

/* renamed from: androidx.media3.common.b */
/* compiled from: PG */
public final class C2600b implements C2668l {

    /* renamed from: a */
    public final long f7218a;

    /* renamed from: b */
    public final int f7219b;

    /* renamed from: c */
    public final Uri[] f7220c;

    /* renamed from: d */
    public final int[] f7221d;

    /* renamed from: e */
    public final long[] f7222e;

    /* renamed from: f */
    public final long f7223f;

    /* renamed from: g */
    public final boolean f7224g;

    public C2600b(long j) {
        this(j, -1, new int[0], new Uri[0], new long[0]);
    }

    /* renamed from: e */
    public static int[] m6823e(int[] iArr, int i) {
        int length = iArr.length;
        int max = Math.max(i, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        return copyOf;
    }

    /* renamed from: f */
    public static long[] m6824f(long[] jArr, int i) {
        int length = jArr.length;
        int max = Math.max(i, length);
        long[] copyOf = Arrays.copyOf(jArr, max);
        Arrays.fill(copyOf, length, max, -9223372036854775807L);
        return copyOf;
    }

    /* renamed from: a */
    public final int mo6108a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f7221d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    /* renamed from: b */
    public final C2600b mo6109b(int i) {
        int[] e = m6823e(this.f7221d, i);
        long[] f = m6824f(this.f7222e, i);
        return new C2600b(this.f7218a, i, e, (Uri[]) Arrays.copyOf(this.f7220c, i), f);
    }

    /* renamed from: c */
    public final C2600b mo6110c(int i, int i2) {
        int i3 = this.f7219b;
        boolean z = false;
        C2601a.m6830b(i3 == -1 || i2 < i3);
        int[] e = m6823e(this.f7221d, i2 + 1);
        int i4 = e[i2];
        if (i4 == 0 || i4 == 1 || i4 == i) {
            z = true;
        }
        C2601a.m6830b(z);
        long[] jArr = this.f7222e;
        int length = jArr.length;
        int length2 = e.length;
        if (length != length2) {
            jArr = m6824f(jArr, length2);
        }
        long[] jArr2 = jArr;
        Uri[] uriArr = this.f7220c;
        if (uriArr.length != length2) {
            uriArr = (Uri[]) Arrays.copyOf(uriArr, length2);
        }
        e[i2] = i;
        return new C2600b(this.f7218a, this.f7219b, e, uriArr, jArr2);
    }

    /* renamed from: d */
    public final boolean mo6111d() {
        if (this.f7219b == -1) {
            return true;
        }
        for (int i = 0; i < this.f7219b; i++) {
            int i2 = this.f7221d[i];
            if (i2 == 0 || i2 == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2600b bVar = (C2600b) obj;
            return this.f7218a == bVar.f7218a && this.f7219b == bVar.f7219b && Arrays.equals(this.f7220c, bVar.f7220c) && Arrays.equals(this.f7221d, bVar.f7221d) && Arrays.equals(this.f7222e, bVar.f7222e);
        }
    }

    public final int hashCode() {
        int i = this.f7219b;
        long j = this.f7218a;
        return ((((((((i * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f7220c)) * 31) + Arrays.hashCode(this.f7221d)) * 31) + Arrays.hashCode(this.f7222e)) * 961;
    }

    public C2600b(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr) {
        C2601a.m6830b(iArr.length == uriArr.length);
        this.f7218a = j;
        this.f7219b = i;
        this.f7221d = iArr;
        this.f7220c = uriArr;
        this.f7222e = jArr;
        this.f7223f = 0;
        this.f7224g = false;
    }
}
