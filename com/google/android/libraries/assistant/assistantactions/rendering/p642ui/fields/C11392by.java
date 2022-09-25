package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.by */
/* compiled from: PG */
public final /* synthetic */ class C11392by implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ TimeSelectionField f37130a;

    public /* synthetic */ C11392by(TimeSelectionField timeSelectionField) {
        this.f37130a = timeSelectionField;
    }

    public final void onFocusChange(View view, boolean z) {
        TimeSelectionField timeSelectionField = this.f37130a;
        timeSelectionField.f37151j = z;
        timeSelectionField.mo19871e();
    }
}
