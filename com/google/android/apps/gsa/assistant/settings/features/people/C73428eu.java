package com.google.android.apps.gsa.assistant.settings.features.people;

import android.content.DialogInterface;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.eu */
/* compiled from: PG */
public final /* synthetic */ class C73428eu implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73429ev f194394a;

    /* renamed from: b */
    public final /* synthetic */ dl f194395b;

    /* renamed from: c */
    public final /* synthetic */ C73437fp f194396c;

    public /* synthetic */ C73428eu(C73429ev evVar, dl dlVar, C73437fp fpVar) {
        this.f194394a = evVar;
        this.f194395b = dlVar;
        this.f194396c = fpVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C73429ev evVar = this.f194394a;
        evVar.f194401e.g(this.f194395b, this.f194396c);
        dialogInterface.dismiss();
    }
}
