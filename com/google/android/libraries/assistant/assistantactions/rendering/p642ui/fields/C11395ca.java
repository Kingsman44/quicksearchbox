package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.MotionEvent;
import android.view.View;
import com.google.assistant.p3897e.p3902c.p3907c.C51146ib;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ca */
/* compiled from: PG */
public final /* synthetic */ class C11395ca implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ TimeSelectionField f37133a;

    /* renamed from: b */
    public final /* synthetic */ List f37134b;

    public /* synthetic */ C11395ca(TimeSelectionField timeSelectionField, List list) {
        this.f37133a = timeSelectionField;
        this.f37134b = list;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TimeSelectionField timeSelectionField = this.f37133a;
        List list = this.f37134b;
        int action = motionEvent.getAction();
        if (action == 0) {
            timeSelectionField.f37042b.requestFocus();
            timeSelectionField.f37042b.requestFocusFromTouch();
            return false;
        } else if (action != 1) {
            return false;
        } else {
            timeSelectionField.f37043c = 0;
            timeSelectionField.mo19870c((C51146ib) list.get(0));
            return true;
        }
    }
}
