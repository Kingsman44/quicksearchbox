package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.w */
/* compiled from: PG */
public final /* synthetic */ class C112389w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C112312ag f311825a;

    /* renamed from: b */
    public final /* synthetic */ C112344bl f311826b;

    public /* synthetic */ C112389w(C112312ag agVar, C112344bl blVar) {
        this.f311825a = agVar;
        this.f311826b = blVar;
    }

    public final void run() {
        C112312ag agVar = this.f311825a;
        C112344bl blVar = this.f311826b;
        synchronized (agVar) {
            agVar.mo99496e(blVar);
            agVar.mo99497f(Instant.ofEpochMilli(0));
        }
        C59104x d = C112312ag.f311670b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ReflectionOnline");
        ((C59052c) ((C59052c) d).mo56372aa(27677)).mo56386p("Loaded incompatible version of Reflection model, retraining on an empty model.");
        agVar.f311685q.mo99076a(C111255r.REFLECTION_LOG, "Loaded incompatible version of Reflection model, retraining on an empty model.");
    }
}
