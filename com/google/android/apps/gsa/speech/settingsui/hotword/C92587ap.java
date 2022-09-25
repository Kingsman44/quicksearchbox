package com.google.android.apps.gsa.speech.settingsui.hotword;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.ap */
/* compiled from: PG */
public final /* synthetic */ class C92587ap implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f258374a;

    public /* synthetic */ C92587ap(AlertDialog alertDialog) {
        this.f258374a = alertDialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AlertDialog alertDialog = this.f258374a;
        C58528ij ijVar = C92591at.f258382a;
        TextView textView = (TextView) alertDialog.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }
}
