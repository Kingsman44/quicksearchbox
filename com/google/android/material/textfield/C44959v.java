package com.google.android.material.textfield;

import android.view.View;
import android.widget.EditText;

/* renamed from: com.google.android.material.textfield.v */
/* compiled from: PG */
final class C44959v {

    /* renamed from: a */
    final /* synthetic */ C44962y f117436a;

    public C44959v(C44962y yVar) {
        this.f117436a = yVar;
    }

    /* renamed from: a */
    public final void mo48588a(TextInputLayout textInputLayout) {
        C44962y yVar = this.f117436a;
        EditText editText = yVar.f117452k;
        if (editText != textInputLayout.f117309c) {
            if (editText != null) {
                editText.removeTextChangedListener(yVar.f117453l);
                if (this.f117436a.f117452k.getOnFocusChangeListener() == this.f117436a.mo48591a().mo48563d()) {
                    this.f117436a.f117452k.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            C44962y yVar2 = this.f117436a;
            yVar2.f117452k = textInputLayout.f117309c;
            EditText editText2 = yVar2.f117452k;
            if (editText2 != null) {
                editText2.addTextChangedListener(yVar2.f117453l);
            }
            this.f117436a.mo48591a().mo48533g(this.f117436a.f117452k);
            C44962y yVar3 = this.f117436a;
            yVar3.mo48603m(yVar3.mo48591a());
        }
    }
}
