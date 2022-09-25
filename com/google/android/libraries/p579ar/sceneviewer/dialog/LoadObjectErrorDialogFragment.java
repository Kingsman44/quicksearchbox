package com.google.android.libraries.p579ar.sceneviewer.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.FragmentManager;

/* renamed from: com.google.android.libraries.ar.sceneviewer.dialog.LoadObjectErrorDialogFragment */
/* compiled from: PG */
public final class LoadObjectErrorDialogFragment extends C0260w {
    public static final String TAG = "LoadObjectErrorDialogFragment";

    public static void showNow(FragmentManager fragmentManager) {
        new LoadObjectErrorDialogFragment().showNow(fragmentManager, TAG);
    }

    /* renamed from: lambda$onCreateDialog$0$com-google-android-libraries-ar-sceneviewer-dialog-LoadObjectErrorDialogFragment */
    public /* synthetic */ void mo18780x857e58bf(DialogInterface dialogInterface, int i) {
        getActivity().finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        getActivity().finish();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(C10696R.string.load_object_error_dialog_title);
        builder.setMessage(C10696R.string.load_object_error_dialog_body).setPositiveButton(C10696R.string.go_back_acknowledgement, new LoadObjectErrorDialogFragment$$ExternalSyntheticLambda0(this));
        return builder.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        getActivity().finish();
    }
}
