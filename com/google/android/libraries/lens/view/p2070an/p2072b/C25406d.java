package com.google.android.libraries.lens.view.p2070an.p2072b;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.an.b.d */
/* compiled from: PG */
final class C25406d extends C25391aa {

    /* renamed from: a */
    public final C24201ad f69243a;

    /* renamed from: b */
    public final C60870cx f69244b;

    /* renamed from: c */
    public final C58833ax f69245c;

    /* renamed from: d */
    public final C58833ax f69246d;

    public C25406d(C24201ad adVar, C60870cx cxVar, C58833ax axVar, C58833ax axVar2) {
        if (adVar != null) {
            this.f69243a = adVar;
            this.f69244b = cxVar;
            if (axVar != null) {
                this.f69245c = axVar;
                this.f69246d = axVar2;
                return;
            }
            throw new NullPointerException("Null reticleServerImage");
        }
        throw new NullPointerException("Null query");
    }

    /* renamed from: a */
    public final C24201ad mo30432a() {
        return this.f69243a;
    }

    /* renamed from: b */
    public final C58833ax mo30433b() {
        return this.f69246d;
    }

    /* renamed from: c */
    public final C58833ax mo30434c() {
        return this.f69245c;
    }

    /* renamed from: d */
    public final C60870cx mo30435d() {
        return this.f69244b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25391aa) {
            C25391aa aaVar = (C25391aa) obj;
            return this.f69243a.equals(aaVar.mo30432a()) && this.f69244b.equals(aaVar.mo30435d()) && this.f69245c.equals(aaVar.mo30434c()) && this.f69246d.equals(aaVar.mo30433b());
        }
    }

    public final int hashCode() {
        return ((((((this.f69243a.hashCode() ^ 1000003) * 1000003) ^ this.f69244b.hashCode()) * 1000003) ^ this.f69245c.hashCode()) * 1000003) ^ this.f69246d.hashCode();
    }

    public final String toString() {
        String obj = this.f69243a.toString();
        String obj2 = this.f69244b.toString();
        String obj3 = this.f69245c.toString();
        String obj4 = this.f69246d.toString();
        return "QueryServerImages{query=" + obj + ", prefetchServerImage=" + obj2 + ", reticleServerImage=" + obj3 + ", interactionServerImage=" + obj4 + "}";
    }
}
