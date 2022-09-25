package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.c */
/* compiled from: PG */
public final /* synthetic */ class C102172c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102176g f285033a;

    public /* synthetic */ C102172c(C102176g gVar) {
        this.f285033a = gVar;
    }

    public final void onClick(View view) {
        C102176g gVar = this.f285033a;
        gVar.f285042e.mo92932b(false);
        ((C89859i) gVar.f285041d.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_FED_HOT_ENROLLMENT_DECLINE_DETAILS_PAGE);
        if (gVar.f285040c.isPresent()) {
            ((C19435g) gVar.f285040c.get()).mo24621c("FedHot.FedHotDiscoverability.Status", 5);
        }
        gVar.mo92927a();
    }
}
