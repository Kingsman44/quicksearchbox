package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10192g;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.o */
/* compiled from: PG */
public final /* synthetic */ class C10417o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10419q f35126a;

    /* renamed from: b */
    public final /* synthetic */ View f35127b;

    /* renamed from: c */
    public final /* synthetic */ C10273r f35128c;

    public /* synthetic */ C10417o(C10419q qVar, View view, C10273r rVar) {
        this.f35126a = qVar;
        this.f35127b = view;
        this.f35128c = rVar;
    }

    public final void onClick(View view) {
        C10419q qVar = this.f35126a;
        View view2 = this.f35127b;
        C10273r rVar = this.f35128c;
        qVar.f35130b.mo65296c(C89849ae.APP_ACTIONS_SETTINGS_QUICK_SAVE_CLICKED);
        view2.findViewById(R.id.loading_ui).setVisibility(0);
        view2.findViewById(R.id.control_icon).setVisibility(4);
        C47393f.m84237h(new C10192g(rVar, false), view);
    }
}
