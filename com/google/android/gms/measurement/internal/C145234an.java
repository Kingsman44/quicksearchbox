package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.an */
/* compiled from: PG */
final class C145234an {

    /* renamed from: a */
    final String f392596a;

    /* renamed from: b */
    final String f392597b;

    /* renamed from: c */
    final long f392598c;

    /* renamed from: d */
    final long f392599d;

    /* renamed from: e */
    final long f392600e;

    /* renamed from: f */
    final long f392601f;

    /* renamed from: g */
    final long f392602g;

    /* renamed from: h */
    final Long f392603h;

    /* renamed from: i */
    final Long f392604i;

    /* renamed from: j */
    final Long f392605j;

    /* renamed from: k */
    final Boolean f392606k;

    public C145234an(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C143919bh.m233969l(str);
        C143919bh.m233969l(str2);
        boolean z = true;
        C143919bh.m233959b(j6 >= 0);
        C143919bh.m233959b(j7 >= 0);
        C143919bh.m233959b(j8 >= 0);
        C143919bh.m233959b(j9 < 0 ? false : z);
        this.f392596a = str;
        this.f392597b = str2;
        this.f392598c = j6;
        this.f392599d = j7;
        this.f392600e = j8;
        this.f392601f = j4;
        this.f392602g = j9;
        this.f392603h = l;
        this.f392604i = l2;
        this.f392605j = l3;
        this.f392606k = bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C145234an mo120836a(Long l, Long l2, Boolean bool) {
        return new C145234an(this.f392596a, this.f392597b, this.f392598c, this.f392599d, this.f392600e, this.f392601f, this.f392602g, this.f392603h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C145234an mo120837b(long j, long j2) {
        return new C145234an(this.f392596a, this.f392597b, this.f392598c, this.f392599d, this.f392600e, this.f392601f, j, Long.valueOf(j2), this.f392604i, this.f392605j, this.f392606k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C145234an mo120838c(long j) {
        return new C145234an(this.f392596a, this.f392597b, this.f392598c, this.f392599d, this.f392600e, j, this.f392602g, this.f392603h, this.f392604i, this.f392605j, this.f392606k);
    }
}
