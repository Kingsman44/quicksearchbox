package com.google.android.apps.gsa.assistant.settings.features.appactions.data;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.data.aq */
/* compiled from: PG */
public final /* synthetic */ class C10330aq implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C10334au f35005a;

    public /* synthetic */ C10330aq(C10334au auVar) {
        this.f35005a = auVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C10334au auVar = this.f35005a;
        return auVar.f35011c.mo28205e(auVar.f35011c.mo28209i(auVar.mo18430e(auVar.f35013e, C89849ae.APP_ACTIONS_SETTINGS_APP_USAGE_STATS_FETCHED), "fetch app usage", new C10328ao(obj)), "fetch app usage fails", Exception.class, new C10329ap(obj));
    }
}
