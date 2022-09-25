package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.p9497a.C126686a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.y */
/* compiled from: PG */
public final /* synthetic */ class C126738y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C126688ab f349032a;

    public /* synthetic */ C126738y(C126688ab abVar) {
        this.f349032a = abVar;
    }

    public final void onClick(View view) {
        C126688ab abVar = this.f349032a;
        abVar.f348894m.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(abVar.f348887f.requireView().findViewById(R.id.assistant_suw_empty_action_button)));
        if (abVar.f348895n || abVar.f348896o) {
            abVar.mo107685c(1);
            if (abVar.f348900s) {
                abVar.mo107684a(true);
            }
        }
        C47393f.m84236g(new C126686a(abVar.f348898q, -1), abVar.f348887f);
    }
}
