package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.aj */
/* compiled from: PG */
public final /* synthetic */ class C102138aj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102140al f284936a;

    public /* synthetic */ C102138aj(C102140al alVar) {
        this.f284936a = alVar;
    }

    public final void onClick(View view) {
        C102140al alVar = this.f284936a;
        alVar.f284944f.mo83702b(C89849ae.VOICE_MATCH_UNIFIED_ENROLLMENT_ACCEPT_DETAILS_PAGE);
        if (alVar.f284942d.isPresent()) {
            ((C19435g) alVar.f284942d.get()).mo24621c("FedAss.UnifiedDiscoverability.Status", 5);
        }
        alVar.f284943e.mo92931a(true);
        alVar.mo92904a();
    }
}
