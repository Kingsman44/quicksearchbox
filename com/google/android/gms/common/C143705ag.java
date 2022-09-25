package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.common.ag */
/* compiled from: PG */
public final class C143705ag extends C0260w {

    /* renamed from: a */
    public Dialog f389608a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f389609b;

    /* renamed from: c */
    private Dialog f389610c;

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f389609b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f389608a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f389610c == null) {
            Context context = getContext();
            C143919bh.m233958a(context);
            this.f389610c = new AlertDialog.Builder(context).create();
        }
        return this.f389610c;
    }
}
