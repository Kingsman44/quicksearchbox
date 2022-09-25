package com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone.j */
/* compiled from: PG */
public final /* synthetic */ class C73170j implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C0392m f193969a;

    public /* synthetic */ C73170j(C0392m mVar) {
        this.f193969a = mVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        TextView textView = (TextView) this.f193969a.mo1197b().mo1177e(16908299);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
