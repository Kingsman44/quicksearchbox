package com.google.android.apps.gsa.assistant.settings.features.appactions;

import com.google.android.apps.gsa.assistant.settings.features.appactions.data.DataType$UpdateResult;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10191f;
import com.google.android.apps.gsa.assistant.shared.appactions.c.a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.cp */
/* compiled from: PG */
public final /* synthetic */ class C10297cp implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C10301ct f34886a;

    /* renamed from: b */
    public final /* synthetic */ TextInputLayout f34887b;

    public /* synthetic */ C10297cp(C10301ct ctVar, TextInputLayout textInputLayout) {
        this.f34886a = ctVar;
        this.f34887b = textInputLayout;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C10301ct ctVar = this.f34886a;
        TextInputLayout textInputLayout = this.f34887b;
        DataType$UpdateResult dataType$UpdateResult = (DataType$UpdateResult) obj;
        ctVar.mo18398a(false);
        int a = dataType$UpdateResult.mo18410a();
        if (a == 0) {
            ctVar.f34902i.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SUCCESS);
            C47393f.m84236g(new C10191f(), ctVar.f34897d);
        } else if (a != 1) {
            ctVar.f34902i.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_CLIENT_ERROR);
            textInputLayout.mo48470e(ctVar.f34897d.getResources().getString(R.string.assistant_default_error_message));
        } else {
            ctVar.f34902i.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_UPDATE_SERVER_ERROR);
            a.b(ctVar.f34897d.getContext(), textInputLayout, dataType$UpdateResult.mo18412c());
        }
    }
}
