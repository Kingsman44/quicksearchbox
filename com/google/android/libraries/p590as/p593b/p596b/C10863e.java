package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.as.b.b.e */
/* compiled from: PG */
final class C10863e extends C10809am {

    /* renamed from: a */
    private final C58485gu f35926a;

    /* renamed from: b */
    private final C58485gu f35927b;

    /* renamed from: c */
    private final C58485gu f35928c;

    public C10863e(C58485gu guVar, C58485gu guVar2, C58485gu guVar3) {
        if (guVar != null) {
            this.f35926a = guVar;
            if (guVar2 != null) {
                this.f35927b = guVar2;
                if (guVar3 != null) {
                    this.f35928c = guVar3;
                    return;
                }
                throw new NullPointerException("Null installed");
            }
            throw new NullPointerException("Null pending");
        }
        throw new NullPointerException("Null downloadable");
    }

    /* renamed from: a */
    public final C58485gu mo19299a() {
        return this.f35926a;
    }

    /* renamed from: b */
    public final C58485gu mo19300b() {
        return this.f35928c;
    }

    /* renamed from: c */
    public final C58485gu mo19301c() {
        return this.f35927b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10809am) {
            C10809am amVar = (C10809am) obj;
            return C58597ky.m90218i(this.f35926a, amVar.mo19299a()) && C58597ky.m90218i(this.f35927b, amVar.mo19301c()) && C58597ky.m90218i(this.f35928c, amVar.mo19300b());
        }
    }

    public final int hashCode() {
        return ((((this.f35926a.hashCode() ^ 1000003) * 1000003) ^ this.f35927b.hashCode()) * 1000003) ^ this.f35928c.hashCode();
    }

    public final String toString() {
        String obj = this.f35926a.toString();
        String obj2 = this.f35927b.toString();
        String obj3 = this.f35928c.toString();
        return "AllLanguagePacks{downloadable=" + obj + ", pending=" + obj2 + ", installed=" + obj3 + "}";
    }
}
