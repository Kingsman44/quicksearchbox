package com.google.android.apps.gsa.assistant.settings.features.p5710az;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.shared.ao;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.az.g */
/* compiled from: PG */
public final /* synthetic */ class C72976g implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C0392m f193615a;

    public /* synthetic */ C72976g(C0392m mVar) {
        this.f193615a = mVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        TextView textView = (TextView) this.f193615a.mo1197b().mo1177e(16908299);
        if (textView != null) {
            ao.b(textView, R.string.add_device_dialog_content, R.string.salsa_support_url);
        }
    }
}
