package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.widget.Button;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C83981af;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ds */
/* compiled from: PG */
public final /* synthetic */ class C108916ds implements C83981af {

    /* renamed from: a */
    public final /* synthetic */ C108925ea f302840a;

    public /* synthetic */ C108916ds(C108925ea eaVar) {
        this.f302840a = eaVar;
    }

    /* renamed from: a */
    public final void mo77411a() {
        C108925ea eaVar = this.f302840a;
        FooterLayout footerLayout = eaVar.f302864m.f228726a;
        footerLayout.mo77362c(1);
        Button a = footerLayout.mo77360a();
        a.setText(R.string.personal_response_on_lockscreen_next_button);
        a.setOnClickListener(new C89943l(new C108918du(eaVar)));
    }
}
