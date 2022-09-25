package com.google.android.apps.gsa.nga.engine.p6144ui.survey;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.p6144ui.survey.receiver.C78910a;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.survey.d */
/* compiled from: PG */
public final /* synthetic */ class C78907d implements C78910a {

    /* renamed from: a */
    public final /* synthetic */ C78906c f217128a;

    public /* synthetic */ C78907d(C78906c cVar) {
        this.f217128a = cVar;
    }

    /* renamed from: a */
    public final void mo73678a(Intent intent) {
        Bundle extras;
        C82885ea eaVar;
        C78906c cVar = this.f217128a;
        if (cVar.f217127e.mo85405j(C90126fx.f251341gw) && (extras = intent.getExtras()) != null && (eaVar = (C82885ea) C78909f.m126789a(extras, "survey_result_event", C82885ea.f225977c.getParserForType())) != null) {
            cVar.f217124b.mo75543a(C82887ec.SURVEY_RESULT, eaVar);
            cVar.f217125c.mo28213m("[NGA] Dismissing the notification.", 500, new C78905b(cVar));
        }
    }
}
