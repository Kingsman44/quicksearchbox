package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;

/* renamed from: com.google.ads.interactivemedia.v3.internal.er */
/* compiled from: PG */
public final class C6911er {

    /* renamed from: a */
    public static final Object f22042a = new Object();

    /* renamed from: q */
    private static final C6873dg f22043q;

    /* renamed from: b */
    public Object f22044b = f22042a;

    /* renamed from: c */
    public C6873dg f22045c = f22043q;

    /* renamed from: d */
    public Object f22046d;

    /* renamed from: e */
    public long f22047e;

    /* renamed from: f */
    public long f22048f;

    /* renamed from: g */
    public long f22049g;

    /* renamed from: h */
    public boolean f22050h;

    /* renamed from: i */
    public boolean f22051i;

    /* renamed from: j */
    public boolean f22052j;

    /* renamed from: k */
    public boolean f22053k;

    /* renamed from: l */
    public int f22054l;

    /* renamed from: m */
    public int f22055m;

    /* renamed from: n */
    public long f22056n;

    /* renamed from: o */
    public long f22057o;

    /* renamed from: p */
    public long f22058p;

    static {
        C6868db dbVar = new C6868db();
        dbVar.mo15653e("com.google.ads.interactivemedia.v3.exoplayer2.Timeline");
        dbVar.mo15656h(Uri.EMPTY);
        f22043q = dbVar.mo15649a();
    }

    /* renamed from: a */
    public final long mo15845a() {
        return C6821bi.m19754a(this.f22056n);
    }

    /* renamed from: b */
    public final void mo15846b(Object obj, C6873dg dgVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, boolean z3, long j4, long j5, int i, long j6) {
        this.f22044b = obj;
        this.f22045c = dgVar != null ? dgVar : f22043q;
        this.f22046d = obj2;
        this.f22047e = j;
        this.f22048f = j2;
        this.f22049g = j3;
        this.f22050h = z;
        this.f22051i = z2;
        this.f22052j = z3;
        this.f22056n = j4;
        this.f22057o = j5;
        this.f22054l = 0;
        this.f22055m = i;
        this.f22058p = j6;
        this.f22053k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            C6911er erVar = (C6911er) obj;
            return aeu.m18533c(this.f22044b, erVar.f22044b) && aeu.m18533c(this.f22045c, erVar.f22045c) && aeu.m18533c(this.f22046d, erVar.f22046d) && this.f22047e == erVar.f22047e && this.f22048f == erVar.f22048f && this.f22049g == erVar.f22049g && this.f22050h == erVar.f22050h && this.f22051i == erVar.f22051i && this.f22052j == erVar.f22052j && this.f22053k == erVar.f22053k && this.f22056n == erVar.f22056n && this.f22057o == erVar.f22057o && this.f22054l == erVar.f22054l && this.f22055m == erVar.f22055m && this.f22058p == erVar.f22058p;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f22044b.hashCode() + 217) * 31) + this.f22045c.hashCode()) * 31;
        Object obj = this.f22046d;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        long j = this.f22047e;
        long j2 = this.f22048f;
        long j3 = this.f22049g;
        boolean z = this.f22050h;
        boolean z2 = this.f22051i;
        boolean z3 = this.f22052j;
        boolean z4 = this.f22053k;
        long j4 = this.f22056n;
        long j5 = this.f22057o;
        int i2 = this.f22054l;
        long j6 = this.f22058p;
        return ((((((((((((((((((((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + i2) * 31) + this.f22055m) * 31) + ((int) ((j6 >>> 32) ^ j6));
    }
}
