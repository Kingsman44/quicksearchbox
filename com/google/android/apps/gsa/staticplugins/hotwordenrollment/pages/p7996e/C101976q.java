package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.q */
/* compiled from: PG */
public final /* synthetic */ class C101976q implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C101933ag f284544a;

    public /* synthetic */ C101976q(C101933ag agVar) {
        this.f284544a = agVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C101933ag agVar = this.f284544a;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", agVar.f284357h.getActivity().getPackageName(), (String) null));
        agVar.f284357h.startActivity(intent);
    }
}
