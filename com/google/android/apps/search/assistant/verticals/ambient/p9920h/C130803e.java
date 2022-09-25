package com.google.android.apps.search.assistant.verticals.ambient.p9920h;

import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.p4479cg.C58079k;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.e */
/* compiled from: PG */
public final class C130803e extends C130805g {

    /* renamed from: a */
    private final C8242v f358048a;

    /* renamed from: b */
    private final double f358049b;

    /* renamed from: c */
    private final C58079k f358050c;

    public C130803e(C8242v vVar, double d, C58079k kVar) {
        if (vVar != null) {
            this.f358048a = vVar;
            this.f358049b = d;
            if (kVar != null) {
                this.f358050c = kVar;
                return;
            }
            throw new NullPointerException("Null latLng");
        }
        throw new NullPointerException("Null featureId");
    }

    /* renamed from: a */
    public final double mo109822a() {
        return this.f358049b;
    }

    /* renamed from: b */
    public final C8242v mo109823b() {
        return this.f358048a;
    }

    /* renamed from: c */
    public final C58079k mo109824c() {
        return this.f358050c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130805g) {
            C130805g gVar = (C130805g) obj;
            return this.f358048a.equals(gVar.mo109823b()) && Double.doubleToLongBits(this.f358049b) == Double.doubleToLongBits(gVar.mo109822a()) && this.f358050c.equals(gVar.mo109824c());
        }
    }

    public final int hashCode() {
        return ((((this.f358048a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f358049b) >>> 32) ^ Double.doubleToLongBits(this.f358049b)))) * 1000003) ^ this.f358050c.hashCode();
    }

    public final String toString() {
        String obj = this.f358048a.toString();
        double d = this.f358049b;
        String obj2 = this.f358050c.toString();
        return "LocationData{featureId=" + obj + ", visitsPerMonth=" + d + ", latLng=" + obj2 + "}";
    }
}
