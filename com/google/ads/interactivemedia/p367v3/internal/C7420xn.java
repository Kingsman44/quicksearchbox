package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xn */
/* compiled from: PG */
public final class C7420xn {

    /* renamed from: a */
    public final C7247rc[] f24323a;

    /* renamed from: b */
    public final long[] f24324b;

    /* renamed from: c */
    public final String f24325c;

    /* renamed from: d */
    public final String f24326d;

    public C7420xn(String str, String str2, long[] jArr, C7247rc[] rcVarArr) {
        this.f24325c = str;
        this.f24326d = str2;
        this.f24324b = jArr;
        this.f24323a = rcVarArr;
    }

    /* renamed from: a */
    public final String mo16773a() {
        String str = this.f24325c;
        String str2 = this.f24326d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
