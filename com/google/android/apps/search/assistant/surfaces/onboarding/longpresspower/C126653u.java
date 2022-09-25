package com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.u */
/* compiled from: PG */
public final /* synthetic */ class C126653u implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C126656x f348781a;

    public /* synthetic */ C126653u(C126656x xVar) {
        this.f348781a = xVar;
    }

    public final void onClick(View view) {
        C126656x xVar = this.f348781a;
        xVar.f348791f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(xVar.f348788c.requireView().findViewById(R.id.assistant_long_press_power_empty_action_button)));
        xVar.f348788c.getActivity().setResult(-1);
        xVar.f348788c.getActivity().finish();
    }
}
