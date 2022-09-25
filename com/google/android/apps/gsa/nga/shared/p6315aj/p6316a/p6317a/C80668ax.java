package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ax */
/* compiled from: PG */
final class C80668ax extends C80719cu {

    /* renamed from: a */
    private final String f221482a;

    /* renamed from: b */
    private final Optional f221483b;

    public C80668ax(String str, Optional optional) {
        this.f221482a = str;
        this.f221483b = optional;
    }

    /* renamed from: a */
    public final Optional mo74511a() {
        return this.f221483b;
    }

    /* renamed from: b */
    public final String mo74512b() {
        return this.f221482a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C80719cu) {
            C80719cu cuVar = (C80719cu) obj;
            return this.f221482a.equals(cuVar.mo74512b()) && this.f221483b.equals(cuVar.mo74511a());
        }
    }

    public final int hashCode() {
        return ((this.f221482a.hashCode() ^ 1000003) * 1000003) ^ this.f221483b.hashCode();
    }

    public final String toString() {
        String str = this.f221482a;
        String valueOf = String.valueOf(this.f221483b);
        return "DisclosureInfo{disclosureLabel=" + str + ", disclosureAction=" + valueOf + "}";
    }
}
