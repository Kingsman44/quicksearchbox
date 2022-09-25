package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n.p9982a;

import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.a.a */
/* compiled from: PG */
final class C131434a extends C131439e {

    /* renamed from: a */
    private final C60870cx f359254a;

    /* renamed from: b */
    private final Instant f359255b;

    public C131434a(C60870cx cxVar, Instant instant) {
        if (cxVar != null) {
            this.f359254a = cxVar;
            if (instant != null) {
                this.f359255b = instant;
                return;
            }
            throw new NullPointerException("Null listLastEditedTimestamp");
        }
        throw new NullPointerException("Null result");
    }

    /* renamed from: a */
    public final C60870cx mo110168a() {
        return this.f359254a;
    }

    /* renamed from: b */
    public final Instant mo110169b() {
        return this.f359255b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131439e) {
            C131439e eVar = (C131439e) obj;
            return this.f359254a.equals(eVar.mo110168a()) && this.f359255b.equals(eVar.mo110169b());
        }
    }

    public final int hashCode() {
        return ((this.f359254a.hashCode() ^ 1000003) * 1000003) ^ this.f359255b.hashCode();
    }

    public final String toString() {
        String obj = this.f359254a.toString();
        String obj2 = this.f359255b.toString();
        return "CachedResult{result=" + obj + ", listLastEditedTimestamp=" + obj2 + "}";
    }
}
