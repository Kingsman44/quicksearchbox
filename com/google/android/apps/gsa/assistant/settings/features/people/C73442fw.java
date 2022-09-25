package com.google.android.apps.gsa.assistant.settings.features.people;

import android.view.View;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.fw */
/* compiled from: PG */
final class C73442fw implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FooterLayout f194432a;

    /* renamed from: b */
    final /* synthetic */ C73443fx f194433b;

    public C73442fw(C73443fx fxVar, FooterLayout footerLayout) {
        this.f194433b = fxVar;
        this.f194432a = footerLayout;
    }

    public final void onClick(View view) {
        this.f194433b.f194439f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f194432a.mo77361b()));
        this.f194433b.getActivity().finish();
    }
}
