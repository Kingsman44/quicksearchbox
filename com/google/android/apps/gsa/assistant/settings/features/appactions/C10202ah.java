package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p565a.C10187b;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10273r;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p570f.C10383ae;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.ah */
/* compiled from: PG */
public final /* synthetic */ class C10202ah implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C10216av f34649a;

    /* renamed from: b */
    public final /* synthetic */ C10187b f34650b;

    public /* synthetic */ C10202ah(C10216av avVar, C10187b bVar) {
        this.f34649a = avVar;
        this.f34650b = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C10216av avVar = this.f34649a;
        C10187b bVar = this.f34650b;
        dialogInterface.dismiss();
        C10273r rVar = bVar.f34608a;
        View view = bVar.f34609b;
        if (view != null) {
            view.findViewById(R.id.loading_ui).setVisibility(0);
            view.findViewById(R.id.control_icon).setVisibility(4);
        }
        avVar.f34678n = Optional.m71637of(C10383ae.m25346b(rVar));
        avVar.mo18348f(avVar.f34678n);
    }
}
