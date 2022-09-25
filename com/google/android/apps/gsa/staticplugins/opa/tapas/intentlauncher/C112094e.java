package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageButton;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.e */
/* compiled from: PG */
final class C112094e implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C112101i f311298a;

    public C112094e(C112101i iVar) {
        this.f311298a = iVar;
    }

    public final void afterTextChanged(Editable editable) {
        C112101i iVar = this.f311298a;
        ImageButton imageButton = iVar.f311312h;
        imageButton.getClass();
        EditText editText = iVar.f311311g;
        editText.getClass();
        imageButton.setVisibility(true != TextUtils.isEmpty(editText.getText().toString()) ? 0 : 8);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C112101i iVar = this.f311298a;
        EditText editText = iVar.f311311g;
        editText.getClass();
        iVar.mo99396c(editText.getText().toString());
    }
}
