package com.google.android.apps.gsa.assistant.settings.features.payments.passwordauthentication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.payments.passwordauthentication.i */
/* compiled from: PG */
public final /* synthetic */ class C73341i implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ PasswordAuthenticationDialogFragment f194252a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f194253b;

    /* renamed from: c */
    public final /* synthetic */ View f194254c;

    public /* synthetic */ C73341i(PasswordAuthenticationDialogFragment passwordAuthenticationDialogFragment, AlertDialog alertDialog, View view) {
        this.f194252a = passwordAuthenticationDialogFragment;
        this.f194253b = alertDialog;
        this.f194254c = view;
    }

    public final void onShow(DialogInterface dialogInterface) {
        PasswordAuthenticationDialogFragment passwordAuthenticationDialogFragment = this.f194252a;
        this.f194253b.getButton(-1).setOnClickListener(new C73339g(passwordAuthenticationDialogFragment, this.f194254c));
    }
}
