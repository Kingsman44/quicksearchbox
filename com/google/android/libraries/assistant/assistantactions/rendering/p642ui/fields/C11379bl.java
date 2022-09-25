package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bl */
/* compiled from: PG */
public final /* synthetic */ class C11379bl implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ LocationSelectionField f37114a;

    public /* synthetic */ C11379bl(LocationSelectionField locationSelectionField) {
        this.f37114a = locationSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        LocationSelectionField locationSelectionField = this.f37114a;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        locationSelectionField.f37011b.requestFocus();
        locationSelectionField.f37011b.requestFocusFromTouch();
        return false;
    }
}
