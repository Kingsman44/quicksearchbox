package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.az */
/* compiled from: PG */
public final /* synthetic */ class C33293az implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ DurationSelectionField f89284a;

    public /* synthetic */ C33293az(DurationSelectionField durationSelectionField) {
        this.f89284a = durationSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SpinnerComponent spinnerComponent;
        DurationSelectionField durationSelectionField = this.f89284a;
        if (motionEvent.getAction() == 0 && (spinnerComponent = durationSelectionField.f89078b) != null) {
            spinnerComponent.requestFocus();
            durationSelectionField.f89078b.requestFocusFromTouch();
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        durationSelectionField.f89079c = 0;
        durationSelectionField.mo38703h();
        return true;
    }
}
