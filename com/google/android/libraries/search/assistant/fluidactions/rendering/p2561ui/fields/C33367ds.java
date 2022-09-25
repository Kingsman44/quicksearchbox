package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.SpinnerComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51146ib;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ds */
/* compiled from: PG */
public final /* synthetic */ class C33367ds implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ TimeSelectionField f89411a;

    /* renamed from: b */
    public final /* synthetic */ List f89412b;

    public /* synthetic */ C33367ds(TimeSelectionField timeSelectionField, List list) {
        this.f89411a = timeSelectionField;
        this.f89412b = list;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TimeSelectionField timeSelectionField = this.f89411a;
        List list = this.f89412b;
        int action = motionEvent.getAction();
        if (action == 0) {
            SpinnerComponent spinnerComponent = timeSelectionField.f89191b;
            if (spinnerComponent != null) {
                spinnerComponent.requestFocus();
                timeSelectionField.f89191b.requestFocusFromTouch();
            }
        } else if (action == 1) {
            timeSelectionField.f89193d = 0;
            timeSelectionField.mo38728h((C51146ib) list.get(0));
            return true;
        }
        return false;
    }
}
