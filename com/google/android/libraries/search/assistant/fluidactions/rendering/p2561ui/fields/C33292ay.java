package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ay */
/* compiled from: PG */
public final /* synthetic */ class C33292ay implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ DurationSelectionField f89283a;

    public /* synthetic */ C33292ay(DurationSelectionField durationSelectionField) {
        this.f89283a = durationSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SpinnerComponent spinnerComponent;
        DurationSelectionField durationSelectionField = this.f89283a;
        if (motionEvent.getAction() != 0 || (spinnerComponent = durationSelectionField.f89078b) == null) {
            return false;
        }
        spinnerComponent.requestFocus();
        durationSelectionField.f89078b.requestFocusFromTouch();
        return false;
    }
}
