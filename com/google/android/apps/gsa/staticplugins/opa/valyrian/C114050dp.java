package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108192a;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108225aw;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108232bc;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108262cf;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108325en;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108397he;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108412ht;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.dp */
/* compiled from: PG */
public final class C114050dp {

    /* renamed from: a */
    final /* synthetic */ C86124t f315737a;

    /* renamed from: b */
    final /* synthetic */ C114071eg f315738b;

    public C114050dp(C114071eg egVar, C86124t tVar) {
        this.f315738b = egVar;
        this.f315737a = tVar;
    }

    /* renamed from: a */
    public final void mo100964a(C108232bc bcVar) {
        if (!(bcVar instanceof C108192a) && !C108225aw.m179693a(bcVar)) {
            boolean z = bcVar instanceof C108262cf;
            if (z && ((C108262cf) bcVar).f301170K == 2) {
                return;
            }
            if ((!z || !((C108262cf) bcVar).f301168I) && !(bcVar instanceof C108325en) && !(bcVar instanceof C108412ht) && !(bcVar instanceof C108397he)) {
                this.f315738b.mo101024ch();
            }
        }
    }

    /* renamed from: b */
    public final void mo100965b() {
        if (this.f315737a.mo79746e(C90014bt.f247181cM)) {
            this.f315738b.mo101018cR();
        }
    }
}
