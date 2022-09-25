package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.dr */
/* compiled from: PG */
public final /* synthetic */ class C33366dr implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ TimeSelectionField f89410a;

    public /* synthetic */ C33366dr(TimeSelectionField timeSelectionField) {
        this.f89410a = timeSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SpinnerComponent spinnerComponent;
        TimeSelectionField timeSelectionField = this.f89410a;
        if (motionEvent.getAction() != 0 || (spinnerComponent = timeSelectionField.f89191b) == null) {
            return false;
        }
        spinnerComponent.requestFocus();
        timeSelectionField.f89191b.requestFocusFromTouch();
        return false;
    }
}
