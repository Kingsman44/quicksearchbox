package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cl */
/* compiled from: PG */
public final /* synthetic */ class C96135cl implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C96139cp f269129a;

    public /* synthetic */ C96135cl(C96139cp cpVar) {
        this.f269129a = cpVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C96139cp cpVar = this.f269129a;
        if ((motionEvent.getAction() != 0 && motionEvent.getAction() != 2) || !cpVar.f269146o) {
            return false;
        }
        cpVar.f269142k = true;
        cpVar.mo89981h();
        return false;
    }
}
