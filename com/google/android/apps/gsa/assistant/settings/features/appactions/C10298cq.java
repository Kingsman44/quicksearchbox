package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cq */
/* compiled from: PG */
public final /* synthetic */ class C10298cq implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C10301ct f34888a;

    /* renamed from: b */
    public final /* synthetic */ TextInputLayout f34889b;

    public /* synthetic */ C10298cq(C10301ct ctVar, TextInputLayout textInputLayout) {
        this.f34888a = ctVar;
        this.f34889b = textInputLayout;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C10301ct ctVar = this.f34888a;
        TextInputLayout textInputLayout = this.f34889b;
        ctVar.f34902i.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_CLIENT_ERROR);
        ctVar.mo18398a(false);
        textInputLayout.mo48470e(ctVar.f34897d.getResources().getString(R.string.assistant_default_error_message));
        C59104x c = C10301ct.f34894a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DetailedPage");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(555)).mo56386p("Failed to update shortcut list");
    }
}
