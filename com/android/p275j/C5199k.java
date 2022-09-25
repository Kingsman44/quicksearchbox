package com.android.p275j;

import android.text.TextUtils;

/* renamed from: com.android.j.k */
/* compiled from: PG */
public final class C5199k {

    /* renamed from: a */
    public final String f16498a;

    /* renamed from: b */
    public final String f16499b;

    public C5199k(String str, String str2) {
        this.f16498a = str;
        this.f16499b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C5199k kVar = (C5199k) obj;
            return TextUtils.equals(this.f16498a, kVar.f16498a) && TextUtils.equals(this.f16499b, kVar.f16499b);
        }
    }

    public final int hashCode() {
        return (this.f16498a.hashCode() * 31) + this.f16499b.hashCode();
    }

    public final String toString() {
        String str = this.f16498a;
        String str2 = this.f16499b;
        return "Header[name=" + str + ",value=" + str2 + "]";
    }
}
