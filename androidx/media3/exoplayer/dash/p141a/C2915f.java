package androidx.media3.exoplayer.dash.p141a;

import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.dash.a.f */
/* compiled from: PG */
public final class C2915f {

    /* renamed from: a */
    public final String f8343a;

    /* renamed from: b */
    public final String f8344b;

    /* renamed from: c */
    public final String f8345c;

    public C2915f(String str, String str2, String str3) {
        this.f8343a = str;
        this.f8344b = str2;
        this.f8345c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2915f fVar = (C2915f) obj;
            return C2612ak.m6951aa(this.f8343a, fVar.f8343a) && C2612ak.m6951aa(this.f8344b, fVar.f8344b) && C2612ak.m6951aa(this.f8345c, fVar.f8345c);
        }
    }

    public final int hashCode() {
        int hashCode = this.f8343a.hashCode() * 31;
        String str = this.f8344b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8345c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
