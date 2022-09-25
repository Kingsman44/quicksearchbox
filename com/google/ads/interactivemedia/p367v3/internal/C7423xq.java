package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xq */
/* compiled from: PG */
public final class C7423xq {

    /* renamed from: a */
    public final long f24336a;

    /* renamed from: b */
    public final long f24337b;

    /* renamed from: c */
    private final String f24338c;

    /* renamed from: d */
    private int f24339d;

    public C7423xq(String str, long j, long j2) {
        this.f24338c = str == null ? BuildConfig.FLAVOR : str;
        this.f24336a = j;
        this.f24337b = j2;
    }

    /* renamed from: a */
    public final Uri mo16776a(String str) {
        return atv.m19617i(str, this.f24338c);
    }

    /* renamed from: b */
    public final String mo16777b(String str) {
        return atv.m19618j(str, this.f24338c);
    }

    /* renamed from: c */
    public final C7423xq mo16778c(C7423xq xqVar, String str) {
        String b = mo16777b(str);
        if (xqVar != null && b.equals(xqVar.mo16777b(str))) {
            long j = this.f24337b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.f24336a;
                if (j3 + j == xqVar.f24336a) {
                    long j4 = xqVar.f24337b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new C7423xq(b, j3, j2);
                }
            }
            long j5 = xqVar.f24337b;
            if (j5 != -1) {
                long j6 = xqVar.f24336a;
                if (j6 + j5 == this.f24336a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    return new C7423xq(b, j6, j2);
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7423xq xqVar = (C7423xq) obj;
            return this.f24336a == xqVar.f24336a && this.f24337b == xqVar.f24337b && this.f24338c.equals(xqVar.f24338c);
        }
    }

    public final int hashCode() {
        int i = this.f24339d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((int) this.f24336a) + 527) * 31) + ((int) this.f24337b)) * 31) + this.f24338c.hashCode();
        this.f24339d = hashCode;
        return hashCode;
    }

    public final String toString() {
        String str = this.f24338c;
        long j = this.f24336a;
        long j2 = this.f24337b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j);
        sb.append(", length=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
