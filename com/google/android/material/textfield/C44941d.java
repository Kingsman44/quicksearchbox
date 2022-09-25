package com.google.android.material.textfield;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.google.android.material.textfield.d */
/* compiled from: PG */
public final /* synthetic */ class C44941d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C44945h f117399a;

    public /* synthetic */ C44941d(C44945h hVar) {
        this.f117399a = hVar;
    }

    public final void onClick(View view) {
        C44945h hVar = this.f117399a;
        EditText editText = hVar.f117403a;
        if (editText != null) {
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            hVar.mo48610x();
        }
    }
}
