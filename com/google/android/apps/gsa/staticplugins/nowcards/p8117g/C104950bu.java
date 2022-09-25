package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.bu */
/* compiled from: PG */
public final /* synthetic */ class C104950bu implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C104957ca f292435a;

    public /* synthetic */ C104950bu(C104957ca caVar) {
        this.f292435a = caVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C104957ca caVar = this.f292435a;
        caVar.f292453k = (int) motionEvent.getX();
        caVar.f292454l = (int) motionEvent.getY();
        return false;
    }
}
