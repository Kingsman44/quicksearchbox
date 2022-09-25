package com.google.android.libraries.mdi.download.p2230c;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.c.c */
/* compiled from: PG */
public final class C28758c extends C28776k {

    /* renamed from: a */
    private final boolean f78176a;

    /* renamed from: b */
    private final C58833ax f78177b;

    public C28758c(boolean z, C58833ax axVar) {
        this.f78176a = z;
        this.f78177b = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo34372a() {
        return this.f78177b;
    }

    /* renamed from: b */
    public final boolean mo34373b() {
        return this.f78176a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C28776k) {
            C28776k kVar = (C28776k) obj;
            return this.f78176a == kVar.mo34373b() && this.f78177b.equals(kVar.mo34372a());
        }
    }

    public final int hashCode() {
        return (((true != this.f78176a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f78177b.hashCode();
    }

    public final String toString() {
        boolean z = this.f78176a;
        String obj = this.f78177b.toString();
        return "CheckContentChangeResponse{contentChanged=" + z + ", freshETagOptional=" + obj + "}";
    }
}
