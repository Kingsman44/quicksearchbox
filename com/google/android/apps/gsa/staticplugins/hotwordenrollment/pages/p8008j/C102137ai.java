package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ai */
/* compiled from: PG */
public final /* synthetic */ class C102137ai implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102140al f284935a;

    public /* synthetic */ C102137ai(C102140al alVar) {
        this.f284935a = alVar;
    }

    public final void onClick(View view) {
        C102140al alVar = this.f284935a;
        alVar.f284944f.mo83702b(C89849ae.VOICE_MATCH_UNIFIED_ENROLLMENT_DECLINE_DETAILS_PAGE);
        if (alVar.f284942d.isPresent()) {
            ((C19435g) alVar.f284942d.get()).mo24621c("FedAss.UnifiedDiscoverability.Status", 6);
        }
        alVar.f284943e.mo92931a(false);
        alVar.mo92904a();
    }
}
