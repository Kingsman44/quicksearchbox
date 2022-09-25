package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.aq */
/* compiled from: PG */
public final /* synthetic */ class C102145aq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102148at f284955a;

    public /* synthetic */ C102145aq(C102148at atVar) {
        this.f284955a = atVar;
    }

    public final void onClick(View view) {
        C102148at atVar = this.f284955a;
        atVar.f284963f.mo83702b(C89849ae.VOICE_MATCH_UNIFIED_ENROLLMENT_DECLINE_ON_BOARDING_PAGE);
        if (atVar.f284961d.isPresent()) {
            ((C19435g) atVar.f284961d.get()).mo24621c("FedAss.UnifiedDiscoverability.Status", 4);
        }
        if (atVar.f284959b.getView() != null) {
            C47393f.m84236g(new C101783w(), atVar.f284959b);
        } else {
            ((C59052c) ((C59052c) C102148at.f284958a.mo56225c()).mo56372aa(20592)).mo56389s("fragment.getView() is %s", atVar.f284959b.getView());
        }
    }
}
