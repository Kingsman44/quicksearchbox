package com.google.android.apps.gsa.nga.engine.p6056o;

import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.engine.understanding.C79004ba;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.f */
/* compiled from: PG */
final class C77369f extends C77426t {

    /* renamed from: a */
    public final C78983aj f213373a;

    /* renamed from: b */
    public final C80401n f213374b;

    /* renamed from: c */
    public final C80379i f213375c;

    /* renamed from: d */
    public final C82838ch f213376d;

    /* renamed from: e */
    public final boolean f213377e;

    /* renamed from: f */
    public final C79004ba f213378f;

    public C77369f(C78983aj ajVar, C80401n nVar, C80379i iVar, C82838ch chVar, boolean z, C79004ba baVar) {
        this.f213373a = ajVar;
        this.f213374b = nVar;
        this.f213375c = iVar;
        this.f213376d = chVar;
        this.f213377e = z;
        this.f213378f = baVar;
    }

    /* renamed from: a */
    public final C77425s mo72524a() {
        return new C76760e(this);
    }

    /* renamed from: b */
    public final C78983aj mo72525b() {
        return this.f213373a;
    }

    /* renamed from: c */
    public final C79004ba mo72526c() {
        return this.f213378f;
    }

    /* renamed from: d */
    public final C82838ch mo72527d() {
        return this.f213376d;
    }

    /* renamed from: e */
    public final C80401n mo72528e() {
        return this.f213374b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77426t) {
            C77426t tVar = (C77426t) obj;
            return this.f213373a.equals(tVar.mo72525b()) && this.f213374b.equals(tVar.mo72528e()) && this.f213375c.equals(tVar.mo72530f()) && this.f213376d.equals(tVar.mo72527d()) && this.f213377e == tVar.mo72531g() && this.f213378f.equals(tVar.mo72526c());
        }
    }

    /* renamed from: f */
    public final C80379i mo72530f() {
        return this.f213375c;
    }

    /* renamed from: g */
    public final boolean mo72531g() {
        return this.f213377e;
    }

    public final int hashCode() {
        return ((((((((((this.f213373a.hashCode() ^ 1000003) * 1000003) ^ this.f213374b.hashCode()) * 1000003) ^ this.f213375c.hashCode()) * 1000003) ^ this.f213376d.hashCode()) * 1000003) ^ (true != this.f213377e ? 1237 : 1231)) * 1000003) ^ this.f213378f.hashCode();
    }

    public final String toString() {
        String obj = this.f213373a.toString();
        String obj2 = this.f213374b.toString();
        String obj3 = this.f213375c.toString();
        String obj4 = this.f213376d.toString();
        boolean z = this.f213377e;
        String obj5 = this.f213378f.toString();
        return "FulfillmentResponse{queryUnderstandingResult=" + obj + ", onDeviceFulfillerResponse=" + obj2 + ", preFulfillmentRankingFeatures=" + obj3 + ", fulfillmentCandidateInfo=" + obj4 + ", didMultipleDevicesTrigger=" + z + ", understandingStreamzEventsBuilder=" + obj5 + "}";
    }
}
