package com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher;

import android.view.View;
import android.widget.EditText;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.intentlauncher.b */
/* compiled from: PG */
public final /* synthetic */ class C112086b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C112101i f311291a;

    public /* synthetic */ C112086b(C112101i iVar) {
        this.f311291a = iVar;
    }

    public final void onClick(View view) {
        C112101i iVar = this.f311291a;
        EditText editText = iVar.f311311g;
        editText.getClass();
        if (!editText.hasFocus()) {
            EditText editText2 = iVar.f311311g;
            editText2.getClass();
            editText2.requestFocus();
        }
        EditText editText3 = iVar.f311311g;
        editText3.getClass();
        editText3.setText(BuildConfig.FLAVOR);
    }
}
