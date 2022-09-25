package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vl */
/* compiled from: PG */
public final class C7364vl {

    /* renamed from: a */
    public final int f24055a = -1;

    /* renamed from: b */
    public final Uri[] f24056b = new Uri[0];

    /* renamed from: c */
    public final int[] f24057c = new int[0];

    /* renamed from: d */
    public final long[] f24058d = new long[0];

    public C7364vl() {
        ary.m19462o(true);
    }

    /* renamed from: a */
    public final int mo16662a() {
        return mo16663b(-1);
    }

    /* renamed from: b */
    public final int mo16663b(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f24057c;
            if (i3 >= 0 || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    /* renamed from: c */
    public final boolean mo16664c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7364vl vlVar = (C7364vl) obj;
            return Arrays.equals(this.f24056b, vlVar.f24056b) && Arrays.equals(this.f24057c, vlVar.f24057c) && Arrays.equals(this.f24058d, vlVar.f24058d);
        }
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f24056b) - 31) * 31) + Arrays.hashCode(this.f24057c)) * 31) + Arrays.hashCode(this.f24058d);
    }
}
