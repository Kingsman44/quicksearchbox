package com.google.android.libraries.search.location.p3029a.p3032c.p3033a;

import com.google.android.gms.location.C144889at;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;

/* renamed from: com.google.android.libraries.search.location.a.c.a.a */
/* compiled from: PG */
final class C38637a extends C38643g {

    /* renamed from: a */
    public final C144889at f102096a;

    /* renamed from: b */
    public final C39226b f102097b;

    public C38637a(C144889at atVar, C39226b bVar) {
        this.f102096a = atVar;
        this.f102097b = bVar;
    }

    /* renamed from: a */
    public final C144889at mo41530a() {
        return this.f102096a;
    }

    /* renamed from: b */
    public final C39226b mo41531b() {
        return this.f102097b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C38643g) {
            C38643g gVar = (C38643g) obj;
            return this.f102096a.equals(gVar.mo41530a()) && this.f102097b.equals(gVar.mo41531b());
        }
    }

    public final int hashCode() {
        return ((this.f102096a.hashCode() ^ 1000003) * 1000003) ^ this.f102097b.hashCode();
    }

    public final String toString() {
        String obj = this.f102096a.toString();
        String num = Integer.toString(this.f102097b.getNumber());
        return "SubscriptionData{listener=" + obj + ", attributionId=" + num + "}";
    }
}
