package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zs */
/* compiled from: PG */
public final class C7479zs implements Comparable {

    /* renamed from: a */
    public final String f24611a;

    /* renamed from: b */
    public final C7479zs f24612b;

    /* renamed from: c */
    public final long f24613c;

    /* renamed from: d */
    public final int f24614d;

    /* renamed from: e */
    public final long f24615e;

    /* renamed from: f */
    public final C7031jc f24616f;

    /* renamed from: g */
    public final String f24617g;

    /* renamed from: h */
    public final String f24618h;

    /* renamed from: i */
    public final long f24619i;

    /* renamed from: j */
    public final long f24620j;

    /* renamed from: k */
    public final boolean f24621k;

    public C7479zs(String str, long j, long j2, String str2, String str3) {
        this(str, (C7479zs) null, 0, -1, -9223372036854775807L, (C7031jc) null, str2, str3, j, j2, false);
    }

    public C7479zs(String str, C7479zs zsVar, long j, int i, long j2, C7031jc jcVar, String str2, String str3, long j3, long j4, boolean z) {
        this.f24611a = str;
        this.f24612b = zsVar;
        this.f24613c = j;
        this.f24614d = i;
        this.f24615e = j2;
        this.f24616f = jcVar;
        this.f24617g = str2;
        this.f24618h = str3;
        this.f24619i = j3;
        this.f24620j = j4;
        this.f24621k = z;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Long l = (Long) obj;
        if (this.f24615e > l.longValue()) {
            return 1;
        }
        return this.f24615e >= l.longValue() ? 0 : -1;
    }
}
