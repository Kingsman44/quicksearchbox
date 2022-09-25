package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114864dg;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.bv */
/* compiled from: PG */
final class C114601bv implements C114864dg {

    /* renamed from: a */
    final /* synthetic */ C114602bw f317837a;

    public C114601bv(C114602bw bwVar) {
        this.f317837a = bwVar;
    }

    /* renamed from: a */
    public final void mo101408a(C89062r rVar) {
        if (!rVar.mo83040a()) {
            C58976aa aaVar = C58975e.f156826a;
            synchronized (this.f317837a.f317848i) {
                if (!this.f317837a.f317854o.isDone()) {
                    this.f317837a.f317857r.set(false);
                    this.f317837a.f317854o.mo57356n(C58485gu.m89845m());
                }
            }
        }
    }
}
