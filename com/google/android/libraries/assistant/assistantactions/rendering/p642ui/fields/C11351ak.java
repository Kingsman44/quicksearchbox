package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ak */
/* compiled from: PG */
public final /* synthetic */ class C11351ak implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ DateSelectionField f37080a;

    public /* synthetic */ C11351ak(DateSelectionField dateSelectionField) {
        this.f37080a = dateSelectionField;
    }

    public final void onFocusChange(View view, boolean z) {
        DateSelectionField dateSelectionField = this.f37080a;
        dateSelectionField.f37151j = z;
        dateSelectionField.mo19840d();
    }
}
