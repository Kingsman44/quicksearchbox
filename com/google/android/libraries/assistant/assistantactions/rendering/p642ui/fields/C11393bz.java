package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.bz */
/* compiled from: PG */
public final /* synthetic */ class C11393bz implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ TimeSelectionField f37131a;

    public /* synthetic */ C11393bz(TimeSelectionField timeSelectionField) {
        this.f37131a = timeSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TimeSelectionField timeSelectionField = this.f37131a;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        timeSelectionField.f37042b.requestFocus();
        timeSelectionField.f37042b.requestFocusFromTouch();
        return false;
    }
}
