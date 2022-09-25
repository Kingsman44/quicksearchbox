package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bx */
/* compiled from: PG */
public final /* synthetic */ class C33318bx implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ LocationSelectionField f89315a;

    public /* synthetic */ C33318bx(LocationSelectionField locationSelectionField) {
        this.f89315a = locationSelectionField;
    }

    public final void onFocusChange(View view, boolean z) {
        LocationSelectionField locationSelectionField = this.f89315a;
        locationSelectionField.f89141g = z;
        locationSelectionField.mo38715i();
    }
}
