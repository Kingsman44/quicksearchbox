package com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.longpresspower.r */
/* compiled from: PG */
final class C126650r implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C126649q f348776a;

    public C126650r(C126649q qVar) {
        this.f348776a = qVar;
    }

    public final void onClick(View view) {
        C126649q qVar = this.f348776a;
        qVar.f348775d.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(qVar.f348772a.requireView().findViewById(R.id.assistant_lpp_contextual_edu_got_it_button)));
        qVar.f348772a.getActivity().finish();
    }
}
