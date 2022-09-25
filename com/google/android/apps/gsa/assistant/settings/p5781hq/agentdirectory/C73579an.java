package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.an */
/* compiled from: PG */
public final /* synthetic */ class C73579an implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ar f194690a;

    public /* synthetic */ C73579an(ar arVar) {
        this.f194690a = arVar;
    }

    public final void onClick(View view) {
        ar arVar = this.f194690a;
        if (arVar.getActivity() != null) {
            arVar.getActivity().onBackPressed();
        }
    }
}
