package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.search.n.c.a.w */
/* compiled from: PG */
final class C39641w extends C39395ak {

    /* renamed from: a */
    private final C58833ax f104357a;

    /* renamed from: b */
    private final boolean f104358b;

    public C39641w(C58833ax axVar, boolean z) {
        this.f104357a = axVar;
        this.f104358b = z;
    }

    /* renamed from: a */
    public final C58833ax mo41812a() {
        return this.f104357a;
    }

    /* renamed from: b */
    public final boolean mo41813b() {
        return this.f104358b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39395ak) {
            C39395ak akVar = (C39395ak) obj;
            return this.f104357a.equals(akVar.mo41812a()) && this.f104358b == akVar.mo41813b();
        }
    }

    public final int hashCode() {
        return ((this.f104357a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f104358b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f104357a);
        boolean z = this.f104358b;
        return "HotwordDetectionStartResult{error=" + valueOf + ", success=" + z + "}";
    }
}
