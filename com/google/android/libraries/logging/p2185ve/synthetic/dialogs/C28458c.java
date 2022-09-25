package com.google.android.libraries.logging.p2185ve.synthetic.dialogs;

import android.content.DialogInterface;
import android.support.p031v4.app.C0260w;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.dialogs.c */
/* compiled from: PG */
public final /* synthetic */ class C28458c implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C0260w f77249a;

    /* renamed from: b */
    public final /* synthetic */ DialogInterface.OnShowListener f77250b;

    public /* synthetic */ C28458c(C0260w wVar, DialogInterface.OnShowListener onShowListener) {
        this.f77249a = wVar;
        this.f77250b = onShowListener;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C0260w wVar = this.f77249a;
        DialogInterface.OnShowListener onShowListener = this.f77250b;
        if (dialogInterface != null && wVar.getDialog() != null) {
            onShowListener.onShow(dialogInterface);
        }
    }
}
