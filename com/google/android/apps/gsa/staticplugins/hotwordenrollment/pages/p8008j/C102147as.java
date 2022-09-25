package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.as */
/* compiled from: PG */
public final /* synthetic */ class C102147as implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102148at f284957a;

    public /* synthetic */ C102147as(C102148at atVar) {
        this.f284957a = atVar;
    }

    public final void onClick(View view) {
        C102148at atVar = this.f284957a;
        atVar.f284963f.mo83702b(C89849ae.VOICE_MATCH_UNIFIED_ENROLLMENT_CLICK_BANNER_PAGE);
        if (atVar.f284961d.isPresent()) {
            ((C19435g) atVar.f284961d.get()).mo24621c("FedAss.UnifiedDiscoverability.Status", 3);
            atVar.mo92911a();
        }
    }
}
