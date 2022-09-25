package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ar */
/* compiled from: PG */
public final /* synthetic */ class C11358ar implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ DurationSelectionField f37087a;

    public /* synthetic */ C11358ar(DurationSelectionField durationSelectionField) {
        this.f37087a = durationSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        DurationSelectionField durationSelectionField = this.f37087a;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        durationSelectionField.f36978b.requestFocus();
        durationSelectionField.f36978b.requestFocusFromTouch();
        return false;
    }
}
