package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83981af;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bm */
/* compiled from: PG */
public final /* synthetic */ class C101676bm implements C83981af {

    /* renamed from: a */
    public final /* synthetic */ C101687bx f283710a;

    public /* synthetic */ C101676bm(C101687bx bxVar) {
        this.f283710a = bxVar;
    }

    /* renamed from: a */
    public final void mo77411a() {
        C101687bx bxVar = this.f283710a;
        C58976aa aaVar = C58975e.f156826a;
        C84012g a = ((OpaPageLayout) bxVar.f283721a.requireView()).mo77369a();
        a.mo77475d(2);
        C84010e e = C84011f.m133882e();
        e.mo77375c(bxVar.f283721a.getString(R.string.structure_level_voice_match_consent_action_button_text));
        ((C83958a) e).f228734b = new C101682bs(bxVar);
        a.mo77472a(e.mo77373a());
        C84010e e2 = C84011f.m133882e();
        e2.mo77374b(true);
        e2.mo77375c(bxVar.f283721a.getString(R.string.structure_level_voice_match_consent_cancel_button_text));
        ((C83958a) e2).f228734b = new C101683bt(bxVar);
        a.mo77473b(e2.mo77373a());
    }
}
