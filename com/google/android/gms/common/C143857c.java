package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.common.c */
/* compiled from: PG */
public final class C143857c extends DialogFragment {

    /* renamed from: a */
    public Dialog f389949a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f389950b;

    /* renamed from: c */
    private Dialog f389951c;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f389950b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f389949a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f389951c == null) {
            Activity activity = getActivity();
            C143919bh.m233958a(activity);
            this.f389951c = new AlertDialog.Builder(activity).create();
        }
        return this.f389951c;
    }
}
