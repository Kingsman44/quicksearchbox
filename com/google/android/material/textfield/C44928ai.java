package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: com.google.android.material.textfield.ai */
/* compiled from: PG */
public final /* synthetic */ class C44928ai implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C44929aj f117377a;

    public /* synthetic */ C44928ai(C44929aj ajVar) {
        this.f117377a = ajVar;
    }

    public final void onClick(View view) {
        C44929aj ajVar = this.f117377a;
        EditText editText = ajVar.f117378a;
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (ajVar.mo48536k()) {
                ajVar.f117378a.setTransformationMethod((TransformationMethod) null);
            } else {
                ajVar.f117378a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                ajVar.f117378a.setSelection(selectionEnd);
            }
            ajVar.mo48610x();
        }
    }
}
