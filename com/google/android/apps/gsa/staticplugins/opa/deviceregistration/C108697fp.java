package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.app.AlertDialog;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fp */
/* compiled from: PG */
public final /* synthetic */ class C108697fp implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108704fw f302312a;

    public /* synthetic */ C108697fp(C108704fw fwVar) {
        this.f302312a = fwVar;
    }

    public final void onClick(View view) {
        C108704fw fwVar = this.f302312a;
        new AlertDialog.Builder(fwVar.getActivity()).setTitle(fwVar.getActivity().getString(R.string.setup_more_devices_dialog_title)).setMessage(fwVar.getActivity().getString(R.string.setup_more_devices_dialog_message)).setPositiveButton(fwVar.getActivity().getString(R.string.setup_more_devices_dialog_dialog_positive_button_text), new C108699fr(fwVar)).setNegativeButton(R.string.setup_more_devices_dialog_dialog_negative_button_text, new C108700fs(fwVar)).create().show();
    }
}
