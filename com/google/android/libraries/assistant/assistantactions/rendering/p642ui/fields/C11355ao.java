package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ao */
/* compiled from: PG */
public final /* synthetic */ class C11355ao implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ DurationSelectionField f37084a;

    public /* synthetic */ C11355ao(DurationSelectionField durationSelectionField) {
        this.f37084a = durationSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        DurationSelectionField durationSelectionField = this.f37084a;
        if (motionEvent.getAction() == 0) {
            durationSelectionField.f36978b.requestFocus();
            durationSelectionField.f36978b.requestFocusFromTouch();
        }
        if (motionEvent.getAction() != 1) {
            return false;
        }
        durationSelectionField.f36979c = 0;
        durationSelectionField.mo19846d();
        return true;
    }
}
