package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.x */
/* compiled from: PG */
public final class C95131x {

    /* renamed from: a */
    private final C87673aa f266154a;

    /* renamed from: b */
    private boolean f266155b;

    public C95131x(C87673aa aaVar) {
        this.f266154a = aaVar;
    }

    /* renamed from: a */
    public final void mo89056a() {
        if (this.f266155b) {
            C87673aa aaVar = this.f266154a;
            if (!aaVar.mo81952x() || !aaVar.mo81953y()) {
                this.f266154a.mo81933e();
                this.f266154a.mo81948t(false);
            } else {
                return;
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        this.f266154a.mo81932c();
        this.f266154a.mo81947s((Bundle) null);
        this.f266155b = true;
    }

    /* renamed from: b */
    public final void mo89057b() {
        if (this.f266155b) {
            C58976aa aaVar = C58975e.f156826a;
            this.f266154a.mo81948t(false);
            this.f266154a.mo81933e();
            this.f266155b = false;
        }
    }
}
