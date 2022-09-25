package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.bg */
/* compiled from: PG */
public final /* synthetic */ class C10231bg implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C10233bi f34711a;

    public /* synthetic */ C10231bg(C10233bi biVar) {
        this.f34711a = biVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C10233bi biVar = this.f34711a;
        biVar.f34713a.f34719f.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_CLIENT_ERROR);
        biVar.mo18363a(false);
        C59104x c = C10234bj.f34714a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ConfirmationDialog");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(551)).mo56386p("Failed to undo");
    }
}
