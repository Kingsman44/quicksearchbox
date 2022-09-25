package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dq */
/* compiled from: PG */
public final /* synthetic */ class C33365dq implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ TimeSelectionField f89409a;

    public /* synthetic */ C33365dq(TimeSelectionField timeSelectionField) {
        this.f89409a = timeSelectionField;
    }

    public final void onFocusChange(View view, boolean z) {
        TimeSelectionField timeSelectionField = this.f89409a;
        timeSelectionField.f89195f = z;
        timeSelectionField.mo38729i();
    }
}
