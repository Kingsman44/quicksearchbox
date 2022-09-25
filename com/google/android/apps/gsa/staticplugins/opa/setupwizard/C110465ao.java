package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3861at.C50131ls;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.ao */
/* compiled from: PG */
public final /* synthetic */ class C110465ao implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110473aw f307960a;

    public /* synthetic */ C110465ao(C110473aw awVar) {
        this.f307960a = awVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110473aw awVar = this.f307960a;
        act act = (act) obj;
        if ((act.f128895b & 2048) != 0) {
            C110501y yVar = awVar.f307983l;
            C50131ls lsVar = act.f128879F;
            if (lsVar == null) {
                lsVar = C50131ls.f130322b;
            }
            yVar.mo98676b(lsVar.f130324a);
            return true;
        }
        ((C59052c) ((C59052c) C110473aw.f307972a.mo56226d()).mo56372aa(26418)).mo56386p("fetchBiometricsSettingUiFuture: no gaiaUserContextUi returned");
        return false;
    }
}
