package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.search.n.c.a.h.d */
/* compiled from: PG */
final class C39585d extends C39562b {

    /* renamed from: a */
    private final C37662hi f104206a;

    /* renamed from: b */
    private final C58833ax f104207b;

    public C39585d(C37662hi hiVar, C58833ax axVar) {
        this.f104206a = hiVar;
        this.f104207b = axVar;
    }

    /* renamed from: a */
    public final C37662hi mo41899a() {
        return this.f104206a;
    }

    /* renamed from: b */
    public final C58833ax mo41900b() {
        return this.f104207b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39562b) {
            C39562b bVar = (C39562b) obj;
            return this.f104206a.equals(bVar.mo41899a()) && this.f104207b.equals(bVar.mo41900b());
        }
    }

    public final int hashCode() {
        return ((this.f104206a.hashCode() ^ 1000003) * 1000003) ^ this.f104207b.hashCode();
    }

    public final String toString() {
        String obj = this.f104206a.toString();
        String valueOf = String.valueOf(this.f104207b);
        return "AudioLibraryListeningSessionParams{hotwordMicInputParams=" + obj + ", audioRouteRequestParams=" + valueOf + "}";
    }
}
