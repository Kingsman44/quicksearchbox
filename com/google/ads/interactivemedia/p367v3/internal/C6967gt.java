package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gt */
/* compiled from: PG */
public final class C6967gt {

    /* renamed from: a */
    private final int[] f22229a;

    /* renamed from: b */
    private final int f22230b = 8;

    static {
        new C6967gt(new int[]{2});
        new C6967gt(new int[]{2, 5, 6});
    }

    public C6967gt(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.f22229a = copyOf;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6967gt)) {
            return false;
        }
        C6967gt gtVar = (C6967gt) obj;
        if (!Arrays.equals(this.f22229a, gtVar.f22229a)) {
            return false;
        }
        int i = gtVar.f22230b;
        return true;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f22229a) * 31) + 8;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f22229a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=8, supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
