package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.p9497a.C126686a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.as */
/* compiled from: PG */
public final /* synthetic */ class C126705as implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C126708av f348943a;

    public /* synthetic */ C126705as(C126708av avVar) {
        this.f348943a = avVar;
    }

    public final void onClick(View view) {
        C126708av avVar = this.f348943a;
        avVar.f348954j.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(avVar.f348948d.requireView().findViewById(R.id.assistant_suw_empty_action_button)));
        if (avVar.f348955k || avVar.f348956l) {
            avVar.mo107703a(true);
        }
        C47393f.m84236g(new C126686a(avVar.f348957m, -1), avVar.f348948d);
    }
}
