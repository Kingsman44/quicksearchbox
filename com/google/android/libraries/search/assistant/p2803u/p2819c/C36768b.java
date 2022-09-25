package com.google.android.libraries.search.assistant.p2803u.p2819c;

/* renamed from: com.google.android.libraries.search.assistant.u.c.b */
/* compiled from: PG */
public final class C36768b extends C36770d {

    /* renamed from: a */
    public final boolean f95822a;

    /* renamed from: b */
    public final String f95823b;

    /* renamed from: c */
    public final int f95824c;

    /* renamed from: d */
    public final boolean f95825d;

    public C36768b(boolean z, String str, int i, boolean z2) {
        this.f95822a = z;
        this.f95823b = str;
        this.f95824c = i;
        this.f95825d = z2;
    }

    /* renamed from: a */
    public final int mo40384a() {
        return this.f95824c;
    }

    /* renamed from: b */
    public final String mo40385b() {
        return this.f95823b;
    }

    /* renamed from: c */
    public final boolean mo40386c() {
        return this.f95825d;
    }

    /* renamed from: d */
    public final boolean mo40387d() {
        return this.f95822a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C36770d) {
            C36770d dVar = (C36770d) obj;
            return this.f95822a == dVar.mo40387d() && this.f95823b.equals(dVar.mo40385b()) && this.f95824c == dVar.mo40384a() && this.f95825d == dVar.mo40386c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((true != this.f95822a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f95823b.hashCode()) * 1000003) ^ this.f95824c) * 1000003;
        if (true == this.f95825d) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        boolean z = this.f95822a;
        String str = this.f95823b;
        int i = this.f95824c;
        boolean z2 = this.f95825d;
        return "SuwContentConfig{isUnicornAccount=" + z + ", accountGivenName=" + str + ", accountStandardGender=" + i + ", biometricsDisabledByAdmin=" + z2 + "}";
    }
}
