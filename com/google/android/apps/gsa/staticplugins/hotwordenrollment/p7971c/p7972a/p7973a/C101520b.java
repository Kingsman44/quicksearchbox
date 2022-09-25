package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.b */
/* compiled from: PG */
final class C101520b extends C101527i {

    /* renamed from: a */
    private final boolean f283335a;

    /* renamed from: b */
    private final C58833ax f283336b;

    /* renamed from: c */
    private final C58833ax f283337c;

    public C101520b(boolean z, C58833ax axVar, C58833ax axVar2) {
        this.f283335a = z;
        this.f283336b = axVar;
        this.f283337c = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo92379a() {
        return this.f283337c;
    }

    /* renamed from: b */
    public final C58833ax mo92380b() {
        return this.f283336b;
    }

    /* renamed from: c */
    public final boolean mo92381c() {
        return this.f283335a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C101527i) {
            C101527i iVar = (C101527i) obj;
            return this.f283335a == iVar.mo92381c() && this.f283336b.equals(iVar.mo92380b()) && this.f283337c.equals(iVar.mo92379a());
        }
    }

    public final int hashCode() {
        return (((((true != this.f283335a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f283336b.hashCode()) * 1000003) ^ this.f283337c.hashCode();
    }

    public final String toString() {
        boolean z = this.f283335a;
        String valueOf = String.valueOf(this.f283336b);
        String valueOf2 = String.valueOf(this.f283337c);
        return "CloudEnrollmentResult{isSuccessful=" + z + ", isRetryable=" + valueOf + ", errorMsg=" + valueOf2 + "}";
    }
}
