package com.google.android.libraries.search.logging.appflows.startup.p3038b;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.search.logging.appflows.startup.b.b */
/* compiled from: PG */
final class C38809b extends C38817j {

    /* renamed from: a */
    private final Object f102426a;

    /* renamed from: b */
    private final C58833ax f102427b;

    public C38809b(Object obj, C58833ax axVar) {
        this.f102426a = obj;
        this.f102427b = axVar;
    }

    /* renamed from: a */
    public final C58833ax mo41650a() {
        return this.f102427b;
    }

    /* renamed from: b */
    public final Object mo41651b() {
        return this.f102426a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C38817j) {
            C38817j jVar = (C38817j) obj;
            return this.f102426a.equals(jVar.mo41651b()) && this.f102427b.equals(jVar.mo41650a());
        }
    }

    public final int hashCode() {
        return ((this.f102426a.hashCode() ^ 1000003) * 1000003) ^ this.f102427b.hashCode();
    }

    public final String toString() {
        String obj = this.f102426a.toString();
        String valueOf = String.valueOf(this.f102427b);
        return "StartupAppFlowEndEvents{firstDrawDoneEvent=" + obj + ", timeToInteractiveEvent=" + valueOf + "}";
    }
}
