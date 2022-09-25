package com.google.android.libraries.onegoogle.accountmenu.features.p2375i;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.i.b */
/* compiled from: PG */
final class C30623b extends C30626e {

    /* renamed from: a */
    private final boolean f82723a;

    /* renamed from: b */
    private final C58833ax f82724b;

    public C30623b(boolean z, C58833ax axVar) {
        this.f82723a = z;
        this.f82724b = axVar;
    }

    /* renamed from: c */
    public final C58833ax mo36345c() {
        return this.f82724b;
    }

    /* renamed from: d */
    public final boolean mo36346d() {
        return this.f82723a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30626e) {
            C30626e eVar = (C30626e) obj;
            return this.f82723a == eVar.mo36346d() && this.f82724b.equals(eVar.mo36345c());
        }
    }

    public final int hashCode() {
        return (((true != this.f82723a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f82724b.hashCode();
    }

    public final String toString() {
        boolean z = this.f82723a;
        String valueOf = String.valueOf(this.f82724b);
        return "UseWithoutAnAccountActionImpl{showForUnicorn=" + z + ", availabilityChecker=" + valueOf + "}";
    }
}
