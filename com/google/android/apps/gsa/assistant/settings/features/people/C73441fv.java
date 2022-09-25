package com.google.android.apps.gsa.assistant.settings.features.people;

import android.view.View;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.fv */
/* compiled from: PG */
final class C73441fv implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ FooterLayout f194430a;

    /* renamed from: b */
    final /* synthetic */ C73443fx f194431b;

    public C73441fv(C73443fx fxVar, FooterLayout footerLayout) {
        this.f194431b = fxVar;
        this.f194430a = footerLayout;
    }

    public final void onClick(View view) {
        this.f194431b.f194439f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f194430a.mo77360a()));
        this.f194431b.getActivity().finish();
    }
}
