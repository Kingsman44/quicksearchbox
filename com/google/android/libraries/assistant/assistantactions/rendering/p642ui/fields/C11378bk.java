package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bk */
/* compiled from: PG */
public final /* synthetic */ class C11378bk implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ LocationSelectionField f37113a;

    public /* synthetic */ C11378bk(LocationSelectionField locationSelectionField) {
        this.f37113a = locationSelectionField;
    }

    public final void onFocusChange(View view, boolean z) {
        LocationSelectionField locationSelectionField = this.f37113a;
        locationSelectionField.f37151j = z;
        locationSelectionField.mo19860e();
    }
}
