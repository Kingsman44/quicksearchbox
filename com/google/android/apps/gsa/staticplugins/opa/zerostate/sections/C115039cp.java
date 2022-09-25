package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import com.google.android.apps.gsa.assistant.shared.s.y;
import com.google.android.apps.gsa.shared.p7066m.C90146y;
import com.google.android.apps.gsa.staticplugins.opa.updatescenter.UpdatesCenterIconView;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cp */
/* compiled from: PG */
final class C115039cp implements C22868d {

    /* renamed from: a */
    final /* synthetic */ UpdatesCenterIconView f319316a;

    /* renamed from: b */
    final /* synthetic */ C115041cr f319317b;

    public C115039cp(C115041cr crVar, UpdatesCenterIconView updatesCenterIconView) {
        this.f319317b = crVar;
        this.f319316a = updatesCenterIconView;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C115041cr.f319320h.mo56226d();
        d.mo56378ag(C58975e.f156826a, "RegContextualGreetingSC");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(29508)).mo56386p("Failed to verify Updates Center eligibility.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        if (((Boolean) obj).booleanValue() && this.f319317b.f319321i.mo79746e(C90146y.f251892d)) {
            this.f319316a.setVisibility(0);
            UpdatesCenterIconView updatesCenterIconView = this.f319316a;
            updatesCenterIconView.f314972f = y.a(this.f319317b.f319321i.mo79758x(C90146y.f251895g));
            updatesCenterIconView.mo100597c();
        }
    }
}
