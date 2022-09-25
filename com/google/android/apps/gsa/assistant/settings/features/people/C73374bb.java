package com.google.android.apps.gsa.assistant.settings.features.people;

import android.app.Activity;
import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.bb */
/* compiled from: PG */
public final /* synthetic */ class C73374bb implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ bs f194314a;

    /* renamed from: b */
    public final /* synthetic */ Activity f194315b;

    public /* synthetic */ C73374bb(bs bsVar, Activity activity) {
        this.f194314a = bsVar;
        this.f194315b = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bs bsVar = this.f194314a;
        Activity activity = this.f194315b;
        if (bsVar.k.c.isEmpty()) {
            activity.finish();
        } else {
            bsVar.d.j(bsVar.k, new C73378bf(activity));
        }
        dialogInterface.dismiss();
    }
}
