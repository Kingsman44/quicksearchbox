package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.cd */
/* compiled from: PG */
public final /* synthetic */ class C9612cd implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33223a;

    /* renamed from: b */
    public final /* synthetic */ Activity f33224b;

    public /* synthetic */ C9612cd(C9619ck ckVar, Activity activity) {
        this.f33223a = ckVar;
        this.f33224b = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C9619ck ckVar = this.f33223a;
        Activity activity = this.f33224b;
        if (ckVar.f33280n.mo79746e(C90014bt.f247174cF)) {
            ckVar.f33279m.mo90174b(ckVar.f32988d, activity);
        } else {
            ckVar.f33279m.mo90175c(ckVar.f32988d, activity);
        }
    }
}
