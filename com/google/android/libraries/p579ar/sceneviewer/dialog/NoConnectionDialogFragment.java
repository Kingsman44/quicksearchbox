package com.google.android.libraries.p579ar.sceneviewer.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;

/* renamed from: com.google.android.libraries.ar.sceneviewer.dialog.NoConnectionDialogFragment */
/* compiled from: PG */
public final class NoConnectionDialogFragment extends C0260w {
    public static final String TAG = "NoConnectionDialogFragment";

    /* renamed from: lambda$onCreateDialog$0$com-google-android-libraries-ar-sceneviewer-dialog-NoConnectionDialogFragment */
    public /* synthetic */ void mo18782x98ecd6b3(DialogInterface dialogInterface, int i) {
        startActivity(new Intent("android.settings.WIFI_SETTINGS"));
    }

    /* renamed from: lambda$onCreateDialog$1$com-google-android-libraries-ar-sceneviewer-dialog-NoConnectionDialogFragment */
    public /* synthetic */ void mo18783xa015b8f4(DialogInterface dialogInterface, int i) {
        getActivity().finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        getActivity().finish();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(C10696R.string.no_connection_dialog_title).setMessage(C10696R.string.no_connection_dialog_body).setPositiveButton(C10696R.string.no_connection_dialog_positive_button, new NoConnectionDialogFragment$$ExternalSyntheticLambda0(this)).setNegativeButton(C10696R.string.no_connection_dialog_negative_button, new NoConnectionDialogFragment$$ExternalSyntheticLambda1(this));
        return builder.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        getActivity().finish();
    }
}
