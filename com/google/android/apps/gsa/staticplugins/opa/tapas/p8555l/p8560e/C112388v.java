package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.v */
/* compiled from: PG */
public final /* synthetic */ class C112388v implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112312ag f311823a;

    /* renamed from: b */
    public final /* synthetic */ C112344bl f311824b;

    public /* synthetic */ C112388v(C112312ag agVar, C112344bl blVar) {
        this.f311823a = agVar;
        this.f311824b = blVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112312ag agVar = this.f311823a;
        C112344bl blVar = this.f311824b;
        C112329ax axVar = (C112329ax) obj;
        Optional b = axVar.mo99482b();
        C112341bi biVar = b.isPresent() ? (C112341bi) ((C58495hd) b.get()).get("SuggestionSorting") : null;
        if (biVar == null || biVar.f180453g.isEmpty()) {
            synchronized (agVar) {
                agVar.mo99496e(blVar);
            }
            C58976aa aaVar = C58975e.f156826a;
            agVar.f311685q.mo99076a(C111255r.REFLECTION_LOG, "New model, started empty predictor from scratch.");
        } else {
            C112341bi a = blVar.mo99509a(biVar.f180453g, agVar.f311674f);
            synchronized (agVar) {
                a.mo59600e(agVar.f311681m);
                agVar.f311682n = Optional.m71637of(a);
                agVar.f311684p = C112312ag.m186172a(a);
            }
            C58976aa aaVar2 = C58975e.f156826a;
            agVar.f311685q.mo99076a(C111255r.REFLECTION_LOG, "Loaded Reflection models from disk.");
        }
        if (axVar.mo99483c()) {
            agVar.mo99497f(Instant.ofEpochMilli(0));
        } else if (agVar.f311675g.mo79746e(C90063do.f249574gB)) {
            agVar.mo99497f(axVar.mo99481a());
        }
    }
}
