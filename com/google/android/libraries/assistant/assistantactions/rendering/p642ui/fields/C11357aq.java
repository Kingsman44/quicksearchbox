package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.aq */
/* compiled from: PG */
public final /* synthetic */ class C11357aq implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ DurationSelectionField f37086a;

    public /* synthetic */ C11357aq(DurationSelectionField durationSelectionField) {
        this.f37086a = durationSelectionField;
    }

    public final void onFocusChange(View view, boolean z) {
        DurationSelectionField durationSelectionField = this.f37086a;
        durationSelectionField.f37151j = z;
        durationSelectionField.mo19847e();
    }
}
