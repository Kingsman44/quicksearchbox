package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.aa */
/* compiled from: PG */
public final /* synthetic */ class C116437aa implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C116446aj f322872a;

    public /* synthetic */ C116437aa(C116446aj ajVar) {
        this.f322872a = ajVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        C116446aj ajVar = this.f322872a;
        if (motionEvent.getAction() != 0) {
            return false;
        }
        float y = motionEvent.getY();
        if (ajVar.f322886d.getVisibility() == 0) {
            i = ajVar.f322886d.getTop();
        } else if (ajVar.f322887e.getVisibility() == 0) {
            i = ajVar.f322887e.getTop();
        } else {
            i = ajVar.f322888f.getTop();
        }
        if (y >= ((float) i)) {
            return false;
        }
        ajVar.mo102715g();
        return true;
    }
}
