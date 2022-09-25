package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.al */
/* compiled from: PG */
public final /* synthetic */ class C11352al implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ DateSelectionField f37081a;

    public /* synthetic */ C11352al(DateSelectionField dateSelectionField) {
        this.f37081a = dateSelectionField;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        DateSelectionField dateSelectionField = this.f37081a;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dateSelectionField.f36970b.requestFocus();
        dateSelectionField.f36970b.requestFocusFromTouch();
        return false;
    }
}
