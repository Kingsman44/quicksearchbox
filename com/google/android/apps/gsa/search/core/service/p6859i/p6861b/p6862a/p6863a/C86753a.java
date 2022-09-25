package com.google.android.apps.gsa.search.core.service.p6859i.p6861b.p6862a.p6863a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.service.i.b.a.a.a */
/* compiled from: PG */
final class C86753a extends C86754b {

    /* renamed from: a */
    private final C60870cx f234327a;

    /* renamed from: b */
    private final C86755c f234328b;

    public C86753a(C60870cx cxVar, C86755c cVar) {
        this.f234327a = cxVar;
        this.f234328b = cVar;
    }

    /* renamed from: a */
    public final C86755c mo80367a() {
        return this.f234328b;
    }

    /* renamed from: b */
    public final C60870cx mo80368b() {
        return this.f234327a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C86754b) {
            C86754b bVar = (C86754b) obj;
            return this.f234327a.equals(bVar.mo80368b()) && this.f234328b.equals(bVar.mo80367a());
        }
    }

    public final int hashCode() {
        return ((this.f234327a.hashCode() ^ 1000003) * 1000003) ^ this.f234328b.hashCode();
    }

    public final String toString() {
        String obj = this.f234327a.toString();
        String obj2 = this.f234328b.toString();
        return "WorkerAcquisitionResult{worker=" + obj + ", nextState=" + obj2 + "}";
    }
}
