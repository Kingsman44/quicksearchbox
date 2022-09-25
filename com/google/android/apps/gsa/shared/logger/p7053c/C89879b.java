package com.google.android.apps.gsa.shared.logger.p7053c;

import com.google.android.apps.gsa.shared.p6968aa.C89059o;

/* renamed from: com.google.android.apps.gsa.shared.logger.c.b */
/* compiled from: PG */
final class C89879b extends C89882e {

    /* renamed from: a */
    private final C89059o f246247a;

    /* renamed from: b */
    private final boolean f246248b;

    public C89879b(C89059o oVar, boolean z) {
        this.f246247a = oVar;
        this.f246248b = z;
    }

    /* renamed from: a */
    public final C89059o mo83715a() {
        return this.f246247a;
    }

    /* renamed from: b */
    public final boolean mo83716b() {
        return this.f246248b;
    }

    /* renamed from: c */
    public final boolean mo83717c() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89882e) {
            C89882e eVar = (C89882e) obj;
            C89059o oVar = this.f246247a;
            if (oVar != null ? oVar.equals(eVar.mo83715a()) : eVar.mo83715a() == null) {
                return this.f246248b == eVar.mo83716b() && !eVar.mo83717c();
            }
        }
    }

    public final int hashCode() {
        C89059o oVar = this.f246247a;
        return (((((oVar == null ? 0 : oVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.f246248b ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f246247a);
        boolean z = this.f246248b;
        return "EndstateLoggingMetadata{connectivityCheckAndReportFactory=" + valueOf + ", isPrefetched=" + z + ", isPrerendered=false}";
    }
}
