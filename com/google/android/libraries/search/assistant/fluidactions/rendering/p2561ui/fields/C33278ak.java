package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ak */
/* compiled from: PG */
public final /* synthetic */ class C33278ak implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ DateSelectionField f89251a;

    public /* synthetic */ C33278ak(DateSelectionField dateSelectionField) {
        this.f89251a = dateSelectionField;
    }

    public final void onFocusChange(View view, boolean z) {
        DateSelectionField dateSelectionField = this.f89251a;
        dateSelectionField.f89064f = z;
        dateSelectionField.mo38695h();
    }
}
