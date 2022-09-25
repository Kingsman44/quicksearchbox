package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.opa.C83572ac;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.bf */
/* compiled from: PG */
final class C113551bf implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ l f314360a;

    /* renamed from: b */
    final /* synthetic */ C113558bm f314361b;

    public C113551bf(C113558bm bmVar, l lVar) {
        this.f314361b = bmVar;
        this.f314360a = lVar;
    }

    public final void onClick(View view) {
        if (this.f314361b.f314434x.mo56113h()) {
            this.f314360a.e((C83572ac) this.f314361b.f314434x.mo56107c());
            return;
        }
        C59104x c = C113558bm.f314371a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TapasUiControllerImpl");
        ((C59052c) ((C59052c) c).mo56372aa(27918)).mo56386p("shouldn't show finish setup bar");
    }
}
