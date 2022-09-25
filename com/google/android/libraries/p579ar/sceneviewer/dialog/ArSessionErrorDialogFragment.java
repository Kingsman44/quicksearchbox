package com.google.android.libraries.p579ar.sceneviewer.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p031v4.app.FragmentManager;

/* renamed from: com.google.android.libraries.ar.sceneviewer.dialog.ArSessionErrorDialogFragment */
/* compiled from: PG */
public final class ArSessionErrorDialogFragment extends C0260w {
    public static final String TAG = "ArSessionErrorDialogFragment";
    private OnCloseCallback callback = new ArSessionErrorDialogFragment$$ExternalSyntheticLambda0(this);

    /* renamed from: com.google.android.libraries.ar.sceneviewer.dialog.ArSessionErrorDialogFragment$OnCloseCallback */
    /* compiled from: PG */
    public interface OnCloseCallback {
        void onClose();
    }

    public static void showNow(FragmentManager fragmentManager, OnCloseCallback onCloseCallback) {
        ArSessionErrorDialogFragment arSessionErrorDialogFragment = new ArSessionErrorDialogFragment();
        arSessionErrorDialogFragment.callback = onCloseCallback;
        arSessionErrorDialogFragment.showNow(fragmentManager, TAG);
    }

    /* renamed from: lambda$new$0$com-google-android-libraries-ar-sceneviewer-dialog-ArSessionErrorDialogFragment */
    public /* synthetic */ void mo18776x8a87f63a() {
        getActivity().finish();
    }

    /* renamed from: lambda$onCreateDialog$1$com-google-android-libraries-ar-sceneviewer-dialog-ArSessionErrorDialogFragment */
    public /* synthetic */ void mo18777xc258f718(DialogInterface dialogInterface, int i) {
        this.callback.onClose();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.callback.onClose();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(C10696R.string.ar_session_error_dialog_title);
        builder.setMessage(C10696R.string.ar_session_error_dialog_body).setPositiveButton(C10696R.string.go_back_acknowledgement, new ArSessionErrorDialogFragment$$ExternalSyntheticLambda1(this));
        return builder.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.callback.onClose();
    }
}
