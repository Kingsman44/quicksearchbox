package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.al */
/* compiled from: PG */
public final /* synthetic */ class C33279al implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ DateSelectionField f89252a;

    public /* synthetic */ C33279al(DateSelectionField dateSelectionField) {
        this.f89252a = dateSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SpinnerComponent spinnerComponent;
        DateSelectionField dateSelectionField = this.f89252a;
        if (motionEvent.getAction() != 0 || (spinnerComponent = dateSelectionField.f89060b) == null) {
            return false;
        }
        spinnerComponent.requestFocus();
        dateSelectionField.f89060b.requestFocusFromTouch();
        return false;
    }
}
