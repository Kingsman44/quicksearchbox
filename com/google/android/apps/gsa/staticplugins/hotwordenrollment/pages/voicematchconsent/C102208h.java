package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.voicematchconsent.h */
/* compiled from: PG */
public final /* synthetic */ class C102208h implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C102209i f285198a;

    /* renamed from: b */
    public final /* synthetic */ Dialog f285199b;

    public /* synthetic */ C102208h(C102209i iVar, Dialog dialog) {
        this.f285198a = iVar;
        this.f285199b = dialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C102209i iVar = this.f285198a;
        TextView textView = (TextView) this.f285199b.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setLinkTextColor(C1878d.m5128a(iVar.f285201b.requireContext(), R.color.linking_failure_dialog_action_color));
        }
        Button button = ((C0392m) dialogInterface).f1349a.f1113m;
        button.setAllCaps(false);
        button.setTextColor(C1878d.m5128a(iVar.f285201b.requireContext(), R.color.linking_failure_dialog_action_color));
    }
}
