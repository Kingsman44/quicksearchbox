package com.google.android.apps.search.googleapp.compliance.p10144a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.b */
/* compiled from: PG */
final class C133551b extends C133570u {

    /* renamed from: a */
    private final boolean f363870a;

    /* renamed from: b */
    private final Optional f363871b;

    /* renamed from: c */
    private final int f363872c;

    public C133551b(boolean z, int i, Optional optional) {
        this.f363870a = z;
        this.f363872c = i;
        this.f363871b = optional;
    }

    /* renamed from: a */
    public final Optional mo111259a() {
        return this.f363871b;
    }

    /* renamed from: b */
    public final boolean mo111260b() {
        return this.f363870a;
    }

    /* renamed from: c */
    public final int mo111261c() {
        return this.f363872c;
    }

    /* renamed from: d */
    public final int mo111262d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C133570u) {
            C133570u uVar = (C133570u) obj;
            return uVar.mo111262d() == 1 && this.f363870a == uVar.mo111260b() && (this.f363872c != 0 ? uVar.mo111261c() == 1 : uVar.mo111261c() == 0) && this.f363871b.equals(uVar.mo111259a());
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = ((true != this.f363870a ? 1237 : 1231) ^ -722379962) * 1000003;
        if (this.f363872c == 0) {
            i = 0;
        }
        return ((i2 ^ i) * 1000003) ^ this.f363871b.hashCode();
    }

    public final String toString() {
        boolean z = this.f363870a;
        String str = this.f363872c != 1 ? "null" : "SETTINGS";
        String valueOf = String.valueOf(this.f363871b);
        return "CookiePersonalizationChangeParams{preference=SEARCH, value=" + z + ", source=" + str + ", isFromClassic=" + valueOf + "}";
    }
}
