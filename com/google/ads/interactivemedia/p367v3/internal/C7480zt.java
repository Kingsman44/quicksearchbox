package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zt */
/* compiled from: PG */
public final class C7480zt extends C7481zu {

    /* renamed from: a */
    public final int f24622a;

    /* renamed from: b */
    public final long f24623b;

    /* renamed from: c */
    public final long f24624c;

    /* renamed from: d */
    public final boolean f24625d;

    /* renamed from: e */
    public final int f24626e;

    /* renamed from: f */
    public final long f24627f;

    /* renamed from: g */
    public final int f24628g;

    /* renamed from: h */
    public final long f24629h;

    /* renamed from: i */
    public final long f24630i;

    /* renamed from: j */
    public final boolean f24631j;

    /* renamed from: k */
    public final boolean f24632k;

    /* renamed from: l */
    public final C7031jc f24633l;

    /* renamed from: m */
    public final List f24634m;

    /* renamed from: n */
    public final long f24635n;

    /* renamed from: o */
    public final ary f24636o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7480zt(int i, String str, List list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, long j5, boolean z2, boolean z3, boolean z4, C7031jc jcVar, List list2, ary ary, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(str, list, z2);
        long j6;
        String str2 = str;
        List list3 = list;
        this.f24622a = i;
        this.f24624c = j2;
        this.f24625d = z;
        this.f24626e = i2;
        this.f24627f = j3;
        this.f24628g = i3;
        this.f24629h = j4;
        this.f24630i = j5;
        this.f24631j = z3;
        this.f24632k = z4;
        this.f24633l = jcVar;
        this.f24634m = Collections.unmodifiableList(list2);
        if (!list2.isEmpty()) {
            C7479zs zsVar = (C7479zs) list2.get(list2.size() - 1);
            j6 = zsVar.f24615e + zsVar.f24613c;
            this.f24635n = j6;
        } else {
            this.f24635n = 0;
            j6 = 0;
        }
        this.f24623b = j != -9223372036854775807L ? j >= 0 ? j : j6 + j : -9223372036854775807L;
        this.f24636o = ary;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16457a(List list) {
        return this;
    }

    /* renamed from: b */
    public final long mo16889b() {
        return this.f24624c + this.f24635n;
    }
}
