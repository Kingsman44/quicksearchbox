package com.google.android.apps.gsa.assistant.settings.features.people;

import android.content.DialogInterface;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.cr */
/* compiled from: PG */
public final /* synthetic */ class C73399cr implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C73406da f194342a;

    public /* synthetic */ C73399cr(C73406da daVar) {
        this.f194342a = daVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C73406da daVar = this.f194342a;
        ((ViewGroup) daVar.f194359j.getParent()).removeView(daVar.f194359j);
        dialogInterface.dismiss();
    }
}
