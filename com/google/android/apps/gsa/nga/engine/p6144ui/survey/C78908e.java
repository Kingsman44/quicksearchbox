package com.google.android.apps.gsa.nga.engine.p6144ui.survey;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.aq.g;
import com.google.android.apps.gsa.nga.engine.aq.i;
import com.google.android.apps.gsa.nga.engine.p6144ui.survey.receiver.C78910a;
import com.google.android.apps.gsa.shared.p6974ae.C89094c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4566l.C60218r;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.survey.e */
/* compiled from: PG */
public final /* synthetic */ class C78908e implements C78910a {

    /* renamed from: a */
    public final /* synthetic */ C78906c f217129a;

    public /* synthetic */ C78908e(C78906c cVar) {
        this.f217129a = cVar;
    }

    /* renamed from: a */
    public final void mo73678a(Intent intent) {
        C78906c cVar = this.f217129a;
        if (cVar.f217127e.mo85405j(C90126fx.f251341gw)) {
            cVar.f217126d.mo74728a(C89094c.NGA_SURVEY);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                g a = C78909f.m126789a(extras, "extra_survey", g.d.getParserForType());
                C60218r rVar = (C60218r) C78909f.m126789a(extras, "parent_client_event_id", C60218r.f162925d.getParserForType());
                if (a == null) {
                    ((C59052c) ((C59052c) C78906c.f217123a.mo56226d()).mo56372aa(5434)).mo56386p("Invalid survey, not showing. survey was null");
                } else if (rVar != null) {
                    if ((a.a & 1) != 0) {
                        i iVar = a.c;
                        if (iVar == null) {
                            iVar = i.b;
                        }
                        if (Collection.EL.stream(iVar.a).allMatch(C78904a.f217121a)) {
                            return;
                        }
                    }
                    ((C59052c) ((C59052c) C78906c.f217123a.mo56226d()).mo56372aa(5432)).mo56388r("Invalid survey, not showing. survey id: %s", a.b);
                } else {
                    ((C59052c) ((C59052c) C78906c.f217123a.mo56226d()).mo56372aa(5433)).mo56386p("Invalid survey, not showing. parentClientEventId was null");
                }
            }
        }
    }
}
