package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vm */
/* compiled from: PG */
public final class C7365vm {

    /* renamed from: a */
    public static final C7365vm f24059a = new C7365vm(new long[0]);

    /* renamed from: b */
    public final int f24060b;

    /* renamed from: c */
    public final long[] f24061c;

    /* renamed from: d */
    public final C7364vl[] f24062d;

    /* renamed from: e */
    public final long f24063e;

    public C7365vm(long... jArr) {
        int length = jArr.length;
        this.f24060b = length;
        this.f24061c = Arrays.copyOf(jArr, length);
        this.f24062d = new C7364vl[length];
        for (int i = 0; i < length; i++) {
            this.f24062d[i] = new C7364vl();
        }
        this.f24063e = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7365vm vmVar = (C7365vm) obj;
            return this.f24060b == vmVar.f24060b && Arrays.equals(this.f24061c, vmVar.f24061c) && Arrays.equals(this.f24062d, vmVar.f24062d);
        }
    }

    public final int hashCode() {
        return (((((this.f24060b * 961) + ((int) -9223372036854775807L)) * 31) + Arrays.hashCode(this.f24061c)) * 31) + Arrays.hashCode(this.f24062d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adResumePositionUs=0, adGroups=[");
        for (int i = 0; i < this.f24062d.length; i++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f24061c[i]);
            sb.append(", ads=[");
            int[] iArr = this.f24062d[i].f24057c;
            sb.append("])");
            if (i < this.f24062d.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
