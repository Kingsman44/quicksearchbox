package com.google.android.material.textfield;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.material.textfield.p */
/* compiled from: PG */
public final /* synthetic */ class C44953p implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C44956s f117418a;

    public /* synthetic */ C44953p(C44956s sVar) {
        this.f117418a = sVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C44956s sVar = this.f117418a;
        if (motionEvent.getAction() == 1) {
            if (sVar.mo48582p()) {
                sVar.f117423c = false;
            }
            sVar.mo48579m();
            sVar.mo48580n();
        }
        return false;
    }
}
