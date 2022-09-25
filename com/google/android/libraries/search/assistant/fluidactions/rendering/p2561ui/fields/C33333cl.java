package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.cl */
/* compiled from: PG */
final class C33333cl implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C33337cp f89340a;

    /* renamed from: b */
    final /* synthetic */ C33338cq f89341b;

    public C33333cl(C33338cq cqVar, C33337cp cpVar) {
        this.f89341b = cqVar;
        this.f89340a = cpVar;
    }

    public final void afterTextChanged(Editable editable) {
        C33337cp cpVar = this.f89340a;
        boolean z = true;
        if (!cpVar.f89363g) {
            cpVar.f89363g = true;
            this.f89341b.f89367c.mo38397c();
        }
        Button button = this.f89340a.f89362f;
        if (editable.length() == 0) {
            z = false;
        }
        button.setEnabled(z);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
