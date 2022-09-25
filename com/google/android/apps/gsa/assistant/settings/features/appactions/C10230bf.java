package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.features.appactions.data.DataType$UpdateResult;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10188c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.bf */
/* compiled from: PG */
public final /* synthetic */ class C10230bf implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C10233bi f34710a;

    public /* synthetic */ C10230bf(C10233bi biVar) {
        this.f34710a = biVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C10233bi biVar = this.f34710a;
        biVar.mo18363a(false);
        int a = ((DataType$UpdateResult) obj).mo18410a();
        if (a == 0) {
            biVar.f34713a.f34719f.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SUCCESS);
            C47393f.m84235f(new C10188c(true, Optional.empty()), biVar.f34713a.f34715b);
            biVar.f34713a.f34715b.dismiss();
        } else if (a != 1) {
            biVar.f34713a.f34719f.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_CLIENT_ERROR);
        } else {
            biVar.f34713a.f34719f.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SERVER_ERROR);
        }
    }
}
