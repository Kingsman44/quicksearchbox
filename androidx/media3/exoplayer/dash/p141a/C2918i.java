package androidx.media3.exoplayer.dash.p141a;

import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.dash.a.i */
/* compiled from: PG */
public final class C2918i {

    /* renamed from: a */
    public final String f8354a;

    /* renamed from: b */
    public final String f8355b;

    /* renamed from: c */
    public final String f8356c;

    /* renamed from: d */
    public final String f8357d;

    /* renamed from: e */
    public final String f8358e;

    public C2918i(String str, String str2, String str3, String str4, String str5) {
        this.f8354a = str;
        this.f8355b = str2;
        this.f8356c = str3;
        this.f8357d = str4;
        this.f8358e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2918i)) {
            return false;
        }
        C2918i iVar = (C2918i) obj;
        return C2612ak.m6951aa(this.f8354a, iVar.f8354a) && C2612ak.m6951aa(this.f8355b, iVar.f8355b) && C2612ak.m6951aa(this.f8356c, iVar.f8356c) && C2612ak.m6951aa(this.f8357d, iVar.f8357d) && C2612ak.m6951aa(this.f8358e, iVar.f8358e);
    }

    public final int hashCode() {
        String str = this.f8354a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f8355b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8356c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f8357d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f8358e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
