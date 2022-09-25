package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.g */
/* compiled from: PG */
public final /* synthetic */ class C97221g implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C97224j f271614a;

    /* renamed from: b */
    public final /* synthetic */ GestureDetector f271615b;

    public /* synthetic */ C97221g(C97224j jVar, GestureDetector gestureDetector) {
        this.f271614a = jVar;
        this.f271615b = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C97224j jVar = this.f271614a;
        if (!this.f271615b.onTouchEvent(motionEvent) || jVar.mo90603b(motionEvent)) {
            jVar.mo90602a(motionEvent);
            return true;
        }
        view.performClick();
        if (jVar.f271620c == C88473w.SEARCH) {
            jVar.f271619b.mo90524l(0.0f, 0.0f);
        }
        jVar.f271619b.mo90525m();
        return true;
    }
}
