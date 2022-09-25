package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.p9497a.C126686a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.m */
/* compiled from: PG */
public final /* synthetic */ class C126726m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C126727n f349004a;

    public /* synthetic */ C126726m(C126727n nVar) {
        this.f349004a = nVar;
    }

    public final void onClick(View view) {
        C126727n nVar = this.f349004a;
        nVar.f349010f.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(nVar.f349007c.requireView().findViewById(R.id.assistant_suw_empty_action_button)));
        ((C59052c) ((C59052c) C126727n.f349005a.mo56224b()).mo56372aa(37109)).mo56386p("Hardware Button Fragment finishes.");
        C47393f.m84236g(new C126686a(nVar.f349011g, -1), nVar.f349007c);
    }
}
