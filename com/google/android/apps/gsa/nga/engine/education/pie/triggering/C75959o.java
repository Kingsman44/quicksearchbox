package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.common.p4522b.C58512hu;
import com.google.common.p4522b.C58671nr;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.o */
/* compiled from: PG */
final class C75959o extends C75932ar {

    /* renamed from: a */
    public C58512hu f210749a;

    /* renamed from: b */
    private Optional f210750b = Optional.empty();

    public C75959o() {
    }

    /* renamed from: a */
    public final C75933as mo71963a() {
        C58512hu huVar = this.f210749a;
        if (huVar != null) {
            return new C75960p(this.f210750b, huVar);
        }
        throw new IllegalStateException("Missing required properties: trackedConditions");
    }

    /* renamed from: b */
    public final void mo71964b(Optional optional) {
        if (optional != null) {
            this.f210750b = optional;
            return;
        }
        throw new NullPointerException("Null appEnteredTimestamp");
    }

    /* renamed from: c */
    public final void mo71965c(C58671nr nrVar) {
        this.f210749a = C58512hu.m89942v(nrVar);
    }

    public C75959o(C75933as asVar) {
        C75960p pVar = (C75960p) asVar;
        this.f210750b = pVar.f210751a;
        this.f210749a = pVar.f210752b;
    }
}
