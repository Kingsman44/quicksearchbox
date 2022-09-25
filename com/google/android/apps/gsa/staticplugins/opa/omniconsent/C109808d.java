package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.assistant.p3861at.C50362ug;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.d */
/* compiled from: PG */
final class C109808d extends C109785ae {

    /* renamed from: a */
    private final C58833ax f305984a;

    /* renamed from: b */
    private final C50362ug f305985b;

    /* renamed from: c */
    private final C58833ax f305986c;

    /* renamed from: d */
    private final boolean f305987d;

    /* renamed from: e */
    private final boolean f305988e;

    public C109808d(C58833ax axVar, C50362ug ugVar, C58833ax axVar2, boolean z, boolean z2) {
        this.f305984a = axVar;
        this.f305985b = ugVar;
        this.f305986c = axVar2;
        this.f305987d = z;
        this.f305988e = z2;
    }

    /* renamed from: a */
    public final C50362ug mo98113a() {
        return this.f305985b;
    }

    /* renamed from: b */
    public final C58833ax mo98114b() {
        return this.f305986c;
    }

    /* renamed from: c */
    public final C58833ax mo98115c() {
        return this.f305984a;
    }

    /* renamed from: d */
    public final boolean mo98116d() {
        return this.f305987d;
    }

    /* renamed from: e */
    public final boolean mo98117e() {
        return this.f305988e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C109785ae) {
            C109785ae aeVar = (C109785ae) obj;
            return this.f305984a.equals(aeVar.mo98115c()) && this.f305985b.equals(aeVar.mo98113a()) && this.f305986c.equals(aeVar.mo98114b()) && this.f305987d == aeVar.mo98116d() && this.f305988e == aeVar.mo98117e();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.f305984a.hashCode() ^ 1000003) * 1000003) ^ this.f305985b.hashCode()) * 1000003) ^ this.f305986c.hashCode()) * 1000003) ^ (true != this.f305987d ? 1237 : 1231)) * 1000003;
        if (true == this.f305988e) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f305984a);
        String obj = this.f305985b.toString();
        String valueOf2 = String.valueOf(this.f305986c);
        boolean z = this.f305987d;
        boolean z2 = this.f305988e;
        return "FetchPayload{valuePropUrl=" + valueOf + ", omniconsentUi=" + obj + ", userProfileUrl=" + valueOf2 + ", isEligibleForGoogleNow=" + z + ", useNeutralButtons=" + z2 + "}";
    }
}
