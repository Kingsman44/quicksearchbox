package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xm */
/* compiled from: PG */
public final class C7419xm {

    /* renamed from: a */
    public final String f24320a;

    /* renamed from: b */
    public final String f24321b;

    /* renamed from: c */
    public final String f24322c;

    public C7419xm(String str, String str2, String str3) {
        this.f24320a = str;
        this.f24321b = str2;
        this.f24322c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7419xm xmVar = (C7419xm) obj;
            return aeu.m18533c(this.f24320a, xmVar.f24320a) && aeu.m18533c(this.f24321b, xmVar.f24321b) && aeu.m18533c(this.f24322c, xmVar.f24322c);
        }
    }

    public final int hashCode() {
        int hashCode = this.f24320a.hashCode() * 31;
        String str = this.f24321b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24322c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
