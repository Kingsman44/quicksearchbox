package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ar */
/* compiled from: PG */
public final /* synthetic */ class C102146ar implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102148at f284956a;

    public /* synthetic */ C102146ar(C102148at atVar) {
        this.f284956a = atVar;
    }

    public final void onClick(View view) {
        C102148at atVar = this.f284956a;
        atVar.f284963f.mo83702b(C89849ae.VOICE_MATCH_UNIFIED_ENROLLMENT_ACCEPT_ON_BOARDING_PAGE);
        if (atVar.f284961d.isPresent()) {
            ((C19435g) atVar.f284961d.get()).mo24621c("FedAss.UnifiedDiscoverability.Status", 3);
            atVar.mo92911a();
        }
    }
}
