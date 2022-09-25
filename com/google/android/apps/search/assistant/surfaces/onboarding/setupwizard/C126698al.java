package com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard;

import android.view.View;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.setupwizard.al */
/* compiled from: PG */
public final /* synthetic */ class C126698al implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C126702ap f348925a;

    public /* synthetic */ C126698al(C126702ap apVar) {
        this.f348925a = apVar;
    }

    public final void onClick(View view) {
        C126702ap apVar = this.f348925a;
        if (apVar.f348931b.canScrollVertically(1)) {
            apVar.f348931b.pageScroll(130);
            return;
        }
        ((C59052c) ((C59052c) C126702ap.f348930a.mo56224b()).mo56372aa(37120)).mo56386p("MORE button is clicked, but the screen is not scrollable. Forcing to move on.");
        apVar.mo107695a();
    }
}
