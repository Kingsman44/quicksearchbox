package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.by */
/* compiled from: PG */
public final /* synthetic */ class C33319by implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ LocationSelectionField f89316a;

    public /* synthetic */ C33319by(LocationSelectionField locationSelectionField) {
        this.f89316a = locationSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        SpinnerComponent spinnerComponent;
        LocationSelectionField locationSelectionField = this.f89316a;
        if (motionEvent.getAction() != 0 || (spinnerComponent = locationSelectionField.f89136b) == null) {
            return false;
        }
        spinnerComponent.requestFocus();
        locationSelectionField.f89136b.requestFocusFromTouch();
        return false;
    }
}
