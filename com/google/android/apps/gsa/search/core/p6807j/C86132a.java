package com.google.android.apps.gsa.search.core.p6807j;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.j.a */
/* compiled from: PG */
final class C86132a extends C86135d {

    /* renamed from: a */
    private final boolean f232802a;

    /* renamed from: b */
    private final C60870cx f232803b;

    public C86132a(boolean z, C60870cx cxVar) {
        this.f232802a = z;
        if (cxVar != null) {
            this.f232803b = cxVar;
            return;
        }
        throw new NullPointerException("Null processedIntentFuture");
    }

    /* renamed from: a */
    public final C60870cx mo79773a() {
        return this.f232803b;
    }

    /* renamed from: b */
    public final boolean mo79774b() {
        return this.f232802a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C86135d) {
            C86135d dVar = (C86135d) obj;
            return this.f232802a == dVar.mo79774b() && this.f232803b.equals(dVar.mo79773a());
        }
    }

    public final int hashCode() {
        return (((true != this.f232802a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f232803b.hashCode();
    }

    public final String toString() {
        boolean z = this.f232802a;
        String obj = this.f232803b.toString();
        return "IntentProcessingResult{willLaunchCustomTabs=" + z + ", processedIntentFuture=" + obj + "}";
    }
}
