package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acb */
/* compiled from: PG */
public final class acb {

    /* renamed from: a */
    public final Uri f20241a;

    /* renamed from: b */
    public final int f20242b;

    /* renamed from: c */
    public final byte[] f20243c;

    /* renamed from: d */
    public final Map f20244d;

    /* renamed from: e */
    public final long f20245e;

    /* renamed from: f */
    public final long f20246f;

    /* renamed from: g */
    public final String f20247g;

    /* renamed from: h */
    public final int f20248h;

    private acb(Uri uri, int i, byte[] bArr, Map map, long j, long j2, String str, int i2) {
        boolean z = false;
        boolean z2 = j >= 0;
        ary.m19462o(z2);
        ary.m19462o(z2);
        if (j2 <= 0) {
            j2 = j2 == -1 ? -1 : j2;
            ary.m19462o(z);
            this.f20241a = uri;
            this.f20242b = i;
            this.f20243c = null;
            this.f20244d = Collections.unmodifiableMap(new HashMap(map));
            this.f20245e = j;
            this.f20246f = j2;
            this.f20247g = str;
            this.f20248h = i2;
        }
        z = true;
        ary.m19462o(z);
        this.f20241a = uri;
        this.f20242b = i;
        this.f20243c = null;
        this.f20244d = Collections.unmodifiableMap(new HashMap(map));
        this.f20245e = j;
        this.f20246f = j2;
        this.f20247g = str;
        this.f20248h = i2;
    }

    public /* synthetic */ acb(Uri uri, int i, byte[] bArr, Map map, long j, long j2, String str, int i2, byte[] bArr2) {
        this(uri, 1, (byte[]) null, map, j, j2, str, i2);
    }

    /* renamed from: a */
    public static String m18196a(int i) {
        if (i == 1) {
            return "GET";
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public final boolean mo14432b(int i) {
        return (this.f20248h & i) == i;
    }

    /* renamed from: c */
    public final acb mo14433c(long j) {
        long j2 = this.f20246f;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        long j4 = j3;
        long j5 = 0;
        if (j != 0) {
            j5 = j;
        } else if (j2 == j4) {
            return this;
        }
        return new acb(this.f20241a, this.f20242b, (byte[]) null, this.f20244d, this.f20245e + j5, j4, this.f20247g, this.f20248h);
    }

    public final String toString() {
        String a = m18196a(this.f20242b);
        String valueOf = String.valueOf(this.f20241a);
        long j = this.f20245e;
        long j2 = this.f20246f;
        String str = this.f20247g;
        int i = this.f20248h;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(a.length() + 70 + length + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(a);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public acb(Uri uri, long j, long j2) {
        this(uri, 1, (byte[]) null, Collections.emptyMap(), j, j2, (String) null, 0);
    }
}
