package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xp */
/* compiled from: PG */
public final class C7422xp {

    /* renamed from: a */
    public final String f24331a;

    /* renamed from: b */
    public final String f24332b;

    /* renamed from: c */
    public final String f24333c;

    /* renamed from: d */
    public final String f24334d;

    /* renamed from: e */
    public final String f24335e;

    public C7422xp(String str, String str2, String str3, String str4, String str5) {
        this.f24331a = str;
        this.f24332b = str2;
        this.f24333c = str3;
        this.f24334d = str4;
        this.f24335e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7422xp xpVar = (C7422xp) obj;
            return aeu.m18533c(this.f24331a, xpVar.f24331a) && aeu.m18533c(this.f24332b, xpVar.f24332b) && aeu.m18533c(this.f24333c, xpVar.f24333c) && aeu.m18533c(this.f24334d, xpVar.f24334d) && aeu.m18533c(this.f24335e, xpVar.f24335e);
        }
    }

    public final int hashCode() {
        String str = this.f24331a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f24332b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24333c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f24334d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f24335e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
