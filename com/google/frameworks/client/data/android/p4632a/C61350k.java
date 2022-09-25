package com.google.frameworks.client.data.android.p4632a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.frameworks.client.data.android.a.k */
/* compiled from: PG */
final class C61350k extends C61357r {

    /* renamed from: a */
    private final C58833ax f165911a;

    /* renamed from: b */
    private final C58833ax f165912b;

    public C61350k(C58833ax axVar, C58833ax axVar2) {
        this.f165911a = axVar;
        this.f165912b = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo57924a() {
        return this.f165911a;
    }

    /* renamed from: b */
    public final C58833ax mo57925b() {
        return this.f165912b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61357r) {
            C61357r rVar = (C61357r) obj;
            return this.f165911a.equals(rVar.mo57924a()) && this.f165912b.equals(rVar.mo57925b());
        }
    }

    public final int hashCode() {
        return ((this.f165911a.hashCode() ^ 1000003) * 1000003) ^ this.f165912b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f165911a);
        String valueOf2 = String.valueOf(this.f165912b);
        return "Options{customScopes=" + valueOf + ", fallbackOptions=" + valueOf2 + "}";
    }
}
