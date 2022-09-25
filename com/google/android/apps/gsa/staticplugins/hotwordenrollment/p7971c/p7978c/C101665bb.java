package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83981af;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84010e;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84012g;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.bb */
/* compiled from: PG */
public final /* synthetic */ class C101665bb implements C83981af {

    /* renamed from: a */
    public final /* synthetic */ C101671bh f283685a;

    public /* synthetic */ C101665bb(C101671bh bhVar) {
        this.f283685a = bhVar;
    }

    /* renamed from: a */
    public final void mo77411a() {
        C101671bh bhVar = this.f283685a;
        C84012g a = ((OpaPageLayout) bhVar.f283691a.requireView()).mo77369a();
        a.mo77475d(2);
        C84010e e = C84011f.m133882e();
        e.mo77375c(bhVar.f283691a.getString(R.string.structure_level_personal_results_consent_action_button_text));
        ((C83958a) e).f228734b = new C101669bf(bhVar);
        a.mo77472a(e.mo77373a());
        C84010e e2 = C84011f.m133882e();
        e2.mo77374b(true);
        e2.mo77375c(bhVar.f283691a.getString(R.string.structure_level_personal_results_consent_cancel_button_text));
        ((C83958a) e2).f228734b = new C101670bg(bhVar);
        a.mo77473b(e2.mo77373a());
    }
}
