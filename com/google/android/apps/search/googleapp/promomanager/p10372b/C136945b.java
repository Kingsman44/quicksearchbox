package com.google.android.apps.search.googleapp.promomanager.p10372b;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.b.b */
/* compiled from: PG */
final class C136945b extends C137019n {

    /* renamed from: a */
    public final C58495hd f372705a;

    /* renamed from: b */
    public final C63042fg f372706b;

    public C136945b(C58495hd hdVar, C63042fg fgVar) {
        if (hdVar != null) {
            this.f372705a = hdVar;
            if (fgVar != null) {
                this.f372706b = fgVar;
                return;
            }
            throw new NullPointerException("Null lastUpdateTime");
        }
        throw new NullPointerException("Null map");
    }

    /* renamed from: a */
    public final C58495hd mo113441a() {
        return this.f372705a;
    }

    /* renamed from: b */
    public final C63042fg mo113442b() {
        return this.f372706b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C137019n) {
            C137019n nVar = (C137019n) obj;
            return this.f372705a.equals(nVar.mo113441a()) && this.f372706b.equals(nVar.mo113442b());
        }
    }

    public final int hashCode() {
        return ((C58758qx.m90643a(this.f372705a.entrySet()) ^ 1000003) * 1000003) ^ this.f372706b.hashCode();
    }

    public final String toString() {
        String obj = this.f372705a.toString();
        String obj2 = this.f372706b.toString();
        return "RankingMap{map=" + obj + ", lastUpdateTime=" + obj2 + "}";
    }
}
