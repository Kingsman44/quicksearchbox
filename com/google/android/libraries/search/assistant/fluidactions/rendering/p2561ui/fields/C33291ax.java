package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ax */
/* compiled from: PG */
public final /* synthetic */ class C33291ax implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ DurationSelectionField f89282a;

    public /* synthetic */ C33291ax(DurationSelectionField durationSelectionField) {
        this.f89282a = durationSelectionField;
    }

    public final void onFocusChange(View view, boolean z) {
        DurationSelectionField durationSelectionField = this.f89282a;
        durationSelectionField.f89082f = z;
        durationSelectionField.mo38704i();
    }
}
