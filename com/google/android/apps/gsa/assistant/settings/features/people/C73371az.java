package com.google.android.apps.gsa.assistant.settings.features.people;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.az */
/* compiled from: PG */
final class C73371az implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ AlertDialog f194308a;

    /* renamed from: b */
    final /* synthetic */ TextInputEditText f194309b;

    /* renamed from: c */
    final /* synthetic */ TextInputLayout f194310c;

    /* renamed from: d */
    final /* synthetic */ ba f194311d;

    public C73371az(ba baVar, AlertDialog alertDialog, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        this.f194311d = baVar;
        this.f194308a = alertDialog;
        this.f194309b = textInputEditText;
        this.f194310c = textInputLayout;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f194308a.getButton(-1).setOnClickListener(new C73370ay(this));
    }
}
