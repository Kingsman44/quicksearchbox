package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gk */
/* compiled from: PG */
public final class C6958gk {

    /* renamed from: a */
    public final long f22190a;

    /* renamed from: b */
    public final C6912es f22191b;

    /* renamed from: c */
    public final int f22192c;

    /* renamed from: d */
    public final C7321tw f22193d;

    /* renamed from: e */
    public final long f22194e;

    /* renamed from: f */
    public final C6912es f22195f;

    /* renamed from: g */
    public final int f22196g;

    /* renamed from: h */
    public final C7321tw f22197h;

    /* renamed from: i */
    public final long f22198i;

    /* renamed from: j */
    public final long f22199j;

    public C6958gk(long j, C6912es esVar, int i, C7321tw twVar, long j2, C6912es esVar2, int i2, C7321tw twVar2, long j3, long j4) {
        this.f22190a = j;
        this.f22191b = esVar;
        this.f22192c = i;
        this.f22193d = twVar;
        this.f22194e = j2;
        this.f22195f = esVar2;
        this.f22196g = i2;
        this.f22197h = twVar2;
        this.f22198i = j3;
        this.f22199j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6958gk gkVar = (C6958gk) obj;
            return this.f22190a == gkVar.f22190a && this.f22192c == gkVar.f22192c && this.f22194e == gkVar.f22194e && this.f22196g == gkVar.f22196g && this.f22198i == gkVar.f22198i && this.f22199j == gkVar.f22199j && apz.m19253b(this.f22191b, gkVar.f22191b) && apz.m19253b(this.f22193d, gkVar.f22193d) && apz.m19253b(this.f22195f, gkVar.f22195f) && apz.m19253b(this.f22197h, gkVar.f22197h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f22190a), this.f22191b, Integer.valueOf(this.f22192c), this.f22193d, Long.valueOf(this.f22194e), this.f22195f, Integer.valueOf(this.f22196g), this.f22197h, Long.valueOf(this.f22198i), Long.valueOf(this.f22199j)});
    }
}
